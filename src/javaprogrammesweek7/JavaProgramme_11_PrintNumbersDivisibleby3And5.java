/*11. Write a java program to print the numbers between 1 to 100 which can be divided by 3
and 5 separately.*/
package javaprogrammesweek7;

public class JavaProgramme_11_PrintNumbersDivisibleby3And5 {
    public static void main(String[] args) {
        methodDivisibleBy3And5();
    }
    public static void methodDivisibleBy3And5(){
        System.out.println("Numbers between 1 and 100 divisible by 3");
        for (int i =1; i<=100; i++){
            if(i%3==0)
                System.out.println(i+" , ");
        }
        System.out.println("Numbers between 1 and 100 divisible by 5");
        for (int i = 1; i<=100;i++){
            if(i%5==0)
                System.out.println(i+" , ");
        }

    }
}
