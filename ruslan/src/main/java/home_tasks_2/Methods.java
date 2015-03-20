package home_tasks_2;


import java.util.ArrayList;
import java.util.Scanner;


public class Methods {
    public static void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите интересующею Вас информацию:");
        System.out.println("0.  Показать всех работников.");
        System.out.println("1.  Отсортировать работников компани №1, по заработной плате.");
        System.out.println("2.  Отсортировать работников компани №2, по возрасту.");
        System.out.println("3.  Отсортировать работников компани №3, по длине фамилии.");
        System.out.println("4.  Добавить сотрудника.");
        System.out.println("5.  Ввести имя работника.");
        System.out.println("6.  Ввести нового сотрудника либо вывести в консоль того которого добавили.");
        System.out.println("7.  Поднять зарплату всем сотрудникам, мужчинам, на заданий %.");
        System.out.println("8.  Уволить всех женщин компании.");
        while (scanner.hasNext()) {
            switch (scanner.next()) {
                case "0":
                    showAllEmployees();
                    break;
                case "1":
                    sortSalary();
                    break;
                case "2":
                    sortAge();
                    break;
                case "3":
                    sortSecondName();
                    break;
                case "4":
                    addNewEmployee();
                    break;
                case "5":
                    showCreateEmployees();
                    break;
                case "6":
                    addNewEmployee();
                    break;
                case "7":
                    takeUpperSalaryForMan();
                    break;
                case "8":
                    firedAllWomen();
                    break;
                case "Exit":
                    System.exit(0);
                default:
                    System.out.println("Нету интересующей Вас информации.");
            }
        }
    }

    private static void showAllEmployees() {
        //ArrayList<Company> companies = CompanyUtil.getCompanies();
        ArrayList<Employee> employees = EmployeeUtil.getEmployees();
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i).getName() + " " + employees.get(i).getSecondName() + ",  - Зарплата - " +
                    employees.get(i).getSalary() + " USD");
            System.out.println();
        }
    }



    private static void firedAllWomen() {
        ArrayList<Company> companies = CompanyUtil.getCompanies();
        for (int i = 0; i < companies.size(); i++) {
            for (int j = 0; j < companies.get(i).getEmployees().size() - 1; j++) {
                if (companies.get(i).getEmployees().get(j).getGender() == "Female") {
                    companies.get(i).getEmployees().remove(j);
                    j--;
                }
            }
        }
        for (int i = 0; i < companies.size(); i++) {
            for (int j = 0;j< companies.get(i).getEmployees().size() - 1;  j++) {
                System.out.print(companies.get(i).getCompanyName() + " " + companies.get(i).getEmployees().get(j).getName() + " " +
                        companies.get(i).getEmployees().get(j).getSecondName() + " " + companies.get(i).getEmployees().get(j).getSalary());
            }
        }
    }
    private static void takeUpperSalaryForMan() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите процент, на которий хотите повысить зарплату сторудникам - мужчинам");
        double percent = scanner.nextDouble();
        ArrayList<Company> companies = CompanyUtil.getCompanies();
        for (int i = 0; i < companies.size(); i++) {
            for (int j = 0; j < companies.get(i).getEmployees().size() - 1; j++) {
                if (companies.get(i).getEmployees().get(j).getGender() == "Male"){
                    companies.get(i).getEmployees().get(j).setSalary(companies.get(i).getEmployees().get(j).getSalary()*percent);
                }
            }
        }
        for (int i = 0; i < companies.size(); i++) {
            for (int j = 0;j< companies.get(i).getEmployees().size() - 1;  j++) {
                System.out.print(companies.get(i).getCompanyName() + "  " + companies.get(i).getEmployees().get(j).getName() + " " +
                        companies.get(i).getEmployees().get(j).getSecondName() + " " + companies.get(i).getEmployees().get(j).getSalary());
            }
        }
    }
    private static void showCreateEmployees() {

    }

    private static void addNewEmployee() {

    }

    private static void sortSecondName() {
        ArrayList<Company> companies = CompanyUtil.getCompanies();
        for (int i = 0; i < companies.size(); i++) {
            for (int j = 0; j < companies.get(i).getEmployees().size() - 1; j++) {
                if (companies.get(i).getEmployees().get(j).getSecondName() == companies.get(i).getEmployees().get(j + 1).getSecondName()) {
                    Employee employee = companies.get(i).getEmployees().get(j);
                    companies.set(j, companies.get(i).getEmployees().get(j + 1));
                    companies.set((j + 1), employee);
                }
            }
        }
        System.out.println(" Сортировка по длине букв в фамилии : ");
        for (int i = 0; i < companies.size(); i++) {
            System.out.println(companies.get(i).getEmployees().get(i).getName() + " " + companies.get(i).getEmployees().get(i).getSecondName() + " - " +
                    companies.get(i).getEmployees().get(i).getSalary() + " USD ");
        }
    }
    private static void sortAge() {
        ArrayList<Company> companies = CompanyUtil.getCompanies();
        for (int i = 0; i < companies.size(); i++) {
            for (int j = 0; j < companies.get(i).getEmployees().size() - 1; j++) {
                if (companies.get(i).getEmployees().get(j).getAge() < companies.get(i).getEmployees().get(j + 1).getAge()) {
                    Employee employee = companies.get(i).getEmployees().get(j);
                    companies.set(j, companies.get(i).getEmployees().get(j + 1));
                    companies.set((j + 1), employee);
                }
            }
        }
        System.out.println(" Сортировка по возрасту : ");
        for (int i = 0; i < companies.size(); i++) {
            System.out.println(companies.get(i).getCompanyName() + "  " +companies.get(i).getEmployees().get(i).getName() + " " +
                    companies.get(i).getEmployees().get(i).getSecondName() + " - " +
                    companies.get(i).getEmployees().get(i).getSalary() + " USD ");
        }
    }
    private static void sortSalary() {
        ArrayList<Company> companies = CompanyUtil.getCompanies();
        ArrayList<Employee> employees = EmployeeUtil.getEmployees();
        for (int i = 0; i < companies.size(); i++) {
            for (int j = 0; j < companies.get(i).getEmployees().size() - 1; j++) {
                if (companies.get(i).getEmployees().get(j).getSalary() < companies.get(i).getEmployees().get(j + 1).getSalary()) {
                    Employee employee = companies.get(i).getEmployees().get(j);
                    companies.set(j, companies.get(i).getEmployees().get(j + 1));
                    companies.set((j + 1), employee);
                }
            }
        }
        System.out.println(" Сортировка зарплаты сотрудников : ");
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i).getName() + " " + employees.get(i).getSecondName() + " - " + employees.get(i).getSalary() + " USD ");
        }
    }

}



