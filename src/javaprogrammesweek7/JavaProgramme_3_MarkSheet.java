/*Write a java program to input student Name, roll No, and three subjects Math, Science and
English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
Input, Marks should between 0 to 100”) and find out total, percentage and result.
If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
%> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format*/

package javaprogrammesweek7;

import java.util.Scanner;

public class JavaProgramme_3_MarkSheet {
    public static void main(String[] args) {
        methodMarkSheet();
    }

    public static void methodMarkSheet() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Student's First Name: ");
        String studentName = scanner.nextLine();
        System.out.println("Enter Student's Roll Number: ");
        int studentRollNumber = scanner.nextInt();
        System.out.println("Enter Student's Mathematics marks: ");
        int studentMathMarks = scanner.nextInt();
        if (studentMathMarks<0 || studentMathMarks>100){
            System.out.println("Invalid Input, Marks should between 0 to 100");
            System.exit(0);
        }
        System.out.println("Enter Student's Science marks: ");
        int studentScienceMarks = scanner.nextInt();
        if (studentScienceMarks<0 || studentScienceMarks>100){
            System.out.println("Invalid Input, Marks should between 0 to 100");
            System.exit(0);
        }
        System.out.println("Enter Student's English marks: ");
        int studentEnglishMarks = scanner.nextInt();
        if (studentEnglishMarks<0 || studentEnglishMarks>100){
            System.out.println("Invalid Input, Marks should between 0 to 100");
            System.exit(0);
        }
        int studentTotalMarks = studentMathMarks + studentScienceMarks + studentEnglishMarks;
        float studentTotalMarksFloat = studentTotalMarks;
        float studentPercentage = (studentTotalMarksFloat * 100) / 300;
        System.out.println(" ________________________");
        System.out.println("|                        |");
        System.out.println("|       Mark Sheet       |");
        System.out.println("|________________________|");
        System.out.println("|   Name    : " + studentName + "        |");
        System.out.println("|   Roll No : " + studentRollNumber + "          |");
        System.out.println("|________________________|");
        System.out.println("|   Subjects:    Marks   |");
        System.out.println("|   Math    : " + studentMathMarks + "         |");
        System.out.println("|   Science : " + studentScienceMarks + "         |");
        System.out.println("|   English : " + studentEnglishMarks + "         |");
        /*if (studentMathMarks<0 || studentMathMarks>100 || studentScienceMarks<0 || studentScienceMarks>100 || studentEnglishMarks<0 || studentEnglishMarks>100){
            System.out.println("Invalid Input, Marks should between 0 to 100");
            System.exit(0);
        }*/
        System.out.println("|________________________|");
        System.out.println("|   Total   :" + studentTotalMarks + "         |");
        System.out.println("|________________________|");
        System.out.println("|   Percentage:" + studentPercentage + "      |");
        if (studentPercentage >= 80) {
            System.out.println("|   Result: Pass         |");
            System.out.println("|   Grade: A+            |");
        } else if (studentPercentage >= 60 ) {
            System.out.println("|   Result: Pass         |");
            System.out.println("|   Grade: A             |");
        } else if (studentPercentage >= 50 ) {
            System.out.println("|   Result: Pass         |");
            System.out.println("|   Grade: B             |");
        } else if (studentPercentage >= 35 ) {
            System.out.println("|   Result: Pass         |");
            System.out.println("|   Grade: C             |");
        } else {
            System.out.println("|   Result: Fail         |");
            System.out.println("|   Grade: F             |");
        }
        System.out.println("|________________________|");
        scanner.close();
    }
}
