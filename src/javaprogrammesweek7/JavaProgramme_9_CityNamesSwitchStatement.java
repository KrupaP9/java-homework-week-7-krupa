/*9. Input any alphabet from “A" to “F” and print their city name accordingly (use switch statement) if
any other alphabet should be invalid entry*/
package javaprogrammesweek7;

import java.util.Scanner;

public class JavaProgramme_9_CityNamesSwitchStatement {
    public static void main(String[] args) {
        methodCityNames();
    }
    public static void methodCityNames(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any letter from A to F: ");
        char letter = scanner.next().charAt(0);
        switch(letter){
            case 'A':
                System.out.println("City is Ahmedabad");
                break;
            case 'B':
                System.out.println("City is Berlin");
                break;
            case 'C':
                System.out.println("City is Chicago");
                break;
            case 'D':
                System.out.println("City is Denver");
                break;
            case 'E':
                System.out.println("City is Edinburgh");
                break;
            case 'F':
                System.out.println("City is Frankfurt");
                break;
            default:
                System.out.println("Invalid Entry");
        }
        scanner.close();
    }
}
