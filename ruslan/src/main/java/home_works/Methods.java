package home_works;

import java.util.ArrayList;
import java.util.Scanner;


public class Methods {
    public static void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите интересующею Вас информацию:");
        System.out.println("1.  Информация о юзерах.");
        System.out.println("2.  Информация о юзерах у которых имя совпадает с логином.");
        System.out.println("3.  Информация о юзерах с одинаковым именем и фамилией.");
        System.out.println("4.  Сортировка юзеров по ID.");
        System.out.println("5.  Информация о работниках.");
        System.out.println("6.  Информация о заработной плате работников. Максимальная зарплата.");
        System.out.println("7.  Информация о работниках, c одинаковыми, именами и фамилиями. Показать их.");
        System.out.println("8.  Отсортировать работников компани №1, по заработной плате.");
        System.out.println("9.  Отсортировать работников компани №2, по возрасту.");
        System.out.println("10.  Отсортировать работников компани №3, по длине фамилии.");
        System.out.println("11.  Добавить сотрудника.");
        System.out.println("12.  Ввести нового сотрудника либо вывести в консоль того которого добавили.");
        System.out.println("13.  Поднять зарплату всем сотрудникам.");
        System.out.println("14.  Уволить всех женщин компании.");
        while (scanner.hasNext()) {
            switch (scanner.next()) {
                case "1":
                    showUsers();
                    break;
                case "2":
                    checkUsersLogin();
                    break;
                case "3":
                    checkUsersName();
                    break;
                case "4":
                    sortUsersId();
                    break;
                case "5":
                    showInfoByEmployees();
                    break;
                case "6":
                    maxSalary();
                    break;
                case "7":
                    sameEmployee();
                    break;
                case "8":
                    sortSalary();
                    break;
                case "9":
                    sortAge();
                    break;
               /* case "10":
                    sortSecondName();
                    break;
                case "11":
                    addNewEmployee();
                    break;
                case "12":
                    showCreateEmployees();
                    break;
                case "13":
                    takeUpperSalaryForMan();
                    break;
                case "14":
                    firedAllWomen();
                    break;*/

                case "Exit":
                    System.exit(0);
                default:
                    System.out.println("Нету интересующей Вас информации.");
            }
        }
    }

    private static void sortAge() {
        ArrayList<Company> companies = CompanyUtil.getCompanies();
        for (int i = 0; i < companies.size(); i++) {
            for (int j = 0; j < companies.get(i).getEmployees().size() - 1; j++) {
                if (companies.get(i).getEmployees().get(j).getAge() < companies.get(i).getEmployees().get(j + 1).getAge()) {
                    Employee employee = companies.get(i).getEmployees().get(j);
                    companies.get(i).getEmployees().set(j, companies.get(i).getEmployees().get(j + 1));
                    companies.get(i).getEmployees().set((j + 1), employee);
                }
            }
            System.out.println(" Сортировка по возрасту : ");
            System.out.println(companies.get(i).getEmployees().get(i).getName() + " " +
                    companies.get(i).getEmployees().get(i).getSecondName() + " - " +
                    companies.get(i).getEmployees().get(i).getAge() + " year(s) ");
        }
    }

    private static void sortSalary() {
        ArrayList<Company> companies = CompanyUtil.getCompanies();
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < companies.get(i).getEmployees().size() - 1; j++) {
                if (companies.get(i).getEmployees().get(j).getSalary() < companies.get(i).getEmployees().get(j + 1).getSalary()) {
                    Employee employee = companies.get(i).getEmployees().get(j);
                    companies.get(i).getEmployees().set(j, companies.get(i).getEmployees().get(j + 1));
                    companies.get(i).getEmployees().set((j + 1), employee);

                    System.out.println(" Сортировка по зарплате : ");
                }

                System.out.println(companies.get(i).getEmployees().get(j).getName() + " " + companies.get(i).getEmployees().get(j).getSecondName() +
                        " зарплата : " + companies.get(i).getEmployees().get(j).getSalary());
            }
        }
    }

    private static void sameEmployee() {
        ArrayList<Employee> employee = EmployeeUtil.getEmployees();
        for (int i = 0; i < employee.size(); i++) {
            for (int j = i + 1; j < employee.size(); j++) {
                if (employee.get(i).getName() == employee.get(j).getName() && employee.get(i).getSecondName() == employee.get(j).getSecondName()) {
                    System.out.println(" Имя  и фамилия однофамильцев - " + employee.get(i).getName() + " " + employee.get(i).getSecondName() + " и " +
                            employee.get(j).getName() + " " + employee.get(j).getSecondName());
                }
            }
        }
    }

    private static void maxSalary() {
        ArrayList<Employee> employee = EmployeeUtil.getEmployees();
        Employee temp = employee.get(0);
        for (int i = 0; i < employee.size(); i++) {
            if (employee.get(i).getSalary() > temp.getSalary()) {
                temp = employee.get(i);
            }
        }
        System.out.println(temp.getName() + " " + temp.getSecondName() + " ,  " + temp.getSalary() + " USD ");

    }


    private static void showInfoByEmployees() {
        ArrayList<Employee> employee = EmployeeUtil.getEmployees();
        for (int i = 0; i < employee.size(); i++) {
            System.out.print(employee.get(i).getName() + " " + employee.get(i).getSecondName() + ",  - Зарплата -  " + employee.get(i).getSalary());
            System.out.println();
        }
    }

    private static void sortUsersId() {
        ArrayList<User> users = UserUtil.getUsers();
        for (int i = 0; i < users.size(); i++) {
            for (int j = 0; j < users.size() - 1; j++) {
                if (users.get(j).getId() < users.get(j + 1).getId()) {
                    User user = users.get(j);
                    users.set(j, users.get(j + 1));
                    users.set(j + 1, user);
                }
            }
        }
        System.out.println(" Сортировка оп ID :");
        for (int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i).getName() + " - " + users.get(i).getId());
        }
    }

    private static void checkUsersName() {
        ArrayList<User> users = UserUtil.getUsers();
        for (int i = 0; i < users.size(); i++) {
            for (int j = i + 1; j < users.size() - 1; j++) {
                if (users.get(i).getName() == users.get(j).getName() && users.get(i).getSecondName() == users.get(j).getSecondName()) {
                    //if (users[i].name.equals(users[j].name) && users[i].secondName.equals(users[j].secondName)) {
                    System.out.println(" Юзеры, однофамильцы :  " + users.get(i).getName() + " " + users.get(i).getSecondName() + " и " +
                            users.get(j).getName() + " " + users.get(j).getSecondName());
                } else {
                    break;
                }
            }
        }
    }

    private static void checkUsersLogin() {
        ArrayList<User> users = UserUtil.getUsers();
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getName().equals(users.get(i).getLogin())) {
                System.out.println(" Имя и Логин совпадают у юзера : " + users.get(i).getName() + " " + users.get(i).getSecondName() + ", логин: " +
                        users.get(i).getLogin());
            } else {
                break;
            }
        }
    }

    private static void showUsers() {
        ArrayList<User> users = UserUtil.getUsers();
        for (int i = 0; i < users.size(); i++) {
            System.out.println(" Имя, Фамилия юзера: " + users.get(i).getName() + " " + users.get(i).getSecondName() + ", Login - " + users.get(i).getLogin());
            System.out.println();
        }
    }
}

