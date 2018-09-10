package conditionalStatementsEnum.HomeWork;

import java.util.Scanner;


/*Solve the next tasks:
read 3 float numbers and check: are they all belong to the range [-5,5];
read 3 integer numbers and write max and min of them;
read number of HTTP Error (400, 401,402, ...) and write the name of this error (Declare enum HTTPError)
Сreate class Dog with fields name, breed, age.
Declare enum for field breed.
Create 3 instances of type Dog.
Check if there is no two dogs with the same name.
Display the name and the kind of the oldest dog.
*Add Unit Tests to each task, publish code on GitHub
*/
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter three float numbers: ");

        float number;
        for (int i = 1; i <= 3; i++) {
            number = scan.nextFloat();
            if (number >= -5 && number <= 5) {
                System.out.println("correct");
            } else {
                System.out.println("incorrect");
            }
        }


        System.out.println("Enter three int numbers: ");

        int num;
        int min = 0;
        int max = 0;
        for (int i = 1; i <= 3; i++) {
            num = scan.nextInt();
            if (i == 1 || num < min) {
                min = num;
            }
            if (i == 1 || num > max) {
                max = num;
            }
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);


        System.out.println("Input number of HTTP Error (400,401,402, ...) : ");
        num = scan.nextInt();
        for (HTTPError ht : HTTPError.values()) {
            if (ht.toString().contains(Integer.toString(num))) {
                System.out.println(ht.getNameError());
                break;

            }

        }


        Dog Nathan = new Dog("Nathan", Breed.Boxers, 5);
        Dog Justin = new Dog("Justin", Breed.Collies, 9);
        Dog Blake = new Dog("Blake", Breed.Rottweilers, 3);
        System.out.println(Nathan);
        System.out.println(Justin);
        System.out.println(Blake);

        System.out.println("The name and the kind of the oldest dog: " + Dog.getMaxAgeDog());
    }
}
