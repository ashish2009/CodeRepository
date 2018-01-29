package code.repo.oops.constructor_newInstance;

public class Employee {

	private int empId;
    private String empName;
    private int empSalary;
    
    public Employee(int empId, String empName, int empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
    }
    
    public int getEmpId() {
        return empId;
    }
    
    public void setEmpId(int empId) {
        this.empId = empId;
    }
    
    public String getEmpName() {
        return empName;
    }
    
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    
    public int getEmpSalary() {
        return empSalary;
    }
    
    public void setEmpSalary(int empSalary) {
        this.empSalary = empSalary;
    }
}
