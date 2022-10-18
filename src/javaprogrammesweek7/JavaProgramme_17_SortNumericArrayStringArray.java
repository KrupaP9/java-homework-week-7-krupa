//17. Write a Java program to sort a numeric array and a string array.
package javaprogrammesweek7;

import java.util.Arrays;

public class JavaProgramme_17_SortNumericArrayStringArray {
    public static void main(String[] args) {
        methodSortingArrays();
    }

    public static void methodSortingArrays()    {
        int arrayNum[] = {9, 5, 7, 3, 1};
        String arrayStr[] = {"Cairo", "Amsterdam", "Beijing", "Denver"};
        Arrays.toString(arrayNum);
        Arrays.toString(arrayStr);
        System.out.println("Before Sorting Numerical:" + Arrays.toString(arrayNum));
        System.out.println("Before Sorting String" + Arrays.toString(arrayStr));
        Arrays.sort(arrayNum);
        Arrays.sort(arrayStr);
        System.out.println("After Sorting Numerical"+Arrays.toString(arrayNum));
        System.out.println("After Sorting String"+Arrays.toString(arrayStr));
    }


}
