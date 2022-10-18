/*1. Write a java program that tells us that Input number is odd or even?
HINT: use ternary operator (? :)*/
package javaprogrammesweek7;

import java.util.Scanner;

public class JavaProgramme_1_InputOddOrEven {
    public static void main(String[] args) {
        methodOddOrEven();
    }
    public static void methodOddOrEven(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number = scanner.nextInt();
        scanner.close();
        String result = number%2==0? "Even":"Odd";
        System.out.println(number + " is " + result);
    }
}
