import java.util.*;
class constr 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        Entertainment a = new Entertainment(); 
        System.out.println("Enter Idol name : ");
        String idol = s.nextLine();
        Entertainment b = new Entertainment(idol);
    }
}
class Entertainment 
{
    Scanner s = new Scanner(System.in);
    Entertainment() 
    {
        System.out.println("Enter Kdrama name : ");
        String nam = s.nextLine();
        System.out.println("Kdrama: " + nam);
    }
    Entertainment(String idol) 
    {
        System.out.println("Fav Idol: " + idol);
    }
}