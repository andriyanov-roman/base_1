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

    public static ArrayList<Company> getCompanies() {
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

    public static void showCompaniesAndEmployees() {
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

    public static void maxSalary() {
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

    public static void maxSalaryOfAllCompanies() {
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

    public static void launch() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Чтобы увидеть,какие сотрудники в каких компаниях работают,нажмите 1");
        System.out.println("2. Чтобы вывести сотрудников с максимальной ЗП в каждой компании,нажмите 2");
        System.out.println("3. Чтобы вывести сотрудника с максимальной ЗП относительно всех сотрудников(всех компаний),нажмите 3");
        System.out.println("4. Чтобы вывести отсортированых сотрудников первой фирмы в порядке возростания ЗП,нажмите 4");
        System.out.println("5. Чтобы вывести отсортированых сотрудников второй фирмы в порядке возростания возраста,нажмите 5");
        System.out.println("6. Чтобы вывести сотрудника с самой длинной фамилией(третья компания),нажмите 6");
        System.out.println("7. Чтобы вывести отсортированых в порядке увеличения длины фамилии сотрудников третьей компании,нажмите 7");
        System.out.println("8. Чтобы вывести количество сотрудниц,работающих во всех компаниях,нажмите 8");
        System.out.println("9 Чтобы уволить сотрудниц,работающих во всех компаниях,и вывести обновленный список сотрудников,нажмите 9");
        System.out.println("10 Чтобы вывести список сотрудников с повышением ЗП на 15%,нажмите 10");
        System.out.println("11 Чтобы вывести сотрудника(мужчину) с максимальной ЗП,нажмите 11");

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

                default:
                    System.out.println("No such case!");
                    break;
                case "Exit":
                    System.exit(0);

            }
        }


    }

    public static void sortSalaryFirstCompany() {
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

    public static void sortAgeSecondCompany() {
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

    public static void maxLengthSecondNameThirdCompany() {
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

    public static void sortSecondName() {
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


    public static void showNewEmployee() {
        ArrayList<Company> companies = getCompanies();
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < companies.get(i).getEmployees().size(); j++) {
                System.out.println(companies.get(i).getEmployees().get(j).getName() + " " + companies.get(i).getEmployees().get(j).getSecondName());
            }

        }


    }

    public static void howMuchFemale() {
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


    public static ArrayList<Company> getCompanyWithoutWomen() {

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

    public static void showOnlyMen() {
        ArrayList<Company> men = getCompanyWithoutWomen();
        System.out.println("Сотрудники(мужчины),с зарплатами по умолчанию:");
        for (int i = 0; i < men.size(); i++) {
            for (int j = 0; j < men.get(i).getEmployees().size(); j++)
                System.out.println(men.get(i).getCompanyName() + "/" + men.get(i).getEmployees().get(j).getName() + " " + men.get(i).getEmployees().get(j).getSecondName() + "/" + men.get(i).getEmployees().get(j).getAge() + "/" + men.get(i).getEmployees().get(j).getSalary());
        }
    }

    public static void maxManSalary() {
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

    public static ArrayList<Company> getFinalList() {   //Возвращает список сотрудников,с увеличением ЗП на 15%
        ArrayList<Company> newList = getCompanyWithoutWomen();
        double persent = 1.15;
        for (int i = 0; i < newList.size(); i++) {
            for (int j = 0; j < newList.get(i).getEmployees().size(); j++) {
                newList.get(i).getEmployees().get(j).setSalary(newList.get(i).getEmployees().get(j).getSalary() * persent);

            }
        }
        return newList;

    }

    public static void showFinalList() {
        ArrayList<Company> men = getFinalList();
        System.out.println("Сотрудники(мужчины),с новыми зарплатами :");
        for (int i = 0; i < men.size(); i++) {
            for (int j = 0; j < men.get(i).getEmployees().size(); j++)
                System.out.println(men.get(i).getCompanyName() + "/" + men.get(i).getEmployees().get(j).getName() + " " + men.get(i).getEmployees().get(j).getSecondName() + "/" + men.get(i).getEmployees().get(j).getAge() + "/" + men.get(i).getEmployees().get(j).getSalary());
        }
    }

    public static ArrayList<Employee1> getListWithNewEmployee() {
        Scanner sc = new Scanner(System.in);
        Employee1 e = new Employee1();
        ArrayList<Company> comNew = getCompanyWithoutWomen();
        ArrayList<Employee1> employee1 = EmployeeUtil.getEmployees();
        System.out.printf("Введите Имя нового сотрудника:");
        e.setName(sc.next());
        System.out.println("Введите Фамилию нового сотрудника:");
        e.setSecondName(sc.next());
        System.out.println("Введите предпологаемую ЗП:");
        e.setSalary(sc.nextInt());
        System.out.println("Введите возраст нового сотрудника:");
        e.setAge(sc.nextInt());
        System.out.println("Введите Пол нового сотрудника:");
        e.setSex(sc.next());
        employee1.add(e);


        return employee1;

    }

    public static void showNewEmpl() {
        ArrayList<Employee1> empl = getListWithNewEmployee();
        for (int i = 0; i < empl.size(); i++) {
            System.out.println(empl.get(i));


        }
    }

    public static void createEmployee() throws IOException {
        Scanner sc = new Scanner(System.in);
        ArrayList<Company> companies = getCompanies();
        ArrayList<Employee1> employee1s = EmployeeUtil.getEmployees();
        Employee1 employee1 = new Employee1();
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
            writer.write(employee1.getName() + "/" + employee1.getSecondName() + "/" + employee1.getSex() + "/" + employee1.getAge() + "/" + employee1.getSalary() + "\n");
            writer.flush();
            writer.close();


        } catch (Exception e) {
        }
        System.out.println("Для продолжения добавления сторудников,нажмите");
        System.out.println("Для просмотра списка сотрудников,нажмите");
        System.out.println("Для выхода,нажмите");
        while (sc.hasNext()) {
            switch (sc.next()) {
                case "1":

                    break;

                case "2":

                    break;

                case "3":

                    break;

                default:
                    System.out.println("No such case");


            }
        }

    }

    public static ArrayList<Employee1> show() throws IOException {
        ArrayList<Employee1> employee1s = new ArrayList<>();
        File file = new File("vorobey/src/FirstCompany.txt");
        FileReader reader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(reader);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            String[] pool = line.split("/");
            Employee1 e = new Employee1();
            e.setName(pool[0]);
            e.setSecondName(pool[1]);
            e.setSex(pool[2]);
            e.setAge(Integer.valueOf(pool[3]));
            e.setSalary(Double.valueOf(pool[4]));
            employee1s.add(e);
            System.out.println(e + "  " + "\n");
        }


        return employee1s;
    }


}


