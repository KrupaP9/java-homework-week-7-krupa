/*16. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
“ZERO”*/
package javaprogrammesweek7;

import java.util.Scanner;

public class JavaProgramme_16_PositiveNegativeZeroCheck {
    public static void main(String[] args) {
        methodPositiveNegativeZero();
    }
    public static void methodPositiveNegativeZero(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int testNum = scanner.nextInt();
        if (testNum>0){
            System.out.println(testNum+" is positive.");
        }else if (testNum<0){
            System.out.println(testNum+" is negative.");
        } else{
            System.out.println("Input is zero");
        }
        scanner.close();
    }
}
