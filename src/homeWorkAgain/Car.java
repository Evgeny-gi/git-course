package homeWorkAgain;

public class Car {

    String color;
    String engine;
    int doors;


    Car(String color, String engine, int doors){
        this.color = color;
        this.engine = engine;
        this.doors = doors;
    }
}
class CarTest{
    public static void changeColor(Car c1, Car c2){
        Car c3 = c1;
        c1=c2;
        c2=c3;
    }
    public static void changeDoors(Car i1, int doors){
        i1.doors = doors;
    }
    public static void main(String[] args) {
        CarTest ct = new CarTest();
        Car C1 = new Car("black","v4",4);
        Car C2 = new Car("yellow","v4",8);
        changeColor(C1,C2);
        System.out.println(C1.color);
        System.out.println(C2.color);
        changeDoors(C2,3);
        System.out.println(C2.doors);
    }
}

