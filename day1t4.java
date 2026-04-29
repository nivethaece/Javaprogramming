class strs {
    public static void main(String[] args)
     {
        int a=6;
        int b=4;
        // Arithmetic operators
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        // Relational operators
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        System.out.println(a == b);
        System.out.println(a != b);

        // Logical operators
        System.out.println(a > b && b > a);
        System.out.println(a > b || b > a);
        System.out.println(!(a > b));

        // Unary operators
        System.out.println(a++);
        System.out.println(++a);
        System.out.println(a--);
        System.out.println(--a);

        // Assignment operators
        a += 2;
        System.out.println(a);
        a -= 2;
        System.out.println(a);
        a *= 2;
        System.out.println(a);
        a /= 2;
        System.out.println(a);
        a %= 2;
        System.out.println(a);

        // Bitwise operators
        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(a ^ b);
        System.out.println(~a);

        // Shift operators
        System.out.println(a << 1);
        System.out.println(a >> 1);

        // Ternary operator
        System.out.println(a > b ? a : b);


        // String concatenation
        System.out.println(5 + 10 + "a");


    }
}
