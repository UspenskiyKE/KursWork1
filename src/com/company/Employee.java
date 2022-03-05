package com.company;

public class Employee {
    private static int i;
    private String firstName;
    private String middleName;
    private String lastName;
    private String department;
    private double salary;
    private int id;


    public Employee (String firstName, String middleName, String lastName, String department, double salary) {
        this.firstName=firstName;
        this.middleName=middleName;
        this.lastName=lastName;
        this.department=department;
        this.salary=salary;
        i++;
        this.id=i;
    }

    public int getId() {
        return id;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getMiddleName() {
        return middleName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getDepartment() {
        return department;
    }
    public double getSalary() {
        return salary;
    }
    public void setDepartment(String department) {
        this.department=department;
    }
    public void setSalary(double salary) {
        this.salary=salary;
    }




}
