package com.company;

public class Employee extends Validator {

    private final int id;
    private static int ID;
    String firstName;
    String lastName;
    double salary;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", last_name='" + lastName + '\'' +
                ", first_name='" + firstName + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Employee(String firstName, String lastName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.id = ID++;
        this.Validator();
    }

    public Employee(String firstName, String lastName) throws ImpossibleNameException {
        this.id = ID++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.Validator();
    }

    public Employee(String lastName, double salary) throws ImpossibleNameException, TooSmallSalaryException {
        this.id = ID++;
        this.lastName = lastName;
        this.salary = salary;
        this.Validator();
    }

    public Employee(double salary) throws TooSmallSalaryException {
        this.id = ID++;
        this.salary = salary;
        this.Validator();
    }

    int getId() {
        return id;
    }

    String getFirstName() {
        return firstName;
    }

    void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    String getLastName() {
        return lastName;
    }

    void setLastName(String lastName) {
        this.lastName = lastName;
    }

    double getSalary() {
        return salary;
    }

    void setSalary(double salary) {
        this.salary = salary;
    }

}