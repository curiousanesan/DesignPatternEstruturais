public class ToDo implements ToDoList {
    String text;

    public ToDo (String text) {
        this.text = text;
    }
    public String getHtml () {
       return this.text;
    }
}
