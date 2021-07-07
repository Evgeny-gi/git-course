package homeWorkAgain;

public class Test3 {
    static final double p = 3.14;

    public double Ploshad(double radius){
        double p1 = p * radius * radius;
        return p1;
    }

    public static double Okrujnost(double radius2){
        double p2 = 2 * p * radius2;
        return p2;
    }

    public void OnScreen(double radius3){
        System.out.println("Радиус = " + radius3);
        System.out.println("Площадь = " + Ploshad(radius3));
        System.out.println("Длинна окружности = " + Okrujnost(radius3));

    }
}

class Test4{
    public static void main(String[] args) {

        Test3 t3 = new Test3();
        t3.Ploshad(12.2);
        Test3.Okrujnost(45.3);
        t3.OnScreen(22.3);

    }
}
