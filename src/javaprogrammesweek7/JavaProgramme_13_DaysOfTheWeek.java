/*13. Write a Java program which input any number between 1 to 7 and it print The Days
name MONDAY, TUESDAY.....SUNDAY of the week accordingly by using switch.
NOTE: if number is out of selection Print message “Week contains 1 to 7 days”*/
package javaprogrammesweek7;

import java.util.Scanner;

public class JavaProgramme_13_DaysOfTheWeek {
    public static void main(String[] args) {
        methodDaysOfTheWeek();
    }
    public static void methodDaysOfTheWeek(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of the day: ");
        int dayNumber = scanner.nextInt();
        switch(dayNumber){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Week contains 1 to 7 days");
        }
        scanner.close();
    }
}
