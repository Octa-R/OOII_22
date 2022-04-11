package ar.edu.unlp.info.oo2.ej1_ToDoItem;

// import java.time.Duration;

public class PausedState extends ToDoState {

    @Override
    public void start(ToDoItem context) {}

    @Override
    public void togglePause(ToDoItem context) {
        context.changeState(new InProgressState());
    }

    @Override
    public void finish(ToDoItem context) {
        context.endTimer();
        context.changeState(new FinishedState());        
    }
}
