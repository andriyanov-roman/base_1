package hometask2_4;

import entity.Company;
import entity.Employee;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Scanner;


/**
 * Created by mit_OK! on 20.03.2015.
 */
class Hometask {
    private static Boolean update = false; // маркер - были ли изменения в компаниях (добавлен работник и т.д.)
    private static ArrayList<Company> updCompany; // контейнер для хранения обновлений компаний
    private static Scanner scanner = new Scanner(System.in);
    private static void welcome(){
        System.out.print("\n0) Previous task (Show higher salary in every OLD company)" +
                        "\n1) Task 1. Show employee's info (SHORT VIEW)" +
                        "\n2) Task 2.a. Sort by Salary" +
                        "\n3) Task 2.b. Sort by Age" +
                        "\n4) Task 2.c. Sort by Surname Length" +
                        "\n5) Task 3*. Add employee (добавляет пользователя и СОХРАНЯЕТ его для следующих вызовов)" +
                        "\n6) !NEW TASK (3). Уволить всех мужчин и женщинам поднять з.п. (СОХРАНЯЕТ результат для след. вызовов)" +
                        "\ne) (or «Exit») End program" +
                        "\n-------------------------------- \nAdditional features:" +
                        "\n11) Task 1. Show FULL employee's info (to show AGE and GENDER)" +
                        "\n Enter command key: "
        );
    }
    public static void runHomeTask3() throws IOException {
        welcome();
        //Каждой задаче присваивается Номер, чтобы пользователь не вводил название задачи вручную
        while (scanner.hasNext()) {
            switch (scanner.next()) {
                case "0":
                    Methods.highSalary();
                    break;
                case "1":
                    inputHandler("show Employee SHORT");
                    break;
                case "2":
                    inputHandler("sort By Salary");
                    break;
                case "3":
                    inputHandler("sort By Age");
                    break;
                case "4":
                    inputHandler("sort By Surname");
                    break;
                case "5":
                    inputHandler("Add employee");
                    break;
                case "6":
                    inputHandler("Fire and Increase");
                    break;
                case "11":
                    inputHandler("show Employee");
                    break;
                case "Exit":
                    System.exit(0);
                case "exit":
                    System.exit(0);
                case "e":
                    System.exit(0);
                case "E":
                    System.exit(0);
                default:
                    System.out.println ("No such case");
            }
            welcome();
        }
    }
    private static void inputHandler(String action) throws IOException {
        /* МЕТОД ДЛЯ ОБРАБОТКИ ТОГО, ЧТО ВВЁЛ ПОЛЬЗОВАТЕЛЬ */
        ArrayList<Company> comps = CompanyUtil.getCompanies();
        System.out.println("\nChoose company:");
        if (action!="Add employee") { // мы не будем добавлять сотрудника сразу во все компании, а только по одной
            System.out.println("0. All employees in all companies");// «0» - вывести всех работников во всех компаниях
        }
        for (int i = 0; i < comps.size(); i++) {
            System.out.println((i + 1) + ". " + comps.get(i).getCompanyName());
        }// Выводим список компаний
        System.out.print("Your choice: ");
        if (scanner.hasNextInt()) {// Если пользователь ввёл цифру
            System.out.println("\n\t*************...processing: \""+action+"\"*************");
            int chooser = scanner.nextInt();
            if (chooser == 0 && action!="Add employee") {// мы не будем добавлять сотрудника сразу во все компании, а только по одной
                for (Company i : comps){
                    taskExecutor(i,action);
                    System.out.println(); // Перевод строки после вывода всех компаний
                };
            }
            else if (chooser>0 && chooser <= comps.size()) {
                taskExecutor(comps.get(chooser - 1), action);
            } else System.out.println("Error! There are only "+comps.size()+" companies available!"+
                    "\nReturn to Main menu...");// Если пользователь ввёл НЕПРАВИЛЬНУЮ цифру
        } else {System.out.println ("No such case. Return to Main menu...");}// Если пользователь ввёл НЕ цифру

    }

    private static void taskExecutor (Company com, String action) throws IOException {
        switch (action) {
            case "show Employee":
                System.out.println("=========== "+com.getCompanyName()+" ===========");
                for (Employee k : com.getEmployees()){k.showEmployee();};
                break;
            case "show Employee SHORT":
                System.out.println("=========== "+com.getCompanyName()+" ===========");
                for (Employee k : com.getEmployees()){System.out.println(k.toString());};
                break;
            case "sort By Salary":
                System.out.println("=========== "+com.getCompanyName()+" ===========");
                for (Employee k : Methods.sort(com,"bySalary")){
                    System.out.println(k.getSalary()+"$ "+k.getName()+" "+k.getSurname());
                }
                break;
            case "sort By Age":
                System.out.println("=========== "+com.getCompanyName()+" ===========");
                for (Employee k : Methods.sort(com,"byAge")){
                    System.out.println(k.getAge() +" "+ k.getName() + " " + k.getSurname());
                }
                break;
            case "sort By Surname":
                System.out.println("=========== "+com.getCompanyName()+" ===========");
                for (Employee k : Methods.sort(com,"bySurname")){
                    System.out.println( k.getSurname()+" ["+k.getSurname().length()+"]");
                }
                break;
            case "Fire and Increase":
                System.out.println("=========== "+com.getCompanyName()+" ===========");
                com = Methods.IncreaseSalary(com, 0.15);
                com = Methods.FireStuff(com,"male");
                updateCompanies(com);
                break;
            case "Add employee":
                System.out.println("=========== "+com.getCompanyName()+" ===========");
                com.getEmployees().add(AddEmployeeDialog());
                com.setEmployees(com.getEmployees());
                updateCompanies(com);
                //Продожение диалога с пользователем:::::
                Boolean goOut=false;
                while (!goOut){
                    System.out.println("\nWhat will You want to do next:");
                    System.out.println("1. Add another user to Company \""+com.getCompanyName()+"\"");
                    System.out.println("2. Show PREVIOUS inputted  user");
                    System.out.println("{any another key}. Exit to Main menu");
                    System.out.print("Choose your destiny: ");
                    switch (scanner.next()) {
                        case "1":
                            taskExecutor(com,"Add employee");
                            goOut=true;
                            break;
                        case "2":
                            int s = com.getEmployees().size();
                            com.getEmployees().get(s-1).showEmployee();
                            break;
                        default:
                            goOut=true;
                            break;
                    }
                };
                break;
            default:
                System.out.println ("Unknown error... :( ");
        }
    }

    private static void updateCompanies (Company com) throws IOException {
        // ОБНОВЛЕНИЕ - UPDATES:::::::
        FileUtil.WriteToFile(com.toString(),com.getFilePath(),false);
    }
    private static Employee AddEmployeeDialog (){
        System.out.println("Please, fill All fields\n");
        scanner.useDelimiter("\n");
        System.out.print("Name:");
        String name = scanner.next();
        System.out.print("Surname:");
        String surname = scanner.next();
        Double salary=0.0;
        boolean wasExc = false; // проверяем, было ли Исключение - "was Exception"
        while (true) {
            System.out.print("Salary: ");
            try {
                salary = Double.parseDouble(scanner.next());
            } catch (Exception e) {
                System.out.println("Wrong scanner! The scanner must be an positive Double number. Try again.");
                wasExc = true;
            }
            if (salary>0.0) {
                break;
            } else if (!wasExc) {
                System.out.println("Oh, the scanner integer number must be positive! Try again.");
            }
        }
        Boolean gender=false;
        String answer="";
        System.out.print("Gender (\"m\"-male, \"f\"-female): ");
        while (true){
            answer = scanner.next();
            if ( answer.equals("m") ) {
                gender=true;
                break;
            } else if ( answer.equals("f") ) {
                gender=false;
                break;
            }
            System.out.print("Input Gender letter (\"m\"-male, \"f\"-female): ");
        }
        int age=0;
        wasExc = false;
        while (true) {
            System.out.print("Age: ");
            try {
                age = Integer.parseInt(scanner.next());
            } catch (Exception e) {
                System.out.println("Wrong scanner! The scanner must be an positive Integer number. Try again.");
                wasExc = true;
            }
            if (age>0) {
                break;
            } else if (!wasExc) {
                System.out.println("Oh, the scanner integer number must be positive! Try again.");
            }
        }
        Employee newStuff = new Employee(name,surname,salary,gender,age);
        return newStuff;
    }
}
