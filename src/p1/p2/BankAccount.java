package p1.p2;

public class BankAccount {
    int id = 13;
    String name ="vaca";
    int balance = 100;

    void popolnenie(int summap){
        System.out.println("Сумма до пополнения " + balance);
        balance += summap;
        System.out.println("Сумма после пополнения " + balance);

    }
    void snyatie(int summas){
        System.out.println("Сумма до снятия " + balance);
        balance -= summas;
        System.out.println("Сумма после снятия " + balance);

    }
}
class meny{
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();


        b1.popolnenie(20);
        b1.snyatie(30);

    }
}
