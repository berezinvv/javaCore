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

        Employee tmpByAge;

        for (int i = 0; i < employees.length - 1; i++) {
            for (int j = 1; j < employees.length; j++) {
                if (employees[i].getAge() < employees[j].getAge()) {
                    tmpByAge = employees[i];
                    employees[i] = employees[j];
                    employees[j] = tmpByAge;
                }
            }
        }

        //find min, max, average
        int minAge = employees[0].getAge(), maxAge = employees[0].getAge(), avrAge = employees[0].getAge();
        double minSalary = employees[0].salary(), maxSalary = employees[0].salary(), avrSalary = employees[0].salary();

        for (int i = 1; i < employees.length; i++) {
            if (minAge > employees[i].getAge()) {
                minAge = employees[i].getAge();
            }
            if (maxAge < employees[i].getAge()) {
                maxAge = employees[i].getAge();
            }
            if (minSalary > employees[i].salary()) {
                minSalary = employees[i].salary();
            }
            if (maxSalary < employees[i].salary()) {
                maxSalary = employees[i].salary();
            }
            avrAge += employees[i].getAge();
            avrSalary += employees[i].salary();
        }
        System.out.println(" - Print sorted array by age");
        System.out.println(Arrays.toString(employees));

        System.out.println("Minimum age: " + minAge);
        System.out.println("Maximum age: " + maxAge);
        System.out.println("Minimum salary: " + minSalary);
        System.out.println("Maximum salary: " + maxSalary);
        System.out.println("Average age: " + avrAge / employees.length);
        System.out.println("Average salary: " + avrSalary / employees.length);
    }
}

