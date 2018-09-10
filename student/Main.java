package student;

/*Create Console Application project in Java.
Add class Student to the project.
Class Student should consists of
 two private fields: name and rating;
 properties for access to these fields
 static field avgRating – average rating of all students
 default constructor and constructor with parameters
 methods:
betterStudent - to definite the better student (between two, return true or false)
toString - to output information about student
changeRating - to change the rating of student
In the method main() create 3 objects of Student type and input information about them.
Display the average and total rating of all student.*/

public class Main {

    public static void main(String[] args) {
        Student Sam = new Student("Sam", 4.6);
        Student Tad = new Student("Tad", 3.9);
        Student Matt = new Student("Matt", 4.2);

        System.out.println(Sam);
        System.out.println(Tad);
        System.out.println(Matt);

        System.out.println("The average rating of all student " + Student.getAvgRating());
        System.out.println("Total rating of all student " + Student.getAllRating());

    }
}
