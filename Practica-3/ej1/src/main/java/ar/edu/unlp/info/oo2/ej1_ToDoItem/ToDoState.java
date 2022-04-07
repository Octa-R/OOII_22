package ar.edu.unlp.info.oo2.ej1_ToDoItem;

import java.time.Duration;
import java.time.LocalDateTime;

public abstract class ToDoState {

    ToDoItem context;

    public ToDoState(ToDoItem context) {
        this.context = context;
    }

    public abstract void start();
    public abstract void togglePause();
    public abstract void finish();

    //si esta pausada o in progress ejecuta este metodo
    public Duration workedTime() {
        return Duration.between(this.context.getStartTime(), LocalDateTime.now());
    }

    public void addComment(String comment) {
        this.context.addNewComment(comment);
    }
}
