package lesson16;

public class Test7 {
    public static void main(String[] args) {
        String s1 = "HELLO WORLD";
        String s2 = "URAAA";
        String s3 = s1.concat(s2).trim().replace("URAAA","УРА").substring(6,10);
        System.out.println(s3);
        System.out.println(s1.substring(s1.indexOf('W')));
    }
}
