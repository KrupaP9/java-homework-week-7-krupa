//19. Write a Java program to calculate the average value of array elements.
package javaprogrammesweek7;

import java.util.Arrays;

public class JavaProgramme_19_AverageOfValues {
    public static void main(String[] args) {
        methodAverageValuesOfArray();
    }

    public static void methodAverageValuesOfArray() {
        int numArray[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        int length = numArray.length;
        for (int i = 0; i < numArray.length; i++) {
            sum = sum + numArray[i];
        }
        double averageArray = sum/length;
        System.out.println("Array: "+Arrays.toString(numArray));
        System.out.println("Average of array = "+averageArray);
    }

}
