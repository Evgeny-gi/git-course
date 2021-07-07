package lesson25;

public class Test1 {
    public static void main(String[] args) {
        Employee emp1 = new Teacher();
        Employee emp2 = new Driver();
        Employee emp3 = new Doktor();
        Employee[] array2 = {emp1, emp2, emp3};

        for (Employee emp : array2) {
            emp.vork();
        }


    }

}

abstract class Employee implements Help_able {
    void sleep() {
        System.out.println("Работник спит");
    }

    abstract void vork();

}

class Teacher extends Employee implements Help_able {
    public void help() {
        System.out.println("Учитель помогает");
    }

    void vork() {
        System.out.println("Учитель работает");
    }
}

class Driver extends Employee implements Help_able {
    public void help() {
        System.out.println("Водитель помогает");
    }

    void vork() {
        System.out.println("Водитель работает");
    }
}

class Doktor extends Employee implements Help_able {
    public void help() {
        System.out.println("Доктор помогает");
    }

    void vork() {
        System.out.println("Доктор работает");
    }
}

interface Help_able {
    void help();
}

