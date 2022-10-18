//12. Write a program that tells us input value is number or an alphabet or symbol.
package javaprogrammesweek7;

import java.util.Scanner;

public class JavaProgramme_12_NumberOrAlphabetOrSymbol {
    public static void main(String[] args) {
        methodNumberOrAlphabetOrSymbol();
    }

    public static void methodNumberOrAlphabetOrSymbol() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the character: ");
        char inputCharacter = scanner.next().charAt(0);
        if (inputCharacter >= 'A' && inputCharacter <= 'Z' || inputCharacter >= 'a' && inputCharacter <= 'z') {
            System.out.println("Alphabet input");
        } else if (inputCharacter >= '0'&&inputCharacter<=0) {
            System.out.println("Numerical input");
        } else{
            System.out.println("Symbol input");
        }
        scanner.close();
    }
}
