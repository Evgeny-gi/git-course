package lesson16;

// isBlank
// isEmpty
// strip, stripLeading, stripTrailing

public class Test20 {
    public static void main(String[] args) {
        String s1 = "Privet";
        System.out.println(s1.isBlank());

        String s2 = "      ";
        System.out.println(s2.isBlank());

        String s3 = "";
        System.out.println(s3.isEmpty());

        String s4 = "     Privet            ";
        System.out.println(s4.strip());

        String s5 = "     Privet            ";
        System.out.println(s5.stripLeading());

        String s6 = "     Privet            ";
        System.out.println(s6.stripTrailing());


    }
}
