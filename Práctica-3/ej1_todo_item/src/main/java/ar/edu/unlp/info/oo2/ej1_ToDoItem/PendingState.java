package ar.edu.unlp.info.oo2.ej1_ToDoItem;

import java.time.Duration;

public class PendingState extends ToDoState {

    @Override
    public void start(ToDoItem context) {
        context.startTimer();
        context.changeState(new InProgressState());
    }

    @Override
    public void togglePause(ToDoItem context) {
        throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress");
    }

    @Override
    public void finish(ToDoItem context) { }

    @Override
    public Duration workedTime(ToDoItem context) {
        throw new RuntimeException("El objeto ToDoItem todavía está pendiente");
    }
}
