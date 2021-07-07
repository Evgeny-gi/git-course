package lesson24;

public class Test4 {
    Jupmpable j1 = new Human();
    Jupmpable j2 = new Animal();
}

class Human implements Jupmpable {
    public void jump() {
        System.out.println("Human jumps");
    }
}

class Animal implements Jupmpable {
    public void jump() {
        System.out.println("Животное прыгает");
    }
}

interface Jupmpable {
    void jump();
}

interface A2 {
    void abc();
}

interface b2 extends A2, Jupmpable {
    void def();
}

abstract class D implements A2, b2 {
}

