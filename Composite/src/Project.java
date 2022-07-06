import java.util.List;

public class Project implements ToDoList {
    String title;
    List <ToDoList> todos;
     public Project (String title, List <ToDoList> todos) {
         this.title = title;
         this.todos = todos;
     }
     public String getHtml () {
         String html = "<h1>";
         html = this. title;
         html = "</h1> <ul>";

         for (ToDoList tl : this.todos) {
             html += "<li>";
             html += tl.getHtml ();
             html += "<li>";
         }
         html += "<ul>";
         return html;
     }
}
