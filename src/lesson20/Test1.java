package lesson20;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Privet");
        Car c = new Car();
        list.add(c);
        Student s = new Student();
        list.add(s);
        list.add(new StringBuilder("ok"));
        // Так, как написано выше никто не делает. Ниже будет правильное написание.

        ArrayList<String> list2 = new ArrayList<String>(30);  // 30 тут вместительность массива, но ее все равно можно изменять
        list2.add("Poka");
        ArrayList<StringBuilder> list3 = new ArrayList<>();
        List<StringBuilder> list4 = new ArrayList();   //так тоже можно писать, если импортировать просто List
        list4.add(new StringBuilder("ok"));
        ArrayList<String> list5 = new ArrayList<>(list2);
        System.out.println(list2 == list5); // выдаст false

    }
}

class Car {
}

class Student {
}

