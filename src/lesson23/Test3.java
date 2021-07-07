package lesson23;

public class Test3 {
    public static void main(String[] args) {
        Employee e = new Teacher();
        e.eat();

    }
}
class Eda{}
class Frukti extends Eda{}

class Employee{
    double salory = 100;
    String name = "Kolya";
    int age;
    int expirience;

    public Eda eat(){
        System.out.println("Kushaet rabotnik");
        Eda e = new Eda();
        return e;
    }
    void sleep(){
        System.out.println("Spat");
    }
}
class Teacher extends Employee{
    public Eda eat(){
        System.out.println("Kushaet uchitel");
        Frukti f = new Frukti();
        return f;
    }
    int kolichestvoUchenikov;

            void uchit(){
                System.out.println("Uchit");
            }
}

