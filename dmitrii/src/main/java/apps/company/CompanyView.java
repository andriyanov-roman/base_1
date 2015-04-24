package apps.company;

import entities.company.Company;
import entities.company.Employee;
import entities.mvc.CommonView;
import tools.Table;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.util.InputMismatchException;

/**
 * Created by mit_OK! on 27.03.2015.
 */
public class CompanyView extends CommonView {
    private static Scanner scanner = new Scanner(System.in);
    private String [] templateTitles = {"Job title","Name","Surname","Salary","Gender","Age","Other"};
    public final int SURNAME_HIGHLIGHT = 2;
    public final int SALARY_HIGHLIGHT = 3;
    public final int AGE_HIGHLIGHT = 5;

    public String[] getTemplateTitles() {
        return templateTitles;
    }

    public void setTemplateTitles(String[] templateTitles) {
        this.templateTitles = templateTitles;
    }

    public static Boolean hasNext() {
        return scanner.hasNext();
    }

    public static String next() {
        return scanner.next();
    }

    @Override
    public void showMainMenu() {
        alertInline("\n0) Show FULL employee's info (to show AGE and GENDER)" +
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
        alert("\nChoose company:");
        if (allCompanies.length == 0) { // мы не будем добавлять сотрудника сразу во все компании, а только по одной
            alert("0. All employees in all companies");// «0» - вывести всех работников во всех компаниях
        }
        for (int i = 0; i < comps.size(); i++) {// Выводим список компаний
            alert((i + 1) + ". " + comps.get(i).getCompanyName());
        }
        alert("f. Type \"f\" to input company's Name manual");// f - ввести имя компании вручную
        alertInline("Your choice: ");
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
                    alert("Error! There are only " + comps.size() + " companies available!" +
                            "\nReturn to CompanyMain menu...");
                }
            }
        } catch (InputMismatchException e) {
            chooseChar = scanner.next();
            // Если пользователь ввёл БУКВУ
            if (chooseChar.equals("f")) { // Если это буква 'f' - просим его ввести компанию
                alertInline("Type company's Name: ");
                String companyName = scanner.next();
                for (Company i : comps) {
                    if (i.getCompanyName().equals(companyName)) {
                        selectedComps.add(i);
                        return selectedComps;
                    }
                }
                alert("COMPANY \'" + companyName + "\' NOT FOUND :((((");// Компания не найдена
                selectCompanyDialog(comps);
                selectCompany(comps);
            } else {
                alert("\nNO SUCH CASE."); // Юзер ввёл НЕ номер компании, и НЕ букву 'f'
                selectCompanyDialog(comps);
                selectCompany(comps);
            }
        }
        alert("Unknown Error!");
        return comps;
    }


    public static void alertInlineCompName (String txt){
        alert("=========== " + txt + " ===========");
    }
    public static void displayWorkersFULL(ArrayList<Company> selectedComps) {
        for (Company com : selectedComps) {
            alert(com.getCompanyName());
            for (int i = 0; i < com.getWorkers().size(); i++) {
                showWorkerFULL(com.getWorkers().get(i).toString());
            }
        }
    }

    public void displayWorkersTable(ArrayList<Company> selectedComps, int ... highlightedTitle) {
        int colWidth = 16;
        String[] titles = templateTitles.clone();
        for (int i = 0; i < highlightedTitle.length; i++) {
            if (highlightedTitle[i]<titles.length){
                titles[highlightedTitle[i]] += " *";
            }
        }
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
    public void displayWorkersTable(Company com, int ... highlightedTitle) {
        int colWidth = 16;
        String[] titles = templateTitles.clone();
        for (int i = 0; i < highlightedTitle.length; i++) {
            if (highlightedTitle[i]<titles.length){
                titles[highlightedTitle[i]] += " *";
            }
        }
        String[] cells = titles;
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
    public static void showWorkerFULL(String workerString) {
        String result = "";
        String[] p = workerString.split(Employee.getSeparator());
        if (p.length < 6) {
            result = "NOT ENOUGH DATA FOR CORRECT DISPLAY!\n" +
                    "All we have: " + workerString;
            alert(result);
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
        alert(result);
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
        alertInline(workerStr.split(Employee.getSeparator())[0]);
        alert(" with HIGHEST salary is:");
        alert("\t" + showWorkerSHORT(workerStr));
        String gen;
        if (workerStr.split(Employee.getSeparator())[4].equals("true")) {
            gen = "He";
        } else {
            gen = "She";
        }
        alert(gen + " works in: \'" + CompanyName + "\'");
    }

    public String[] AddEmployeeDialog() {
        alert("Please, fill All fields\n");
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
                alert("Job title is undefined!");
                alertInline("Try again? \'y\' - YES / \'n\' (or other variant) - return to Menu. : ");
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
        alert("Input profession with Capital letter ");
        alertInline("(ex. \'Admin\', \'Manager\', \'Programmer\' or just \'Employee\'): ");
        return scanner.next();
    }

    public static String addName() {
        alertInline("Name: ");
        return scanner.next();
    }

    public static String addSurname() {
        alertInline("Surname: ");
        return scanner.next();
    }

    public static Double addSalary() {
        Double salary = 0.0;
        boolean wasExc = false; // проверяем, было ли Исключение - "was Exception"
        while (true) {
            alertInline("Salary: ");
            try {
                salary = Double.parseDouble(scanner.next());
            } catch (Exception e) {
                alert("Wrong input! The input must be an positive Double number. Try again.");
                wasExc = true;
            }
            if (salary > 0.0) {
                break;
            } else if (!wasExc) {
                alert("Oh, the inputted number must be positive! Try again.");
            }
        }
        return salary;
    }

    public static Boolean addGender() {
        String answer;
        Boolean gender;
        alertInline("Gender (\"m\"-male, \"f\"-female): ");
        while (true) {
            answer = scanner.next();
            if (answer.equals("m")) {
                gender = true;
                break;
            } else if (answer.equals("f")) {
                gender = false;
                break;
            }
            alertInline("Input Gender letter (\"m\"-male, \"f\"-female): ");
        }
        return gender;
    }

    public static int addAge() {
        int age = 0;
        Boolean wasExc = false;
        while (true) {
            alertInline("Age: ");
            try {
                age = Integer.parseInt(scanner.next());
            } catch (Exception e) {
                alert("Wrong input! The scanner must be an positive Integer number. Try again.");
                wasExc = true;
            }
            if (age > 0) {
                break;
            } else if (!wasExc) {
                alert("Oh, the input integer number must be positive! Try again.");
            }
        }
        return age;
    }

    private static String addSpecField(String specFieldName) {
        alertInline("Input " + specFieldName + ": ");
        return scanner.next();
    }

    public String goToNextStep(String companyName) {
        //Продожение диалога с пользователем:::::
        alert("\nWhat will You want to do next:" +
                "\n1. Add another user to Company \"" + companyName + "\"" +
                "\n2. Show PREVIOUS inputted  user" +
                "\ne. (or any another key) Exit to CompanyMain menu");
        alertInline("Choose your destiny: ");
        return scanner.next();
    }

    public static Double percentDialog() {
        Double percent = 0.0;
        alertInline("Input percent for increasing salary (ex. 15, 27): ");
        try {
            percent = Double.valueOf(scanner.next());
        } catch (Exception e){
            alertInline("Wrong input! Try again.");
            percent = percentDialog();
        }
        return percent/100;
    }

    public static void changeConfigDialog() {
        alertInline("Specify new Config path: ");
        CompanyModel.setConfigPath(scanner.next());
    }


}
