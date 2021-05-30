public class BoolOperation {
    public static void operations (String s1, String s2){

        System.out.println( '\n' + "s1: " + s1 + " s2: " + s2);
        System.out.println(">: " + (s1.length() > s2.length()));
        System.out.println("<: " + (s1.length() < s2.length()));
        System.out.println("==: " + (s1 == s2));
        System.out.println("!=: " + (s1 != s2));
        System.out.println("equal: " + s1.equals(s2));
        System.out.println("!equal: " + !(s1.equals(s2)));
    }
}
