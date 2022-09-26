package Calcula;

import java.util.Scanner;

public class Cal {


    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        int choice;
        int num1, num2;
        while(true) {
            System.out.println("Enter the two numbers");

            num1 = op.nextInt();
            num2 = op.nextInt();
            choice = op.nextInt();
            switch (choice) {
                case 1:
                    System.out.println(num1 + num2);
                    break;
                case 2:
                    System.out.println(num1 - num2);
                    break;
                case 3:
                    System.out.println(num1 * num2);
                    break;
                case 4:
                    System.out.println(num1 / num2);
                    break;

            }
        }
    }

}
