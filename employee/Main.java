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

public class Main {

    public static void main(String[] args) {
        Employee Sue = new Employee("Sue", 32, 120);
        Employee Terry = new Employee("Terry", 20, 79);
        Employee Frank = new Employee("Frank", 5, 164);

        System.out.println(Sue);
        System.out.println(Terry);
        System.out.println(Frank);

        System.out.println("Total hours of all workers " + Employee.getTotalHours());

    }
}

