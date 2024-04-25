public class Employee {
    private String EmpName;
    private int EmpID;
    private float EmpSalary;

    public Employee(String empName, int empID, float empSalary) {
        EmpName = empName;
        EmpID = empID;
        EmpSalary = empSalary;
    }

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String empName) {
        EmpName = empName;
    }

    public int getEmpID() {
        return EmpID;
    }

    public void setEmpID(int empID) {
        EmpID = empID;
    }

    public float getEmpSalary() {
        return EmpSalary;
    }

    public void setEmpSalary(float empSalary) {
        EmpSalary = empSalary;
    }
//    @Override
    public String EmpDisplay() {
//        System.out.println("Employee Name: "+EmpName);
//        System.out.println("Employee ID: "+EmpID);
//        System.out.println("Employee Salary: "+EmpSalary);

        return "Employee Name: "+EmpName+"||"+"Employee ID: "+EmpID+"||"+"Employee Salary: "+EmpSalary;
    }
}
