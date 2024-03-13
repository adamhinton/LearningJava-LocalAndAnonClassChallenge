package dev.lpa;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();

    }

    public record Employee(String firstName, String lastName, String hireDate){

    }


}

