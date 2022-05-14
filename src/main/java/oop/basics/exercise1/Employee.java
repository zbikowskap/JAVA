package oop.basics.exercise1;

import java.time.LocalDate;

public class Employee {

    public static int numberOfEmployees = 0;

    private String firstname;
    private String lastname;
    private int age;
    private LocalDate employmentDate;
    private double salary;

    public Employee(String firstname) {
        this.firstname = firstname;
        numberOfEmployees++;
    }

    public Employee(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        numberOfEmployees++;
    }

    public Employee(String firstname, String lastname, int age, LocalDate employmentDate, double salary) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.employmentDate = employmentDate;
        this.salary = salary;
        numberOfEmployees++;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getEmploymentDate() {
        return employmentDate;
    }

    public void setEmploymentDate(LocalDate employmentDate) {
        this.employmentDate = employmentDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void working() {
        System.out.println("Pracuje...");
    }

    public void chill() {
        System.out.println("Odpoczywam...");
    }

}
