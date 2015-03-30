package homeproject;

import entities.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.util.InputMismatchException;

/**
 * Created by mit_OK! on 27.03.2015.
 */
public class ViewE {
    private static Scanner scanner = new Scanner(System.in);
    public static void update(ArrayList<Company> comps) throws IOException {
        Boolean ShowMenuTag = true;
        ArrayList<Company> selectedComps; // выбранные компании
        String userAnswer;
        welcome();
        while (scanner.hasNext()) {
            switch (scanner.next()) {
                case "0":
                    System.out.println("\t *** Action: HIGHEST SALARY of EMPLOYEES ***");
                    ControllerE.displayHighestSalary(comps);
                    break;
                case "1": // Показать инфо о сотрудниках компаний
                    selectCompanyDialog(comps); // Выводим пользователю список компаний
                    selectedComps = selectCompany(comps);// узнаём, какая компания интересует пользователя
                    System.out.println("\t *** Action: SHOW INFO ***");
                    ControllerE.showStuff(selectedComps);// передаём задание контроллеру
                    break;
                case "2": // Остортировать по Зарплате
                    selectCompanyDialog(comps); // Выводим пользователю список компаний
                    selectedComps = selectCompany(comps);// узнаём, какая компания интересует пользователя
                    System.out.println("\t *** Action: SORT BY SALARY ***");
                    ControllerE.sortBySalary(selectedComps);
                    break;
                case "3":// Остортировать по Возрасту
                    selectCompanyDialog(comps); // Выводим пользователю список компаний
                    selectedComps = selectCompany(comps);// узнаём, какая компания интересует пользователя
                    System.out.println("\t *** Action: SORT BY AGE ***");
                    ControllerE.sortByAge(selectedComps);
                    break;
                case "4":// Остортировать по длине фамилии
                    selectCompanyDialog(comps); // Выводим пользователю список компаний
                    selectedComps = selectCompany(comps);// узнаём, какая компания интересует пользователя
                    System.out.println("\t *** Action: SORT BY SURNAME LENGTH ***");
                    ControllerE.sortBySurnameLength(selectedComps);
                    break;
                case "7":
                    selectCompanyDialog(comps); // Выводим пользователю список компаний
                    selectedComps = selectCompany(comps);// узнаём, какая компания интересует пользователя
                    System.out.println("\t *** Action: MAX SALARY IN COMPANY ***");
                    printer(ControllerE.getMaxSalary(selectedComps));
                    break;
                case "8":
                    System.out.println(ControllerE.findHighestAdmin());
                case "m":
                    welcome();
                    ShowMenuTag = false;
                    break;
                case "exit":
                case "Exit":
                case "e":
                case "E":
                    System.exit(0);
                default:
                    System.out.println ("No such case");
                    ShowMenuTag = true;
            }
        if (ShowMenuTag == true) {
            System.out.print("\n\'m\' -- return to main MENU or 0-7,e -- for tasks: ");
        }
        ShowMenuTag = true;
        }
    }
    private static void welcome(){
        System.out.print("\n0) Previous task (Show higher salary in every OLD company)" +
                        "\n1) Task 1. Show employee's info (SHORT VIEW)" +
                        "\n2) Task 2.a. Sort by Salary" +
                        "\n3) Task 2.b. Sort by Age" +
                        "\n4) Task 2.c. Sort by Surname Length" +
                        "\n5) Task 3*. Add employee (добавляет пользователя и СОХРАНЯЕТ его для следующих вызовов)" +
                        "\n6) !NEW TASK (3). Уволить всех мужчин и женщинам поднять з.п. (СОХРАНЯЕТ результат для след. вызовов)" +
                        "\n7) Task 5.1 Найти сотрудника у которого самая высокая зарплата." +
                        "\ne) (or «Exit») End program" +
                        "\n-------------------------------- \nAdditional features:" +
                        "\nx) Task 1. Show FULL employee's info (to show AGE and GENDER)" +
                        "\n Enter command key: "
        );
    }
    private static void selectCompanyDialog (ArrayList<Company> comps, Boolean ... allCompanies) throws IOException {
        System.out.println("\nChoose company:");
        if (allCompanies.length==0) { // мы не будем добавлять сотрудника сразу во все компании, а только по одной
            System.out.println("0. All employees in all companies");// «0» - вывести всех работников во всех компаниях
        }
        for (int i = 0; i < comps.size(); i++) {// Выводим список компаний
            System.out.println((i + 1) + ". " + comps.get(i).getCompanyName());
        }
        System.out.println("f. Type \"f\" to input company's Name manual");// f - ввести имя компании вручную
        System.out.print("Your choice: ");
    }

    private static ArrayList<Company> selectCompany (ArrayList<Company> comps, Boolean ... allCompanies) throws IOException {
     /* МЕТОД ДЛЯ ОБРАБОТКИ ТОГО, ЧТО ВВЁЛ ПОЛЬЗОВАТЕЛЬ */
        ArrayList<Company> selectedComps = new ArrayList<>();
        int chooseNumber = -1;
        String chooseChar = "";
        try {
            chooseNumber = scanner.nextInt();
            if (chooseNumber >= 0) {// Если пользователь ввёл цифру
                if (chooseNumber == 0 && allCompanies.length == 0) {// мы не будем добавлять сотрудника сразу во все компании, а только по одной
                    return comps; // 0 - возвращаем все компании
                } else if (chooseNumber > 0 && chooseNumber <= comps.size()) {
                    // цифра - возращаем ArrayList, в котором только ОДНА компания - ВЫБРАННАЯ
                    // '-1' - потому что вывод компаний начинается с 1, а не с 0
                    selectedComps.add(comps.get(chooseNumber - 1));
                    return selectedComps;
                } else {// Если пользователь ввёл НЕПРАВИЛЬНУЮ цифру
                    System.out.println("Error! There are only " + comps.size() + " companies available!" +
                            "\nReturn to Main menu...");
                }
            }
        }catch (InputMismatchException e){
            chooseChar = scanner.next();
            // Если пользователь ввёл БУКВУ
            if (chooseChar.equals("f")){ // Если это буква 'f' - просим его ввести компанию
                System.out.print("Type company's Name: ");
                String companyName = scanner.next();
                for (Company i : comps) {
                    if (i.getCompanyName().equals(companyName)) {
                        selectedComps.add(i);
                        return selectedComps;
                    }
                }
                System.out.println("COMPANY \'"+companyName+"\'NOT FOUND :((((");// Компания не найдена
                selectCompanyDialog(comps);
                selectCompany(comps);
            }else {
                System.out.println("NO SUCH CASE."); // Юзер ввёл НЕ номер компании, и НЕ букву 'f'
                selectCompanyDialog(comps);
                selectCompany(comps);
            }
        }
        System.out.println("Unknown Error!");
        return comps;
    }
    public static void printer(String txt) throws IOException {
        System.out.println(txt);
    }
    public static void showWorkers (Company com) {
        System.out.println("=========== "+com.getCompanyName()+" ===========");
        for (int i = 0; i < com.getStuff().size(); i++) {
            ArrayList division = (ArrayList) com.getStuff().get(i);
            for (int j = 0; j < division.size(); j++) {
                System.out.println(division.get(j).toString());
            }
        }
        /*for (Employee i : com.getEmployees()){
            System.out.println(i.toString());
        }
        for (Admin i : com.getAdmins()){
            System.out.println(i.toString());
        }
        for (Manager i : com.getManagers()){
            System.out.println(i.toString());
        }
        for (Programmer i : com.getProgrammers()){
            System.out.println(i.toString());
        }*/
    }
    public static void showEmployees (Company com){
        System.out.println("=========== "+com.getCompanyName()+" ===========");
        for (Employee i : com.getEmployees()){
            System.out.println(i.toString());
        }
    }
}
