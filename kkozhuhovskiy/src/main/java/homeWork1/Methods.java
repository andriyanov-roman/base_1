package homeWork1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Kirill on 24.03.2015.
 */
public class Methods {

    static Scanner scanner = new Scanner(System.in);

        public static void findEmployeeUserSalary() {

        ArrayList<Employee> workers = EmployeeUtil.getEmployees();
        for (int i = 0; i < workers.size(); i++) {
            double temp = workers.get(i).getSalary();
            if (workers.get(i).getSalary() > temp) ;
            System.out.println(workers.get(i).getName() + workers.get(i).getSecondName() + "Have salary : " + workers.get(i).getSalary() + " more salary than " + temp);
        }

    }

    public static void showIdUsers() {
        User[] users = UserUtil.getUsers();
        for (int i = 0; i < users.length; i++) {
            System.out.println(users[i].getName() + "have id" + users[i].getId());
        }
    }

    public static void findMatches() {
        User[] users = UserUtil.getUsers();
        for (int i = 0; i < users.length; i++) {
            if (users[i].getLogin().equals(users[i].getName()))
                System.out.println("User " + users[i] + " have matched login with name");
            for (int c = 0; c < users.length; c++) {
                if (users[c].getLogin().equals(users[c].getSecondName()))
                    System.out.println("User" + users[c] + " have matched login with second name");
            }
        }

    }

    public static void showUsers() throws IOException {
        User[] users = UserUtil.getUsers();
        System.out.println(" **** Нажмите 0 для возврата в главное меню ****");
        for (int i = 0; i < users.length; i++) {
            System.out.print(users[i].getName() + " " + " " + users[i].getSecondName() + "; " + "\n");
        }
        System.out.println(" Введите : ");
        while (scanner.hasNext()) {
            switch (scanner.next()) {
                case "0":
                    StartUserProgram.start();
            }
        }
    }


}
