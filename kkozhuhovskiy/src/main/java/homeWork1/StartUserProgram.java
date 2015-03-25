package homeWork1;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Kirill on 14.03.2015.
 */
public class StartUserProgram {

    public static void start() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter comman key");
        System.out.println("Нажми 1 - покажет юзеров");
        System.out.println("Нажми 2 - покажет совпадения");
        System.out.println("Нажми 3 - покажет ID -  юзеров");
        System.out.println("Нажми 4 - покажет зарплату Юзеров");
        System.out.println("Нажми 5 - покажет названия компаний");
        System.out.println("Нажми 6 - покажет максимальную з.п сотрудников");
        System.out.println("Нажми 7 - добавить нового пользователя");
        System.out.println("Нажми 8 - покажет длину фамилий");
        System.out.println("Нажми 9 - покажет возраст");
        System.out.println("Нажми 10 - break");
        while (scanner.hasNext()) {
            switch (scanner.next()) {
                case "1":
                    Methods.showUsers();
                case "2":
                    Methods.findMatches();
                    break;
                case "3":
                    Methods.showIdUsers();
                case "4":
                    Methods.findEmployeeUserSalary();
                case "5":
                    Methods.findCompName();
                case "6":
                    Methods.maxCompSalary();
                case "7":
                    Methods.addUserInComp();
                case "8":
                    Methods.secondNameLength();
                case "9":
                    Methods.sortAgeInComp();
                case "10":
                    break;
            }
        }
    }

}
