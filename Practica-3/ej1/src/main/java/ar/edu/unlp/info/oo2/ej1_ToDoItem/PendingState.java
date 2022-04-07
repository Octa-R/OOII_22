package ar.edu.unlp.info.oo2.ej1_ToDoItem;

import java.time.Duration;

public class PendingState extends ToDoState {

    public PendingState(ToDoItem context) {
        super(context);
    }

    @Override
    public void start() {
        this.context.startTimer();
        this.context.changeState(new InProgressState(this.context));
    }

    @Override
    public void togglePause() {
        throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress");
    }

    @Override
    public void finish() { }

    @Override
    public Duration workedTime() {
        throw new RuntimeException("El objeto ToDoItem todavía está pendiente");
    }
}
