class Stringmethod {
    public static void main(String[] args) {

        String s1 = " College ";
        String s2 = "Engineering";
        // Inspection
        System.out.println(s1.length());
        System.out.println(s1.isEmpty());
        System.out.println(s1.isBlank());
        // Comparison
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.contains("ege"));
        // Extraction
        System.out.println(s1.charAt(2));
        System.out.println(s2.substring(1, 5));
        System.out.println(s2.indexOf("e"));
        System.out.println(s2.lastIndexOf("e"));
        // Modification
        System.out.println(s1.trim());
        System.out.println(s1.strip());
        System.out.println(s2.replace('e', 'E'));
        System.out.println(s2.repeat(2));
        System.out.println(s2.toUpperCase());

    }
}