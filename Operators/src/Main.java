import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        // Task 5
        Dog scruffy = new Dog("Scruffy", "fuf, I'm ");
        Dog spot = new Dog("Spot","fuf, I'm ");
        Dog bufDog = spot;

        System.out.println(scruffy.getSays() + scruffy.getName() + '\n' +
                spot.getSays() + spot.getName());

        // Task 6
        System.out.println( '\n' + "comparison");

        System.out.println("equal: " + bufDog.equals(spot) + '\n' +
                "==: " + (bufDog == spot));

        // Task 8

        long a = 0x2f;
        long b = 0177;
        System.out.println( '\n' + "hexadecimal to binary " + Long.toBinaryString(a));
        System.out.println("octal to binary " + Long.toBinaryString(b) + '\n');

        // Task 10
         final int FIRST = 0x1;
         final int SECOND = 0x9;

            System.out.println("binary FIRST: " + Integer.toBinaryString(FIRST));
            System.out.println("binary FIRST: " + Integer.toBinaryString(SECOND));
            System.out.println("~ FIRST:" + Integer.toBinaryString(~FIRST));
            System.out.println("~ SECOND:" + Integer.toBinaryString(~SECOND));
            System.out.println("&: " + Integer.toBinaryString(FIRST & SECOND));
            System.out.println("|: " + Integer.toBinaryString(FIRST | SECOND));
            System.out.println("^: " + Integer.toBinaryString(FIRST ^ SECOND));
            System.out.println('\n');


        // Task 12
        int value = 0x3;
        System.out.println("value to binary: " + Integer.toBinaryString(value));
        value <<= 2;
        System.out.println("left shit: " + Integer.toBinaryString(value));
        value >>>= 2;
        System.out.println("right unsigned shit: " + Integer.toBinaryString(value));


        // task 14
       BoolOperation.operations("Dog", "Tree");

    }
}
