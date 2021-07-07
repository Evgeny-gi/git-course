package lesson4;

public class Employee {

    int id;
  public   String surname;
    int age;
   private double salary;
    String department;

    public Employee (int id2, String surname2, int age2, double salary2, String department2){

        id = id2;
        surname = surname2;
        age = age2;
        salary = salary2;
        department = department2;


    }

    double Uvelicheniezarplaty () {

        salary *= 2;
        return salary;
    }

}
