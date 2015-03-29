package homeTasks;



import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class Methods {
    static Scanner scanner;

    public static void start() throws IOException {
        scanner = new Scanner(System.in);

        System.out.println("Enter command key!");
        System.out.println("1. Пользователи у которых логин совпадает с иминем или фамилией");
        System.out.println("2. Найти юзеров с одинаковым иминем и фамилией");
        System.out.println("3. Сортировка юзеров по id по убыванию");
        System.out.println("********************************************************************************************");
        System.out.println("4. Информация о сотрудниках всех компаний");
        System.out.println("5. Сотрудник с наибольшей зарплатой из всех компаний");
        System.out.println("6. Сотрудники с одинаковыми именами и фамилией");
        System.out.println("7. Сортировка сотрудников, всех компаний, по зп в порядке убывания");
        System.out.println("8. Узнать названия компаний");
        System.out.println("9. Узнать имена сотрудников, которые работают в каждой компании");
        System.out.println("10. Узнать сотрудника с наибольшей зп в каждой компании");
        System.out.println("11. Сортировка сотрудников по зарплате,в порядке убывания");
        System.out.println("12. Сортировка сотрудников по возрасту,в порядке убывания");
        System.out.println("13. Сортировка сотрудников по длине фамилии,в порядке убывания");
        System.out.println("14. Добавить нового сотрудника");
        System.out.println("15. Уволить всех женщин и мужчинам поднять зп");
        System.out.println("16. Уволить всех мужчин и женщинам поднять зп");
        System.out.println("17. Добавить администратора в Luxsoft");
        System.out.println("18. Добавить менеджера в Luxsoft");
        System.out.println("19. Добавить програмиста в Luxsoft");
        System.out.println("20. Узнать среди админов,программистов и менеджеров в Luxsoft, кто получает наибольшую зп");




        while (scanner.hasNext()) {
            switch (scanner.next()) {
                case "1":
                    coincidenceLoginNameSecondName();
                    break;
                case "2":
                    coincidenceNameSecondName();
                    break;
                case "3":
                    sort();
                    break;
                case "4":
                    infoEmployees();
                    break;
                case "5":
                    maxSalary();
                    break;
                case "6":
                    tesku();
                    break;
                case "7":
                    sortSalary();
                    break;
                case "8":
                    companyName();
                    break;
                case "9":
                    infoCompany();
                    break;
                case "10":
                    сompanyMaxSalary();
                    break;
                case "11":
                    sortCompanysBySalary();
                    break;
                case "12":
                    sortCompanysByAge();
                    break;
                case "13":
                    sortCompanysByLengthSecondName();
                    break;
                case "14":
                    //CompanyUtil.addEmployeesToFile();
                    greatNewEmployees();
                    break;
                case "15":
                    salaryPlusMenAndKillWomen();
                    break;
                case "16":
                    salaryPlusWomenAndKillMen();
                    break;
                case "17":
                    greatLuxsoftAdmin();
                    break;
                case "18":
                    greatLuxsoftMeneger();
                    break;
                case "19":
                    greatLuxsoftProgrammer();
                    break;
                case "20":
                    maxSalaryFromAdminMenegerProgrammer();
                    break;
                case "Exit":
                    System.exit(0);
                    break;
                default:
                    System.out.println("No such case");
            }
        }
    }

    public static void coincidenceLoginNameSecondName() {
        int count = 0;
        UserMatveu[] users = UsersUtil.getUsers();
        for (int i = 0; i < users.length; i++) {
            if (users[i].login.equals(users[i].name)) {
                System.out.println("Логин совпадает с именем: " + users[i].name);
                count++;
            }
            if (users[i].login.equals(users[i].secondName)) {
                System.out.println("Логин совпадает с фамилией: " + users[i].secondName);
                count++;
            }
        }
        System.out.println("Количество совпадений: " + count);
    }

    public static void coincidenceNameSecondName() {
        UserMatveu[] users = UsersUtil.getUsers();
        for (int i = 0; i < users.length; i++) {
            if (users[i].name.equals(users[i].secondName)) {
                System.out.println("Пользователи с одинаковым именем и фамилией: " + users[i].name + " " + users[i].secondName);
            }
        }

    }

    public static void sort() {
        UserMatveu[] users = UsersUtil.getUsers();
        for (int i = users.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (users[j].id < users[j + 1].id) {
                    UserMatveu k = users[j];
                    users[j] = users[j + 1];
                    users[j + 1] = k;
                }
            }
        }
        for (int i = 0; i < users.length; i++) {
            System.out.print(users[i].name + "/");
            System.out.print(users[i].id + "/ ");
        }
    }

    //*******************************************************************************************************************************
    public static void infoEmployees() throws IOException {
        ReadingFromFileLuxsoft.getEmployees();
        ReadingFromFileMicrosoft.getEmployees();
        ReadingFromFileSony.getEmployees();
        System.out.print("Количество всех сотрудников всех компаний: " + ReadingFromFileEmployeesAll.getEmployees().size());
        System.out.println();
    }

    public static void maxSalary() throws IOException {
        ArrayList<Employee> employees = ReadingFromFileEmployeesAll.getEmployees();
        double maxSalary = employees.get(0).getSalary();
        String maxName = "";
        String maxSecondName = "";
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getSalary() > maxSalary) {
                maxSalary = employees.get(i).getSalary();
                maxName = employees.get(i).getName();
                maxSecondName = employees.get(i).getSecondName();
            }
        }
        System.out.println("Сотрудник с наибольшей зп из всех компаний: " + maxName + " " + maxSecondName + ", с зарплатой: " + maxSalary);
       /* ArrayList<Employee> employees = ReadingFromFileLuxsoft.getEmployees();
        ArrayList<Employee> employees1 = ReadingFromFileMicrosoft.getEmployees();
        ArrayList<Employee> employees2 = ReadingFromFileSony.getEmployees();
        int i,j,k;
        double maxSalary = employees.get(0).getSalary();
        String maxCompanyName="";
        String maxName="";
        String maxSecondName="";

        for (i = 0; i < employees.size(); i++) {
            for (j = 0; j < employees1.size(); j++) {
                for (k = 0; k < employees2.size(); k++) {
                    if(employees.get(i).getSalary()>maxSalary) {
                        maxSalary = employees.get(i).getSalary();
                        maxCompanyName = "Luxsoft";
                        maxName = employees.get(i).getName();
                        maxSecondName = employees.get(i).getSecondName();
                    }
                        if(employees1.get(j).getSalary()>maxSalary) {
                            maxSalary = employees1.get(j).getSalary();
                            maxCompanyName = "Microsoft";
                            maxName = employees1.get(j).getName();
                            maxSecondName = employees1.get(j).getSecondName();
                        }
                            if(employees2.get(k).getSalary()>maxSalary){
                                maxSalary=employees2.get(k).getSalary();
                                maxCompanyName="Sony";
                                maxName=employees2.get(k).getName();
                                maxSecondName=employees2.get(k).getSecondName();
                            }
                }
            }
        }
        System.out.print(maxCompanyName + ": " + maxName + " " + maxSecondName + ". Зарплата: " + maxSalary + "\n");
*/
    }

    public static void tesku() throws IOException {
        ArrayList<Employee> employees = ReadingFromFileEmployeesAll.getEmployees();
        String sameName = " ";
        String sameSecondName = " ";
        System.out.print("Сотрудники с одинаковыми именами и фамилией: ");
        for (int i = 0; i < employees.size(); i++) {
            for (int j = i + 1; j < employees.size(); j++) {
                if (employees.get(i).getName().equals(employees.get(j).getName()) && employees.get(i).getSecondName().equals(
                        employees.get(j).getSecondName())) {
                    sameName = employees.get(i).getName();
                    sameSecondName = employees.get(i).getSecondName();
                    System.out.println(sameName + " " + sameSecondName);
                }
            }
        }
    }


    public static void sortSalary() throws IOException {
        ArrayList<Employee> employees = ReadingFromFileEmployeesAll.getEmployees();
        for (int i = employees.size() - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (employees.get(j).getSalary() < employees.get(j + 1).getSalary()) {
                    Employee k = employees.get(j);
                    employees.set(j, employees.get(j + 1));
                    employees.set(j + 1, k);
                }
            }
        }
        for (int i = 0; i < employees.size(); i++) {
            System.out.print(employees.get(i).getName() + " " + employees.get(i).getSecondName() + "/" + employees.get(i).getSalary() + "/");
            System.out.println();

        }
    }

    public static void companyName() throws IOException {
        ArrayList<Company> companies = CompanyUtil.getCompanies();
        for (int i = 0; i < companies.size(); i++) {
            System.out.println(companies.get(i).getCompanyName() + " ");
        }
    }

    public static void infoCompany() throws IOException {
        System.out.println("Сотрудники компании 'Luxsoft': ");
        ReadingFromFileLuxsoft.getEmployees();
        System.out.println("Сотрудники компании 'Microsoft': ");
        ReadingFromFileMicrosoft.getEmployees();
        System.out.println("Сотрудники компании 'Sony': ");
        ReadingFromFileSony.getEmployees();
    }

    public static void сompanyMaxSalary() throws IOException {
        ArrayList<Employee> employees1 = ReadingFromFileLuxsoft.getEmployees();
        ArrayList<Employee> employees2 = ReadingFromFileMicrosoft.getEmployees();
        ArrayList<Employee> employees3 = ReadingFromFileSony.getEmployees();
        int i, j, k;
        double maxSalary1 = employees1.get(0).getSalary();
        double maxSalary2 = employees2.get(0).getSalary();
        double maxSalary3 = employees3.get(0).getSalary();
        String maxCompanyName1 = " ";
        String maxCompanyName2 = " ";
        String maxCompanyName3 = " ";
        String maxName1 = "";
        String maxSecondName1 = "";
        String maxName2 = "";
        String maxSecondName2 = "";
        String maxName3 = "";
        String maxSecondName3 = "";

        for (i = 0; i < employees1.size(); i++) {
            if (employees1.get(i).getSalary() > maxSalary1) {
                maxSalary1 = employees1.get(i).getSalary();
                maxCompanyName1 = "Luxsoft";
                maxName1 = employees1.get(i).getName();
                maxSecondName1 = employees1.get(i).getSecondName();
            }
        }
        System.out.println(maxCompanyName1 + ": " + maxName1 + " " + maxSecondName1 + ". Зарплата: " + maxSalary1);

        for (j = 0; j < employees2.size(); j++) {
            if (employees2.get(j).getSalary() > maxSalary2) {
                maxSalary2 = employees2.get(j).getSalary();
                maxCompanyName2 = "Microsoft";
                maxName2 = employees2.get(j).getName();
                maxSecondName2 = employees2.get(j).getSecondName();
            }
        }
        System.out.println(maxCompanyName2 + ": " + maxName2 + " " + maxSecondName2 + ". Зарплата: " + maxSalary2);

        for (k = 0; k < employees3.size(); k++) {
            if (employees3.get(k).getSalary() > maxSalary3) {
                maxSalary3 = employees3.get(k).getSalary();
                maxCompanyName3 = "Sony";
                maxName3 = employees3.get(k).getName();
                maxSecondName3 = employees3.get(k).getSecondName();
            }
        }
        System.out.println(maxCompanyName3 + ": " + maxName3 + " " + maxSecondName3 + ". Зарплата: " + maxSalary3);
    }


    public static void sortCompanysBySalary() throws IOException {
        scanner = new Scanner(System.in);
        System.out.println("Выберите компанию в которой желаете отсортировать сотрудников по зарплате:");
        System.out.println("1. Luxsoft");
        System.out.println("2. Microsoft");
        System.out.println("3. Sony");
        while (scanner.hasNext()) {
            switch (scanner.nextInt()) {
                case 1:
                    sortBySalaryLuxsoft();
                    break;
                case 2:
                    sortBySalaryMicrosoft();
                    break;
                case 3:
                    sortBySalarySony();
                    break;
            }
        }
    }

    public static void sortBySalaryLuxsoft() throws IOException {
        ArrayList<Employee> employees = ReadingFromFileLuxsoft.getEmployees();
        for (int i = employees.size() - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (employees.get(j).getSalary() < employees.get(j + 1).getSalary()) {
                    Employee k = employees.get(j);
                    employees.set(j, employees.get(j + 1));
                    employees.set(j + 1, k);
                }
            }
        }
        for (int i = 0; i < employees.size(); i++) {
            System.out.print(employees.get(i).getName() + " " + employees.get(i).getSecondName() + "/" + employees.get(i).getSalary() + "/");
            System.out.println();

        }
    }

    public static void sortBySalaryMicrosoft() throws IOException {
        ArrayList<Employee> employees = ReadingFromFileMicrosoft.getEmployees();
        for (int i = employees.size() - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (employees.get(j).getSalary() < employees.get(j + 1).getSalary()) {
                    Employee k = employees.get(j);
                    employees.set(j, employees.get(j + 1));
                    employees.set(j + 1, k);
                }
            }
        }
        for (int i = 0; i < employees.size(); i++) {
            System.out.print(employees.get(i).getName() + " " + employees.get(i).getSecondName() + "/" + employees.get(i).getSalary() + "/");
            System.out.println();

        }
    }

    public static void sortBySalarySony() throws IOException {
        ArrayList<Employee> employees = ReadingFromFileSony.getEmployees();
        for (int i = employees.size() - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (employees.get(j).getSalary() < employees.get(j + 1).getSalary()) {
                    Employee k = employees.get(j);
                    employees.set(j, employees.get(j + 1));
                    employees.set(j + 1, k);
                }
            }
        }
        for (int i = 0; i < employees.size(); i++) {
            System.out.print(employees.get(i).getName() + " " + employees.get(i).getSecondName() + "/" + employees.get(i).getSalary() + "/");
            System.out.println();

        }
    }

    public static void sortCompanysByAge() throws IOException {
        scanner = new Scanner(System.in);
        System.out.println("Выберите компанию в которой желаете отсортировать сотрудников по возрасту:");
        System.out.println("1. Luxsoft");
        System.out.println("2. Microsoft");
        System.out.println("3. Sony");
        while (scanner.hasNext()) {
            switch (scanner.nextInt()) {
                case 1:
                    sortByAgeLuxsoft();
                    break;
                case 2:
                    sortByAgeMicrosoft();
                    break;
                case 3:
                    sortByAgeSony();
                    break;
            }
        }
    }

    public static void sortByAgeLuxsoft() throws IOException {
        ArrayList<Employee> employees = ReadingFromFileLuxsoft.getEmployees();
        for (int i = employees.size() - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (employees.get(j).getAge() < employees.get(j + 1).getAge()) {
                    Employee k = employees.get(j);
                    employees.set(j, employees.get(j + 1));
                    employees.set(j + 1, k);
                }
            }
        }
        for (int i = 0; i < employees.size(); i++) {
            System.out.print(employees.get(i).getName() + " " + employees.get(i).getSecondName() + "/" + employees.get(i).getAge() + "/");
            System.out.println();

        }
    }

    public static void sortByAgeMicrosoft() throws IOException {
        ArrayList<Employee> employees = ReadingFromFileMicrosoft.getEmployees();
        for (int i = employees.size() - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (employees.get(j).getAge() < employees.get(j + 1).getAge()) {
                    Employee k = employees.get(j);
                    employees.set(j, employees.get(j + 1));
                    employees.set(j + 1, k);
                }
            }
        }
        for (int i = 0; i < employees.size(); i++) {
            System.out.print(employees.get(i).getName() + " " + employees.get(i).getSecondName() + "/" + employees.get(i).getAge() + "/");
            System.out.println();

        }
    }

    public static void sortByAgeSony() throws IOException {
        ArrayList<Employee> employees = ReadingFromFileSony.getEmployees();
        for (int i = employees.size() - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (employees.get(j).getAge() < employees.get(j + 1).getAge()) {
                    Employee k = employees.get(j);
                    employees.set(j, employees.get(j + 1));
                    employees.set(j + 1, k);
                }
            }
        }
        for (int i = 0; i < employees.size(); i++) {
            System.out.print(employees.get(i).getName() + " " + employees.get(i).getSecondName() + "/" + employees.get(i).getAge() + "/");
            System.out.println();

        }
    }

    public static void sortCompanysByLengthSecondName() throws IOException {
        scanner = new Scanner(System.in);
        System.out.println("Выберите компанию в которой желаете отсортировать сотрудников по длине фамилии:");
        System.out.println("1. Luxsoft");
        System.out.println("2. Microsoft");
        System.out.println("3. Sony");
        while (scanner.hasNext()) {
            switch (scanner.nextInt()) {
                case 1:
                    sortByLengthSecondNameLuxsoft();
                    break;
                case 2:
                    sortByLengthSecondNameMicrosoft();
                    break;
                case 3:
                    sortByLengthSecondNameSony();
                    break;
            }
        }
    }

    public static void sortByLengthSecondNameLuxsoft() throws IOException {
        ArrayList<Employee> employees = ReadingFromFileLuxsoft.getEmployees();
        for (int i = employees.size() - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (employees.get(j).getSecondName().length() < employees.get(j + 1).getSecondName().length()) {
                    Employee k = employees.get(j);
                    employees.set(j, employees.get(j + 1));
                    employees.set(j + 1, k);
                }
            }
        }
        for (int i = 0; i < employees.size(); i++) {
            System.out.print(employees.get(i).getName() + " " + employees.get(i).getSecondName() + ". Количество букв в фамилии: /" + employees.get(i).getSecondName().length() + "/");
            System.out.println();

        }
    }

    public static void sortByLengthSecondNameMicrosoft() throws IOException {
        ArrayList<Employee> employees = ReadingFromFileMicrosoft.getEmployees();
        for (int i = employees.size() - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (employees.get(j).getSecondName().length() < employees.get(j + 1).getSecondName().length()) {
                    Employee k = employees.get(j);
                    employees.set(j, employees.get(j + 1));
                    employees.set(j + 1, k);
                }
            }
        }
        for (int i = 0; i < employees.size(); i++) {
            System.out.print(employees.get(i).getName() + " " + employees.get(i).getSecondName() + ". Количество букв в фамилии: /" + employees.get(i).getSecondName().length() + "/");
            System.out.println();

        }
    }

    public static void sortByLengthSecondNameSony() throws IOException {
        ArrayList<Employee> employees = ReadingFromFileSony.getEmployees();
        for (int i = employees.size() - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (employees.get(j).getSecondName().length() < employees.get(j + 1).getSecondName().length()) {
                    Employee k = employees.get(j);
                    employees.set(j, employees.get(j + 1));
                    employees.set(j + 1, k);
                }
            }
        }
        for (int i = 0; i < employees.size(); i++) {
            System.out.print(employees.get(i).getName() + " " + employees.get(i).getSecondName() + ". Количество букв в фамилии: /" + employees.get(i).getSecondName().length() + "/");
            System.out.println();

        }
    }

    public static void greatNewEmployees() throws IOException {
        scanner = new Scanner(System.in);
        System.out.println("Выберите компанию,в которую желаете добавить сотрудника:");
        System.out.println("1: Luxsoft");
        System.out.println("2: Microsoft");
        System.out.println("3: Sony");
        while (scanner.hasNext()) {
            switch (scanner.next()) {
                case "1":
                    greatEmployeeLuxsoft();
                    break;
                case "2":
                    greatEmployeeMicrosoft();
                    break;
                case "3":
                    greatEmployeeSony();
                    break;
            }
        }
    }

    public static void greatEmployeeLuxsoft() throws IOException {
        ArrayList<Employee> employees = EmployeesUtil.getEmployees();
        ArrayList<Company> companies = CompanyUtil.getCompanies();
        Employee employee = new Employee();
        try {
            scanner = new Scanner(System.in);
            System.out.println("Введите имя сотрудника!");
            employee.setName(scanner.nextLine());
            System.out.println("Введите фамилию сотрудника!");
            employee.setSecondName(scanner.nextLine());
            System.out.println("Введите пол сотрудника! (man/woman)");
            employee.setSex(scanner.nextLine());
            System.out.println("Введите возраст сотрудника!");
            employee.setAge(scanner.nextInt());
            System.out.println("Введите зарплату сотрудника!");
            employee.setSalary(scanner.nextInt());
            employees.add(employee);
            FileWriter writer = new FileWriter("matveu/src/EmployeesLuxsoft.txt", true);
            writer.write(employee.getName() + ":" + employee.getSecondName() + ":" + employee.getSex() +
                    ":" + employee.getAge() + ":" + employee.getSalary() + "\n");
            writer.flush();
            writer.close();
            FileWriter writerAll = new FileWriter("matveu/src/EmployeesAll.txt", true);
            writerAll.write(employee.getName() + ":" + employee.getSecondName() + ":" + employee.getSex() +
                    ":" + employee.getAge() + ":" + employee.getSalary() + "\n");
            writerAll.flush();
            writerAll.close();
        } catch (Exception e) {
        }

        scanner = new Scanner(System.in);
        System.out.println("Выберите действие:");
        System.out.println("1: Добавить следующего сотрудника в Luxsoft");
        System.out.println("2: Вывести информацию по данному сотруднику");
        System.out.println("3: Добавить нового сотрудника в другие компании");
        System.out.println("4: Выход в главное меню");
        System.out.println("5: Вывести информацию по всем сотрудникам этой компании");

        while (scanner.hasNext()) {
            switch (scanner.next()) {
                case "1":
                    greatEmployeeLuxsoft();
                    break;
                case "2":
                    System.out.print(employee.getName() + " " + employee.getSecondName() + ". Sex: " + employee.getSex() + ". Age: " +
                            employee.getAge() + ". Salary: " + employee.getSalary());
                    System.out.println();
                    break;
                case "3":
                    greatNewEmployees();
                    break;
                case "4":
                    start();
                    break;
                case "5":
                    ReadingFromFileLuxsoft.getEmployees();
                    break;
            }
        }
    }

    public static void greatEmployeeMicrosoft() throws IOException {
        ArrayList<Employee> employees = EmployeesUtil.getEmployees();
        ArrayList<Company> companies = CompanyUtil.getCompanies();
        Employee employee = new Employee();
        try {
            scanner = new Scanner(System.in);
            System.out.println("Введите имя сотрудника!");
            employee.setName(scanner.nextLine());
            System.out.println("Введите фамилию сотрудника!");
            employee.setSecondName(scanner.nextLine());
            System.out.println("Введите пол сотрудника! (man/woman)");
            employee.setSex(scanner.nextLine());
            System.out.println("Введите возраст сотрудника!");
            employee.setAge(scanner.nextInt());
            System.out.println("Введите зарплату сотрудника!");
            employee.setSalary(scanner.nextInt());
            employees.add(employee);
            FileWriter writer = new FileWriter("matveu/src/EmployeesMicrosoft.txt", true);
            writer.write(employee.getName() + ":" + employee.getSecondName() + ":" + employee.getSex() +
                    ":" + employee.getAge() + ":" + employee.getSalary() + "\n");
            writer.flush();
            writer.close();
            FileWriter writerAll = new FileWriter("matveu/src/EmployeesAll.txt", true);
            writerAll.write(employee.getName() + ":" + employee.getSecondName() + ":" + employee.getSex() +
                    ":" + employee.getAge() + ":" + employee.getSalary() + "\n");
            writerAll.flush();
            writerAll.close();
        } catch (Exception e) {
        }

        scanner = new Scanner(System.in);
        System.out.println("Выберите действие:");
        System.out.println("1: Добавить следующего сотрудника в Microsoft");
        System.out.println("2: Вывести информацию по данному сотруднику");
        System.out.println("3: Добавить нового сотрудника в другие компании");
        System.out.println("4: Выход в главное меню");
        System.out.println("5: Вывести информацию по всем сотрудникам этой компании");

        while (scanner.hasNext()) {
            switch (scanner.next()) {
                case "1":
                    greatEmployeeMicrosoft();
                    break;
                case "2":
                    System.out.print(employee.getName() + " " + employee.getSecondName() + ". Sex: " + employee.getSex() + ". Age: " +
                            employee.getAge() + ". Salary: " + employee.getSalary());
                    System.out.println();
                    break;
                case "3":
                    greatNewEmployees();
                    break;
                case "4":
                    start();
                    break;
                case "5":
                    ReadingFromFileMicrosoft.getEmployees();
                    break;
            }
        }
    }

    public static void greatEmployeeSony() throws IOException {
        ArrayList<Employee> employees = EmployeesUtil.getEmployees();
        ArrayList<Company> companies = CompanyUtil.getCompanies();
        Employee employee = new Employee();
        try {
            scanner = new Scanner(System.in);
            System.out.println("Введите имя сотрудника!");
            employee.setName(scanner.nextLine());
            System.out.println("Введите фамилию сотрудника!");
            employee.setSecondName(scanner.nextLine());
            System.out.println("Введите пол сотрудника! (man/woman)");
            employee.setSex(scanner.nextLine());
            System.out.println("Введите возраст сотрудника!");
            employee.setAge(scanner.nextInt());
            System.out.println("Введите зарплату сотрудника!");
            employee.setSalary(scanner.nextInt());
            employees.add(employee);
            FileWriter writer = new FileWriter("matveu/src/EmployeesSony.txt", true);
            writer.write(employee.getName() + ":" + employee.getSecondName() + ":" + employee.getSex() +
                    ":" + employee.getAge() + ":" + employee.getSalary() + "\n");
            writer.flush();
            writer.close();
            FileWriter writerAll = new FileWriter("matveu/src/EmployeesAll.txt", true);
            writerAll.write(employee.getName() + ":" + employee.getSecondName() + ":" + employee.getSex() +
                    ":" + employee.getAge() + ":" + employee.getSalary() + "\n");
            writerAll.flush();
            writerAll.close();
        } catch (Exception e) {
        }

        scanner = new Scanner(System.in);
        System.out.println("Выберите действие:");
        System.out.println("1: Добавить следующего сотрудника в Sony");
        System.out.println("2: Вывести информацию по данному сотруднику");
        System.out.println("3: Добавить нового сотрудника в другие компании");
        System.out.println("4: Выход в главное меню");
        System.out.println("5: Вывести информацию по всем сотрудникам этой компании");

        while (scanner.hasNext()) {
            switch (scanner.next()) {
                case "1":
                    greatEmployeeSony();
                    break;
                case "2":
                    System.out.print(employee.getName() + " " + employee.getSecondName() + ". Sex: " + employee.getSex() + ". Age: " +
                            employee.getAge() + ". Salary: " + employee.getSalary());
                    System.out.println();
                    break;
                case "3":
                    greatNewEmployees();
                    break;
                case "4":
                    start();
                    break;
                case "5":
                    ReadingFromFileSony.getEmployees();
                    break;
            }
        }
    }
    public static void greatLuxsoftAdmin() throws IOException {
        ArrayList<Admin> admins = AdminsUtil.getAdmins();
        ArrayList<Company> companies = CompanyUtil.getCompanies();
        Admin admin = new Admin();
        try {
            scanner = new Scanner(System.in);
            System.out.println("Введите имя админа!");
            admin.setName(scanner.nextLine());
            System.out.println("Введите фамилию админа!");
            admin.setSecondName(scanner.nextLine());
            System.out.println("Введите пол админа! (man/woman)");
            admin.setSex(scanner.nextLine());
            System.out.println("Введите возраст админа!");
            admin.setAge(scanner.nextInt());
            System.out.println("Введите зарплату админа!");
            admin.setSalary(scanner.nextInt());
            System.out.println("Введите рабочую платформу!");
            admin.setWorkingPlatform(scanner.next());
            admins.add(admin);
            FileWriter writer = new FileWriter("matveu/src/AdminLuxsoft.txt", true);
            writer.write(admin.getName() + ":" + admin.getSecondName() + ":" + admin.getSex() +
                    ":" + admin.getAge() + ":" + admin.getSalary() +":"+ admin.getWorkingPlatform() + "\n");
            writer.flush();
            writer.close();
        } catch (Exception e) {
        }
    }
    public static void greatLuxsoftMeneger() throws IOException {
        ArrayList<Manager> manegers = ManagersUtil.getMenegers();
        ArrayList<Company> companies = CompanyUtil.getCompanies();
        Manager maneger = new Manager();
        try {
            scanner = new Scanner(System.in);
            System.out.println("Введите имя менеджера!");
            maneger.setName(scanner.nextLine());
            System.out.println("Введите фамилию менеджера!");
            maneger.setSecondName(scanner.nextLine());
            System.out.println("Введите пол менеджера! (man/woman)");
            maneger.setSex(scanner.nextLine());
            System.out.println("Введите возраст менеджера!");
            maneger.setAge(scanner.nextInt());
            System.out.println("Введите зарплату менеджера!");
            maneger.setSalary(scanner.nextInt());
            System.out.println("Введите название проекта!");
            maneger.setNameOfProject(scanner.next());
            manegers.add(maneger);
            FileWriter writer = new FileWriter("matveu/src/MenegerLuxsoft.txt", true);
            writer.write(maneger.getName() + ":" + maneger.getSecondName() + ":" + maneger.getSex() +
                    ":" + maneger.getAge() + ":" + maneger.getSalary() +":"+ maneger.getNameOfProject() + "\n");
            writer.flush();
            writer.close();
        } catch (Exception e) {
        }
    }
    public static void greatLuxsoftProgrammer() throws IOException {
        ArrayList<Programmer> programmers = ProgrammersUtil.getProgrammers();
        ArrayList<Company> companies = CompanyUtil.getCompanies();
        Programmer programmer = new Programmer();
        try {
            scanner = new Scanner(System.in);
            System.out.println("Введите имя програмиста!");
            programmer.setName(scanner.nextLine());
            System.out.println("Введите фамилию програмиста!");
            programmer.setSecondName(scanner.nextLine());
            System.out.println("Введите пол програмиста! (man/woman)");
            programmer.setSex(scanner.nextLine());
            System.out.println("Введите возраст програмиста!");
            programmer.setAge(scanner.nextInt());
            System.out.println("Введите зарплату програмиста!");
            programmer.setSalary(scanner.nextInt());
            System.out.println("Введите язык программирования!");
            programmer.setProgrammingLanguage(scanner.next());
            programmers.add(programmer);
            FileWriter writer = new FileWriter("matveu/src/ProgrammerLuxsoft.txt", true);
            writer.write(programmer.getName() + ":" + programmer.getSecondName() + ":" + programmer.getSex() +
                    ":" + programmer.getAge() + ":" + programmer.getSalary() +":"
                    + programmer.getProgrammingLanguage()+ "\n");
            writer.flush();
            writer.close();
        } catch (Exception e) {
        }
    }

    public static void salaryPlusMenAndKillWomen() throws IOException {
        ArrayList<Employee> employees = ReadingFromFileEmployeesAll.getEmployees();
        scanner = new Scanner(System.in);
        System.out.println("Введите сумму, на которую хотите повысить зп мужчинам");
        double plus = scanner.nextDouble();
        int i;
        for (i = 0; i < employees.size(); i++) {
            if (employees.get(i).getSex().equals("woman")) {
                employees.remove(i);
            }
        }
        for (i = 0; i < employees.size(); i++) {
            if (employees.get(i).getSex().equals("man")) {
                employees.get(i).setSalary(employees.get(i).getSalary() + plus);
            }
        }
        for (i = 0; i < employees.size(); i++) {
            System.out.print(employees.get(i).getName() + " " + employees.get(i).getSecondName() + " " + employees.get(i).getSalary());
            System.out.println();
        }
    }

    public static void salaryPlusWomenAndKillMen() throws IOException {
        ArrayList<Employee> employees = ReadingFromFileEmployeesAll.getEmployees();
        scanner = new Scanner(System.in);
        System.out.println("Введите сумму, на которую хотите повысить зп женщинам");
        double plus = scanner.nextDouble();
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getSex().equals("man")) {
                employees.remove(i);
            }
            if (employees.get(i).getSex().equals("woman")) {
                employees.get(i).setSalary(employees.get(i).getSalary() + plus);
            }
        }
        for (int i = 0; i < employees.size(); i++) {
            System.out.print(employees.get(i).getName() + " " + employees.get(i).getSecondName() + " " + employees.get(i).getSalary());
            System.out.println();
        }
    }


    public static void maxSalaryFromAdminMenegerProgrammer() throws IOException{
        ArrayList<Admin> admins  = ReadingFromFileAdminLuxsoft.getAdmins();
        ArrayList<Manager> manegers = ReadingFromFileMenegerLuxsoft.getMenegers();
        ArrayList<Programmer> programmers = ReadingFromFileProgrammerLuxsoft.getProgrammer();
        int i,j,k;
        double maxSalary = admins.get(0).getSalary();
        String maxCompanyName="";
        String maxName="";
        String maxSecondName="";

        for (i = 0; i < admins.size(); i++) {
            for (j = 0; j < manegers.size(); j++) {
                for (k = 0; k < programmers.size(); k++) {
                    if(admins.get(i).getSalary()>maxSalary) {
                        maxSalary = admins.get(i).getSalary();
                        maxCompanyName = "Admin";
                        maxName = admins.get(i).getName();
                        maxSecondName = admins.get(i).getSecondName();
                    }
                        if(manegers.get(j).getSalary()>maxSalary) {
                            maxSalary = manegers.get(j).getSalary();
                            maxCompanyName = "Manager";
                            maxName = manegers.get(j).getName();
                            maxSecondName = manegers.get(j).getSecondName();
                        }
                            if(programmers.get(k).getSalary()>maxSalary){
                                maxSalary=programmers.get(k).getSalary();
                                maxCompanyName="Programmer";
                                maxName=programmers.get(k).getName();
                                maxSecondName=programmers.get(k).getSecondName();
                            }
                }
            }
        }
        System.out.print("Максимальная зарплата: "+maxCompanyName + ": " + maxName + " " + maxSecondName + ". Зарплата: " + maxSalary + "\n");

    }
}


