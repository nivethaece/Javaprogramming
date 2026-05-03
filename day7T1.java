class methods
{
    public static void main(String[] args)
    {
        int n = -10;
        int a = 5, b = 8, c = 25;

        // Absolute
        System.out.println("Absolute value: " + Math.abs(n));

        // Maximum
        System.out.println("Maximum: " + Math.max(a, b));

        // Minimum
        System.out.println("Minimum: " + Math.min(a, b));

        // Square Root
        System.out.println("Square Root: " + Math.sqrt(c));

        // Cube Root
        System.out.println("Cube Root: " + Math.cbrt(b));

        // Power
        System.out.println("Power (a^b): " + Math.pow(a, b));

        // Rounding
        double x = 4.3;
        double y = 4.7;

        //ceil
        System.out.println("Ceil (round up): " + Math.ceil(x));

        //Floor
        System.out.println("Floor (round down): " + Math.floor(y));

        //Round
        System.out.println("Round: " + Math.round(y));

        // Trigonometry 
        double angle = Math.toRadians(30);

        //Sin
        System.out.println("sin(30): " + Math.sin(angle));

        //cos
        System.out.println("cos(30): " + Math.cos(angle));

        //tan
        System.out.println("tan(30): " + Math.tan(angle));
    }
}