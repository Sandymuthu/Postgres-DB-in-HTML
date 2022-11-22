package com.example.console;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="employee")
public class Employee implements Serializable  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int empid;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dob;

    public int getEmpid() {
        return empid;
    }
    
    public void setEmpid(int empid) {
        this.empid = empid;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Employee() {
    }
    @Override
    public String toString() {
        return "Employee [empid=" + empid + ", name=" + name + ", dob=" + dob + "]";
    }
    public Date getDob() {
        return dob;
    }
    public void setDob(Date dob) {
        this.dob = dob;
    }
    
}
