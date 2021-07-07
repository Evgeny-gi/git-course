package lesson4;


public class Student {
    Student(int studentid2, String name2, String surname2, int course2, double mathAverageGrade2, double economicsAverageGrade2, double foreingLanguageAverageGrade2) {


        studentid = studentid2;
         name = name2;
         surname = surname2;
         course = course2;
         mathAverageGrade = mathAverageGrade2;
         economicsAverageGrade = economicsAverageGrade2;
         foreingLanguageAverageGrade = foreingLanguageAverageGrade2;


    }

    Student(int studentid3, String name3, String surname3, int course3) {
        this(studentid3, name3, surname3, course3, 0, 0, 0);

    }

    Student() {
    }

    int studentid;
    String name;
    String surname;
    int course;
    double mathAverageGrade;
    double economicsAverageGrade;
    double foreingLanguageAverageGrade;
}

class StudentTest {
    double sredOrifmOcenka(Student st) {
        double sredOcenka = (st.mathAverageGrade + st.economicsAverageGrade + st.foreingLanguageAverageGrade) / 3;
        System.out.println("СРЕДНЯЯ ОРИФМЕТИЧЕСКАЯ ОЦЕНКА СТУДЕНТА: " + st.name + " " + st.surname + ": " + sredOcenka);
        return sredOcenka;
    }

    public static void main(String[] args) {
        Student st1 = new Student();
        st1.studentid = 1;
        st1.name = "НИКОЛАЙ";
        st1.surname = "ЕБАЛАЙ";
        st1.course = 3;
        st1.mathAverageGrade = 7.8;
        st1.economicsAverageGrade = 9.2;
        st1.foreingLanguageAverageGrade = 8.8;

        Student st2 = new Student(2, "ALEX", "PETROV", 1);
        st2.mathAverageGrade = 6.3;
        st2.economicsAverageGrade = 7;
        st2.foreingLanguageAverageGrade = 8.5;

        Student st3 = new Student(3, "ANTON", "GOVNOV", 4, 9.1, 9, 10);

        StudentTest sTest = new StudentTest();
        sTest.sredOrifmOcenka(st1);
        sTest.sredOrifmOcenka(st2);
        sTest.sredOrifmOcenka(st3);
    }
}


