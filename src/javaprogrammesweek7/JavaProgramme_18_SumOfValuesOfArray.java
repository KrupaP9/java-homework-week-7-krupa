//18. Write a Java program to sum values of an array.
package javaprogrammesweek7;

import java.util.Arrays;

public class JavaProgramme_18_SumOfValuesOfArray {
    public static void main(String[] args) {
        methodSumValuesOfArray();
    }

    public static void methodSumValuesOfArray() {
        int numArray[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int i = 0; i < numArray.length; i++) {
            sum = sum + numArray[i];
        }
        System.out.println("Array: "+ Arrays.toString(numArray));
        System.out.println("Sum of array = " + sum);
    }

}
