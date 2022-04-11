package ar.edu.unlp.info.oo2.ej1_ToDoItem;

import java.time.Duration;

public class FinishedState extends ToDoState{

    @Override
    public void start(ToDoItem context) {
        //no hace nada
    }

    @Override
    public void togglePause(ToDoItem context) {
        throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress");
    }

    @Override
    public void finish(ToDoItem context) {
        //no hace nada
     }

    @Override
    public Duration workedTime(ToDoItem context) {
        return Duration.between(context.getStartTime(),context.getEndTime());
    }

    @Override
    public void addComment(String comment,ToDoItem context) { 
        //no hace nada
    }
    
}
