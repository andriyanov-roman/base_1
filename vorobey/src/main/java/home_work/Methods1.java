package home_work;

import java.util.Scanner;

/**
 * Created by user on 09.03.2015.
 */
public class Methods1 {
    public static void start() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Для получения информации об участниках,нажмите '1' ");
        System.out.println("2.Чтобы узнать,у каких участников совпадает логин с Именем или Фамилией,нажмите '2' ");
        System.out.println("3.Чтобы узнать,у каких участников совпадает Имя и Фамилия,нажмите '3'");
        System.out.println("4.Чтобы отсортировать участников по id в порядке возростания,нажмите '4'");
        System.out.println("5.Для получения информации о сотрудниках компании,нажмите '5' ");
        System.out.println("6.Чтобы узнать,у кого из сотрудников самая большая зарплата,нажмите '6' ");
        System.out.println("7.Чтобы отсортировать сотруников по ЗП в порядке возростания,нажмите '7'");


        while (sc.hasNext()) {
            switch (sc.next()) {
                case "1":
                    showUser();
                    break;
                case "2":
                    checkUsersLogin();
                    break;
                case "3":
                    checkUser();
                    break;
                case "4":
                    sort();
                    break;
                case "5":
                    showEmployee();
                    break;
                case "6":
                    maxSalary();
                    break;
                case "7":
                    sortSalary();
                    break;


                case "Exit":
                    System.exit(0);


                default:
                    System.out.println("No such case");
            }
        }

    }

    public static void showUser() {
        User[] users = UsersUtil.getUsers();
        for (int i = 0; i < users.length; i++) {
            System.out.println((i + 1) + "." + users[i].name + " " + users[i].secondName + ", age: " + users[i].age + ", id: " + users[i].id + ", Login: " + users[i].login);
        }


    }

    public static void checkUser() {

        User[] users = UsersUtil.getUsers();
        System.out.println("Имя и Фамилимя совпадают у: ");
        for (int i = 0; i < users.length; i++) {

            if (users[i].name.equals(users[i].secondName))
                System.out.println(users[i].name + "  " + users[i].secondName + ".");


        }


    }

    public static void checkUsersLogin() {
        User[] users = UsersUtil.getUsers();
        System.out.println("Логин и Имя(Фамилия) совпадают у: ");
        for (int i = 0; i < users.length; i++) {
            if (users[i].login.equals(users[i].name) || users[i].login.equals(users[i].secondName))
                System.out.println(users[i].name + "," + users[i].secondName + ".");
        }
    }

    public static void sort() {
        User[] users = UsersUtil.getUsers();
        for (int i = users.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (users[j].id < users[j + 1].id) {
                    User u = users[j];
                    users[j] = users[j + 1];
                    users[j + 1] = u;


                }


            }
            System.out.print(users[i].name + '/');

        }
    }

    public static void maxSalary() {

        Employee[] empl = EmployeeUtil.getEmployees();
        int maxSalary = 0;
        String maxName = "";
        String maxSecondName = "";
        for (int i = 0; i < empl.length; i++) {
            if (empl[i].salary > maxSalary) {
                maxSalary = empl[i].salary;
                maxName = empl[i].name;
                maxSecondName = empl[i].secondName;
            }

        }
        System.out.println("Сотрудник: " + maxName + " " + maxSecondName + " c максимальной запрлатой: " + maxSalary);


    }

    public static void showEmployee() {
        Employee[] empl = EmployeeUtil.getEmployees();
        for (int i = 0; i < empl.length; i++) {
            System.out.println((i + 1) + "." + empl[i].name + " " + empl[i].secondName + ", c запрлатой: " + empl[i].salary);
        }


    }

    public static void sortSalary() {
        Employee[] empl = EmployeeUtil.getEmployees();
        for (int i = empl.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (empl[j].salary < empl[j + 1].salary) {
                    Employee e = empl[j];
                    empl[j] = empl[j + 1];
                    empl[j + 1] = e;


                }


            }
            System.out.print(empl[i].name + ": " + empl[i].salary + "/");

        }
    }

    public static void sameEmployee() {
        int count = 0;
        String sameName = "";
        String sameSecondName = "";
        Employee[] empl = EmployeeUtil.getEmployees();
        for (int i = 0; i < empl.length; i++) {
            for (int j = i + 1; j < empl.length; ++j) {
                if (empl[i].name == empl[j].name && empl[i].secondName == empl[j].secondName) {
                    count++;
                    sameName = empl[i].name;
                    sameSecondName = empl[i].secondName;
                }
            }

        }
        System.out.println("Количество одинаковых сотрудников: " + count + "  " + sameName + " " + sameSecondName);

    }
}
