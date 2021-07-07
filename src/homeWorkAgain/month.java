package homeWorkAgain;

public class month {}
class month2{

    public static void dni(int m){

        switch (m){
            case 2:
            case 3:
                System.out.println("В месяце 28 дней");
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                System.out.println("В месяце 29 дней");
                break;
            case 12:
            case 13:
            case 14:
                System.out.println("В месяце 30 дней");
                break;
            default:
                System.out.println("Такого дня не существует");

        }

    }

    public static void main(String[] args) {

        dni(2);
        dni(9);
        dni(12);
        dni(15);
        dni(18);
    }

}
