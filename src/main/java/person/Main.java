package person;

/*Create Console Application project in Java.
Add class Person to the project.
Class Person should consists of
two private fields: name and birthYear (the birthday year)
properties for access to these fields
default constructor and constructor with 2 parameters
methods:
age - to calculate the age of person
input - to input information about person
output - to output information about person
changeName - to change the name of person
In the method main() create 5 objects of Person type and input information about them.*/


import person.model.Person;

public class Main{

    public static void main(String[] args) {

        Person Jacob = new Person();
        Person Michael = new Person();
        Person Andrew = new Person();
        Person Matthew = new Person();
        Person Daniel = new Person();

        Jacob.input("Jacob", 2000);
        Michael.input("Michael", 1987);
        Andrew.input("Andrew", 1999);
        Matthew.input("Matthew", 1974);
        Daniel.input("Daniel", 2002);

        System.out.println(Jacob.output());
        System.out.println(Michael.output());
        System.out.println(Andrew.output());
        System.out.println(Matthew.output());
        System.out.println(Daniel.output());

    }
}