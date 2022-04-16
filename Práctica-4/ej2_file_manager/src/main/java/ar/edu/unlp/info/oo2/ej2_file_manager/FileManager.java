package ar.edu.unlp.info.oo2.ej2_file_manager;

public class FileManager {
    public static void main(String[] args) {
        FileOO2 file = new ConcreteFile("uwu",19,"bat","rwe");
        NameDecorator name = new NameDecorator(file);
        PermissionsDecorator per = new PermissionsDecorator(name);
        System.out.println(per.prettyPrint());
        file.modify();
    }
}
