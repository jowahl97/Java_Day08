package a01;

public class Employee {
    private String name;
    private String surName;
    private int yearOfBirth;
    private double salary;

    public Employee(String name, String surName, int yearOfBirth, double salary) {
        this.name = name;
        this.surName = surName;
        this.yearOfBirth = yearOfBirth;
        this.salary = salary;
    }

    public Employee() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
