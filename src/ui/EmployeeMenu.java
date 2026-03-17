package ui;

import model.Contract;
import model.Employee;
import model.Fulltime;
import model.Parttime;
import service.EmployeeService;

import java.sql.SQLOutput;
import java.util.Scanner;

public class EmployeeMenu {
    private EmployeeService employeeService;
    private final Scanner scanner = new Scanner(System.in);

    //Inversion of Control
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
                    viewAllEmployee();
                    break;
                case 3:
                    updateEmployee();
                    break;
                case 4:
                    deleteEmployee();
                    break;
                case 5:
                    searchById();
                    break;
                default:
                    System.out.println("Invalid choice!!");

            }
        }
    }

    //TODO Complete all the methods below
    private void searchById() {
    }

    private void deleteEmployee() {
    }

    private void updateEmployee() {
    }

    private void viewAllEmployee() {
        for(Employee employee: employeeService.getAllEmployee()){
            System.out.println(employee.toString());
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
        } else if (choice == 2) {
            System.out.println("Enter hourly rate: ");
            double hourlyRate = scanner.nextDouble();
            System.out.println("Enter hours per week: ");
            int hoursPerWeek = scanner.nextInt();

            employee = new Parttime(dept, id, name, baseSalary, false, hourlyRate, hoursPerWeek);

        } else if (choice == 3) {
            System.out.println("Contract end date: ");
            String endDate = scanner.next();
            System.out.println("Contract start date: ");
            String startDate = scanner.next();
            System.out.println("Agency Name: ");
            String agencyName = scanner.next();
            System.out.println("Contract value: ");
            double contractValue = scanner.nextDouble();

            employee = new Contract(dept, id, name, baseSalary, endDate, startDate, agencyName, contractValue);

        }

        if (employeeService.addEmployee(employee)){
            System.out.println("Employee added successfully");
        }else {
            System.out.println("Something went wrong!");
        }

    }


}
