package javaprogrammesweek7;
/*2. Write a java program to input any year like (ex.2007) and find out if it is leap year or
not?*/
import java.util.Scanner;

public class JavaProgramme_2_LeapYearQuery {
    public static void main(String[] args) {
        methodLeapYear();
    }

    public static void methodLeapYear() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int testYear = scanner.nextInt();
        if ((testYear % 4 == 0) && testYear % 100 != 0) { //year is divisible by 4, not divisible by 100
            System.out.println(testYear + " is a leap year.");
        } else if (testYear % 400 == 0) { //year divisible by 4,by 100 and by 400
            System.out.println(testYear + " is a leap year.");
        } else {
            System.out.println(testYear + " is not a leap year.");
        }
        scanner.close();
    }
}

