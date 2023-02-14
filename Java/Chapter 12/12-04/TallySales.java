package com.example.sales;

import java.text.NumberFormat;
import java.util.ArrayList;

public class TallySales {

    public static void main(String[] args) {
        ArrayList<Sale> sales = new ArrayList<Sale>();
        NumberFormat currency = NumberFormat.getCurrencyInstance();

        fillTheList(sales);

        double runningTotal = 0;
        for (Sale sale : sales) {
            if (itemIsDVD(sale)) {
                runningTotal += sale.getPrice();
            }
        }

        System.out.println(currency.format(runningTotal));
    }

    static boolean itemIsDVD(Sale sale) {
        return sale.getItem().equals("DVD");
    }

    static void fillTheList(ArrayList<Sale> sales) {
        sales.add(new Sale("DVD", 15.00));
        sales.add(new Sale("Book", 12.00));
        sales.add(new Sale("DVD", 21.00));
        sales.add(new Sale("CD", 5.25));
    }
}
