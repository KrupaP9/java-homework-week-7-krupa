/*7. Write a java program input sales id, seller's name, sales amount, and salary basic and
then fined this sales
Commission
Sales amount >= 50,000 35%
Sales amount >= 30,000 20%
>= 20,000 10%
>= 10,000 5%
< 10,000 2%*/
package javaprogrammesweek7;

import java.util.Scanner;

public class JavaProgramme_7_CommisionCalculation {
    public static void main(String[] args) {
        methodCommissionCalculator();
    }

    public static void methodCommissionCalculator() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Sales ID:");
        int salesID = scanner.nextInt();
        System.out.println("Enter Seller Name:");
        String sellerName = scanner.next();
        System.out.println("Enter Sales Amount:");
        int salesAmount = scanner.nextInt();
        System.out.println("Enter Salary Basic:");
        int salaryBasic = scanner.nextInt();
        System.out.println("Sales ID: " + salesID);
        System.out.println("Seller Name: " + sellerName);
        System.out.println("Sales Amount: " + salesAmount);
        System.out.println("Salary Basic: " + salaryBasic);
        if (salesAmount >= 50000) {
            System.out.println("Commission : " + ((salesAmount * 35) / 100));
        } else if (salesAmount >= 30000) {
            System.out.println("Commission : " + ((salesAmount * 20) / 100));
        } else if (salesAmount >= 20000) {
            System.out.println("Commission : " + ((salesAmount * 10) / 100));
        } else if (salesAmount >= 10000) {
            System.out.println("Commission : " + ((salesAmount * 5) / 100));
        } else {
            System.out.println("Commission : " + ((salesAmount * 2) / 100));
        }
        scanner.close();
    }
}
