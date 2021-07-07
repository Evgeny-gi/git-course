package lesson9;

public class Student {
   public int a = 10;
    public int b = this.a;
    public static int c = 5;
    public  int z = this.c;
    public static int f = c;
}

class studentTest{
    public static void main(String[] args) {
        Student st1 = new Student();
        Student st2 = new Student();
        Student st3;
        st1 = null;
    }
}
