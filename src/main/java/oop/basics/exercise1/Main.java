package oop.basics.exercise1;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Michal");
        Employee employee2 = new Employee("Michal", "Chmielewski");
        Employee employee3 = new Employee("Michal", "Chmielewski", 28, LocalDate.of(1994, 1, 1), 2500);

        employee1.setFirstname("Cichał");
        employee1.setLastname("Mhmielewski");
        System.out.println(employee1.getFirstname());
        System.out.println(employee1.getLastname());

        employee1.working();
        employee1.chill();

        System.out.println(Employee.numberOfEmployees);
    }

}
