package chapter7;
import java.util.Scanner;

public class DayOfTheWeek {

    public static void main(String[] args){

        String [] weekDays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a corresponding number in range of 1-7 -> Sunday-Saturday");
        int dayNum = scanner.nextInt();

        scanner.close();

        System.out.println("The number corresponds to: " + weekDays[dayNum-1]);

    }
}
