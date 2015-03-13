package Homeworks.HW10;

/**
 * Created by enerush on 19.01.2015.
 */
public class MainTen {
    public static void main(String[] args) {

        Employee e1 = new Employee();
        e1.name = "Elza";
        e1.secondName = "Hero";
        e1.salary = 1.666;

        Employee e2 = new Employee();
        e2.name = "Oleg";
        e2.secondName = "Kosarev";
        e2.salary = 1.600;

        Employee e3 = new Employee();
        e3.name = "Emma";
        e3.secondName = "Oreva";
        e3.salary = 2.005;

        Employee e4 = new Employee();
        e4.name = "Fil";
        e4.secondName = "Piterson";
        e4.salary = 3.700;

        Employee e5 = new Employee();
        e5.name = "Lesya";
        e5.secondName = "Klimuik";
        e5.salary = 2.600;

        Employee e6 = new Employee();
        e6.name = "Igor";
        e6.secondName = "Krav";
        e6.salary = 1.100;

        Employee e7 = new Employee();
        e7.name = "Tengiz";
        e7.secondName = "Tura";
        e7.salary = 2.800;

        Employee e8 = new Employee();
        e8.name = "Enrica";
        e8.secondName = "Herera";
        e8.salary = 5.100;

        Employee e9 = new Employee();
        e9.name = "Oksana";
        e9.secondName = "Lima";
        e9.salary = 4.600;

        Employee e10 = new Employee();
        e10.name = "Dima";
        e10.secondName = "Chernikov";
        e10.salary = 1.600;

        Employee[] employees = {e1, e2, e3, e4, e5, e6, e7, e8, e9, e10};


        Company c1 = new Company();
        c1.companyName = "Advego";
        c1.address = "NY";
        c1.employees = employees;

        Company[] companies = {c1};

        sortBySalary(companies, employees);

//        Company mainCompany = new Company();
//
//
////        mainCompany.sortBySalary(companies,employees);

    }
    public static void sortBySalary (Company[] companies, Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            for (int j = 0; j < employees.length-1; j++) {
                if(employees[j].salary < employees[j+1].salary){
                    Employee human = employees[j];
                    employees[j] = employees[j + 1];
                    employees[j + 1] = human;
                }
            }
        }
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].name + " " + employees[i].salary + " " + companies[i].companyName);
        }
    }
}
