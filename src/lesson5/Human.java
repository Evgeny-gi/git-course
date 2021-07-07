package lesson5;


public class Human {
String name;
Car3 car;
BancAccount ba;

void info(){
    System.out.println("inua: " + name + " cvet mashini: " + car.color + " Balans banlovsloho schota: " + ba.balance);
}
}
class HumanTest {

    public static void main(String[] args) {
        Human h = new Human();
        h.name = "David";
        h.car = new Car3("red", "v8");
        h.ba = new BancAccount(18,200.5);
        h.info();
    }

}

class Car3{
  Car3(String c, String e){
color = c;
engine = e;
  }
    String color;
    String engine;
}

class BancAccount {
    BancAccount(int id2, double balance2){
id = id2;
balance = balance2;


    }
int id;
double balance;



}