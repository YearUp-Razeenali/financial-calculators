package com.pluralsight;

import java.util.*;

public class annuity_calculator {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double monthly_payment = prompt_for_double("How much would you be willing to pay monthly: ");
        double interest_rate = prompt_for_double("What is the expected monthly rate: ");
        double years = prompt_for_double("How many years do you plan on paying: ");
        System.out.println("----------------------------------------------------");
        double monthly_interest = (2.5 / 100)/12;
        System.out.printf("You would have to invest a total of: $%.2f" ,annuity_calc(monthly_payment, interest_rate, years));
    }

    public static double prompt_for_double(String prompt){
        System.out.print(prompt);
        double number = scanner.nextDouble();
        return number;
    }

    public static double annuity_calc(double monthly_payments, double interest_rate, double years){
        double monthly_interest = (2.5 / 100)/12;
        double total_months = -12 * 20;
        double parenthesis = Math.pow(1 + monthly_interest,total_months);
        return monthly_payments * ((1-parenthesis) / monthly_interest);
    }
}


