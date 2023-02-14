/*
 * This code does not compile.
 * This code does not compile.
 * This code does not compile.
 * This code does not compile.
 * This code does not compile.
 * This code does not compile.
 * This code does not compile.
 * This code does not compile.
 * This code does not compile.
 */

package com.example.payroll;

import java.io.File;
import java.util.Scanner;

import static java.lang.System.out;

public class DoNotDoPayroll {

    public static void main(String[] args) {
        out.println("Starting payroll ...");
        doPayroll();
        out.println("Payroll completed.");
    }

    public static void doPayroll() {
        var diskScanner = new Scanner(new File("EmployeeInfo.txt"));
        String name = diskScanner.nextLine();
        double amountPaid = diskScanner.nextDouble();

        out.printf("Pay to the order of %s: $%,.2f\n", name, amountPaid);

        diskScanner.close();
    }

}
