import java.util.*;
class Scanner_class
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int num;
        do
        {
            num=s.nextInt();
            System.out.println(num);
        }
        while(num != 0);

    }
}