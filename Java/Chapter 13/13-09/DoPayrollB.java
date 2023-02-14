package com.example.payroll;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static java.lang.System.out;

public class DoPayrollB {

    public static void main(String[] args) {
        out.println("Starting payroll ...");
        try {
            cutCheck();
            out.println("Payroll completed.");
        } catch (FileNotFoundException e) {
            out.println(e.getMessage());
        }
    }

    public static void cutCheck() throws FileNotFoundException {
        var diskScanner = new Scanner(new File("EmployeeInfo.txt"));
        String name = diskScanner.nextLine();
        double amountPaid = diskScanner.nextDouble();

        out.printf("Pay to the order of %s: $%,.2f\n", name, amountPaid);

        diskScanner.close();
    }
}
