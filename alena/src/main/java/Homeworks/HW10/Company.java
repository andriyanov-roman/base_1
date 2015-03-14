package Homeworks.HW10;

/**
 * Created by enerush on 19.01.2015.
 */
public class Company {
        public String companyName;
        public String address;
        public Employee[] employees;

        public void findMaxSalary(Company[] companies) {
                double temp = companies[0].employees[0].salary;
                String namey = companies[0].employees[0].name;
                for (int i = 0; i < companies.length; i++) {
                        if (companies[i].employees[i].salary > companies[0].employees[0].salary) {
                                temp = companies[i].employees[i].salary;
                                namey = companies[i].employees[i].name;
                        }
                        break;


                }

        }
        public void sortBySalary (Company[] companies, Employee[] employees) {
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

