package lessonAgain;

public class MethodOverloading {

    int sum(){
        int result = 0;
        System.out.println("Сумма всех чисел " + result);
        return  result;

    }

    int sum(int a){
        int result = a;
        System.out.println("Сумма всех чисел " + result);
        return result;
    }

    int sum(int b, int c){
        int result = b+c;
        System.out.println("Сумма всех чисел " + result);
        return result;
    }

    int sum(int d, int e, int f){
       int result = d+e+f;
        System.out.println("Сумма всех чисел " + result);
        return result;
    }

    int sum(int g, int i, int h, int m){
        int result = g+i+h+m;
        System.out.println("Сумма всех чисел " + result);
        return result;
    }

}
class summirovanie{
    public static void main(String[] args) {

        MethodOverloading s = new MethodOverloading();

        s.sum();
        s.sum(3);
        s.sum(2,5);
        s.sum(5,3,2);
        s.sum(6,7,2,9);



    }
}
