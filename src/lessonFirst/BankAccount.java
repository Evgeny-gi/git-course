package lessonFirst;

public class BankAccount {

    int id;
    String name;
    int balance;

    int popolnenie(int dengi) {
        balance += dengi;
        return balance;
    }

    int sniatie(int dengi) {
        balance -= dengi;
        return balance;
    }

    void showInfo(){
        System.out.println("NOMER " + id + " IMYA " + name + " OPERACIA " + balance);

    }
}
class BankAccountTest{
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        b1.id = 13;
        b1.name = "Sam";
        b1.balance = 100;


        b1.popolnenie(20);
        b1.sniatie(90);
    }

        }
