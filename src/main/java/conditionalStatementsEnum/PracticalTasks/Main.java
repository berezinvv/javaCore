package conditionalStatementsEnum.PracticalTasks;
/*Enter three numbers. Find out how many of them are odd.
Enter the number of the day of the week. Display the name in three languages.
Enter the name of the country. Print the name of the continent. (Declare enum with names of continents)
Create class Product with fields name, price and quantity.
Create four instances of type Product.
Display the name and quantity of the most expensive item.
Display the name of the items, which has the biggest quantity.*/

import conditionalStatementsEnum.PracticalTasks.enums.Continents;
import conditionalStatementsEnum.PracticalTasks.enums.WeekDaysDE;
import conditionalStatementsEnum.PracticalTasks.enums.WeekDaysEN;
import conditionalStatementsEnum.PracticalTasks.enums.WeekDaysFR;
import conditionalStatementsEnum.PracticalTasks.model.Product;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter three numbers: ");

        double number;
        int count = 0;
        for (int i = 1; i <= 3; i++) {
            number = scan.nextDouble();
            if (number % 2 != 0) {
                count++;
            }
        }
        System.out.println("Odd numbers = " + count);

        System.out.print("Enter the number of the day of the week: ");
        scan = new Scanner(System.in);
        int numberDay = scan.nextInt();

        switch (numberDay) {
            case 1: {
                System.out.println(WeekDaysEN.MONDAY);
                System.out.println(WeekDaysDE.MONTAG);
                System.out.println(WeekDaysFR.LUNDI);
                break;
            }
            case 2: {
                System.out.println(WeekDaysEN.TUESDAY);
                System.out.println(WeekDaysDE.DIENSTAG);
                System.out.println(WeekDaysFR.MARDI);
                break;
            }
            case 3: {
                System.out.println(WeekDaysEN.WEDNESDAY);
                System.out.println(WeekDaysDE.MITTWOCH);
                System.out.println(WeekDaysFR.MERCREDI);
                break;
            }
            case 4: {
                System.out.println(WeekDaysEN.THURSDAY);
                System.out.println(WeekDaysDE.DONNERSTAG);
                System.out.println(WeekDaysFR.JEUDI);
                break;
            }
            case 5: {
                System.out.println(WeekDaysEN.FRIDAY);
                System.out.println(WeekDaysDE.FREITAG);
                System.out.println(WeekDaysFR.VENDREDI);
                break;
            }
            case 6: {
                System.out.println(WeekDaysEN.SATURDAY);
                System.out.println(WeekDaysDE.SAMSTAG);
                System.out.println(WeekDaysFR.DIMANCHE);
                break;
            }
            case 7: {
                System.out.println(WeekDaysEN.SUNDAY);
                System.out.println(WeekDaysDE.SONNTAG);
                System.out.println(WeekDaysFR.SAMEDI);
                break;
            }
            default: {
                System.out.println("Wrong data");
            }
        }


        System.out.print("Enter the name of the country: ");
        scan = new Scanner(System.in);
        String nameCountry = scan.next();

        for (Continents continents : Continents.values()) {
            if (continents.getCountries().toLowerCase().contains(nameCountry.toLowerCase())) {
                System.out.println(continents);
                break;
            }
        }


        Product product1 = new Product("Saffron", 12.3, 2);
        Product product2 = new Product("Peaches", 6.5,4);
        Product product3 = new Product("Nori", 9.0,9);
        Product product4 = new Product("Honey", 4.12,1);

        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);
        System.out.println(product4);

        System.out.println("The name and quantity of the most expensive item is " + Product.getMostExpensive());
        System.out.println("The name of the items, which has the biggest quantity is " + Product.getBiggestQuantity());

    }
}
