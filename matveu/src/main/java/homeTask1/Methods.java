package homeTask1;

import java.util.ArrayList;
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
        System.out.println("11. Сортировка сотрудников в первой компании(Luxsoft) по зп,в порядке возрастания");
        System.out.println("12. Сортировка сотрудников во второй компании(Microsoft) по возрасту,в порядке возрастания");
        System.out.println("13. Сортировка сотрудников в третей компании(Sony) по длине фамилии,в порядке возрастания");
        System.out.println("14. Добавить нового сотрудника");


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
                case "11":
                    sortCompany1Salary();
                    break;
                case "12":
                    sortCompany2Age();
                    break;
                case "13":
                    sortCompany3LengthSecondName();
                    break;
                case "14":
                    greatNewEmployees();
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
        ArrayList<Employee> employees = EmployeesUtil.getEmployees();
        for (int i = 0; i < employees.size(); i++) {
            System.out.print(employees.get(i).getName() + " " + employees.get(i).getSecondName() + " " + employees.get(i).getSalary());
            System.out.println();
        }
    }

    public static void maxSalary() {
        ArrayList<Employee> employees = EmployeesUtil.getEmployees();
        double maxSalary = 0;
        int i;
        int max = 0;
        for (i = 0; i < employees.size(); i++) {
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
            System.out.println(companies[i].getCompanyName() + " ");
        }
    }

    public static void infoCompany() {
        Company[] companies = CompanyUtil.getCompanies();
        for (int i = 0; i < companies.length; i++) {
            System.out.println();
            System.out.print(companies[i].getCompanyName() + ": ");
            for (int j = 0; j < companies[i].getEmployees().size(); j++) {
                System.out.print(companies[i].getEmployees()[j].name + " " +
                        companies[i].getEmployees()[j].secondName + "; ");

            }
        }
    }

    public static void сompanyMaxSalary() {
        Company[] companies = CompanyUtil.getCompanies();
        for (int i = 0; i < companies.length; i++) {
            Employee temp = companies[i].getEmployees()[0];
            for (int j = 0; j < companies[i].getEmployees().size(); j++) {
                if (companies[i].getEmployees()[j].salary > temp.salary) {
                    temp = companies[i].getEmployees()[j];
                }
            }
            System.out.println(companies[i].getCompanyName() + ": salary:" + temp.salary + " name: " + temp.name);
        }
    }

    public static void sortCompany1Salary() {
        Company[] companies = CompanyUtil.getCompanies();
        for (int i = 0; i < 1; i++) {
            for (int j = companies[i].getEmployees().size() - 1; j >= 0; j--) {
                for (int k = 0; k < j; k++) {
                    if (companies[i].getEmployees()[k].salary < companies[i].getEmployees()[k + 1].salary) {
                        Employee www = companies[i].getEmployees()[k];
                        companies[i].getEmployees()[k] = companies[i].getEmployees()[k + 1];
                        companies[i].getEmployees()[k + 1] = www;
                    }
                }
                System.out.print(companies[i].getEmployees()[j].name + " " + companies[i].getEmployees()[j].secondName + ": " + companies[i].getEmployees()[j].salary + " ");
                System.out.println();
            }
        }

    }

    public static void sortCompany2Age() {
        Company[] companies = CompanyUtil.getCompanies();
        for (int i = 1; i < 2; i++) {
            for (int j = companies[i].getEmployees().size() - 1; j >= 0; j--) {
                for (int k = 0; k < j; k++) {
                    if (companies[i].getEmployees()[k].age < companies[i].getEmployees()[k + 1].age) {
                        Employee www = companies[i].getEmployees()[k];
                        companies[i].getEmployees()[k] = companies[i].getEmployees()[k + 1];
                        companies[i].getEmployees()[k + 1] = www;
                    }
                }
                System.out.print(companies[i].getEmployees()[j].name + " " + companies[i].getEmployees()[j].secondName +
                        ":Age: " + companies[i].getEmployees()[j].age);
                System.out.println();
            }
        }
    }

    public static void sortCompany3LengthSecondName() {
        Company[] companies = CompanyUtil.getCompanies();
        for (int i = 2; i < 3; i++) {
            for (int j = companies[i].getEmployees().size() - 1; j >= 0; j--) {
                for (int k = 0; k < j; k++) {
                    if (companies[i].getEmployees()[k].secondName.length() < companies[i].getEmployees()[k + 1].secondName.length()) {
                        Employee www = companies[i].getEmployees()[k];
                        companies[i].getEmployees()[k] = companies[i].getEmployees()[k + 1];
                        companies[i].getEmployees()[k + 1] = www;
                    }
                }
                System.out.print(companies[i].getEmployees()[j].name + " " + companies[i].getEmployees()[j].secondName + ".");
                System.out.print(" Количество букв в фамилии: " + companies[i].getEmployees()[j].secondName.length());
                System.out.println();
            }
        }
    }

    public static void greatNewEmployees() {
        Scanner scannerNew = new Scanner(System.in);
        System.out.println("Выберите компанию,в которую желаете добавить сотрудника:");
        System.out.println("1: Luxsoft");
        System.out.println("2: Microsoft");
        System.out.println("3: Sony");

        while (scannerNew.hasNext()) {
            switch (scannerNew.next()) {
                case "1":
                    greatEmployeeLuxsoft();
                    break;
                case "2":

                    break;
                case "3":

                    break;
            }
        }
    }

    public static void greatEmployeeLuxsoft() {
        Employee[] employees = EmployeesUtil.getEmployees();
        for (int i = 0; i < 1; i++) {
            for(int j=0;j<employees.length;j++) {
                Scanner scannerLux = new Scanner(System.in);
                System.out.println("Введите имя сотрудника!");
                employees[j].name = scannerLux.nextLine();
                System.out.println("Введите фамилию сотрудника!");
                employees[j].secondName = scannerLux.nextLine();
                System.out.println("Введите пол сотрудника!");
                employees[j].sex = scannerLux.nextLine();
                System.out.println("Введите возраст сотрудника!");
                employees[j].age = scannerLux.nextInt();
                System.out.println("Введите зарплату сотрудника!");
                employees[j].salary = scannerLux.nextInt();


            Scanner scannerNew = new Scanner(System.in);
            System.out.println("Выберите действие:");
            System.out.println("1: Добавить следующего сотрудника");
            System.out.println("2: Вывести информацию по данному сотруднику");
            while (scannerNew.hasNext()) {
                switch (scannerNew.next()) {
                    case "1":
                        greatEmployeeLuxsoft();
                        break;
                    case "2":
                        showGreatedEmployee();
                        break;

                }

                }
            }
        }
    }

    public static void showGreatedEmployee() {
        Employee[] employees = EmployeesUtil.getEmployees();
        Company[] companies = CompanyUtil.getCompanies();
        for (int k = 0; k < 1; k++) {
            System.out.print(companies[k].getCompanyName() + ": ");
            for (int i = 0; i < 1; i++) {
                System.out.print(employees[i].name + " " + employees[i].secondName + " " +
                        employees[i].sex + " " + employees[i].age + " " +
                        employees[i].salary);
            }

        }
    }
}


