/*5. WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
salary
HRA = basic salary 10%
DA = Basic salary 8%
TA = Basic salary 9%
PF= Basic salary 20%
Gross salary = basic salary + HRA + TA + DA –PF
Print in following format
_______________________________
| Salary Slip |
|______________________________|
| Employee Id : 2564 |
| Employee Name : Jay |
|______________________________|
| Basic Salary : 25000.0 |
| HRA 10% : 2500.0 |
| TA 8% : 2250.0 |
| DA 9% : 2000.0 |
| PF - 20& : 5000.0 |
|______________________________|
| Gross Salary : 26750.0 |
|===========================|*/
package javaprogrammesweek7;

import java.util.Scanner;

public class JavaProgramme_5_EmployeeSalarySlip {
    public static void main(String[] args) {
        methodSalarySlip();
    }
    public static void methodSalarySlip(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Employee Name");
        String empName = scanner.nextLine();
        System.out.println("Enter Employee Id");
        int empId = scanner.nextInt();
        System.out.println("Enter Employee Basic Salary");
        float empBasicSalary = scanner.nextFloat();
        float salaryHRA = ((empBasicSalary*10)/100);
        float salaryTA = ((empBasicSalary*9)/100);
        float salaryDA = ((empBasicSalary*8)/100);
        float salaryPF = ((empBasicSalary*20)/100);
        float grossSalary = empBasicSalary+salaryHRA+salaryTA+salaryDA-salaryPF;
        System.out.println(" _______________________________");
        System.out.println("|          Salary Slip          |");
        System.out.println("|_______________________________|");
        System.out.println("| Employee Id   :"+empId +"           |");
        System.out.println("| Employee Name :" +empName+ "            |");
        System.out.println("|_______________________________|");
        System.out.println("| Basic Salary  : "+empBasicSalary+"       |");
        System.out.println("| HRA 10%       : "+salaryHRA+"        |");
        System.out.println("| TA 8%         : "+salaryTA+"        |");
        System.out.println("| DA 9%         : "+salaryDA+"        |");
        System.out.println("| PF 20%        : "+salaryPF+"        |");
        System.out.println("|_______________________________|");
        System.out.println("| Gross Salary  : "+grossSalary+"       |");
        System.out.println("|===============================|");
        scanner.close();
    }
}
