package home_task2;


import home_task2.Employee1;
import home_task2.EmployeeUtil;


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
                System.out.print(companies.get(i).getEmployees().get(j).name + " " + companies.get(i).getEmployees().get(j).secondName + "(" + companies.get(i).getEmployees().get(j).salary + ")");
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
                for (int k = 0; k < companies.get(i).getEmployees().get(j).salary; k++) {
                    if (companies.get(i).getEmployees().get(j).salary > maxSalary) {
                        maxSalary = companies.get(i).getEmployees().get(j).salary;
                        maxName = companies.get(i).getEmployees().get(j).name;
                        maxSecondName = companies.get(i).getEmployees().get(j).name;
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
                for (int k = 0; k < companies.get(i).getEmployees().get(j).salary; k++) {
                    if (companies.get(i).getEmployees().get(j).salary > maxSalary) {
                        maxSalary = companies.get(i).getEmployees().get(j).salary;
                        maxName = companies.get(i).getEmployees().get(j).name;
                        maxSecondName = companies.get(i).getEmployees().get(j).name;
                        maxNameCompany = companies.get(i).getCompanyName();

                    }
                }
            }


        }
        System.out.println("Из всех компаний,сотрудник с максимальной ЗП :" + maxName + ",а именно :" + maxSalary + ", работает в компании " + maxNameCompany);

    }

    public static void launch() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Чтобы увидеть,какие сотрудники в каких компаниях работают,нажмите 1");
        System.out.println("2.Чтобы вывести сотрудников с максимальной ЗП в каждой компании,нажмите 2");
        System.out.println("3.Чтобы вывести сотрудника с максимальной ЗП относительно всех сотрудников(всех компаний),нажмите 3");
        System.out.println("4.Чтобы вывести отсортированых сотрудников первой фирмы в порядке возростания ЗП,нажмите 4");
        System.out.println("5.Чтобы вывести отсортированых сотрудников второй фирмы в порядке возростания возраста,нажмите 5");
        System.out.println("6.Чтобы вывести сотрудника с самой длинной фамилией(третья компания),нажмите 6");
        System.out.println("7.Чтобы вывести отсортированых в порядке увеличения длины фамилии сотрудников третьей компании,нажмите 7");
        System.out.println("8.Чтобы вывести количество сотрудниц,работающих во всех компаниях,нажмите 8");
        System.out.println("9.Чтобы уволить сотрудниц,работающих во всех компаниях,и вывести обновленный список сотрудников,нажмите 9");
        System.out.println("10.Чтобы вывести список сотрудников с повышением ЗП на 15%,нажмите 10");

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
                    maxManSalary();
                    break;

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
                    if (companies.get(i).getEmployees().get(k).salary < companies.get(i).getEmployees().get(k + 1).salary) {
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
                System.out.println(companies.get(i).getEmployees().get(j).name + " " + companies.get(i).getEmployees().get(j).secondName + " (" + companies.get(i).getEmployees().get(j).salary + ")");
            }

        }

    }

    public static void sortAgeSecondCompany() {
        ArrayList<Company> companies = getCompanies();
        for (int i = 1; i < 2; i++) {
            for (int j = companies.get(i).getEmployees().size() - 1; j >= 0; j--) {
                for (int k = 0; k < j; k++) {
                    if (companies.get(i).getEmployees().get(k).age < companies.get(i).getEmployees().get(k + 1).age) {
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
                System.out.println(companies.get(i).getEmployees().get(j).name + " " + companies.get(i).getEmployees().get(j).secondName + " (" + companies.get(i).getEmployees().get(j).age + ")");
            }


        }

    }

    public static void maxLengthSecondNameThirdCompany() {
        ArrayList<Company> companies = getCompanies();
        String maxLengthSecondName = "";
        int maxLength = 0;
        for (int i = 2; i < 3; i++) {
            for (int j = 0; j < companies.get(i).getEmployees().size(); j++) {
                if (companies.get(i).getEmployees().get(j).secondName.length() > maxLength) {
                    maxLengthSecondName = companies.get(i).getEmployees().get(j).secondName;
                    maxLength = companies.get(i).getEmployees().get(j).secondName.length();
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
                    if (companies.get(i).getEmployees().get(k).secondName.length() < companies.get(i).getEmployees().get(k + 1).secondName.length()) {
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
                System.out.println(companies.get(i).getEmployees().get(j).name + " " + companies.get(i).getEmployees().get(j).secondName + "  " + companies.get(i).getEmployees().get(j).secondName.length());
            }
        }

    }


    public static void showNewEmployee() {
        ArrayList<Company> companies = getCompanies();
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < companies.get(i).getEmployees().size(); j++) {
                System.out.println(companies.get(i).getEmployees().get(j).name + " " + companies.get(i).getEmployees().get(j).secondName);
            }

        }


    }

    public static void howMuchFemale() {
        ArrayList<Company> companies = getCompanies();
        int count = 0;
        for (int i = 0; i < companies.size(); i++) {
            for (int j = 0; j < companies.get(i).getEmployees().size(); j++) {
                if (companies.get(i).getEmployees().get(j).sex.contains("f")) {
                    count++;
                    System.out.println(companies.get(i).getEmployees().get(j).name + "  " + companies.get(i).getEmployees().get(j).secondName + " : " + companies.get(i).getCompanyName());
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
                if (companyWithoutWoman.get(i).getEmployees().get(j).sex.contains("f")) {
                    companyWithoutWoman.get(i).getEmployees().remove(j);
                }
            }
        }

        return companyWithoutWoman;


    }

    public static void showOnlyMen() {
        ArrayList<Company> men = getCompanyWithoutWomen();
        System.out.println("Сотрудники(мужчины),с повышеными ЗП:");
        for (int i = 0; i < men.size(); i++) {
            for (int j = 0; j < men.get(i).getEmployees().size(); j++)
                System.out.println(men.get(i).getCompanyName() + "/" + men.get(i).getEmployees().get(j).name + " " + men.get(i).getEmployees().get(j).secondName + "/" + men.get(i).getEmployees().get(j).age + "/" + men.get(i).getEmployees().get(j).salary);
        }
    }

    public static void maxManSalary() {
        ArrayList<Company> maxManSalary = getCompanyWithoutWomen();
        double maxSalary = 0;
        String maxManName = "";
        String maxManSecondName = "";
        String maxManCompany = "";
        int maxManAge = 0;

        for (int i = 0; i < maxManSalary.size(); i++) {
            for (int j = 0; j < maxManSalary.get(i).getEmployees().size(); j++) {
                for (int k = 0; k < maxManSalary.get(i).getEmployees().get(j).salary; k++) {
                    if (maxManSalary.get(i).getEmployees().get(j).salary > maxSalary) {
                        maxSalary = maxManSalary.get(i).getEmployees().get(j).salary;
                        maxManName = maxManSalary.get(i).getEmployees().get(j).name;
                        maxManSecondName = maxManSalary.get(i).getEmployees().get(j).secondName;
                        maxManAge = maxManSalary.get(i).getEmployees().get(j).age;
                        maxManCompany = maxManSalary.get(i).getCompanyName();


                    }

                }
            }
        }
        System.out.println("Компания: " + maxManCompany + " : " + maxManName + " " + maxManSecondName + "/" + maxManAge + "/" + maxSalary);


    }

    public static ArrayList<Company> getNewListPersentPlus() {
        ArrayList<Company> men = getCompanyWithoutWomen();
        double persentPlus = 1.15;
        for (int i = 0; i < men.size(); i++) {
            for (int j = 0; j < men.get(i).getEmployees().size(); j++) {
                for (int k = 0; k < men.get(i).getEmployees().get(j).salary; k++) {
                    men.get(i).getEmployees().get(j).salary = men.get(i).getEmployees().get(j).salary * persentPlus;
                }
            }
        }


        return men;

    }


}


