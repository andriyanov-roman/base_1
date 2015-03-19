package homeWork1;

import java.util.Scanner;

/**
 * Created by Kirill on 14.03.2015.
 */
public class StartUserProgram {

    public static void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter comman key");
        System.out.println("Нажми 1 - покажет юзеров");
        System.out.println("Нажми 2 - покажет совпадения");
        System.out.println("Нажми 3 - покажет ID -  юзеров");
        System.out.println("Нажми 4 - покажет зарплату Юзеров");
        System.out.println("Нажми 5 - покажет названия компаний");
        System.out.println("Нажми 6 - покажет максимальную з.п сотрудников");
        System.out.println("Нажми 7 - тоже, что и в 6 (пока криво работаем)");
        System.out.println("Нажми 8 - покажет длину фамилий");
        System.out.println("Нажми 9 - покажет возраст");
        System.out.println("Нажми 10 - break");
        while (scanner.hasNext()) {
            switch (scanner.next()) {
                case "1":
                    UserUtil.showUsers();
                case "2":
                    UserUtil.findMatches();
                    break;
                case "3":
                    UserUtil.showIdUsers();
                case "4":
                    EmployeeUtil.findEmployeeUserSalary();
                case "5":
                    CompanyUtil.findCompName();
                case "6":
                    CompanyUtil.maxCompSalary();
                case "7":
                    CompanyUtil.sortSalaryComp();
                case "8":
                    CompanyUtil.secondNameLength();
                case "9":
                    CompanyUtil.sortAgeComp();
                case "10":
                    break;
            }
        }
    }

}
