package com.pluralsight;

import java.util.*;

public class cd_calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double deposit = prompt_for_float("How much money would you like to deposit: ");
        double interest_rate = prompt_for_float("What is the interest rate: ");
        double years = prompt_for_float("How many years would you like to leave it for: ");

        System.out.println("-------------------------------------------------------");

        System.out.printf("Your CD balance after "+ (int)years + " years would be:          $%.2f\n", cd_calculator(deposit,interest_rate,years));

        double  interest_gained = cd_calculator(deposit,interest_rate,years) - deposit;
        System.out.printf("The total interest that you have gained is:      $%.2f\n" ,interest_gained);
    }

    public static double prompt_for_float(String prompt){
        System.out.print(prompt);
        double number = scanner.nextDouble();
        return number;
    }

    /*
    * formula for CD:
    * A = P (1 + r/n) ^(nt)
    * P is the principal (the starting amount)
    * r is the annual interest rate, which is written as a decimal
    * n is the number of times the interest compounds each year
    * t is the time, or total number of years
    * A is the total amount you will wind up with at the end of the timeframe
     */

    public static double cd_calculator(double deposit, double interest, double years){
        double inside_paren, total_cd;
        interest = interest/100;
        inside_paren = Math.pow((1 + interest/365), years * 365);
        return total_cd = deposit * inside_paren;
    }
}
