import java.util.*;

class expense {
    public static void main(String[] args) {
        exp o = new exp();
        o.tracker();
    }
}

class exp {
    void tracker() {
        Scanner s = new Scanner(System.in);
        int temp = 0;

        do {
            System.out.println("Enter your expense: ");
            String str = s.nextLine();

            if (str.equalsIgnoreCase("Stop"))
                break;

            System.out.println("Enter expense amount: ");
            int rup = s.nextInt();
            s.nextLine(); 

            temp = temp + rup;

        } while (true);

        System.out.println("Total expense: " + temp);
    }
}