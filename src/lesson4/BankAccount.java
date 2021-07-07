package lesson4;

public class BankAccount {

    private  int id;
   private String name;
 private    double balance = 100;

    public BankAccount() {

        System.out.println("1");

    }

    public BankAccount(int i, String name, double balance) {
        this.id = i;
        this.name = name;
        this.balance = balance;
        System.out.println("2");

    }

    public BankAccount(String name) {
        this.name = name;
        System.out.println("3");
    }


    void popolnenie(int summapopolnenie) {
        System.out.println("Баланс до пополнения: " + balance);
        System.out.println("баланс пополняется на: " + summapopolnenie);
        balance += summapopolnenie;
        System.out.println("баланс после пополнения" + balance);


    }

    void popolnenie() {

        popolnenie();



    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
