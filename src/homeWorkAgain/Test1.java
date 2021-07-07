package homeWorkAgain;

public class Test1 {

    public static int umnojenie(int a, int b, int c){
        return a*b*c;

    }

    public static void delenie(int a, int b){
        System.out.println("Целое " + a/b + " Остаток " + a % b);
    }

}

class Test2{
    public static void main(String[] args) {

        System.out.println(Test1.umnojenie(3,3,3));
        Test1.delenie(7,4);
        System.out.println(Test1.umnojenie(5,5,5));
        Test1.delenie(5,2);


    }
}
