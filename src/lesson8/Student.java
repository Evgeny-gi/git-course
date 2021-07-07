package lesson8;

public class Student {
    String name;
    int course;
    static int count;
    int a;
    
    public Student(String name2, int course2){
        count++;
        name=name2;
        course=course2;
        System.out.println("Student # " + count + " Sozdan");
    }
    public static void showCount(){
        System.out.println("Всего создано студентов " + count);
    }
    public void showInfo(){
        System.out.println("Welcome to the student class");
    }
    void abc(){
        a++;
        count++;
    }
    static void abvd(){
        count++;
        Student st2 = new Student("Petr", 1);
        st2.a++;
    }

    public static void main(String[] args) {
        abvd();
       // Student st3 = new Student("Ivan",4);
        //st3.abc();
    }
}
