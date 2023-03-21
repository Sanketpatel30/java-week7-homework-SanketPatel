package HomeworkWeek7;

/*WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
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
|===========================
*/

import java.util.Scanner;

public class Project5SalarySlip {
    public static void main(String[] args) {

        double HRA;
        double TA;
        double DA;
        double PF;
        double basicsalary;
        int empid;
        String empname;

        Scanner s = new Scanner(System.in);
        System.out.print("Enter employee Id: ");
        empid = s.nextInt();

        System.out.println("Enter Employee Name:  ");
        empname = s.next();

        System.out.println("Enter Employee Salary:  ");
        basicsalary = s.nextDouble();


        HRA = (basicsalary * 10) / 100;
        TA = (basicsalary * 9) / 100;
        DA = (basicsalary * 8) / 100;
        PF = (basicsalary * 20) / 100;

        double GrossSalary = (basicsalary + HRA + TA + DA) - (PF);

        System.out.println("|-------------------------------------|");
        System.out.println("|           Salary Slip               |");
        System.out.println("|-------------------------------------|");
        System.out.println("|Employee Id     : " + empid + "                    |");
        System.out.println("|Employee Name   : " + empname + "                  |");
        System.out.println("|-------------------------------------|");
        System.out.println("|Basic salary    : " + basicsalary + "              |");
        System.out.println("|HRA    10%      : " + HRA + "                      |");
        System.out.println("|TA     9%       : " + TA + "                      |");
        System.out.println("|DA     8%       : " + DA + "                      |");
        System.out.println("|PF    -20%&;    : " + PF + "                      |");
        System.out.println("|---------------------------------------------------|");
        System.out.println("| Gross Salary   : " + GrossSalary + "                      ");
        System.out.println("|------------------------------------------------|");
        s.close();
    }
}