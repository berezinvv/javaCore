package employee;

/*Create Console Application project in Java.
Add class Employee to the project.
Class Employee should consists of
	three private fields: name, rate and hours;
	static field totalHours
	properties for access to these fields;
	default constructor, constructor with 2 parameters (name and rate) and constructor with 3 parameters;
	methods:
salary - to calculate the salary of person (rate * hours)
toString - to output information about employee
changeRate - to change the rate of employee
bonuses – to calculate % from salary
In the method main() create 3 objects of Employee type. Input information about them.
Display the total hours of all workers to screen*/

/*...... and other tasks*/

import employee.model.Employee;
import employee.service.EmployeeService;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Employee Sue = new Employee("Sue", 32, 120, 31);
        Employee Terry = new Employee("Terry", 20, 79, 45);
        Employee Frank = new Employee("Frank", 5, 164, 41);

        System.out.println(Sue);
        System.out.println(Terry);
        System.out.println(Frank);

        System.out.println("Total hours of all workers " + Employee.getTotalHours());


        //array
        Employee Marry = new Employee("Mary", 11, 29, 25);
        Employee Leon = new Employee("Leon", 15, 54, 19);

        Employee[] employees = {Sue, Terry, Frank, Marry, Leon};

        System.out.println(" - Print unsorted array");
        System.out.println(Arrays.toString(employees));

        EmployeeService.sortByAge(employees);

        System.out.println(" - Print sorted array by age");
        System.out.println(Arrays.toString(employees));


        EmployeeService.sortBySalary(employees);

        System.out.println(" - Print sorted array by salary");
        System.out.println(Arrays.toString(employees));


        //find min, max, average

        System.out.println("Minimum age: " + EmployeeService.findEmployeeMinAge(employees));
        System.out.println("Maximum age: " + EmployeeService.findEmployeeMaxAge(employees));
        System.out.println("Minimum salary: " + EmployeeService.findEmployeeMinSalary(employees));
        System.out.println("Maximum salary: " + EmployeeService.findEmployeeMaxSalary(employees));
        System.out.println("Average age: " + EmployeeService.findAverageAge(employees));
        System.out.println("Average salary: " + EmployeeService.findAverageSalary(employees));
    }
}

