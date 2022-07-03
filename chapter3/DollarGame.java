package chapter3;

import java.util.Scanner;

public class DollarGame {

    public static void main(String[] args){

        double pennie = 0.01;
        double nickle = 0.05;
        double dime = 0.10;
        double quarter = 0.025;
        int dollar = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of pennies");
        int numOfPennies = scanner.nextInt();

        System.out.println("Enter the number of nickels");
        int numOfNickels = scanner.nextInt();

        System.out.println("Enter the number of dimes");
        int numOfDimes = scanner.nextInt();

        System.out.println("Enter the number of quarters");
        int numOfQuarters = scanner.nextInt();

        // close scanner
        scanner.close();

        double total = numOfPennies*pennie + numOfNickels*nickle + numOfDimes*dime + numOfQuarters*quarter;

        if (total > dollar){
            double amount = total - dollar;
           System.out.println("You went over a Dollar by: " + String.format("%.2f", amount) + " cents");
        } else if (total < dollar) {
            double amount = dollar - total;
            System.out.println("You went under a Dollar by: " + String.format("%.2f", amount) + " cents");
        } else {
          System.out.println("YOU WIN! THAT'S EXACTLY $1.00");
        }


    } // end of main()

}
