package HomeWork;

public class HWEmployeeTest {
    public static void main(String[] args) {
        HWEmployee emp1 = new HWEmployee(5);
        HWEmployee emp2 = new HWEmployee("IVANOV");
      //  HWEmployee emp3 = new HWEmployee(555.5);

        System.out.println(emp1.id);
        System.out.println(emp1.surname);
     //   System.out.println(emp1.salaru);

        System.out.println(emp2.id);
        System.out.println(emp2.surname);
      //  System.out.println(emp2.salaru);

        emp1.getId();
        emp1.getSalary();
        emp1.getSurname();

        emp2.getId();
        emp2.getSalary();
        emp2.getSurname();

    }
}
