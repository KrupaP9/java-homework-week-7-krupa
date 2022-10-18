//20. Write a Java program to test if an array contains a specific value.
package javaprogrammesweek7;

import java.util.Arrays;
import java.util.Scanner;

public class JavaProgramme_20_ArrayValueCheck {
    public static void main(String[] args) {
        methodArrayValueCheck();
    }

    public static void methodArrayValueCheck() {
        Scanner scanner = new Scanner(System.in);
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Array is: " + Arrays.toString(array));
        System.out.println("Enter the element you want to check: ");
        int testNumUser = scanner.nextInt();
        scanner.close();
        for (int i = 0; i < array.length; i++) {
            if (testNumUser == array[i]) {
                System.out.println("Array contains that value");
                System.exit(0);
            }
        }
        System.out.println("Array doesn't contain that value");
    }
}
