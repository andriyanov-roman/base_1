package home_task2;


import home_task.Employee;
import home_task2.Employee1;
import home_task2.EmployeeUtil;


import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class CompanyUtil {


    public static ArrayList<Company> getCompanies() throws IOException {
        ArrayList<Employee1> employees1 = EmployeeUtil.getEmployees();
        ArrayList<Company> companies = new ArrayList<>();
        Company c1 = new Company();
        Company c2 = new Company();
        Company c3 = new Company();


        c1.setEmployees(new ArrayList<>());
        c1.getEmployees().add(employees1.get(0));
        c1.getEmployees().add(employees1.get(1));
        c1.getEmployees().add(employees1.get(2));
        c1.setCompanyName("FirstCompany");

        c2.setEmployees(new ArrayList<>());
        c2.getEmployees().add(employees1.get(3));
        c2.getEmployees().add(employees1.get(4));
        c2.setCompanyName("SecondCompany");

        c3.setEmployees(new ArrayList<>());
        c3.getEmployees().add(employees1.get(5));
        c3.getEmployees().add(employees1.get(6));
        c3.getEmployees().add(employees1.get(7));
        c3.setCompanyName("ThirdCompany");


        return new ArrayList<Company>(Arrays.asList(c1, c2, c3));

    }

    public static void showCompaniesAndEmployees() throws IOException {
        ArrayList<Company> companies = getCompanies();
        for (int i = 0; i < companies.size(); i++) {
            System.out.println("********************************");
            System.out.println("В компании " + companies.get(i).getCompanyName() + " работают сотрудники: ");
            for (int j = 0; j < companies.get(i).getEmployees().size(); j++) {
                System.out.print(companies.get(i).getEmployees().get(j).getName() + " " + companies.get(i).getEmployees().get(j).getSecondName() + "(" + companies.get(i).getEmployees().get(j).getSalary() + ")");
                System.out.println();
            }
        }


    }

    public static void maxSalary() throws IOException {
        ArrayList<Company> companies = getCompanies();
        for (int i = 0; i < companies.size(); i++) {
            double maxSalary = 0;
            String maxName = "", maxSecondName = "";
            for (int j = 0; j < companies.get(i).getEmployees().size(); j++) {
                for (int k = 0; k < companies.get(i).getEmployees().get(j).getSalary(); k++) {
                    if (companies.get(i).getEmployees().get(j).getSalary() > maxSalary) {
                        maxSalary = companies.get(i).getEmployees().get(j).getSalary();
                        maxName = companies.get(i).getEmployees().get(j).getName();
                        maxSecondName = companies.get(i).getEmployees().get(j).getSecondName();
                    }

                }

            }
            System.out.println("В компании " + companies.get(i).getCompanyName() + " сотрудник с максимальной ЗП: " + maxName + ",а именно :" + maxSalary);

        }


    }

    public static void maxSalaryOfAllCompanies() throws IOException {
        ArrayList<Company> companies = getCompanies();
        double maxSalary = 0;
        String maxName = "";
        String maxSecondName = "";
        String maxNameCompany = "";

        for (int i = 0; i < companies.size(); i++) {
            for (int j = 0; j < companies.get(i).getEmployees().size(); j++) {
                for (int k = 0; k < companies.get(i).getEmployees().get(j).getSalary(); k++) {
                    if (companies.get(i).getEmployees().get(j).getSalary() > maxSalary) {
                        maxSalary = companies.get(i).getEmployees().get(j).getSalary();
                        maxName = companies.get(i).getEmployees().get(j).getName();
                        maxSecondName = companies.get(i).getEmployees().get(j).getSecondName();
                        maxNameCompany = companies.get(i).getCompanyName();

                    }
                }
            }


        }
        System.out.println("Из всех компаний,сотрудник с максимальной ЗП :" + maxName + ",а именно :" + maxSalary + ", работает в компании " + maxNameCompany);

    }

    public static void launch() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Чтобы увидеть,какие сотрудники в каких компаниях работают,нажмите 1");
        System.out.println("2. Чтобы вывести сотрудников с максимальной ЗП в каждой компании,нажмите 2");
        System.out.println("3. Чтобы вывести сотрудника с максимальной ЗП относительно всех сотрудников(всех компаний),нажмите 3");
        System.out.println("4. Чтобы вывести отсортированых сотрудников первой фирмы в порядке возростания ЗП,нажмите 4");
        System.out.println("5. Чтобы вывести отсортированых сотрудников второй фирмы в порядке возростания возраста,нажмите 5");
        System.out.println("6. Чтобы вывести сотрудника с самой длинной фамилией(третья компания),нажмите 6");
        System.out.println("7. Чтобы вывести отсортированых в порядке увеличения длины фамилии сотрудников третьей компании,нажмите 7");
        System.out.println("8. Чтобы вывести количество сотрудниц,работающих во всех компаниях,нажмите 8");
        System.out.println("9  Чтобы уволить сотрудниц,работающих во всех компаниях,и вывести обновленный список сотрудников,нажмите 9");
        System.out.println("10 Чтобы вывести список сотрудников с повышением ЗП на 15%,нажмите 10");
        System.out.println("11 Чтобы вывести сотрудника(мужчину) с максимальной ЗП,нажмите 11");
        System.out.println("12 Чтобы добавить нового сотрудника,нажмите 12");

        while (sc.hasNext()) {
            switch (sc.next()) {
                case "1":
                    showCompaniesAndEmployees();
                    break;

                case "2":
                    maxSalary();
                    break;
                case "3":
                    maxSalaryOfAllCompanies();
                    break;
                case "4":
                    sortSalaryFirstCompany();
                    break;
                case "5":
                    sortAgeSecondCompany();
                    break;
                case "6":

                    maxLengthSecondNameThirdCompany();
                    break;
                case "7":
                    sortSecondName();
                    break;

                case "8":
                    howMuchFemale();
                    break;

                case "9":
                    showOnlyMen();
                    break;
                case "10":
                    showFinalList();
                    break;
                case "11":
                    maxManSalary();
                    break;

                case "12":
                    create();
                    break;

                default:
                    System.out.println("No such case!");
                    break;
                case "Exit":
                    System.exit(0);

            }
        }


    }

    public static void sortSalaryFirstCompany() throws IOException {
        ArrayList<Company> companies = getCompanies();
        for (int i = 0; i < 1; i++) {
            for (int j = companies.get(i).getEmployees().size() - 1; j >= 0; j--) {
                for (int k = 0; k < j; k++) {
                    if (companies.get(i).getEmployees().get(k).getSalary() < companies.get(i).getEmployees().get(k + 1).getSalary()) {
                        Employee1 e = companies.get(i).getEmployees().get(k);
                        companies.get(i).getEmployees().set(k, companies.get(i).getEmployees().get(k + 1));
                        companies.get(i).getEmployees().set(k + 1, e);
                    }
                }
            }
            System.out.println("Сотрудники компании " + companies.get(i).getCompanyName() + " в порядке возростания ЗП:");
        }
        for (int i = 0; i < 1; i++) {
            for (int j = companies.get(i).getEmployees().size() - 1; j >= 0; j--) {
                System.out.println(companies.get(i).getEmployees().get(j).getName() + " " + companies.get(i).getEmployees().get(j).getSecondName() + " (" + companies.get(i).getEmployees().get(j).getSalary() + ")");
            }

        }

    }

    public static void sortAgeSecondCompany() throws IOException {
        ArrayList<Company> companies = getCompanies();
        for (int i = 1; i < 2; i++) {
            for (int j = companies.get(i).getEmployees().size() - 1; j >= 0; j--) {
                for (int k = 0; k < j; k++) {
                    if (companies.get(i).getEmployees().get(k).getAge() < companies.get(i).getEmployees().get(k + 1).getAge()) {
                        Employee1 e = companies.get(i).getEmployees().get(k);
                        companies.get(i).getEmployees().set(k, companies.get(i).getEmployees().get(k + 1));
                        companies.get(i).getEmployees().set(k + 1, e);
                    }
                }
            }
            System.out.println("Сотрудники компании " + companies.get(i).getCompanyName() + " в порядке возростания возроста:");
        }
        for (int i = 1; i < 2; i++) {
            for (int j = companies.get(i).getEmployees().size() - 1; j >= 0; j--) {
                System.out.println(companies.get(i).getEmployees().get(j).getName() + " " + companies.get(i).getEmployees().get(j).getSecondName() + " (" + companies.get(i).getEmployees().get(j).getAge() + ")");
            }


        }

    }

    public static void maxLengthSecondNameThirdCompany() throws IOException {
        ArrayList<Company> companies = getCompanies();
        String maxLengthSecondName = "";
        int maxLength = 0;
        for (int i = 2; i < 3; i++) {
            for (int j = 0; j < companies.get(i).getEmployees().size(); j++) {
                if (companies.get(i).getEmployees().get(j).getSecondName().length() > maxLength) {
                    maxLengthSecondName = companies.get(i).getEmployees().get(j).getSecondName();
                    maxLength = companies.get(i).getEmployees().get(j).getSecondName().length();
                }

            }
        }
        System.out.println("Сотрудник с фамилией :" + maxLengthSecondName);
        System.out.println("Длина фамилии :" + maxLength);


    }

    public static void sortSecondName() throws IOException {
        ArrayList<Company> companies = getCompanies();
        for (int i = 2; i < 3; i++) {
            for (int j = companies.get(i).getEmployees().size() - 1; j >= 0; j--) {
                for (int k = 0; k < j; k++) {
                    if (companies.get(i).getEmployees().get(k).getSecondName().length() < companies.get(i).getEmployees().get(k + 1).getSecondName().length()) {
                        Employee1 e = companies.get(i).getEmployees().get(k);
                        companies.get(i).getEmployees().set(k, companies.get(i).getEmployees().get(k + 1));
                        companies.get(i).getEmployees().set(k + 1, e);


                    }

                }
            }
            System.out.println("Сортировка сотрудников третьей компании в порядке увеличения длины фамилии: ");


        }
        for (int i = 2; i < 3; i++) {
            for (int j = companies.get(i).getEmployees().size() - 1; j >= 0; j--) {
                System.out.println(companies.get(i).getEmployees().get(j).getName() + " " + companies.get(i).getEmployees().get(j).getSecondName() + "  " + companies.get(i).getEmployees().get(j).getSecondName().length());
            }
        }

    }


    public static void showNewEmployee() throws IOException {
        ArrayList<Company> companies = getCompanies();
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < companies.get(i).getEmployees().size(); j++) {
                System.out.println(companies.get(i).getEmployees().get(j).getName() + " " + companies.get(i).getEmployees().get(j).getSecondName());
            }

        }


    }

    public static void howMuchFemale() throws IOException {
        ArrayList<Company> companies = getCompanies();
        int count = 0;
        for (int i = 0; i < companies.size(); i++) {
            for (int j = 0; j < companies.get(i).getEmployees().size(); j++) {
                if (companies.get(i).getEmployees().get(j).getSex().contains("f")) {
                    count++;
                    System.out.println(companies.get(i).getEmployees().get(j).getName() + "  " + companies.get(i).getEmployees().get(j).getSecondName() + " : " + companies.get(i).getCompanyName());
                }

            }
        }
        System.out.println("Всего сотрудниц: " + count);

    }


    public static ArrayList<Company> getCompanyWithoutWomen() throws IOException {

        ArrayList<Company> companies = getCompanies();
        ArrayList<Company> companyWithoutWoman = getCompanies();
        for (int i = 0; i < companyWithoutWoman.size(); i++) {
            for (int j = 0; j < companyWithoutWoman.get(i).getEmployees().size(); j++) {
                if (companyWithoutWoman.get(i).getEmployees().get(j).getSex().contains("f")) {
                    companyWithoutWoman.get(i).getEmployees().remove(j);
                }
            }
        }

        return companyWithoutWoman;

    }

    public static void showOnlyMen() throws IOException {
        ArrayList<Company> men = getCompanyWithoutWomen();
        System.out.println("Сотрудники(мужчины),с зарплатами по умолчанию:");
        for (int i = 0; i < men.size(); i++) {
            for (int j = 0; j < men.get(i).getEmployees().size(); j++)
                System.out.println(men.get(i).getCompanyName() + "/" + men.get(i).getEmployees().get(j).getName() + " " + men.get(i).getEmployees().get(j).getSecondName() + "/" + men.get(i).getEmployees().get(j).getAge() + "/" + men.get(i).getEmployees().get(j).getSalary());
        }
    }

    public static void maxManSalary() throws IOException {
        ArrayList<Company> maxManSalary = getFinalList();
        double maxSalary = 0;
        String maxManName = "";
        String maxManSecondName = "";
        String maxManCompany = "";
        int maxManAge = 0;

        for (int i = 0; i < maxManSalary.size(); i++) {
            for (int j = 0; j < maxManSalary.get(i).getEmployees().size(); j++) {
                for (int k = 0; k < maxManSalary.get(i).getEmployees().get(j).getSalary(); k++) {
                    if (maxManSalary.get(i).getEmployees().get(j).getSalary() > maxSalary) {
                        maxSalary = maxManSalary.get(i).getEmployees().get(j).getSalary();
                        maxManName = maxManSalary.get(i).getEmployees().get(j).getName();
                        maxManSecondName = maxManSalary.get(i).getEmployees().get(j).getSecondName();
                        maxManAge = maxManSalary.get(i).getEmployees().get(j).getAge();
                        maxManCompany = maxManSalary.get(i).getCompanyName();

                    }

                }
            }
        }
        System.out.println("Компания: " + maxManCompany + " : " + maxManName + " " + maxManSecondName + "/" + maxManAge + "/" + maxSalary);

    }

    public static ArrayList<Company> getFinalList() throws IOException {   //Возвращает список сотрудников,с увеличением ЗП на 15%
        ArrayList<Company> newList = getCompanyWithoutWomen();
        double persent = 1.15;
        for (int i = 0; i < newList.size(); i++) {
            for (int j = 0; j < newList.get(i).getEmployees().size(); j++) {
                newList.get(i).getEmployees().get(j).setSalary(newList.get(i).getEmployees().get(j).getSalary() * persent);

            }
        }
        return newList;

    }

    public static void showFinalList() throws IOException {
        ArrayList<Company> men = getFinalList();
        System.out.println("Сотрудники(мужчины),с новыми зарплатами :");
        for (int i = 0; i < men.size(); i++) {
            for (int j = 0; j < men.get(i).getEmployees().size(); j++)
                System.out.println(men.get(i).getCompanyName() + "/" + men.get(i).getEmployees().get(j).getName() + " " + men.get(i).getEmployees().get(j).getSecondName() + "/" + men.get(i).getEmployees().get(j).getAge() + "/" + men.get(i).getEmployees().get(j).getSalary());
        }
    }


    public static void create() throws IOException {

        System.out.println("Для добавления сотрудника в 'FirstCompany',нажмите 1");
        System.out.println("Для добавления сотрудника в 'SecondCompany',нажмите 2");
        System.out.println("Для добавления сотрудника в 'ThirdCompany',нажмите 3");
        System.out.println("Для выхода в основное меню,нажмите 4");
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            switch (sc.next()) {
                case "1":
                    createEmployeeFirstCompany();
                    break;
                case "2":
                    createEmployeeSecondCompany();
                    break;
                case "3":
                    createEmployeeThirdCompany();
                    break;

                case "4":
                    launch();

                    break;

                default:
                    System.out.println("No such case!");


            }
        }


    }


    public static void createEmployeeFirstCompany() throws IOException {

        ArrayList<Employee1> employee1s = EmployeeUtil.getEmployees();
        Employee1 employee1 = new Employee1();
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Введите Имя сотрудника: ");
            employee1.setName(sc.next());
            System.out.println("Введите Фамилию сотрудника: ");
            employee1.setSecondName(sc.next());
            System.out.println("Введите Пол сотрудника: ");
            employee1.setSex(sc.next());
            System.out.println("Введите возраст сотрудника: ");
            employee1.setAge(sc.nextInt());
            System.out.println("Введите предпологаемую ЗП сотрудника: ");
            employee1.setSalary(sc.nextInt());
            employee1s.add(employee1);
            FileWriter writer = new FileWriter("vorobey/src/FirstCompany.txt", true);
            writer.write(employee1.getName() + ":" + employee1.getSecondName() + ":" + employee1.getSex() + ":" + employee1.getAge() + ":" + employee1.getSalary() + "\n");
            writer.flush();
            writer.close();


        } catch (Exception e) {
        }
        System.out.println("Для продолжения добавления сотрудников,нажмите 1");
        System.out.println("Для просмотра списка сотрудников,нажмите 2");
        System.out.println("Для выхода в основное меню,нажмите 3");
        while (sc.hasNext()) {
            switch (sc.next()) {
                case "1":
                    createEmployeeFirstCompany();
                    break;
                case "2":
                    showFirstCompany();
                    break;
                case "3":
                    launch();
                    break;

                default:
                    System.out.println("No such case");


            }
        }

    }

    public static ArrayList<Employee1> showFirstCompany() throws IOException {

        File file = new File("vorobey/src/FirstCompany.txt");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        ArrayList<Employee1> employee1s = new ArrayList<>();
        String line;

        while ((line = bufferedReader.readLine()) != null) {
            String[] pool = line.split(":");
            Employee1 e1 = new Employee1();
            e1.setName(pool[0]);
            e1.setSecondName(pool[1]);
            e1.setSex(pool[2]);
            e1.setAge(Integer.valueOf(pool[3]));
            e1.setSalary(Double.valueOf(pool[4]));
            employee1s.add(e1);
            System.out.print("Сотрудник: " + e1.getName() + " " + e1.getSecondName() + ",пол: " + e1.getSex() + ",возраст: " + e1.getAge() + ",зарплата: " + e1.getSalary() + "\n");
        }
        return employee1s;
    }

    public static ArrayList<Employee1> showSecondCompany() throws IOException {
        File file = new File("vorobey/src/SecondCompany.txt");
        FileReader reader = new FileReader(file);
        BufferedReader buffer = new BufferedReader(reader);
        ArrayList<Employee1> employees1 = new ArrayList<>();
        String line;
        while ((line = buffer.readLine()) != null) {
            String[] pool = line.split(":");
            Employee1 e1 = new Employee1();
            e1.setName(pool[0]);
            e1.setSecondName(pool[1]);
            e1.setSex(pool[2]);
            e1.setAge(Integer.valueOf(pool[3]));
            e1.setSalary(Double.valueOf(pool[4]));
            employees1.add(e1);
            System.out.print("Сотрудник: " + e1.getName() + " " + e1.getSecondName() + ",пол: " + e1.getSex() + ",возраст: " + e1.getAge() + ",зарплата: " + e1.getSalary() + "\n");
        }
        return employees1;
    }


    public static ArrayList<Employee1> showThirdCompany() throws IOException {
        File file = new File("vorobey/src/ThirdCompany.txt");
        FileReader reader = new FileReader(file);
        BufferedReader buffer = new BufferedReader(reader);
        ArrayList<Employee1> employees1 = new ArrayList<>();
        String line;
        while ((line = buffer.readLine()) != null) {
            String[] pool = line.split(":");
            Employee1 e1 = new Employee1();
            e1.setName(pool[0]);
            e1.setSecondName(pool[1]);
            e1.setSex(pool[2]);
            e1.setAge(Integer.valueOf(pool[3]));
            e1.setSalary(Double.valueOf(pool[4]));
            employees1.add(e1);
            System.out.print("Сотрудник: " + e1.getName() + " " + e1.getSecondName() + ",пол: " + e1.getSex() + ",возраст: " + e1.getAge() + ",зарплата: " + e1.getSalary() + "\n");
        }
        return employees1;
    }

    public static void createEmployeeSecondCompany() throws IOException {

        ArrayList<Employee1> employee1s = EmployeeUtil.getEmployees();
        Employee1 employee1 = new Employee1();
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Введите Имя сотрудника: ");
            employee1.setName(sc.next());
            System.out.println("Введите Фамилию сотрудника: ");
            employee1.setSecondName(sc.next());
            System.out.println("Введите Пол сотрудника: ");
            employee1.setSex(sc.next());
            System.out.println("Введите возраст сотрудника: ");
            employee1.setAge(sc.nextInt());
            System.out.println("Введите предпологаемую ЗП сотрудника: ");
            employee1.setSalary(sc.nextInt());
            employee1s.add(employee1);
            FileWriter writer = new FileWriter("vorobey/src/SecondCompany.txt", true);
            writer.write(employee1.getName() + ":" + employee1.getSecondName() + ":" + employee1.getSex() + ":" + employee1.getAge() + ":" + employee1.getSalary() + "\n");
            writer.flush();
            writer.close();


        } catch (Exception e) {
        }
        System.out.println("Для продолжения добавления сотрудников,нажмите 1");
        System.out.println("Для просмотра списка сотрудников,нажмите 2");
        System.out.println("Для выхода в основное меню,нажмите 3");
        while (sc.hasNext()) {
            switch (sc.next()) {
                case "1":
                    createEmployeeSecondCompany();
                    break;

                case "2":
                    showSecondCompany();

                    break;

                case "3":
                    launch();

                    break;

                default:
                    System.out.println("No such case");


            }
        }

    }

    public static void createEmployeeThirdCompany() throws IOException {

        ArrayList<Employee1> employee1s = EmployeeUtil.getEmployees();
        Employee1 employee1 = new Employee1();
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Введите Имя сотрудника: ");
            employee1.setName(sc.next());
            System.out.println("Введите Фамилию сотрудника: ");
            employee1.setSecondName(sc.next());
            System.out.println("Введите Пол сотрудника: ");
            employee1.setSex(sc.next());
            System.out.println("Введите возраст сотрудника: ");
            employee1.setAge(sc.nextInt());
            System.out.println("Введите предпологаемую ЗП сотрудника: ");
            employee1.setSalary(sc.nextInt());
            employee1s.add(employee1);
            FileWriter writer = new FileWriter("vorobey/src/ThirdCompany.txt", true);
            writer.write(employee1.getName() + ":" + employee1.getSecondName() + ":" + employee1.getSex() + ":" + employee1.getAge() + ":" + employee1.getSalary() + "\n");
            writer.flush();
            writer.close();


        } catch (Exception e) {
        }
        System.out.println("Для продолжения добавления cотрудников,нажмите 1");
        System.out.println("Для просмотра списка сотрудников,нажмите 2");
        System.out.println("Для выхода в основное меню,нажмите 3");
        while (sc.hasNext()) {
            switch (sc.next()) {
                case "1":
                    createEmployeeThirdCompany();
                    break;

                case "2":
                    showThirdCompany();

                    break;

                case "3":
                    launch();

                    break;

                default:
                    System.out.println("No such case");


            }
        }

    }

    public static void allSHow() throws IOException {
        System.out.println("Количество сотрудников компании FirstCompany: " + showFirstCompany().size());
        System.out.println();
        System.out.println("Количество сотрудников компании SecondCompany: " + showSecondCompany().size());
        System.out.println();
        System.out.println("Количество сотрудников компании ThirdCompany: " + showThirdCompany().size());
        System.out.println();
    }


}





