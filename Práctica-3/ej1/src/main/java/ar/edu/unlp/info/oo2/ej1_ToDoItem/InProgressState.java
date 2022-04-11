package ar.edu.unlp.info.oo2.ej1_ToDoItem;

// import java.time.Duration;

public class InProgressState extends ToDoState{


    @Override
    public void start(ToDoItem context) {}

    @Override
    public void togglePause(ToDoItem context) {
        context.changeState(new PausedState());        
    }

    @Override
    public void finish(ToDoItem context) {
        context.endTimer();
        context.changeState(new FinishedState());        
    }
}
