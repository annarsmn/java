package org.example;

public class EmployeeTest
{
    public static void main(String[] args) {
        Employee employee1 = new Employee("Jane", "Green", 500);
        Employee employee2 = new Employee("John", "Blue", 600);

        System.out.printf("Yearly salary of %s %s: %.2f%n", employee1.getFirstName(), employee1.getLastName(), employee1.getMonthlySalary() * 12);
        System.out.printf("Yearly salary of %s %s: %.2f%n", employee2.getFirstName(), employee2.getLastName(), employee2.getMonthlySalary() * 12);

        double newSalary1 = employee1.getMonthlySalary() * 1.1;
        double newSalary2 = employee2.getMonthlySalary() * 1.1;

        employee1.setMonthlySalary(newSalary1);
        employee2.setMonthlySalary(newSalary2);

        System.out.printf("Updated yearly salary of %s %s: %.2f%n", employee1.getFirstName(), employee1.getLastName(), employee1.getMonthlySalary() * 12);
        System.out.printf("Updated yearly salary of %s %s: %.2f%n", employee2.getFirstName(), employee2.getLastName(), employee2.getMonthlySalary() * 12);
    }
}
