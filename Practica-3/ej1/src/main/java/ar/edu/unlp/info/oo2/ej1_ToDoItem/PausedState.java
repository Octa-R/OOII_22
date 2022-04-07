package ar.edu.unlp.info.oo2.ej1_ToDoItem;

// import java.time.Duration;

public class PausedState extends ToDoState {

    public PausedState(ToDoItem context) {
        super(context);
    }

    @Override
    public void start() {}

    @Override
    public void togglePause() {
        context.changeState(new InProgressState(this.context));
    }

    @Override
    public void finish() {
        context.endTimer();
        context.changeState(new FinishedState(this.context));        
    }
}
