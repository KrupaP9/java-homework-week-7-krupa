/*6. Write a java program to input any number and find out if it’s odd or even*/
package javaprogrammesweek7;

import java.util.Scanner;

public class JavaProgramme_6_OddOrEvenIfElse {
    public static void main(String[] args) {
        methodOddOrEven();
    }
    public static void methodOddOrEven(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int testNumber = scanner.nextInt();
        if (testNumber%2==0){
            System.out.println(testNumber +" is even");
        }else{
            System.out.println(testNumber + " is odd");
        }
        scanner.close();
    }
}
