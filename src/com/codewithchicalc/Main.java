package com.codewithchicalc;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    byte TOTAL_MONTH_YEAR = 12;
        byte TOTAL_PERCENT = 100;

        int principal = 0;
        int paymentsNumber = 0;
        float monthlyInterest = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Principal: ");
            principal = scanner.nextInt();
            if (principal >= 1000 && principal <= 1_000_000)
                break;
            System.out.println("Enter a value between 1000 and 1000000");
        }

        while (true) {
            System.out.println("Annual Interest Rate: ");
            float annualInterest = scanner.nextFloat();
            if (annualInterest >=1 && annualInterest <= 30)
                monthlyInterest = annualInterest / TOTAL_PERCENT / TOTAL_MONTH_YEAR;
                break;
        }
        System.out.println("Enter a value between 1 and 30");

        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, paymentsNumber))
                / (Math.pow(1 + monthlyInterest, paymentsNumber) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format();
        System.out.println("Mortgage: " + mortgageFormatted);
    }
}
