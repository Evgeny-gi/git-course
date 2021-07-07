package HomeWork2;

public class HWEmployeeTest2 {
    public static void main(String[] args) {
        HomeWork.HWEmployee emp1 = new HomeWork.HWEmployee(5);
       // HomeWork.HWEmployee emp2 = new HomeWork.HWEmployee("IVANOV");
      //  HomeWork.HWEmployee emp3 = new HomeWork.HWEmployee(555.5);

     //   System.out.println(emp1.id);
        System.out.println(emp1.surname);
      //  System.out.println(emp1.salary);

        emp1.getId();
        emp1.getSalary();
        emp1.getSurname();

    }
}
