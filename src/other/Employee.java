package other;

public class Employee {

   int id;
  public String surname;
   int age;
   private double salary;
   int department;

    public static void main(String[] args) {

    }

   double uvelichenieZp(){
       salary *= 2;
       return salary;
   }

   public void ID(){
       System.out.println("ID = " + id);
   }

   public void SURNAME(){
       System.out.println("SURNAME = " + surname);
   }

   public void SALARY(){
       System.out.println("SALARY = " + salary);
   }

   public Employee(int id2){
       id = id2;
   }

   Employee(String surname2){
       surname = surname2;
   }

   private Employee(double salary2){
       salary = salary2;
   }


}


