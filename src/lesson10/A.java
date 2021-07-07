package lesson10;
import lesson9.Car;
import HomeWork.lesson4.*;
import static lesson9.Car.*;
import lesson9.Student;
import java.lang.*;  // Необязательный к натисанию стейтмент, он работает всегда, написан он или нет
// Import lesson9.*;  Звездочка означает, что все пакеты импортируются, а не по одному!!!
public class A {

    public static void main(String[] args) {
        String st4 = new String();
        lesson9.Car c1 = new lesson9.Car("red","V6"); // Без стейтмента Import
        Car c2 = new Car("black", "V4");  // Со стейсментом Import
        lesson9.Student st1 = new lesson9.Student();  //  БЕЗ
        Student st2 = new Student();
        System.out.println(st2.z);
        System.out.println(a);


    }
}

class B{
    Student st3 = new Student();
}
