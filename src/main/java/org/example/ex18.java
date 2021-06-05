package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Exercise 18 Solution
 *  Copyright 2021 Drake Scott
 */

public class ex18 {

    public static double fromFahrenheit(double temp) {
        return (temp - 32) * 5 / 9;
    }

    public static double fromCelsius(double temp) {
        return (temp * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Press C to convert from Fahrenheit to Celsius.\n" +
                "Press F to convert from Celsius to Fahrenheit.\nYour choice: ");
        String selection = input.nextLine();
        selection = selection.toLowerCase();
        double temp, output;
        String type = "";

        if (selection.equals("c")) {
            type = "Celsius";
            System.out.print("Please enter the temperature in Fahrenheit: ");
            temp = input.nextDouble();
            output = fromFahrenheit(temp);
        } else {
            type = "Fahrenheit";
            System.out.print("Please enter the temperature in Celsius: ");
            temp = input.nextDouble();
            output = fromCelsius(temp);
        }


        String outputString = "The temperature in " + type + " is " + output + ".";
        System.out.println(outputString);

    }
}
