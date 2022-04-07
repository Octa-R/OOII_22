package ar.edu.unlp.info.oo2.ej1_ToDoItem;

import java.time.Duration;

public class FinishedState extends ToDoState{

    public FinishedState(ToDoItem context) {
        super(context);
    }

    @Override
    public void start() {
        //no hace nada
    }

    @Override
    public void togglePause() {
        throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress");
    }

    @Override
    public void finish() {
        //no hace nada
     }

    @Override
    public Duration workedTime() {
        return Duration.between(this.context.getStartTime(), this.context.getEndTime());
    }

    @Override
    public void addComment(String comment) { 
        //no hace nada
    }
    
}
