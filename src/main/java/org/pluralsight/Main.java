package org.pluralsight;

import java.util.Scanner;

public class Main
{
    static void main()
    {
        // declare variables
        Scanner scanner = new Scanner(System.in);
        // create other variables


        // display home screen
        System.out.println("Welcome to Abeer's Math App");

        System.out.print("Enter the first number: ");
        // get input from the user using scanner.nextLine() or scanner.nextDouble()
        double firstNumber = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        // get input from the user using scanner.nextLine() or scanner.nextDouble()
        double secondNumber = scanner.nextDouble();
        scanner.nextLine();



        System.out.println();
        System.out.println("What would you like to do?");
        System.out.println("(A) Add");
        System.out.println("(S) Subtract");
        System.out.println("(M) Multiply");
        System.out.println("(D) Divide");
        System.out.print("Enter your selection: ");
        // get the user select option

        String selection = scanner.nextLine();

        if(selection.equalsIgnoreCase("A")) {
            double sum = firstNumber + secondNumber;
            System.out.println(firstNumber + "+" + secondNumber + "=" + sum);

        }else if(selection.equalsIgnoreCase("S")){
            double sub = firstNumber - secondNumber;
            System.out.println(firstNumber + "-" + secondNumber + "=" + sub);
        }else if(selection.equalsIgnoreCase("M")) {
            double multi = firstNumber * secondNumber;
            System.out.println(firstNumber + "*" + secondNumber + "=" + multi);
        } else if(selection.equalsIgnoreCase("D")) {
            double div = firstNumber / secondNumber;
            System.out.println(firstNumber + "/" + secondNumber + "=" + div);
        } else {
            System.out.println("you made a BAD choice");
        }

    }
}

