package lesson4;

public class Car {

    Car(String cvet, String motor){

color = cvet;
engine = motor;

        System.out.println("ЦВЕТ МАШИНЫ" + color + "МОТОР" + engine);


    }



    String color;
    String engine;


}

class CarTest {

    public static void main(String[] args) {

        Car car1 = new Car("black","V8");
        Car car2 = new Car("white","V6");


    }

}