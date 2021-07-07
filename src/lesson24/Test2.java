package lesson24;

public class Test2 {
    public static void main(String[] args) {
        Figura f1 = new Kvadrat(); //Сщздается объекс необстрактного класса Kvadrat и на него ссылается переменная, которая имеет тип Figura
        System.out.println(f1.kolichestvoStoron);
        f1.Ploshad();
    }
}

abstract class Figura {
    /*Figura(int kolichestvoStoron) {                          // Конструктор абстрактного класса Figura
        this.kolichestvoStoron = kolichestvoStoron;         // Конструктор абстрактного класса Figura
    } */

    int kolichestvoStoron = 0;

    abstract void Perimetr();  //Метод без тела всегда должен быть abstract

    abstract void Ploshad();  //Метод без тела всегда должен быть abstract

    void showInfo() {
        System.out.println("Eto Figura");
    }
}

class Kvadrat extends Figura {
    /*Kvadrat(int kolichestvoStoron) {
        super(kolichestvoStoron);
        this.kolichestvoStoron = kolichestvoStoron;
    } */

    int storona1 = 10;
    int kolichestvoStoron = 4;

    public void Perimetr() {
        System.out.println("Perimetr kvadrata = " + 4 * storona1);
    }

    public void Ploshad() {
        System.out.println("Ploshad lvadrata = " + storona1 * storona1);
    }
}

class Pramougolnik extends Figura {
    int storona1 = 8;
    int storona2 = 5;
    int kolichestvoStoron = 4;

    public void Perimetr() {
        System.out.println("Perimetr pramougolnika = " + 2 * (storona1 + storona2));
    }

    public void Ploshad() {
        System.out.println("Ploshad pramougolnika = " + storona1 * storona2);
    }
}

class Okrujnost extends Figura {
    int radius = 3;
    int kolichestvoStoron = 0;

    public void Perimetr() {
        System.out.println("Perimetr okrujnosti = " + 2 * 3.14 * radius);
    }

    public void Ploshad() {
        System.out.println("Ploshad okrujnosti = " + 3.14 * radius * radius);
    }
}

abstract class Chetirehugolnik extends Figura {
    void def() {
        System.out.println("Eto Chetirehugolnik");
    }
}
