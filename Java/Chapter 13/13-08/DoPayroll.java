package com.example.payroll;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static java.lang.System.out;

public class DoPayroll {

    public static void main(String[] args) {
        out.println("Starting payroll ...");
        cutCheck();
        out.println("Payroll completed.");
    }

    public static void cutCheck() {
        try {
            var diskScanner = new Scanner(new File("EmployeeInfo.txt"));
            String name = diskScanner.nextLine();
            double amountPaid = diskScanner.nextDouble();

            out.printf("Pay to the order of %s: $%,.2f\n", name, amountPaid);

            diskScanner.close();
        } catch (FileNotFoundException e) {
            out.println(e.getMessage());
        }
    }
}
