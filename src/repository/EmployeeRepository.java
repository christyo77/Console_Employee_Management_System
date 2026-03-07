package repository;

import model.Employee;

import java.util.ArrayList;

 public interface EmployeeRepository {

    //search for an employee by ID
    Employee getById(int employeeId);

    //Add employee
    void addEmployee(Employee employee);

    //view all employees
    ArrayList<Employee> getAllEmployees();

    //update employees
    void updateEmployee(int employeeId, Employee employee);


    //delete
    void deleteEmployee(int employeeId);
}
