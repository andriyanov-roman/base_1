package home_works.сompany.view_company;

import entity.ConsoleView;
import home_works.сompany.data.files.UserReaderWriter;
import home_works.сompany.entities.company.User;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by user on 24.04.2015.
 */
public class UserView extends ConsoleView {
    protected Scanner scanner;
    ArrayList<User> users;

    public UserView(Scanner scanner) {
        super(scanner);
    }

    public void start() throws IOException {
        System.out.println("Виберіть пункт " + "\n" +
                "0: Вивести усіх юзерів " + "\n" +
                "1: Вивести юзерів у яких : логін співпадає з ім’ям " + "\n" +
                "2: Вивести юзерів у яких : ім’я та прізвищем співпадають" + "\n" +
                "3: Відсортувати по ID " + "\n" +
                "4: Повернутись до попереднього меню ");
        while (scanner.hasNext()) {
            switch (scanner.next()) {
                case "0":
                    showUsers();
                    break;
                case "1":
                    checkUsersLogin();
                    break;
                case "2":
                    checkUsersName();
                    break;
                case "3":
                    sortUsersId();
                    break;
                case "4":
                    return;
            }
        }
    }

    private void sortUsersId() throws IOException {
        users = UserReaderWriter.getUsers();
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

    private void checkUsersName() throws IOException {
        users = UserReaderWriter.getUsers();
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

    private void checkUsersLogin() throws IOException {
        users = UserReaderWriter.getUsers();
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getName().equals(users.get(i).getLogin())) {
                System.out.println(" Имя и Логин совпадают у юзера : " + users.get(i).getName() + " " + users.get(i).getSecondName() + ", логин: " +
                        users.get(i).getLogin());
            } else {
                break;
            }
        }
    }

    private void showUsers() throws IOException {
        users = UserReaderWriter.getUsers();
        for (int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i).getName() + " " + users.get(i).getSecondName());

        }
    }
}
