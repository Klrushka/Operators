public class Task10 {
    public static void task10 (){
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
    }
}
