package lesson16;

public class Test9 {
    public static void main(String[] args) {
        String s1 = new String("ok");
        String s2 = new String ("ok");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        String s3 = "Privet";
        String s4 = "Privet";
        System.out.println(s3 == s4);  // РАВНО
        System.out.println(s3.equals(s4));    // РАВНО
        System.out.println(s1 != s4);     // НЕ РАВНО

        String s10 = "Kak Dela?";
        String s11 = "kak dela?";
        System.out.println(s10.equalsIgnoreCase(s11));

    }
}
