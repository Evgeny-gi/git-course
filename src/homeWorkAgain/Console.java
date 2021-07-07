package homeWorkAgain;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Input first number");
        int num1 = s.nextInt();
        System.out.println("Input 2nd number");
        int num2 = s.nextInt();
        System.out.println("Input number operation: ");
        int num = s.nextInt();
        int sum = 0;
        


        switch (num){
            case 1:
                sum = num1 + num2;
                break;
            case 2:
                sum = num1 - num2;
                break;
            case 3:
                sum = num1 * num2;
                break;
            default:
                System.out.println("операция не определена");
        }

        if (num>=1 && num<=3){
            System.out.printf("Результат: %d", sum);
        }

        s.close();
        }
    }

