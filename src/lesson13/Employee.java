package lesson13;

public class Employee {
    public static void main(String[] args) {

        int denNedeli = 3;

        switch (denNedeli * 3){
            case 1:

            case 2:

            case 3:

            case 4:

            case 5:
                System.out.println("Rabota 1800");
                break;
            case 6:
                System.out.println("Rabota 1400");
                break;
            case 7:
                System.out.println("Rabota net");
                break;
            default:
                System.out.println("takoho dna net");
        }
    }
}
