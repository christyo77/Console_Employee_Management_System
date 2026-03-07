import model.Fulltime;
import repository.ArrayListEmployeeRepository;
import repository.EmployeeRepository;
import service.EmployeeService;
import ui.EmployeeMenu;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        EmployeeRepository repository = new ArrayListEmployeeRepository();
        EmployeeService service = new EmployeeService(repository);
        EmployeeMenu employeeMenu = new EmployeeMenu(service);
        employeeMenu.show();
    }
}