import java.util.Scanner;

class EmployeeSalaryManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== EMPLOYEE SALARY MANAGEMENT =====");

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Basic Salary: ");
        double basicSalary = sc.nextDouble();

        System.out.print("Enter HRA: ");
        double hra = sc.nextDouble();

        System.out.print("Enter Transport Allowance: ");
        double transport = sc.nextDouble();

        System.out.print("Enter Deduction: ");
        double deduction = sc.nextDouble();

        double grossSalary = basicSalary + hra + transport;
        double netSalary = grossSalary - deduction;

        System.out.println("\n===== EMPLOYEE SALARY DETAILS =====");
        System.out.println("Employee Name       : " + name);
        System.out.println("Employee ID         : " + id);
        System.out.println("Basic Salary        : " + basicSalary);
        System.out.println("HRA                 : " + hra);
        System.out.println("Transport Allowance : " + transport);
        System.out.println("Gross Salary        : " + grossSalary);
        System.out.println("Deduction           : " + deduction);
        System.out.println("Net Salary          : " + netSalary);

        sc.close();
    }
}
