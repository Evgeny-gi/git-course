package lessonFirst;

public class Animal {

    String type = "Gepard";
    String name = "Sid";
    int speed = 100;

    void skorostUv(int uvelichenie) {
        System.out.println("do " + speed);
        speed += uvelichenie;
        System.out.println("pesle "+ speed);

    }

        void skorostUm(int umenshenit){
            System.out.println("do " + speed);
            speed -= umenshenit;
            System.out.println("posle " + speed);

    }

}

class mainTheme{
    public static void main(String[] args) {

        Animal A1 = new Animal();
        A1.skorostUv(50);
        A1.skorostUm(5);

    }



}

