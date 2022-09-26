package com.nest.menudriven;

import java.util.Scanner;

public class MenuDriven {
    public static void main(String[] args) {
        int choice;
        while(true)
        {

            System.out.println("1. add student");
            System.out.println("2. Search student");
            System.out.println("2. delete student");
            System.out.println("3. View all Student");
            System.out.println("5. exit");
            System.out.println("Please Select an Option");
            Scanner option = new Scanner(System.in);
            choice=option.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.println("add student select");
                    break;
                case 2:
                    System.out.println("search student select");
                    break;
                case 3:
                    System.out.println("delete student select");
                    break;
                case 4:
                    System.out.println("view student select");
                    break;
                case 5:
                    System.exit(0);

            }
        }
    }
}
