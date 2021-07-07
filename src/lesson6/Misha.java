package lesson6;

public class Misha {
    public static void main(String[] args) {

        X t = new X();

        System.out.println(t.sayHello4("rrr"));
    }

    static class X{
        void sayHello1(){

            System.out.println("HELLO");

        }

        void sayHello2(String name){

            System.out.println("HELLO, " + name);

        }

        String sayHello3(){
            return "HELLO";

        }

        String sayHello4(String name){
            return "HELLO, " + name;

        }

    }

}


