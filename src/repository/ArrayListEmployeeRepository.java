package repository;

import model.Employee;

import javax.xml.crypto.dsig.XMLSignature;
import java.util.ArrayList;

public class ArrayListEmployeeRepository implements EmployeeRepository {

    ArrayList<Employee> employeeList = new ArrayList<>();


    @Override
    public Employee getById(int employeeId) {
//       // for (Employee e: employeeList) {
//            if (e.getId() == employeeId) {
//                return e;
//            }
      //  }
        for(int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId() == employeeId) {
                return employeeList.get(i);
            }
        }
        return null;
    }

    @Override
    public void addEmployee(Employee employee) {
    employeeList.add(employee);

    }

    @Override
    public ArrayList<Employee> getAllEmployees() {
        return employeeList;
    }

    @Override
    public void updateEmployee(int employeeId, Employee employee) {
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId() == employeeId) {
                employeeList.set(i,employee);
                return;
            }
        }

    }


    @Override
    public void deleteEmployee(int employeeId) {
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId() == employeeId) {
                employeeList.remove(i);
                return;
            }
        }
    }

}
