package apps.company;

import entities.company.Company;
import entities.company.Employee;
import tools.Table;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.util.InputMismatchException;

/**
 * Created by mit_OK! on 27.03.2015.
 */
public class CompanyView {
    private static Scanner scanner = new Scanner(System.in);

    public static Boolean hasNext() {
        return scanner.hasNext();
    }

    public static String next() {
        return scanner.next();
    }

    public static void welcome() {
        toPrint("\n0) Show FULL employee's info (to show AGE and GENDER)" +
                        "\n1) Show employee's info (in TABLE)" +
                        "\n2) Show highest salary in company" +
                        "\n3) Show highest salary by PROFESSION" +
                        "\n4) Sort by Salary" +
                        "\n5) Sort by Age" +
                        "\n6) Sort by Surname Length" +
                        "\n7) Add worker (добавляет пользователя и СОХРАНЯЕТ его для следующих вызовов)" +
                        "\n8) Уволить всех мужчин и женщинам поднять з.п." +
                        "\ne) (or «Exit») End program" +
                        "\n-------------------------------- \nAdditional features:" +
                        "\n9) Change config" +
                        "\n Enter command key: "
        );
    }

    public static void selectCompanyDialog(ArrayList<Company> comps, Boolean... allCompanies) {
        toPrintLN("\nChoose company:");
        if (allCompanies.length == 0) { // мы не будем добавлять сотрудника сразу во все компании, а только по одной
            toPrintLN("0. All employees in all companies");// «0» - вывести всех работников во всех компаниях
        }
        for (int i = 0; i < comps.size(); i++) {// Выводим список компаний
            toPrintLN((i + 1) + ". " + comps.get(i).getCompanyName());
        }
        toPrintLN("f. Type \"f\" to input company's Name manual");// f - ввести имя компании вручную
        toPrint("Your choice: ");
    }

    public static ArrayList<Company> selectCompany(ArrayList<Company> comps, Boolean... allCompanies) {
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
                    toPrintLN("Error! There are only " + comps.size() + " companies available!" +
                            "\nReturn to CompanyMain menu...");
                }
            }
        } catch (InputMismatchException e) {
            chooseChar = scanner.next();
            // Если пользователь ввёл БУКВУ
            if (chooseChar.equals("f")) { // Если это буква 'f' - просим его ввести компанию
                toPrint("Type company's Name: ");
                String companyName = scanner.next();
                for (Company i : comps) {
                    if (i.getCompanyName().equals(companyName)) {
                        selectedComps.add(i);
                        return selectedComps;
                    }
                }
                toPrintLN("COMPANY \'" + companyName + "\' NOT FOUND :((((");// Компания не найдена
                selectCompanyDialog(comps);
                selectCompany(comps);
            } else {
                toPrintLN("\nNO SUCH CASE."); // Юзер ввёл НЕ номер компании, и НЕ букву 'f'
                selectCompanyDialog(comps);
                selectCompany(comps);
            }
        }
        toPrintLN("Unknown Error!");
        return comps;
    }

    public static void toPrintLN(String txt) {
        System.out.println(txt);
    }

    public static void toPrint(String txt) {
        System.out.print(txt);
    }
    public static void toPrintCompName (String txt){
        toPrintLN("=========== " + txt + " ===========");
    }
    public static void displayWorkersFULL(ArrayList<Company> selectedComps) {
        for (Company com : selectedComps) {
            toPrintLN(com.getCompanyName());
            for (int i = 0; i < com.getWorkers().size(); i++) {
                showWorkerFULL(com.getWorkers().get(i).toString());
            }
        }
    }

    public static void displayWorkersTable(ArrayList<Company> selectedComps, String... template) {
        int colWidth = 16;
        String titleStr;
        if (template.length == 0) {
            titleStr = "Job title:Name:Surname:Salary:Gender:Age:Other";
        } else {
            titleStr = template[0];
        }
        String[] titles = titleStr.split(Employee.getSeparator());
        String[] cells = titles;
        for (Company com : selectedComps) {
            int totalColumns = cells.length;
            int fullWidth = colWidth * cells.length;
            Table.toDash(fullWidth);
            Table.toHeader(fullWidth, com.getCompanyName());
            Table.toPlusDash(colWidth, totalColumns);
            Table.toRowCenter(colWidth, titles);
            Table.toPlusDash(colWidth, totalColumns);
            for (int i = 0; i < com.getWorkers().size(); i++) {
                String tempStr = com.getWorkers().get(i).toString();
                String temp[] = tempStr.split(Employee.getSeparator());
                if (temp.length < totalColumns) {
                    for (int k = temp.length; k < totalColumns; k++) {
                        tempStr += (Employee.getSeparator() + " ");
                    }
                }
                cells = tempStr.split(Employee.getSeparator());
                if (Boolean.valueOf(cells[4])) {
                    cells[4] = "male";} else {cells[4] = "female";}
                Table.toRow(colWidth, cells);
            }
            Table.toDash(fullWidth);
        }
    }

    public static void showWorkerFULL(String workerString) {
        String result = "";
        String[] p = workerString.split(Employee.getSeparator());
        if (p.length < 6) {
            result = "NOT ENOUGH DATA FOR CORRECT DISPLAY!\n" +
                    "All we have: " + workerString;
            toPrintLN(result);
            return;
        }
        for (int i = 0; i < p.length; i++) {
            if (p[i].isEmpty()) {
                p[i] = "[not set]";
            }
        }
        if (Boolean.valueOf(p[4])) {
            p[4] = "male";
        } else p[4] = "female";
        result = "\nJob title: " + p[0] + "\nName: " + p[1] + "\nSurname: " + p[2] +
                "\nSalary: " + p[3] + "$" + "\nGender: " + p[4] + "\nAge: " + p[5];
        if (p.length > 6) {
            String diffField = "";
            switch (p[0]) {
                case "Admin":
                    diffField = "\nOS/Platform: ";
                    break;
                case "Programmer":
                    diffField = "\nDev.lang.: ";
                    break;
                case "Manager":
                    diffField = "\nProjects: ";
                    break;
                default:
                    diffField = "\nOther field: ";
            }
            result += diffField + p[6];
        }
        if (p.length > 7) {
            for (int i = 7; i < p.length; i++) {
                result += "\nNew field: " + p[i];
            }
        }
        toPrintLN(result);
    }

    public static String showWorkerSHORT(String workerString) {
        String[] p = workerString.split(Employee.getSeparator());
        String result = "";
        for (int i = 0; i < p.length; i++) {
            switch (i){
                case 1: p[1] = ">> " + p[1];break;
                case 3: p[3] += "$"; break;
                case 4: if (Boolean.valueOf(p[4])) {p[4] = "male";} else {p[4] = "female";}break;
                case 5: p[5] += " years"; break;
                case 6: if (p[0].equals("Admin")) {p[6] = "OS: " + p[6];}
                        if (p[0].equals("Manager")) {p[6] = "Project: " + p[6];}
                        if (p[0].equals("Programmer")) {p[6] = "Dev.lang.: " + p[6];}
                    break;
            }
            if (p[i].isEmpty()) {p[i] = "[not set]";}
            result += p[i] + " ";
        }
        return result;
    }

    public static void toShowHighSalary(String workerStr, String CompanyName) {
        toPrint(workerStr.split(Employee.getSeparator())[0]);
        toPrintLN(" with HIGHEST salary is:");
        toPrintLN("\t" + showWorkerSHORT(workerStr));
        String gen;
        if (workerStr.split(Employee.getSeparator())[4].equals("true")) {
            gen = "He";
        } else {
            gen = "She";
        }
        toPrintLN(gen + " works in: \'" + CompanyName + "\'");
    }

    public static String[] AddEmployeeDialog() {
        toPrintLN("Please, fill All fields\n");
        scanner.useDelimiter("\n");
        String[] str = new String[7];
        str[0] = addJobTitle();
        switch (str[0]) {
            case "Admin":
                fillMainFields(str);
                str[6] = addSpecField("OS / Platform: ");
                break;
            case "Programmer":
                fillMainFields(str);
                str[6] = addSpecField("Dev. lang.: ");
                break;
            case "Manager":
                fillMainFields(str);
                str[6] = addSpecField("Project name: ");
                break;
            case "Employee":
                fillMainFields(str);
                break;
            default:
                toPrintLN("Job title is undefined!");
                toPrint("Try again? \'y\' - YES / \'n\' (or other variant) - return to Menu. : ");
                if (scanner.next().equals("y")) {
                    str = AddEmployeeDialog();
                }
        }
        return str;
    }

    public static String[] fillMainFields(String[] str) {
        str[1] = addName();
        str[2] = addSurname();
        str[3] = addSalary().toString();
        str[4] = addGender().toString();
        str[5] = String.valueOf(addAge());
        return str;
    }

    public static String addJobTitle() {
        toPrintLN("Input profession with Capital letter ");
        toPrint("(ex. \'Admin\', \'Manager\', \'Programmer\' or just \'Employee\'): ");
        return scanner.next();
    }

    public static String addName() {
        toPrint("Name: ");
        return scanner.next();
    }

    public static String addSurname() {
        toPrint("Surname: ");
        return scanner.next();
    }

    public static Double addSalary() {
        Double salary = 0.0;
        boolean wasExc = false; // проверяем, было ли Исключение - "was Exception"
        while (true) {
            toPrint("Salary: ");
            try {
                salary = Double.parseDouble(scanner.next());
            } catch (Exception e) {
                toPrintLN("Wrong input! The input must be an positive Double number. Try again.");
                wasExc = true;
            }
            if (salary > 0.0) {
                break;
            } else if (!wasExc) {
                toPrintLN("Oh, the inputted number must be positive! Try again.");
            }
        }
        return salary;
    }

    public static Boolean addGender() {
        String answer;
        Boolean gender;
        toPrint("Gender (\"m\"-male, \"f\"-female): ");
        while (true) {
            answer = scanner.next();
            if (answer.equals("m")) {
                gender = true;
                break;
            } else if (answer.equals("f")) {
                gender = false;
                break;
            }
            toPrint("Input Gender letter (\"m\"-male, \"f\"-female): ");
        }
        return gender;
    }

    public static int addAge() {
        int age = 0;
        Boolean wasExc = false;
        while (true) {
            toPrint("Age: ");
            try {
                age = Integer.parseInt(scanner.next());
            } catch (Exception e) {
                toPrintLN("Wrong input! The scanner must be an positive Integer number. Try again.");
                wasExc = true;
            }
            if (age > 0) {
                break;
            } else if (!wasExc) {
                toPrintLN("Oh, the input integer number must be positive! Try again.");
            }
        }
        return age;
    }

    private static String addSpecField(String specFieldName) {
        toPrint("Input " + specFieldName + ": ");
        return scanner.next();
    }

    public static String goToNextStep(String companyName) {
        //Продожение диалога с пользователем:::::
        toPrintLN("\nWhat will You want to do next:" +
                "\n1. Add another user to Company \"" + companyName + "\"" +
                "\n2. Show PREVIOUS inputted  user" +
                "\ne. (or any another key) Exit to CompanyMain menu");
        toPrint("Choose your destiny: ");
        return scanner.next();
    }

    public static Double percentDialog() {
        Double percent = 0.0;
        toPrint("Input percent for increasing salary (ex. 15, 27): ");
        try {
            percent = Double.valueOf(scanner.next());
        } catch (Exception e){
            toPrint("Wrong input! Try again.");
            percent = percentDialog();
        }
        return percent/100;
    }

    public static void changeConfigDialog() {
        toPrint("Specify new Config path: ");
        CompanyModel.setConfigPath(scanner.next());
    }


}
