package com.pluralsight;

import java.util.*;

public class mortgage_calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        float principle = prompt_for_float("Please enter your principle: ");
        float interest_rate = prompt_for_float("Please enter your interest rate: ");
        float years = prompt_for_float("Please enter the amount of years of your mortgage: ");

        System.out.printf("Your monthly payment would be: $%.2f\n", monthly_mortgage(principle, interest_rate,years));
        System.out.printf("Your total interest payment would be: $%.2f", total_interest(principle,(monthly_mortgage(principle, interest_rate,years)), years));

    }

    public static float prompt_for_float(String prompt){
        System.out.print(prompt);
        float number = scanner.nextFloat();
        return number;
    }

    public static double monthly_mortgage(float principle, float interest, float years){
        double interest_as_deci = (interest/100)/12;
        double years_into_months = 12 * 15;

        double top_frac = (principle*interest_as_deci)* Math.pow((1+interest_as_deci), years_into_months);
        double bot_frac = Math.pow((1+interest_as_deci),years_into_months)-1;
        double month_payment = top_frac/bot_frac;
        return month_payment;
    }

    public static double total_interest(float principle, double month_pay, float years){
        double total_interest;
        total_interest = month_pay * (years * 12);
        return total_interest -= principle;
    }
}
