package com.mendes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number;
        int sum = 0, counter = 0, positiveNumber = 0, negativeNumber = 0;
        System.out.println("enter 0 for exit...");

        while (true) {
            System.out.println("enter number:");
            number = scanner.nextInt();
            if (number > 0) {
                positiveNumber++;
            }
            if (number < 0) {
                negativeNumber++;
            }
            if (number == 0) {
                System.out.println("program exit...");
                break;
            }
            sum = sum + number;
            counter++;
        }
        System.out.println("sum: " + sum + " counter: " + counter + " positive number: " + positiveNumber + " negative number: " + negativeNumber);
    }
}