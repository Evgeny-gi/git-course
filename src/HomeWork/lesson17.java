package HomeWork;

public class lesson17 {
    public static boolean revenstvo(StringBuilder sb1, StringBuilder sb2){
        boolean result = true;
        if (sb1.length() == sb2.length()){
            for (int i = 0; i<sb1.length(); i++){
                if (sb1.charAt(i) != sb2.charAt(i)){
                    result = false;
                    break;
                }
            }
        } else {
            result = false;
        }
        return result;
    }
}
class Lesson17Test{
    public static void main(String[] args) {
        StringBuilder sb3 = new StringBuilder("hello");
        StringBuilder sb4 = new StringBuilder("hello");
        StringBuilder sb5 = new StringBuilder("Hello");
        boolean a = lesson17.revenstvo(sb3,sb4);
       // System.out.println(a);
        System.out.println(lesson17.revenstvo(sb4,sb5));
      //  System.out.println(lesson17.revenstvo(new StringBuilder(""), new StringBuilder("")));
       // System.out.println(lesson17.revenstvo(new StringBuilder(), new StringBuilder()));
    }
}
