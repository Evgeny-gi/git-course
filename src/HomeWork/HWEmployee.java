package HomeWork;

public class HWEmployee {
    int id;
    public String surname;
    int age;
    private double salary;
    String depertment;

    public HWEmployee (int id2){
        id = id2;
    }
    HWEmployee (String surname2){
        surname = surname2;
    }
    private HWEmployee (double salary2){
        salary = salary2;
    }
    double uvelichenieZarplaty(){
        salary *=2;
        return salary;
    }
    public void getId(){
        System.out.println("ID= " + id);
    }
    public void getSurname(){
        System.out.println("SURNAME= " + surname);
    }
    public void getSalary(){
        System.out.println("SALARY= " + salary);
    }
}
