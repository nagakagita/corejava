package com.model;

public class Employee{
    private int empid;
    private String empname;
    private int sal;
    private String department;

    public Employee(int empid, String empname, int sal, String department) {
        this.empid = empid;
        this.empname = empname;
        this.sal = sal;
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empid=" + empid +
                ", empname='" + empname + '\'' +
                ", sal=" + sal +
                ",department ="+department+'\''+
                '}';
    }
}
