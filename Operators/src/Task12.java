public class Task12 {
    public static void task12(){
        int value = 0x3;
        System.out.println("value to binary: " + Integer.toBinaryString(value));
        value <<= 2;
        System.out.println("left shit: " + Integer.toBinaryString(value));
        value >>>= 2;
        System.out.println("right unsigned shit: " + Integer.toBinaryString(value));
    }
}
