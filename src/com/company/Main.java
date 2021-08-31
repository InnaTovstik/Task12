package com.company;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args) throws ImpossibleNameException, TooSmallSalaryException {
        ArrayList<Employee> company = new ArrayList<>();
        company.add(createEmployee("Ivan", "Ivanov", -100));
        company.add(createEmployee("Petro", "Ivanov", 1000));
        company.add(createEmployee("Ivanov", 1000));
        company.add(createEmployee("Stepan", "Stepanov"));
        company.add(createEmployee("Oksana", "Petrenko", 2000));
        company.add(createEmployee("Alex", "Zirov", 1500));
        company.add(createEmployee("Alla", "Minova", 800));
        company.add(createEmployee("Ivanenko", 200));
        printEmployee(company);
    }


    public static void printEmployee(ArrayList<Employee> e) {
        for (Employee employee : e) {
            System.out.println(employee);
        }
    }

    public static Employee createEmployee (String firstName, String lastName,double salary) throws ImpossibleNameException, TooSmallSalaryException {

        return new Employee(firstName, lastName, salary);
        }

    public static Employee createEmployee (String firstName, String lastName) throws ImpossibleNameException {
        return new Employee(firstName, lastName);
        }

   public static Employee createEmployee (String lastName,double salary) throws ImpossibleNameException, TooSmallSalaryException {
       return new Employee(lastName, salary);
        }

   public static Employee createEmployee (double salary) throws TooSmallSalaryException {
       return new Employee(salary);
        }
    }

