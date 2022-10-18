/*10.Write a java program to input any two number and ask user to enter their symbol (+, -,
/, *) find addition, Subtraction, multiplication and division according to their symbol
(using if else)*/
package javaprogrammesweek7;

import java.util.Scanner;

public class JavaProgramme_10_CalculationOperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        float inputNum1 = scanner.nextFloat();
        System.out.println("Enter second number: ");
        float inputNum2 = scanner.nextFloat();
        System.out.println("Enter operator (+ or - or x or /)");
        char inputOperator = scanner.next().charAt(0);

        if (inputOperator == '+'){
            System.out.println(inputNum1 + " + "+ inputNum2 + " = "+ (inputNum1+inputNum2));
        } else if (inputOperator == '-'){
            System.out.println(inputNum1 + " - "+ inputNum2 + " = "+ (inputNum1-inputNum2));
        } else if (inputOperator == '*' || inputOperator == 'x'){
            System.out.println(inputNum1 + " x "+ inputNum2 + " = "+ (inputNum1*inputNum2));
        } else if (inputOperator == '/'){
            System.out.println(inputNum1 + " / "+ inputNum2 + " = "+ (inputNum1/inputNum2));
        }
        scanner.close();
    }
}
