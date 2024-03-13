package dev.lpa;

import java.time.LocalDate;
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

        printEmployees(employeeList);

    }

    public static void printEmployees(List<Employee> employeeList){

        // print EEs

        // local class
        class InternalEmployee{
            private Employee myEmployee;
            private String fullName;
            private int yearsWorked;

            public InternalEmployee(Employee myEmployee) {
                this.myEmployee = myEmployee;
                this.fullName = myEmployee.firstName() + " " + myEmployee.lastName();

                int currentYear = LocalDate.now().getYear();
                // Last four digits, aka yearstarted
                int yearStarted = Integer.parseInt(myEmployee.hireDate().substring(myEmployee.hireDate().length() -4));
                this.yearsWorked = currentYear - yearStarted;
            }

            @Override
            public String toString() {
                return "InternalEmployee{" +
                        ", fullName='" + fullName + '\'' +
                        ", yearsWorked=" + yearsWorked +
                        '}';
            }
        }

        for (var employee : employeeList){
            System.out.println(employee);
        }

    }

}

record Employee(String firstName, String lastName, String hireDate) {
}
