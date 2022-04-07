package ar.edu.unlp.info.oo2.ej1_ToDoItem;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.Temporal;
import java.util.ArrayList;
import java.util.List;

public class ToDoItem {
    ToDoState state;
    String name;
    List<String> comments;
    Temporal startTime,endTime;
/**
* Instancia un ToDoItem nuevo en estado pending con <name> como nombre.
*/
    public ToDoItem(String name){
        this.comments = new ArrayList<String>();
        this.name = name;
        this.state = new PendingState(this);
    }
/**
* Pasa el ToDoItem a in-progress (siempre y cuando su estado actual sea
* pending, si se encuentra en otro estado, no hace nada)
*/
    public void start() {
        this.state.start();
    }
/**
* Pasa la tarea a paused si su estado es in-progress, o a in-progress si su
* estado es paused. Caso contrario (pending o finished) genera un error
* informando la causa específica del mismo
*/
    public void togglePause() {
        try {
            this.state.togglePause();
        } catch (Exception e) {
            throw e;
        }
    }
/**
* Pasa el ToDoItem a finished (siempre y cuando su estado actual sea
* in-progress o pausada, si se encuentra en otro estado, no hace nada)
*/
    public void finish(){
        this.state.finish();
    }
/**
* Retorna el tiempo que transcurrió desde que se inició la tarea (start)
* hasta que se finalizó. En caso de que no esté finalizada, el tiempo que
* haya transcurrido hasta el momento actual. Si la tarea no se inició,
* genera un error informando la causa específica del mismo.
*/
    public Duration workedTime() {
        return this.state.workedTime();
    }

    public void startTimer() {
        this.startTime = LocalDateTime.now();
    }

    public void endTimer() {
        this.endTime = LocalDateTime.now();
    }

    public Temporal getStartTime() {
        return this.startTime;
    }

    public Temporal getEndTime() {
        return this.endTime;
    }
/**
* Agrega un comentario a la tarea siempre y cuando no haya finalizado. Caso
* contrario no hace nada."
*/
    public void addComment(String comment) {
        this.state.addComment(comment);
    }

    public void addNewComment(String comment) {
        this.comments.add(comment);
    }
    
    public void changeState(ToDoState state) {
        this.state = state;
    }

    public List<String> getComments() {
        return this.comments;
    }
}