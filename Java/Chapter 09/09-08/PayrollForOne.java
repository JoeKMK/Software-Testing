package com.example.payroll;

public class PayrollForOne {

    public static void main(String[] args) {

        var ftEmployee = new FullTimeEmployee(5000.00);

        ftEmployee.setName("Barry Burd");
        ftEmployee.setJobTitle("CEO");
        ftEmployee.setBenefitDeduction(500.00);
        ftEmployee.cutCheck(ftEmployee.findPaymentAmount());
        System.out.println();
    }
}
