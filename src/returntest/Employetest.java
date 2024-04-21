package returntest;

import com.model.Employee;

import java.util.*;
import java.util.stream.Collectors;


public class Employetest {
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
        employeeList.add(e6);
        employeeList.add(e11);
        employeeList.add(e21);
        employeeList.add(e31);
        employeeList.add(e41);
        employeeList.add(e51);
        employeeList.add(e61);
        Map<String, List<Employee>> groupMap = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        Map<String, List<Employee>> solutionMap = new HashMap<>();
        groupMap.forEach((key,values)->{
            // for getting lowest salaried employee draw back is displaying only one least employee salary
            solutionMap.put(key,values.stream().min(Comparator.comparing(Employee::getSal)).stream().collect(Collectors.toList()));
            solutionMap.put(key,values.stream().filter(e->(e.getSal()==values.stream().min(Comparator.comparing(Employee::getSal)).
                    get().getSal())).collect(Collectors.toList()));

            // to get all least salarie employees
           /* values.stream().filter(e->(e.getSal() == values.stream().min(Comparator.comparing(Employee::getSal)).get().getSal())
            ).collect(Collectors.toList());*/
           /* solutionMap.put(key,values.stream().filter(e->(e.getSal() == values.stream().min(Comparator.comparing(Employee::getSal)).get().getSal())
            ).collect(Collectors.toList()));*/
        });
        System.out.println(solutionMap);

        //sorting
       // Comparator<Employee> groupByComparator = Comparator.comparing(Employee::getEmpname).thenComparing(Employee::getDepartment);
      //  employeeList.stream().sorted(groupByComparator).forEach(System.out::println);
        }

}
