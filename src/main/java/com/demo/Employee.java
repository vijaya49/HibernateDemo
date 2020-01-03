package com.demo;

public class Employee {

    public Employee(int empId, String empName, Double empSal) {
        this.empId = empId;
        this.empName = empName;
        EmpSal = empSal;
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

    public Double getEmpSal() {
        return EmpSal;
    }

    public void setEmpSal(Double empSal) {
        EmpSal = empSal;
    }
    private  int empId;
    private String empName;
    private Double EmpSal;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("empId=").append(empId);
        sb.append(", empName='").append(empName).append('\'');
        sb.append(", EmpSal=").append(EmpSal);
        sb.append('}');
        return sb.toString();
    }
}
