package dev.lpa;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("Bob", "Bobson", "01/13/2021"));
        employeeList.add(new Employee("CableBob", "Cabelson", "04/13/2024"));
        employeeList.add(new Employee("Beep Boop", "123", "12/12/1990"));
        employeeList.add(new Employee("Please Promote Me", "Or I'll Leave", "12/12/1993"));
        employeeList.add(new Employee("Just here for paycheck", "And Coffee", "09/19/2020"));
    }
}

record Employee(String firstName, String lastName, String hireDate) {
}
