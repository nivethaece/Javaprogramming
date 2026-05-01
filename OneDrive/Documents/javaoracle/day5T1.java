import java.util.*;
class string{
    public static void main(String[] args)
    {
    System.out.println("Enter the task:");
    Scanner s  = new Scanner(System.in);
    String st = s.nextLine();
    todo x= new todo();
    x.todolist(st);

    }
}
class todo{
    void todolist(String a)
    {
        if(a.isBlank())
        {
            System.out.println("Please enter task");
            return;

        }
        else{
            System.out.println("task entered");
        }
    }
    
}