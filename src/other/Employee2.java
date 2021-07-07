package other;

public class Employee2 {
    public static void main(String[] args) {


        Employee emp1 = new Employee(1);
        Employee emp2 = new Employee("Ivanov");
       // Employee emp3 = new Employee(34.3);

        System.out.println(emp1.id);
        System.out.println(emp1.surname);

        System.out.println(emp2.id);
        System.out.println(emp2.surname);

        emp1.ID();
        emp1.SALARY();
        emp1.SURNAME();

        emp2.ID();
        emp2.SALARY();
        emp2.SURNAME();


    }
}
