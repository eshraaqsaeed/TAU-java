package chapter5;

import java.util.Scanner;

public class PhoneBillCalculator {

    public static void main(String [] args){

        double baseCost;
        int overageMin;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the base cost of the plan:");
        baseCost = scanner.nextDouble();

        System.out.println("Enter the overage minutes:");
        overageMin = scanner.nextInt();

        double ovgMinCharge = chargeMinutes(overageMin);
        double afterTax = calculateTax(ovgMinCharge + baseCost);
        double billState = billStatement(baseCost, ovgMinCharge, afterTax);

        System.out.println("Your Bill Statement is:");
        System.out.println("Plan: $" + String.format("%.2f", baseCost));
        System.out.println("Overage: $" + String.format("%.2f", ovgMinCharge));
        System.out.println("Tax: $" + String.format("%.2f", afterTax));
        System.out.println("Total: $82.45" + String.format("%.2f", billState));

    }

    public static double chargeMinutes(int minutes){

        double chargeMin = 0.25;
        double charged = chargeMin * minutes;

        return charged;
    }

    public static double calculateTax(double subtotal){

        double tax = 0.15;
        double taxed = tax * subtotal;

        return taxed;
    }

    public static double billStatement(double plan, double ovgMinCharge, double taxAdded){

        double totalBill;
        totalBill = plan + ovgMinCharge + taxAdded;

        return totalBill;
    }

}
