package lessonFirst;

public class Student {

    int id;
    String name;
    String surname;
    int date;
    double mat;
    double aconomy;
    double language;


}

class StudentTest{
    public static void main(String[] args) {

        Student st1 = new Student();
        Student st2 = new Student();
        Student st3 = new Student();

        st1.id = 1;
        st1.name = "Pavel";
        st1.surname = "Ivanov";
        st1.date = 1995;
        st1.mat = 9.8;
        st1.aconomy = 6;
        st1.language = 4.8;

        st2.id = 1;
        st2.name = "vova";
        st2.surname = "dark";
        st2.date = 1565;
        st2.mat = 5.1;
        st2.aconomy = 3.2;
        st2.language = 4.1;

        st3.id = 1;
        st3.name = "lala";
        st3.surname = "par";
        st3.date = 1965;
        st3.mat = 7.8;
        st3.aconomy = 7.7;
        st3.language = 5.2;

        System.out.println("Средняя оценка студента " + st1.name + "= " + (st1.mat + st1.aconomy + st1.language) / 3);
        System.out.println("Средняя оценка студента " + st2.name + "= " + (st2.mat + st2.aconomy + st2.language) / 3);
        System.out.println("Средняя оценка студента " + st3.name + "= " + (st3.mat + st3.aconomy + st3.language) / 3);

    }

}
