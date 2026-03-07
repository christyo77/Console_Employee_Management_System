package service;

import model.Employee;
import repository.EmployeeRepository;

import java.util.List;

public class EmployeeService {
    private EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    public void addEmployee(Employee employee){
        employeeRepository.addEmployee(employee);
    }
    public Employee getEmployeeById(int id){
        return employeeRepository.getById(id);
    }
    public List<Employee> getAllEmployee(){
        return employeeRepository.getAllEmployees();
    }

    //TODO
    //Complete the service for delete and updating employee;
}
