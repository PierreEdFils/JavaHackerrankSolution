package com.careerdevs;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class JavaCurrencyFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        Locale usLocale = new Locale.Builder().setLanguage("en").setRegion("US").build();
        Locale indiaLocale = new Locale.Builder().setLanguage("en").setRegion("IN").build();
        Locale chinaLocale = new Locale.Builder().setLanguage("zh").setRegion("CN").build();
        Locale franceLocale = new Locale.Builder().setLanguage("fr").setRegion("FR").build();

        NumberFormat usFormat = NumberFormat.getCurrencyInstance(usLocale);
        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(indiaLocale);
        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(chinaLocale);
        NumberFormat franceFormat = NumberFormat.getCurrencyInstance(franceLocale);

        String us = usFormat.format(payment);
        String india = indiaFormat.format(payment);
        String china = chinaFormat.format(payment);
        String france = franceFormat.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
