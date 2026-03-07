package ui;

import model.Employee;
import model.Fulltime;
import service.EmployeeService;

import java.sql.SQLOutput;
import java.util.Scanner;

public class EmployeeMenu {
    private EmployeeService employeeService;
    private final Scanner scanner = new Scanner(System.in);

    public EmployeeMenu(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    boolean isTrue = true;
    public void show(){
        while(isTrue){
            System.out.println("---Employee Management System");
            System.out.println("1. Add employee");
            System.out.println("2. View employees");
            System.out.println("3. Update employee");
            System.out.println("4. Delete employee");
            System.out.println("5. Search employee by id");
            System.out.println("0. To exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            //TODO
            //Implement getEmployee by id
            // update employee
            switch (choice){
                case 1:
                    addEmployee();
                    break;
                case 2:
                    System.out.println(employeeService.getAllEmployee());
                    break;
                default:
                    System.out.println("Invalid choice!!");

            }
        }
    }

    public void addEmployee(){
        System.out.println("1. Full time 2.Part time 3. Contract");
        int choice = scanner.nextInt();

        System.out.print("Enter emplyee ID: ");
        int id = scanner.nextInt();

        System.out.print("Employee name: ");
        String name = scanner.next();

        System.out.print("Department: ");
        String dept = scanner.next();

        System.out.print("Base Salary: ");
        double baseSalary = scanner.nextDouble();

        Employee employee = null;

        if(choice == 1){
            System.out.print("Enter annual bonus: ");
            double annualBonus = scanner.nextDouble();
            employee = new Fulltime(dept, id, name, baseSalary, true, annualBonus);
            employeeService.addEmployee(employee);
        } else if (choice == 2) {

        } else if (choice == 3) {

        }

    }
}
