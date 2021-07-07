package other;

public class Start {
    public static void main(String[] args) {
        Person olya1 = new Person();
        olya1.setName("Olya");
        olya1.setAge(25);
        olya1.sayHello();

        Person dima = new Person();
        dima.setName("Dima");
        dima.setAge(33);
        dima.sayHello();


        int result = dima.sum(5,5);
        System.out.println(result * 2);

    }
}
