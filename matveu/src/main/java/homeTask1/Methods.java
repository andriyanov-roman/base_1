package homeTask1;

import java.util.ArrayList;
import java.util.Scanner;


public class Methods {

    public static void start() {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter command key!");
        System.out.println("1. Пользователи у которых логин совпадает с иминем или фамилией");
        System.out.println("2. Найти юзеров с одинаковым иминем и фамилией");
        System.out.println("3. Сортировка юзеров по id по убыванию");
        System.out.println("4. Информация о сотрудниках");
        System.out.println("5. Сотрудник с наибольшей зарплатой");
        System.out.println("6. Сотрудники с одинаковыми именами и фамилией");
        System.out.println("7. Сортировка сотрудников по зп в порядке убывания");
        System.out.println("8. Узнать названия компаний");
        System.out.println("9. Узнать имена сотрудников, которые работают в каждой компании");
        System.out.println("10. Узнать сотрудника с наибольшей зп в каждой компании");
        System.out.println("11. Сортировка сотрудников в первой компании(Luxsoft) по зп,в порядке возрастания");
        System.out.println("12. Сортировка сотрудников во второй компании(Microsoft) по возрасту,в порядке возрастания");
        System.out.println("13. Сортировка сотрудников в третей компании(Sony) по длине фамилии,в порядке возрастания");
        System.out.println("14. Добавить нового сотрудника");
        System.out.println("15. Уволить всех женщин и мужчинам поднять зп");
        System.out.println("16. Уволить всех мужчин и женщинам поднять зп");



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
                    sortCompany1Salary();
                    break;
                case "12":
                    sortCompany2Age();
                    break;
                case "13":
                    sortCompany3LengthSecondName();
                    break;
                case "14":
                    greatNewEmployees();
                    break;
                case "15":
                    salaryPlusMenAndKillWomen();
                    break;
                case "16":
                    salaryPlusWomenAndKillMen();
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

    public static void infoEmployees() {
        ArrayList<Employee> employees = EmployeesUtil.getEmployees();
        for (int i = 0; i < employees.size(); i++) {
            System.out.print(employees.get(i).getName() + " " + employees.get(i).getSecondName() + " " + employees.get(i).getSalary());
            System.out.println();
        }
    }

    public static void maxSalary() {
        ArrayList<Employee> employees = EmployeesUtil.getEmployees();
        double maxSalary = 0;
        int i;
        int max = 0;
        for (i = 0; i < employees.size(); i++) {
            if (employees.get(i).getSalary() > maxSalary) {
                maxSalary = employees.get(i).getSalary();
                max = i;
            }
        }
        System.out.println("Сотрудник с наибольшей зарплатой: " + employees.get(max).getName() + " " + employees.get(max).getSecondName() + " " + employees.get(max).getSalary());

    }

    public static void tesku() {
        ArrayList<Employee> employees = EmployeesUtil.getEmployees();
        String sameName = " ";
        String sameSecondName = " ";
        for (int i = 0; i < employees.size(); i++) {
            for (int j = i + 1; j < employees.size(); j++) {
                if (employees.get(i).getName() == employees.get(j).getName() && employees.get(i).getSecondName() == employees.get(j).getSecondName()) {
                    sameName = employees.get(i).getName();
                    sameSecondName = employees.get(i).getSecondName();
                }
            }
        }
        System.out.println("Сотрудники с одинаковыми именами и фамилией: " + sameName + " " + sameSecondName);
    }

    public static void sortSalary() {
        ArrayList<Employee> employees = EmployeesUtil.getEmployees();
        for (int i = employees.size() - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (employees.get(j).getSalary() < employees.get(j+1).getSalary()) {
                    Employee k = employees.get(j);
                   // employees.get(j) = employees.get(j+1);
                    //employees.get(j+1) = k;
                }
            }
        }
        for (int i = 0; i < employees.size(); i++) {
            System.out.print(employees.get(i).getName() + " " + employees.get(i).getSecondName() + "/" + employees.get(i).getSalary() + "/");
            System.out.println();

        }
    }

    public static void companyName() {
        ArrayList<Company> companies = CompanyUtil.getCompanies();
        for (int i = 0; i < companies.size(); i++) {
            System.out.println(companies.get(i).getCompanyName() + " ");
        }
    }

    public static void infoCompany() {
        ArrayList<Company> companies = CompanyUtil.getCompanies();
        for (int i = 0; i < companies.size(); i++) {
            System.out.println();
            System.out.print(companies.get(i).getCompanyName() + ": ");
            for (int j = 0; j < companies.get(i).getEmployees().size(); j++) {
                System.out.print(companies.get(i).getEmployees().get(j).getName() + " " +
                        companies.get(i).getEmployees().get(j).getSecondName() + "; ");

            }
        }
    }

    public static void сompanyMaxSalary() {
        ArrayList<Company> companies = CompanyUtil.getCompanies();
        for (int i = 0; i < companies.size(); i++) {
            Employee temp = companies.get(i).getEmployees().get(0);
            for (int j = 0; j < companies.get(i).getEmployees().size(); j++) {
                if (companies.get(i).getEmployees().get(j).getSalary() > temp.getSalary()) {
                    temp = companies.get(i).getEmployees().get(j);
                }
            }
            System.out.println(companies.get(i).getCompanyName() + ": " +temp.getName()  + ", с зарплатой: " +temp.getSalary() );
        }
    }

    public static void sortCompany1Salary() {
        ArrayList<Company> companies = CompanyUtil.getCompanies();
                    for (int i = 0; i < 1; i++) {
                        for (int j = companies.get(i).getEmployees().size() - 1; j >= 0; j--) {
                            for (int k = 0; k < j; k++) {
                    if (companies.get(i).getEmployees().get(k).getSalary() < companies.get(i).getEmployees().get(k+1).getSalary()) {
                        Employee www = companies.get(i).getEmployees().get(k);
                      //  companies.get(i).getEmployees().get(k) = companies.get(i).getEmployees().get(k+1);
                        //companies.get(i).getEmployees().get(k+1) = www;
                    }
                }
                System.out.print(companies.get(i).getEmployees().get(j).getName() + " " + companies.get(i).getEmployees().get(j).getSecondName() + ": " + companies.get(i).getEmployees().get(j).getSalary() + " ");
                System.out.println();
            }
        }

    }

    public static void sortCompany2Age() {
        ArrayList<Company> companies = CompanyUtil.getCompanies();
        for (int i = 1; i < 2; i++) {
            for (int j = companies.get(i).getEmployees().size() - 1; j >= 0; j--) {
                for (int k = 0; k < j; k++) {
                    if (companies.get(i).getEmployees().get(k).getAge() < companies.get(i).getEmployees().get(k+1).getAge()) {
                        Employee www = companies.get(i).getEmployees().get(k);
                      //  companies.get(i).getEmployees().get(k) = companies.get(i).getEmployees().get(k+1);
                        //companies.get(i).getEmployees().get(k+1) = www;
                    }
                }
                System.out.print(companies.get(i).getEmployees().get(j).getName() + " " + companies.get(i).getEmployees().get(j).getSecondName() +
                        ":Age: " + companies.get(i).getEmployees().get(j).getAge());
                System.out.println();
            }
        }
    }

    public static void sortCompany3LengthSecondName() {
        ArrayList<Company> companies = CompanyUtil.getCompanies();
        for (int i = 2; i < 3; i++) {
            for (int j = companies.get(i).getEmployees().size() - 1; j >= 0; j--) {
                for (int k = 0; k < j; k++) {
                    if (companies.get(i).getEmployees().get(k).getSecondName().length() < companies.get(i).getEmployees().get(k+1).getSecondName().length()) {
                        Employee www = companies.get(i).getEmployees().get(k);
                      //  companies.get(i).getEmployees().get(k) = companies.get(i).getEmployees().get(k+1);
                        //companies.get(i).getEmployees().get(k+1) = www;
                    }
                }
                System.out.print(companies.get(i).getEmployees().get(j).getName() + " " + companies.get(i).getEmployees().get(j).getSecondName() + ".");
                System.out.print(" Количество букв в фамилии: " + companies.get(i).getEmployees().get(i).getSecondName().length());
                System.out.println();
            }
        }
    }

    public static void greatNewEmployees() {
        Scanner scannerNew = new Scanner(System.in);
        System.out.println("Выберите компанию,в которую желаете добавить сотрудника:");
        System.out.println("1: Luxsoft");
        System.out.println("2: Microsoft");
        System.out.println("3: Sony");

        while (scannerNew.hasNext()) {
            switch (scannerNew.next()) {
                case "1":
                    greatEmployeeLuxsoft();
                    break;
                case "2":

                    break;
                case "3":

                    break;
            }
        }
    }

    public static void greatEmployeeLuxsoft() {
        ArrayList<Company> companies = new ArrayList<>();
        ArrayList<Employee> employees = EmployeesUtil.getEmployees();
        Employee employee=new Employee();
        Company c1=new Company();

        for (int i = 0; i < 1; i++) {
            for(int j=0;j<employees.size();j++) {
                Scanner scannerLux = new Scanner(System.in);
                System.out.println("Введите имя сотрудника!");
                employee.setName(scannerLux.nextLine());
                System.out.println("Введите фамилию сотрудника!");
                employee.setSecondName(scannerLux.nextLine());
                System.out.println("Введите пол сотрудника!");
                employee.setSex(scannerLux.nextLine());
                System.out.println("Введите возраст сотрудника!");
                employee.setAge(scannerLux.nextInt());
                System.out.println("Введите зарплату сотрудника!");
                employee.setSalary(scannerLux.nextInt());
                employees.add(employee);
                c1.setEmployees(new ArrayList<>());
                c1.getEmployees().add(employees.get(8));

                Scanner scannerNew = new Scanner(System.in);
            System.out.println("Выберите действие:");
            System.out.println("1: Добавить следующего сотрудника");
            System.out.println("2: Вывести информацию по данному сотруднику");
            while (scannerNew.hasNext()) {
                switch (scannerNew.next()) {
                    case "1":
                        greatEmployeeLuxsoft();
                        break;
                    case "2":
                       //  System.out.print(employee.getName()+" "+employee.getSecondName());
                       showGreatedEmployee();
                        break;

                }

                }
            }
        }
    }

    public static void showGreatedEmployee() {

        ArrayList<Employee> employees = EmployeesUtil.getEmployees();
        ArrayList<Company> companies = CompanyUtil.getCompanies();
        for (int k = 0; k < 1; k++) {
            System.out.print(companies.get(k).getCompanyName() + ": ");
            for (int i = 0; i < companies.get(k).getEmployees().size(); i++) {
                System.out.print(companies.get(k).getEmployees().get(i).getName() + " " + companies.get(k).getEmployees().get(i).getSecondName() + ": " +
                        companies.get(k).getEmployees().get(i).getSex() + ", " + companies.get(k).getEmployees().get(i).getAge() + ", " +
                        companies.get(k).getEmployees().get(i).getSalary());
                System.out.println();
            }

        }
    }
    public static void salaryPlusMenAndKillWomen() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите сумму, на которую хотите повысить зп мужчинам");
             double plus = scanner.nextDouble();
        ArrayList<Company> companies = CompanyUtil.getCompanies();
        for (int i = 0; i < companies.size(); i++) {
            for (int j = companies.get(i).getEmployees().size()-1; j >= 0; j--) {
                    if(companies.get(i).getEmployees().get(j).getSex()=="man"){
                        companies.get(i).getEmployees().get(j).setSalary(companies.get(i).getEmployees().get(j).getSalary()+plus);
                }
                if (companies.get(i).getEmployees().get(j).getSex() == "woman") {
                    companies.get(i).getEmployees().remove(j);
                }
            }
        }
        for (int i = 0; i < companies.size(); i++) {
            for (int j = companies.get(i).getEmployees().size()-1; j >= 0; j--) {
                System.out.print(companies.get(i).getCompanyName() + ": " + companies.get(i).getEmployees().get(j).getName() + " " +
                        companies.get(i).getEmployees().get(j).getSecondName() + " " + companies.get(i).getEmployees().get(j).getSalary());
                System.out.println();
            }
        }
    }
    public static void salaryPlusWomenAndKillMen() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите сумму, на которую хотите повысить зп женщинам");
        double plus = scanner.nextDouble();
        ArrayList<Company> companies = CompanyUtil.getCompanies();
        for (int i = 0; i < companies.size(); i++) {
            for (int j = companies.get(i).getEmployees().size()-1; j >= 0; j--) {
                if(companies.get(i).getEmployees().get(j).getSex()=="woman"){
                    companies.get(i).getEmployees().get(j).setSalary(companies.get(i).getEmployees().get(j).getSalary()+plus);
                }
                if (companies.get(i).getEmployees().get(j).getSex() == "man") {
                    companies.get(i).getEmployees().remove(j);
                }
            }
        }
        for (int i = 0; i < companies.size(); i++) {
            for (int j = companies.get(i).getEmployees().size()-1; j >= 0; j--) {
                System.out.print(companies.get(i).getCompanyName() + ": " + companies.get(i).getEmployees().get(j).getName() + " " +
                        companies.get(i).getEmployees().get(j).getSecondName() + " " + companies.get(i).getEmployees().get(j).getSalary());
                System.out.println();
            }
            }
    }
}


