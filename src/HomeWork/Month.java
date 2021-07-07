package HomeWork;

public class Month {
    public static void dayQ(int n){
        switch (n){
            case 2:
                System.out.println("dnei 28");
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("dnei 30");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("snei 31");
                break;
            default:
                System.out.println("m s t p n nesush");
        }


    }

    public static void main(String[] args) {
        Month.dayQ(0);
        dayQ(1);
        Month.dayQ(2);
        dayQ(4);
        Month.dayQ(-5);
    }
}
