import java.util.Comparator;

public class SalaryNameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        int salaryCompare = Float.compare(e1.getEmpSalary(), e2.getEmpSalary());

        if(salaryCompare != 0) {
            return salaryCompare;
        }
        else {
            return e1.getEmpName().compareTo(e2.getEmpName());
        }

    }

}
