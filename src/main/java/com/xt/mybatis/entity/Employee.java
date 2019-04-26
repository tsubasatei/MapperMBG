package com.xt.mybatis.entity;

import javax.persistence.*;

@Table(name = "tbl_emp")
public class Employee {
    @Id
    @Column(name = "emp_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer empId;

    @Column(name = "emp_name")
    private String empName;

    @Column(name = "emp_salary_apple")
    private Double empSalaryApple;

    @Column(name = "emp_age")
    private Integer empAge;

    public Employee(String empName, Double empSalaryApple, Integer empAge) {
        this.empName = empName;
        this.empSalaryApple = empSalaryApple;
        this.empAge = empAge;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empSalaryApple=" + empSalaryApple +
                ", empAge=" + empAge +
                '}';
    }

    /**
     * @return emp_id
     */
    public Integer getEmpId() {
        return empId;
    }

    /**
     * @param empId
     */
    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    /**
     * @return emp_name
     */
    public String getEmpName() {
        return empName;
    }

    /**
     * @param empName
     */
    public void setEmpName(String empName) {
        this.empName = empName;
    }

    /**
     * @return emp_salary_apple
     */
    public Double getEmpSalaryApple() {
        return empSalaryApple;
    }

    /**
     * @param empSalaryApple
     */
    public void setEmpSalaryApple(Double empSalaryApple) {
        this.empSalaryApple = empSalaryApple;
    }

    /**
     * @return emp_age
     */
    public Integer getEmpAge() {
        return empAge;
    }

    /**
     * @param empAge
     */
    public void setEmpAge(Integer empAge) {
        this.empAge = empAge;
    }
}