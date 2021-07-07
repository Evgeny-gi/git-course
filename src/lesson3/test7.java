package lesson3;

public class test7 {

    public static void main(String [] args) {

        int a = 10;
        int b = 3;

        int c = ++a - b*2; // 11 - 6
        int d = (++a - b)*2; // (11 - 3)*2
        int e = (a-- - b)*2; // (10 - 3)*2


        System.out.println(c);


    }

}
