package hometask2;

import java.util.Scanner;

/**
 * Created by mit_OK! on 14.03.2015.
 */
public class Hometask2 {
    private static Boolean update = false; // маркер - были ли изменения в компаниях (добавлен работник и т.д.)
    private static Company[] updCompany; // контейнер для хранения обновлений компаний
    private static void welcome(){
        System.out.print("\n0) Previous task (Show higher salary in every OLD company)" +
                         "\n1) Task 1. Show full employee's info (to show AGE and GENDER)" +
                         "\n2) Task 2.a. Sort by Salary" +
                         "\n3) Task 2.b. Sort by Age" +
                         "\n4) Task 2.c. Sort by Surname Length" +
                         "\n5) Task 3. OPTIONAL* Add employee (добавляет пользователя и СОХРАНЯЕТ его для следующих вызовов)" +
                         "\ne) (or «Exit») End program" +
                         "\n Enter command key: "
        );

    }

    public static void startProgram(){
        welcome();
        Scanner scanner = new Scanner(System.in);
        //Каждой задаче присваивается Номер, чтобы пользователь не вводил название задачи вручную
        while (scanner.hasNext()) {
            switch (scanner.next()) {
                case "0":
                    CompanyUtil.highSalary();
                    break;
                case "1":
                    taskSolver("show Employee");
                    break;
                case "2":
                    taskSolver("sort By Salary");
                    break;
                case "3":
                    taskSolver("sort By Age");
                    break;
                case "4":
                    taskSolver("sort By Surname");
                    break;
                case "5":
                    taskSolver("Add employee");
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

    private static void taskSolver(String action) {

        Scanner subScanner = new Scanner(System.in);
        Company comps[] = CompanyUtil.getCompanies();
         if (update==true) {
             comps = updCompany;
         }
        System.out.println("\nChoose company:");
        if (action!="Add employee") { // мы не будем добавлять сотрудника сразу во все компании, а только по одной
            System.out.println("0. All employees in all companies");// «0» - вывести всех работников во всех компаниях
        }
        for (int i = 0; i < comps.length; i++) {
            System.out.println( (i+1)+". "+comps[i].getCompanyName() );
        }// Выводим список компаний
        System.out.print("Your choice: ");
        if (subScanner.hasNextInt()) {// Если пользователь ввёл цифру
            System.out.println("\n\t*************...processing: \""+action+"\"*************");
            int chooser = subScanner.nextInt();
            if (chooser == 0 && action!="Add employee") {// мы не будем добавлять сотрудника сразу во все компании, а только по одной
                for (Company i : comps){
                    taskExecutor(i,action);
                    System.out.println(); // Перевод строки после вывода всех компаний
                };
            }
            else if (chooser>0 && chooser <= comps.length) {
                taskExecutor(comps[chooser - 1], action);
            } else System.out.println("Error! There are only "+comps.length+" companies available!"+
                "\nReturn to Main menu...");// Если пользователь ввёл НЕПРАВИЛЬНУЮ цифру
        } else {System.out.println ("No such case. Return to Main menu...");}// Если пользователь ввёл НЕ цифру

    }

    private static void taskExecutor (Company com, String action) {
        switch (action) {
            case "show Employee":
                System.out.println("=========== "+com.getCompanyName()+" ===========");
                for (Employee k : com.getEmployees()){k.showEmployee();};
                break;
            case "sort By Salary":
                System.out.println("=========== "+com.getCompanyName()+" ===========");
                for (Employee k : com.sortBySalary()){
                    System.out.println(k.getSalary()+"$ "+k.getName()+" "+k.getSurname());
                }
                break;
            case "sort By Age":
                System.out.println("=========== "+com.getCompanyName()+" ===========");
                for (Employee k : com.sortByAge()){
                    System.out.println(k.getAge() +" "+ k.getName() + " " + k.getSurname());
                }
                break;
            case "sort By Surname":
                System.out.println("=========== "+com.getCompanyName()+" ===========");
                for (Employee k : com.sortBySurname()){
                    System.out.println( k.getSurname()+" ["+k.getSurname().length()+"]");
                }
                break;
            case "Add employee":
                System.out.println("=========== "+com.getCompanyName()+" ===========");
                System.out.println("Please, fill All fields\n");
                Scanner input = new Scanner(System.in);
                input.useDelimiter("\n");
                System.out.print("Name:");
                String name = input.next();
                System.out.print("Surname:");
                String surname = input.next();
                Double salary=0.0;
                boolean wasExc = false; // проверяем, было ли Исключение - "was Exception"
                while (true) {
                    System.out.print("Salary: ");
                    try {
                        salary = Double.parseDouble(input.next());
                    } catch (Exception e) {
                        System.out.println("Wrong input! The input must be an positive Double number. Try again.");
                        wasExc = true;
                    }
                    if (salary>0.0) {
                        break;
                    } else if (!wasExc) {
                        System.out.println("Oh, the input integer number must be positive! Try again.");
                    }
                }
                Boolean gender=false;
                String answer="";
                System.out.print("Gender (\"m\"-male, \"f\"-female): ");
                while (true){
                    answer = input.next();
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
                        age = Integer.parseInt(input.next());
                    } catch (Exception e) {
                        System.out.println("Wrong input! The input must be an positive Integer number. Try again.");
                        wasExc = true;
                    }
                    if (age>0) {
                        break;
                    } else if (!wasExc) {
                        System.out.println("Oh, the input integer number must be positive! Try again.");
                    }
                }
                Employee newStuff = new Employee(name,surname,salary,gender,age);
                int s = com.getEmployees().length;// узнаём сколько сотрудников было в компании
                Employee [] tempArr = new Employee[s+1];// создаём новый массив по их количеству и ПЛЮС ОДНО место под нового сотрудника
                for (int i = 0; i < s; i++) {
                    tempArr[i]=com.getEmployees()[i];// загоняем старых во временный массив
                }
                tempArr[s]=newStuff;// в этот же массив добавляем нового сотрудника
                com.setEmployees(tempArr); //обновляем список сотрудников компании
                // ОБНОВЛЕНИЕ - UPDATES:::::::
                // сохраняем обновления в глобальную переменную для возможности дальнейшего использования
                if (update==false){
                    updCompany = CompanyUtil.getCompanies();// если обновлений не было, то грузимся из CompanyUtil
                }
                for (Company i : updCompany){
                    if (i.getCompanyName().equals(com.getCompanyName())){
                        i.setEmployees(com.getEmployees());
                        update=true;// ставим маркер, что у нас есть обновление данных
                    }
                }
                updCompany=updCompany;
                //Продожение диалога с пользователем:::::
                Boolean goOut=false;
                while (!goOut){
                System.out.println("\nWhat will You want to do next:");
                System.out.println("1. Add another user to Company \""+com.getCompanyName()+"\"");
                System.out.println("2. Show PREVIOUS inputted user");
                System.out.println("{any another key}. Exit to Main menu");
                System.out.print("Choose your destiny: ");
                    switch (input.next()) {
                        case "1":
                            taskExecutor(com,"Add employee");
                            goOut=true;
                            break;
                        case "2":
                            com.getEmployees()[s].showEmployee();
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


}
