/*          Problem Statement
David needs to write a program to calculate the net
payable salary. The program will take basic salary as an
input from the user and calculate the total salary
along with the following components:
HRA, which is 50% of the basic salary
Special allowance, which is 75% of the basic salary
PF deduction, which is 12% of the basic salary
After calculating the preceding salary components,
the net payable salary should be displayed. Help David
to perform the preceding requirement.
*/


import java.util.Scanner;

public class NetPayableSalary{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter basic Slalry");
        double basic = sc.nextDouble();

        double hra = basic *0.50;
        double specialAllowance = basic *0.75;
        double pf = basic *0.12;

        double netSalary = basic + hra + specialAllowance - pf;
        System.out.println("Net Payable Salary: "+netSalary);
    }
}