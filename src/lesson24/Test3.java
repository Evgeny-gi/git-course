package lesson24;

public class Test3 {
    public static void main(String[] args) {
        Help_able h = new Driver();
        Swim_able s = new Driver();
        Employee e = new Driver();
        System.out.println(h.a);
        h.pomosh();
        h.tushitPojar("Voda");
        s.swim();
    }

}

class Employee {

    double salary = 100;
    String name = "Kolya";
    int age;
    int expirience;

    void eat() {
        System.out.println("kushat");
    }

    void sleet() {
        System.out.println("spat");
    }
}

class Teacher extends Employee implements Help_able {    // Имплементируем (воплощаем в жизнь) ИНТЕРФЕЙС!!!!!

    int kolichestvoUchenikov;

    void Uchit() {
        System.out.println("uchit");

    }

    public void pomosh() {
        System.out.println("Учитель оказывает помощь");     // ПЕРЕЗАПИСЫВАЕМ МЕТОДЫ ИНТЕРФЕЙСА
    }

    public void tushitPojar(String s) {
        System.out.println("Учитель тушит пожар" + s);          // ПЕРЕЗАПИСЫВАЕМ МЕТОДЫ ИНТЕРФЕЙСА
    }
}

class Driver extends Employee implements Help_able, Swim_able {

    String nazvanieMashini;

    void Vodit() {
        System.out.println("vodit");
    }

    public void pomosh() {
        System.out.println("Водитель оказывает помощь");     // ПЕРЕЗАПИСЫВАЕМ МЕТОДЫ ИНТЕРФЕЙСА
    }

    public void tushitPojar(String s) {
        System.out.println("Водитель тушит пожар" + s);          // ПЕРЕЗАПИСЫВАЕМ МЕТОДЫ ИНТЕРФЕЙСА
    }

    public void swim() {
        System.out.println("Водитель плавает");
    }
}

interface Help_able {
    void pomosh();  //Абстрактный метод. В интерфейсе можно не писать слово abstract. А так же все методы в интерфейсе по умолчанию Public

    void tushitPojar(String predmet);

    int a = 10;
}

interface Swim_able {
    void swim();
}
