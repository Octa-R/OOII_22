package ar.edu.unlp.info.oo2.java_logging;

import java.util.Properties;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

import jakarta.mail.Authenticator;
import jakarta.mail.Message;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

public class MailHandler extends Handler {
    private Handler handler;

    public MailHandler(Handler handler) {
        this.handler = handler;
    }

    //https://mailtrap.io/inboxes/1746197/messages

    @Override
    public void publish(LogRecord record) {

        String logMessage = record.getMessage();
        String logLevel = record.getLevel().toString();
        try {
            String from = "example@logger.com";
            String to = "destination@mail.com";

            // credenciales
            String username = "f7dd0cd6d2c43f"; // Completar con su username de mailtrap
            String password = "65c9bc079ddd9e"; // Completar con su password de mailtrap

            Properties props = new Properties();
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.host", "smtp.mailtrap.io");
            props.put("mail.smtp.port", "587");
            Session session = Session.getInstance(props,
                    new Authenticator() {
                        protected PasswordAuthentication getPasswordAuthentication() {
                            return new PasswordAuthentication(username, password);
                        }
                    });

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from, "Java logging mail"));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));

            //----
            message.setSubject(logLevel);
            message.setText(logMessage);
            Transport.send(message);
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void flush() {
        this.handler.flush();
    }

    @Override
    public void close() throws SecurityException {
        this.handler.close();
    }
}
