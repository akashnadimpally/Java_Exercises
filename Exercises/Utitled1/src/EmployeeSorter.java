import java.util.ArrayList;
import java.util.Collections;

public class EmployeeSorter {

    public static void main(String []args) {

        ArrayList<Employee> eList = new ArrayList<>();

        ((ArrayList<Employee>) eList).add(new Employee("John Doe", 443, 5000));
        ((ArrayList<Employee>) eList).add(new Employee("Jim Dog", 552, 7500));
        ((ArrayList<Employee>) eList).add(new Employee("Tom Jerry", 923, 12400));
        ((ArrayList<Employee>) eList).add(new Employee("Jeff Quionon", 143, 83600));
        ((ArrayList<Employee>) eList).add(new Employee("Webb Martin", 567, 64500));

        for(Employee emp:eList) {
            System.out.println(emp.EmpDisplay());
        }

        Collections.sort(eList, new SalaryNameComparator());

        for(Employee emp:eList) {
            System.out.println(emp.EmpDisplay());
        }

    }

}
