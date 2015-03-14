package homeTask1;

import java.util.Scanner;


public class Methods {

    public static void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter command key!");
        System.out.println("1. Пользователи у которых логин совпадает с иминем или фамилией");
        System.out.println("2. Найти юзеров с одинаковым иминем и фамилией");
        System.out.println("3. Сортировка юзеров по id по убыванию");
        System.out.println("4. Информация о сотрудниках");
        System.out.println("5. Сотрудник с наибольшей зарплатой");
        System.out.println("6. Сотрудники с одинаковыми именами и фамилией");
        System.out.println("7. Сортировка сотрудников по зп в порядке убывания");
        System.out.println("8. Узнать названия компаний");
        System.out.println("9. Узнать имена сотрудников, которые работают в каждой компании");
        System.out.println("10. Узнать сотрудника с наибольшей зп в каждой компании");

        while (scanner.hasNext()) {
            switch (scanner.next()) {
                case "1":
                    coincidenceLoginNameSecondName();
                    break;
                case "2":
                    coincidenceNameSecondName();
                    break;
                case "3":
                    sort();
                    break;
                case "4":
                    infoEmployees();
                    break;
                case "5":
                    maxSalary();
                    break;
                case "6":
                    tesku();
                    break;
                case "7":
                    sortSalary();
                    break;
                case "8":
                    companyName();
                    break;
                case "9":
                    infoCompany();
                    break;
                case "10":
                    сompanyMaxSalary();
                    break;
                case "Exit":
                    System.exit(0);
                    break;
                default:
                    System.out.println("No such case");
            }
        }
    }

    public static void coincidenceLoginNameSecondName() {
        int count = 0;
        UserMatveu[] users = UsersUtil.getUsers();
        for (int i = 0; i < users.length; i++) {
            if (users[i].login.equals(users[i].name)) {
                System.out.println("Логин совпадает с именем: " + users[i].name);
                count++;
            }
            if (users[i].login.equals(users[i].secondName)) {
                System.out.println("Логин совпадает с фамилией: " + users[i].secondName);
                count++;
            }

        }
        System.out.println("Количество совпадений: " + count);

    }

    public static void coincidenceNameSecondName() {
        UserMatveu[] users = UsersUtil.getUsers();
        for (int i = 0; i < users.length; i++) {
            if (users[i].name.equals(users[i].secondName)) {
                System.out.println("Пользователи с одинаковым именем и фамилией: " + users[i].name + " " + users[i].secondName);
            }
        }

    }

    public static void sort() {
        UserMatveu[] users = UsersUtil.getUsers();
        for (int i = users.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (users[j].id < users[j + 1].id) {
                    UserMatveu k = users[j];
                    users[j] = users[j + 1];
                    users[j + 1] = k;
                }
            }
        }
        for (int i = 0; i < users.length; i++) {
            System.out.print(users[i].name + "/");
            System.out.print(users[i].id + "/ ");
        }
    }

    public static void infoEmployees() {
        Employee[] employees = EmployeesUtil.getEmployees();
        for (int i = 0; i < employees.length; i++) {
            System.out.print(employees[i].name + " " + employees[i].secondName + " " + employees[i].salary);
            System.out.println();
        }
    }

    public static void maxSalary() {
        Employee[] employees = EmployeesUtil.getEmployees();
        double maxSalary = 0;
        int i;
        int max = 0;
        for (i = 0; i < employees.length; i++) {
            if (employees[i].salary > maxSalary) {
                maxSalary = (double) (employees[i].salary);
                max = i;
            }
        }
        System.out.println("Сотрудник с наибольшей зарплатой: " + employees[max].name + " " + employees[max].secondName + " " + employees[max].salary);

    }

    public static void tesku() {
        Employee[] employees = EmployeesUtil.getEmployees();
        String sameName = " ";
        String sameSecondName = " ";
        for (int i = 0; i < employees.length; i++) {
            for (int j = i + 1; j < employees.length; j++) {
                if (employees[i].name == employees[j].name && employees[i].secondName == employees[j].secondName) {
                    sameName = employees[i].name;
                    sameSecondName = employees[i].secondName;
                }
            }
        }
        System.out.println("Сотрудники с одинаковыми именами и фамилией: " + sameName + " " + sameSecondName);
    }

    public static void sortSalary() {
        Employee[] employees = EmployeesUtil.getEmployees();
        for (int i = employees.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (employees[j].salary < employees[j + 1].salary) {
                    Employee k = employees[j];
                    employees[j] = employees[j + 1];
                    employees[j + 1] = k;
                }
            }
        }
        for (int i = 0; i < employees.length; i++) {
            System.out.print(employees[i].name + " " + employees[i].secondName + "/" + employees[i].salary + "/");
            System.out.println();

        }
    }

    public static void companyName() {
        Company[] companies = CompanyUtil.getCompanies();
        for (int i = 0; i < companies.length; i++) {
            System.out.println(companies[i].companyName + " ");
        }
    }

    public static void infoCompany() {
        Company[] companies = CompanyUtil.getCompanies();
        for (int i = 0; i < companies.length; i++) {
            System.out.println(companies[i].companyName + ": " + companies[i].employees[0].name + " " +
                    companies[i].employees[0].secondName + "; " + companies[i].employees[1].name + " " +
                    companies[i].employees[1].secondName);
        }
    }

    public static void сompanyMaxSalary() {
        Company[] companies = CompanyUtil.getCompanies();
        for (int i = 0; i < companies.length; i++) {
            Employee temp = companies[i].employees[0];
            for (int j = 0; j < companies[i].employees.length; j++) {
                if (companies[i].employees[j].salary > temp.salary) {
                    temp = companies[i].employees[j];
                }
            }
            System.out.println(companies[i].companyName + ": salary:" + temp.salary + " name: " + temp.name);
        }
    }
}

