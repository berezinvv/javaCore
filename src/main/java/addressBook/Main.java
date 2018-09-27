package addressBook;

import addressBook.model.*;

public class Main {
    public static void main(String[] args) {

        AddressBook addressBook = new AddressBook();


        //Employee
        Employee emma = new Employee("Emma");
        emma.setAddress("street 1");
        emma.setPhoneNumber("+5 012 123 45 69");
        Employee liam = new Employee("Liam", "street 2", "+5 012 123 45 69");
        Employee olivia = new Employee("Olivia", "street 3", "+5 589 123 41 69");
        Employee noah = new Employee("Noah", "street 4", "+5 012 896 96 41");
        Employee ava = new Employee("Ava", "street 5", "+5 124 123 45 69");
        Employee oliver = new Employee("Oliver", "street 6", "+5 569 471 20 69");
        Employee isabella = new Employee("Isabella", "street 7", "+5 120 852 45 69");
        Employee mason = new Employee("Mason", "street 8", "+5 103 568 49 69");
        Employee sophia = new Employee("Sophia", "street 9", "+5 471 796 417 71");
        Employee lucas = new Employee("Lucas", "street 10", "+5 365 854 45 91");

        //Company
        Company companyFirst = new Company("First", "street 11", "+6 021 547 58 98");
        Company companySecond = new Company("Second", "street 12", "+6 475 702 87 10");
        Company companyThird = new Company("Third", "street 13", "+6 021 486 96 46");

        addressBook.addAddressBook(liam);
        addressBook.addAddressBook(olivia);
        addressBook.addAddressBook(noah);
        addressBook.addAddressBook(ava);
        addressBook.addAddressBook(oliver);
        addressBook.addAddressBook(isabella);
        addressBook.addAddressBook(mason);
        addressBook.addAddressBook(sophia);
        addressBook.addAddressBook(lucas);
        addressBook.addAddressBook(companyFirst);
        addressBook.addAddressBook(companySecond);
        addressBook.addAddressBook(companyThird);


        liam.addWorkPlaceSet(new WorkPlace(companyFirst, Position.ACCOUNTANT), true);


        System.out.println(addressBook);


        System.out.println("----------------------");

        //liam.removeWorkPlace(new WorkPlace(companyFirst, Position.ACCOUNTANT), true);
        companyFirst.removeWorkPlace(liam,Position.ACCOUNTANT, true);


        System.out.println(addressBook);

    }
}
