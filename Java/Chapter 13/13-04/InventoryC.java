package com.example.inventory;

import java.text.NumberFormat;
import java.util.Scanner;

import static java.lang.System.out;

public class InventoryC {

    public static void main(String[] args) {
        final double boxPrice = 3.25;
        var keyboard = new Scanner(System.in);
        NumberFormat currency = NumberFormat.getCurrencyInstance();

        out.print("How many boxes do we have? ");
        String numBoxesIn = keyboard.next();

        try {
            int numBoxes = Integer.parseInt(numBoxesIn);
            if (numBoxes < 0) {
                throw new OutOfRangeException("You typed " + numBoxes +
                        ". There's no such thing as a negative box.");
            }

            out.print("The value is ");
            out.println(currency.format(numBoxes * boxPrice));
        } catch (NumberFormatException e) {
            out.print(e.getMessage());
            out.println(" ... Cannot interpret the input.");
        } catch (OutOfRangeException e) {
            out.println(e.getMessage());
        }

        keyboard.close();
    }
}
