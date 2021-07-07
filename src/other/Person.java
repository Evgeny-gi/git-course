package other;

public class Person {
    private String name;
    private int age;

    public void setName(String xxx) {
       name = xxx;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int sum(int a, int b){
        int ttt = a+b;
        return ttt;

    }


    public void sayHello(){
        String name = "Olya";
       String msg = "Hello. My name is " + this.name + ". I am " + age + " years old.";
        System.out.println(msg);
    }

}
