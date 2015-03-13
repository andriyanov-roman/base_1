/**
 * Created by user on 15.01.2015.
 */
public class MainInDaClass {
    public static void main(String[] args) {
        Company c1 = new Company();
        c1.companyName = "Eseo";
        c1.address = "London";

        Company c2 = new Company();
        c2.companyName = "Kasko";
        c2.address = "Kiev";

        Company c3 = new Company();
        c3.companyName = "Yeap";
        c3.address = "NewYork";

        Employee e1 = new Employee();
        e1.name = "Elza";
        e1.secondName = "Hero";
        e1.salary = 1.600;

        Employee e2 = new Employee();
        e2.name = "Oleg";
        e2.secondName = "Kosarev";
        e2.salary = 1.300;

        Employee e3 = new Employee();
        e3.name = "Emma";
        e3.secondName = "Oreva";
        e3.salary = 2.000;

        Employee e4 = new Employee();
        e4.name = "Fil";
        e4.secondName = "Piterson";
        e4.salary = 1.700;

        Employee e5 = new Employee();
        e5.name = "Lesya";
        e5.secondName = "Klimuik";
        e5.salary = 6.600;

        Employee e6 = new Employee();
        e6.name = "Igor";
        e6.secondName = "Krav";
        e6.salary = 1.100;

        Employee e7 = new Employee();
        e7.name = "Tengiz";
        e7.secondName = "Tura";
        e7.salary = 0.800;

        Employee e8 = new Employee();
        e8.name = "Enrica";
        e8.secondName = "Herera";
        e8.salary = 2.100;

        Employee e9 = new Employee();
        e9.name = "Oksana";
        e9.secondName = "Lima";
        e9.salary = 5.600;

        Employee[] company1 = {e1, e2, e3};
        Employee[] company2 = {e4, e5, e6};
        Employee[] company3 = {e7, e8, e9};
        c1.employees = company1;
        c2.employees = company2;
        c3.employees = company3;
        Employee[] employees = {e1, e2, e3, e4, e5, e6, e7, e8, e9};

        Company[] companies = {c1, c2, c3};

        Company mainCompany = new Company();
        mainCompany.getEmployeeMaxSalary(companies);

        findMaxSalary(companies);

    }


    public static void findMaxSalary (Company[] companies) {
        double temp = companies[1].employees[1].salary;
        String namey = companies[1].employees[1].name;
        for (int i = 0; i <companies.length ; i++) {
            for (int j = 0; j < companies[i].employees.length; j++) {
                if (companies[i].employees[j].salary > companies[1].employees[1].salary)
                    temp = companies[i].employees[j].salary;
                    namey = companies[i].employees[j].name;
                break;
            }
        } System.out.println(temp + " " + namey);
    }

}
