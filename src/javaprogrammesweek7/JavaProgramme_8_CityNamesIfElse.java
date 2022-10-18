/*8. Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
any other alphabet should be invalid entry*/
package javaprogrammesweek7;

import java.util.Scanner;

public class JavaProgramme_8_CityNamesIfElse {
    public static void main(String[] args) {
        methodCityNames();
    }
    public static void methodCityNames(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your letter:");
        char letter = scanner.next().charAt(0);
        if (letter == 'A' || letter == 'a'){
            System.out.println("City is Ahmedabad");
        } else if (letter == 'B' || letter == 'b'){
            System.out.println("City is Berlin");
        } else if (letter == 'C' || letter == 'c'){
            System.out.println("City is Chicago");
        } else if (letter == 'D' || letter == 'd'){
            System.out.println("City is Denver");
        } else if (letter == 'E' || letter == 'e'){
            System.out.println("City is Edinburgh");
        } else if (letter == 'F' || letter == 'f'){
            System.out.println("City is Frankfurt");
        } else{
            System.out.println("Invalid Entry");
        }
        scanner.close();
    }
}
