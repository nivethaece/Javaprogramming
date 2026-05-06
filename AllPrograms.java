import java.util.*;
import java.util.Arrays;

class Course {
    String name;
    static int count = 0;

    Course(String name) {
        this.name = name;
        count++;
    }
}

class Ball {
    boolean usable;
    Ball ball;
}

public class AllPrograms {

    public static void main(String[] args) {

        // =========================
        // QUESTION 2
        // =========================
        System.out.println("QUESTION 2");

        int n1 = 10, n2 = 15;
        int sum = 0, avg = 0;

        sum = n1 + n2;
        avg = sum / 2;

        System.out.println("sum = " + sum + " avg = " + avg);


        // =========================
        // QUESTION 3
        // =========================
        System.out.println("\nQUESTION 3");

        int a = 7;
        int b = 3;

        int result = a / b + a * b - a % b;

        System.out.println(result);


        // =========================
        // QUESTION 4
        // =========================
        System.out.println("\nQUESTION 4");

        Course c = new Course("Java Programming");

        System.out.println(c.name + ":" + Course.count);


        // =========================
        // QUESTION 5
        // =========================
        System.out.println("\nQUESTION 5");

        int x = 10;
        int y = 20;
        int z = 30;

        System.out.println(x++ > 10 || ++y <= 21);
        System.out.println(x > 10 && ++y <= 22);
        System.out.println(x <= 11 && y == 22);
        System.out.println(z++ == 31 && x++ == 11 || y++ == 22);


        // =========================
        // QUESTION 6
        // =========================
        System.out.println("\nQUESTION 6");

        List<String> items = new ArrayList<>();

        items.add("pen");
        items.add("pencil");
        items.add("erasers");
        items.add("paper");

        for (String item : items) {
            System.out.print(item + " ");
        }


        // =========================
        // QUESTION 7
        // =========================
        System.out.println("\n\nQUESTION 7");

        int p = 3;
        int q = 2;
        int r = -1;

        if (p + q % r > (p + (-q) * (-r))) {
            System.out.println(p + q - r);
        } else {
            System.out.println("No Output");
        }


        // =========================
        // QUESTION 8
        // =========================
        System.out.println("\nQUESTION 8");

        String string1, string2, string3;

        string1 = new String("StringObjects");
        string2 = string1;
        string3 = string1 + string2;

        System.out.println(string1);
        System.out.println(string2);
        System.out.println(string3);


        // =========================
        // QUESTION 9
        // =========================
        System.out.println("\nQUESTION 9");

        String str1 = "1" + "2";

        System.out.println(str1);


        // =========================
        // QUESTION 11
        // =========================
        System.out.println("\nQUESTION 11");

        String greeting = "Hello";

        boolean equal =
                (greeting.compareToIgnoreCase("hello") == 0)
                        ? true : false;

        boolean contains =
                greeting.contains("ello")
                        ? true : false;

        System.out.println(equal + " " + contains);


        // =========================
        // QUESTION 13
        // =========================
        System.out.println("\nQUESTION 13");

        String var = "1";

        switch (var) {

            case "1":
                System.out.println("one");
                break;
        }


        // =========================
        // QUESTION 14
        // =========================
        System.out.println("\nQUESTION 14");

        try {
            String str[] = {};

            System.out.println(str.length);

            System.out.println(str[0]);

        } catch (Exception e) {
            System.out.println(e);
        }


        // =========================
        // QUESTION 15
        // =========================
        System.out.println("\nQUESTION 15");

        try {
            int[] array = new int[5];

            for (int idx = 1; idx <= array.length; idx++) {
                System.out.print(array[idx]);
            }

        } catch (Exception e) {
            System.out.println("\n" + e);
        }


        // =========================
        // QUESTION 16
        // =========================
        System.out.println("\nQUESTION 16");

        for (int i = 10; i < 20; i++) {
            System.out.println("OK");
        }


        // =========================
        // QUESTION 17
        // =========================
        System.out.println("\nQUESTION 17");

        int value = 60;

        if (value > 100) {
            System.out.println(true);

        } else if (value > 50) {
            System.out.println(true);

        } else {
            System.out.println(false);
        }


        // =========================
        // QUESTION 18 & 20
        // =========================
        System.out.println("\nQUESTION 18 & 20");

        int[] anArray = {1, 3, 5, 7, 11};

        anArray[3] = anArray[1] + anArray[2];

        Arrays.sort(anArray);

        for (int num : anArray) {
            System.out.print(num + " ");
        }


        // =========================
        // QUESTION 19
        // =========================
        System.out.println("\n\nQUESTION 19");

        Random r2 = new Random();

        int num = r2.nextInt(10);

        System.out.println(num);


        // =========================
        // QUESTION 21
        // =========================
        System.out.println("\nQUESTION 21");

        int m = 10;
        int n = 10;

        m = m--;
        n = --n;

        if (m < n) {
            m--;
            n--;
        } else {
            m++;
            n++;
        }

        System.out.println("x = " + m + ", y = " + n);


        // =========================
        // QUESTION 23
        // =========================
        System.out.println("\nQUESTION 23");

        double number = -25.67;

        System.out.println(Math.abs(number));


        // =========================
        // QUESTION 27
        // =========================
        System.out.println("\nQUESTION 27");

        try {
            Ball ballObj = new Ball();

            System.out.print(ballObj.usable);

            System.out.print(" " + ballObj.ball.usable);

        } catch (Exception e) {
            System.out.println("\n" + e);
        }

    }
}
