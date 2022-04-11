package ar.edu.unlp.info.oo2.ej1_ToDoItem;

import java.time.Duration;
import java.time.LocalDateTime;

public abstract class ToDoState {

    public abstract void start(ToDoItem context);
    public abstract void togglePause(ToDoItem context);
    public abstract void finish(ToDoItem context);

    //si esta pausada o in progress ejecuta este metodo
    public Duration workedTime(ToDoItem context) {
        return Duration.between(context.getStartTime(), LocalDateTime.now());
    }

    public void addComment(String comment,ToDoItem context) {
        context.comments.add(comment);
    }
}
