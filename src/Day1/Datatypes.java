package Day1;

public class Datatypes {
    public static void main(String[] args) {
        // data_type variable_name = variable_value(literal)

        // Data Type
        // Primitive Data Type
        //  boolean
        // true or false
        boolean is_married = true;
        boolean are_you_a_boy = true;
        System.out.println(is_married);
        System.out.println(are_you_a_boy);


        // Numerical
        // integral - byte, short, int, long

        byte b  = 100;
        short s = 101;
        int age = 130;
        long phone_number = 9876543210L; // 9876543210l;

        //  char - char  - A,B
        char grade  = 'A'; // O,A,B,C,D,E, F = Fail

        // floating
        // float
        float pi = 3.14f; // 3.14F;
        // double
        double d = 118.654;


        // Non primitive Data Types
        // String  name -> "pramod" -, number or char or bunch of char
        String name = "Deepak";
        String name2 = "D";
//        char cc = "c";

        byte bytes  = 10;
        System.out.println(bytes);
        // JVM -> brother who will execute the main method
        // 10 - Decimal
        // Machine(0,1) -> 00001010 - 8 bits = 1 Byte
        long distance_moon_earth = 3844000000000000l;

        int A123 = 987;
        System.out.println(A123);

        System.out.println("9x1=9");
        System.out.println("9x2=18");
        System.out.println("9x10=90");

        // Formatting
        int ages = 98;
        System.out.println("You age is -> " + ages);
        // %d ->  any integer - byte, short, int or long
        // %s -> String
        // %c -> char
        // %f -> float
        System.out.printf("You age is -> %d",ages);

        int octal = 0101; // If your Automation you may be working with these numbers
        System.out.println(octal);
        int hex = 0Xface;

        // https://www.rapidtables.com/convert/number/decimal-to-hex.html?x=10

        // ASCII Table
        // 0-9 48-57
        // A-Z 65-90
        // a-z 97-122
//      // 0-9 48-57

        System.out.println(hex);
        int k = 024;
        System.out.println("%d" + k);
        int n = 9;
        System.out.println("%d" + n);
        String names = "Pramod";
        System.out.println("Your name is ->" + names);

        // Escape Chars
        char c = '\n'; // New line / Next Line
        char c1 = '\t'; // Add Tab
        char c2 = '\b'; // Backlash, delete 1 char
        char c3 = '\r'; // Backlash, delete 1 word
//        System.out.println("Pramod" + c3 + "Dutta");
//        System.out.println("Pramod" + c2 + "Dutta");
//        System.out.println("Pramod" + c1 + "Dutta");
        System.out.println("Pramod" + c + "Dutta");


    }
}
