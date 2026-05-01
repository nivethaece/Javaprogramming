import java.util.Scanner;
class strscan{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        String name = s.nextLine();
        System.out.println("Enter your Age: ");
        int age = s.nextInt();
        s.nextLine();
        System.out.println("Enter your Favkdrama: ");
        String drama = s.nextLine();
        System.out.println("Enter your percentage of sleep these days: ");
        int time = s.nextInt();
        s.nextLine();
        System.out.println("Enter your fav Idol name: ");
        String idol = s.next();
       s.nextLine();
        System.out.println("Enter your Idol's Number: ");
        long num = s.nextLong();
    }
}
