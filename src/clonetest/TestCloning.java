package clonetest;

class Employee{
    private Integer empId;
    private String empName;

    public Employee(Integer empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }
    public void setEmpName(String empName){
        this.empName = empName;
    }
    public String getEmpName(){
        return empName;
    }
    public  Employee(){

    }

}
public class TestCloning {
    public static void main(String[] args) {
        Employee e1= new Employee(1,"nagababu");
        //Employee e2 =e1;
        Employee temp =e1;
        Employee e2 =new Employee();
        e2.setEmpName(temp.getEmpName());
        e2.setEmpId(temp.getEmpId());
        e1.setEmpId(100);
        e1.setEmpName("Sowjanya");
        System.out.println(e1.getEmpId());
        System.out.println(e1.getEmpName());
        System.out.println(e2.getEmpId());
        System.out.println(e2.getEmpName());

    }
}
