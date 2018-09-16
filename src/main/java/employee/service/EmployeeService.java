package employee.service;

import employee.model.Employee;

public class EmployeeService {

    public void sortByAge(Employee [] employees){

        Employee tmpByAge;
        for (int i = 0; i < employees.length - 1; i++) {
            for (int j = i+1; j < employees.length; j++) {
                if (employees[i].getAge() > employees[j].getAge()) {
                    tmpByAge = employees[i];
                    employees[i] = employees[j];
                    employees[j] = tmpByAge;
                }
            }
        }
    }

    public void sortBySalary(Employee [] employees){

        Employee tmpByAge;
        for (int i = 0; i < employees.length - 1; i++) {
            for (int j = i+1; j < employees.length; j++) {
                if (employees[i].salary() > employees[j].salary()) {
                    tmpByAge = employees[i];
                    employees[i] = employees[j];
                    employees[j] = tmpByAge;
                }
            }
        }
    }

    public Employee findEmployeeMinAge(Employee [] employees){

        Employee tmpByAge = employees[0];
        for (int i = 1; i < employees.length; i++) {
            if (tmpByAge.getAge() > employees[i].getAge()) {
                tmpByAge = employees[i];
            }
        }
        return tmpByAge;
    }

    public Employee findEmployeeMinSalary(Employee [] employees){

        Employee tmpByAge = employees[0];
        for (int i = 1; i < employees.length; i++) {
            if (tmpByAge.salary() > employees[i].salary()) {
                tmpByAge = employees[i];
            }
        }
        return tmpByAge;
    }

    public Employee findEmployeeMaxAge(Employee [] employees){

        Employee tmpByAge = employees[0];
        for (int i = 1; i < employees.length; i++) {
            if (tmpByAge.getAge() < employees[i].getAge()) {
                tmpByAge = employees[i];
            }
        }
        return tmpByAge;
    }

    public Employee findEmployeeMaxSalary(Employee [] employees){

        Employee tmpByAge = employees[0];
        for (int i = 1; i < employees.length; i++) {
            if (tmpByAge.salary() < employees[i].salary()) {
                tmpByAge = employees[i];
            }
        }
        return tmpByAge;
    }

    public double findAverageAge(Employee [] employees){

        int avrAge = 0;
        for (int i = 1; i < employees.length; i++) {
            avrAge += employees[i].getAge();
        }
        return avrAge / employees.length;
    }

    public double findAverageSalary(Employee [] employees){

        double avrSalary = 0;
        for (int i = 1; i < employees.length; i++) {
            avrSalary += employees[i].salary();
        }
        return avrSalary / employees.length;
    }
}
