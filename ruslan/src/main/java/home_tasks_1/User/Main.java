package home_tasks_1.User;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите интересующею Вас информацию:");
        System.out.println("1.  Информация о юзерах.");
        System.out.println("2.  Информация о юзерах у которых имя совпадает с логином.");
        System.out.println("3.  Информация о юзерах с одинаковым именем и фамилией.");
        System.out.println("4.  Сортировка юзеров по ID.");
        while (scanner.hasNext()) {
            switch (scanner.next()) {
                case "1":
                    showUsers();
                    break;
                case "2":
                    checkUsers();
                    break;
                case "3":
                    checkUsersName();
                    break;
                case "4":
                    sortUsersId();
                    break;
                case "Exit":
                    System.exit(0);
                default:
                    System.out.println("No such case");
            }
        }
    }

    private static void sortUsersId() {
        User[] users = UsersUtil.getUsers();
        for (int i = 0; i < users.length; i++) {
            for (int j = 0; j < users.length - 1; j++) {
                if (users[j].id < users[j + 1].id) {
                    User employee = users[j];
                    users[j] = users[j + 1];
                    users[j + 1] = employee;
                }
            }
        }
        System.out.println(" Сортировка оп ID :");
        for (int i = 0; i < users.length; i++) {
            System.out.println(users[i].name + users[i].secondName + " - " + users[i].id);
        }
    }

    private static void checkUsersName() {
        User[] users = UsersUtil.getUsers();
        for (int i = 0; i < users.length; i++) {
            for (int j = i + 1; j < users.length; j++) {
                if (users[i].name == users[j].name && users[i].secondName == users[j].secondName) {
                    //if (users[i].name.equals(users[j].name) && users[i].secondName.equals(users[j].secondName)) {
                        System.out.println(" Юзеры, однофамильцы :  " + users[i].name + " " + users[i].secondName+" и "+users[j].name + " "+ users[j].secondName);
                    } else {
                        break;

                    }
                }
            }
        }



    public static void showUsers() {
        User[] users = UsersUtil.getUsers();
        for (int i = 0; i < users.length; i++) {
            System.out.println(" Имя, Фамилия юзера: " + users[i].name + " " + users[i].secondName + ", Login - " + users[i].login);
            System.out.println();

        }
    }

    public static void checkUsers() {
        User[] users = UsersUtil.getUsers();
        for (int i = 0; i < users.length; i++) {
            if (users[i].name.equals(users[i].login)) {
                System.out.println(" Имя и Логин совпадают у юзера : " + users[i].name +" "+ users[i].secondName +", логин: " + users[i].login);
            } else {
                break;

            }
        }
    }
}





