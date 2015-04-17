package home_works.сompany.view_company;

import entity.ConsoleView;
import home_works.сompany.model_methods.CompanyMethods;

import java.util.Scanner;

/**
 * Created by user on 08.04.2015.
 */


public class CompanyView extends ConsoleView {
    protected Scanner scanner;

    public CompanyView(Scanner scanner) {
        super(scanner);
    }

    public void start() {
        System.out.println("Виберіть пункт " + "\n" +
                        "1: Добавити нового співробітника" + "\n" +
                        "2: Повернутись до попереднього меню " + "\n" +
                        "5.  Інформація про співробітників." + "\n" +
                        "6.  Інформація про заробітню платню робітників. Максимальна зарплата." + "\n" +
                        "7.  Інформація про робітників, тезки. Показати їх." + "\n" +
                        "8.  Відсортуватти робітників компанії №1, по  зарплаті." + "\n" +
                        "9.  Відсортуватти робітників компанії №2, по віку." + "\n" +
                        "10.  Відсортуватти робітників компанії №3, по довжині прізвища." + "\n" +
                        "11.  Добавить робітника." + "\n" +
                        "12.  Ввести нового робітника або вивести в консоль того якогоо добавили." + "\n" +
                        "13.  Підняти зарплату всім чоловікам та звільнити всіх жінок." + "\n" +
                        "14. Повернутись у попереднэ меню");

        while (scanner.hasNext()) {
            switch (scanner.next()) {
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "6":
                    break;
                case "7":
                    break;
                case "8":
                    break;
                case "9":
                    break;
                case "10":
                    break;
                case "11":
                    break;
                case "12":
                    break;
                case "13":
                    break;
                case "14":
                    return;
            }
        }
    }


}
