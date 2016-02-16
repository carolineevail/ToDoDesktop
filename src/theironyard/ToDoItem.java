package theironyard;

/**
 * Created by Caroline on 2/16/16.
 */
public class ToDoItem {
    String text;
    boolean isDone;

    public ToDoItem(String text) {
        this.text = text;
        this.isDone = false;
    }

    @Override
    public String toString() {
        return text + (isDone ? " (done) " : "");
    }
}
