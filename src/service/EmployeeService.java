package service;

import model.Employee;
import repository.EmployeeRepository;

import java.util.List;

public class EmployeeService {
    private EmployeeRepository employeeRepository;

    //Inversion of control
    public EmployeeService(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    public boolean addEmployee(Employee employee){
        //check if employee ID exist before adding
        if(getEmployeeById(employee.getId()) == null){
            employeeRepository.addEmployee(employee);
            return true;
        }
        else {
            System.out.println("Employee Id already exist!!!");
        }
        return false;
    }


    public Employee getEmployeeById(int id){
        return employeeRepository.getById(id);
    }
    public List<Employee> getAllEmployee(){
        return employeeRepository.getAllEmployees();
    }


    //Complete the service for delete and updating employee;
    public void deleteEmployee (int employeeID) {
        employeeRepository.deleteEmployee(employeeID);
    }

    public void updateEmployee (int employeeID, Employee employee) {
        employeeRepository.updateEmployee(employeeID,employee);
    }
}
