package HomeWork;

public class Zadacha1 {
    static double umnojenie(double a, double b, double c){
        return a*b*c;
    }
    static void delenie (int a, int b){
        System.out.println("Целое частное= " + a/b + "; Остаток = " + a % b);
    }
}
class Zadacha1Test {
    public static void main(String[] args) {
        System.out.println(Zadacha1.umnojenie(2,3,4));
        Zadacha1.delenie(9,2);
        System.out.println(Zadacha1.umnojenie(2.5,3.5,4));
        Zadacha1.delenie(15,4);
    }
}
