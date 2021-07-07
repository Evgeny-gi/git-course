package lessonFirst;

public class Car {

    String color = "Red";
    String engine = "V6";

}

class CarTest{
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.color = "Black";
        car1.engine = "V8";

        System.out.println("Cvet " + car1.color);
        System.out.println("Engine " + car1.engine);
    }
}
