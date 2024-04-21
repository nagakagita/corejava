package interview;

import com.model.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Testjava8samples {
    public static void main(String[] args) {
        Employee e1=new Employee(1,"naga1 babu",4000,"it");
        Employee e2=new Employee(2,"naga2 kagita",3000,"it");
        Employee e3=new Employee(3,"naga3 moksha",1000,"it");
        Employee e4=new Employee(4,"naga4 jeswitha",3000,"it");
        Employee e5=new Employee(5,"naga5 ramarao",4000,"it");
        Employee e6=new Employee(6,"naga6  venka",1000,"it");

        Employee e11=new Employee(11,"naga11 mad",40000,"non it");
        Employee e21=new Employee(12,"naga21 abhi",30000,"non it");
        Employee e31=new Employee(13,"naga31  sai",10000,"non it");
        Employee e41=new Employee(14,"naga4 sow",1000,"teaching");
        Employee e51=new Employee(15,"naga5 ped",4000,"teaching");
        Employee e61=new Employee(16,"naga6 pava",3000,"teaching");
        List<Employee> employeeList=new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);
        /*employeeList.add(e6);
        employeeList.add(e11);
        employeeList.add(e21);
        employeeList.add(e31);
        employeeList.add(e41);
        employeeList.add(e51);
        employeeList.add(e61);*/


        Map<Integer, String> fMap = employeeList.stream().collect(Collectors.toMap(Employee::getEmpid, Employee::getEmpname));
        fMap.forEach((k,v)->{
            System.out.println("Key : " + k + " Value : " + v);
        });
        Map<Integer, Employee> smap = employeeList.stream().collect(Collectors.toMap(Employee::getEmpid, Function.identity()));
        smap.forEach((k,v)->{
            System.out.println("key : "+ k + " value : "+v);
        });
    }
}
