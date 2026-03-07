import model.Fulltime;
import repository.ArrayListEmployeeRepository;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ArrayListEmployeeRepository employees = new ArrayListEmployeeRepository();
        employees.addEmployee(new Fulltime("QA", 2, "Seyi", 10000, true,500));
        employees.addEmployee(new Fulltime("IT", 3, "Fidelis", 30000, true,600));

      //  System.out.println(employees.getById(2));
        employees.updateEmployee(2,new Fulltime("Healthcare", 5, "John", 40000, false, 100));
       // System.out.println(employees.getById(5));
        employees.deleteEmployee(5);

        System.out.println(employees.getAllEmployees());
    }
}