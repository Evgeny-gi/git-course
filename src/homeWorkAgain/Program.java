package homeWorkAgain;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Input a number: ");
        int num = in.nextInt();

        System.out.printf("You number: %d /n", num);
        in.close();
    }
}