package Task;
import java.util.Scanner;

/**
 * Created by user on 14.03.2015.
 */
public class CompanyUtil {

    public static Company[] getCompanies() {
        Employee[] employees = EmployeeUtil.getEmployees();
        Company c1 = new Company("Microsoft", new Employee[] {employees[0],employees[1],employees[2]} );
        Company c2 = new Company("Apple", new Employee[] {employees[3],employees[4],employees[5]} );
        Company c3 = new Company("IBM", new Employee[] {employees[6],employees[7],employees[8]} );
/*
        Company c1 = new Company();
        c1.name ="Microsoft";
        c1.employees = new Employee[] {employees[0],employees[1],employees[2]};

        Company c2 = new Company();
        c2.name = "Apple";
        c2.employees = new Employee[] {employees[3],employees[4],employees[5]};

        Company c3 = new Company();
        c3.name = "IBM";
        c3.employees = new Employee[] {employees[6],employees[7],employees[8]};
*/
        return new Company[] {c1,c2,c3};

    }
    public static void showAllEmployees(){
        Company[] companies = getCompanies();
        for (int i=0; i< companies.length;i++) {
            showCompanysEmployees(companies[i]);
        }

    }
    public static void showCompanysEmployees(Company company) {
        System.out.println(company.getCompanyName());
        for (int i=0;i<company.getEmployees().length; i++) {
            showEmployee(company.getEmployees()[i]);
        }
    }

    public static void showEmployee (Employee employee){
        System.out.println(
            employee.getName() + " " +
            employee.getSecondName() + " " +
            //employee.address + " " +
            employee.getSalary() + " " +
            employee.getSex() + " " +
            employee.getAge()
        );
    }
    public static void showEmployees(Employee[] employees) {
        for (int i=0;i<employees.length; i++) {
            showEmployee(employees[i]);
        }
    }

    public static void showBiggestSallaries() {
        Company[] companies = getCompanies();
        for (int i=0;i<companies.length;i++){
            System.out.println(companies[i].getCompanyName());
            double salary = 0;
            for (int j=0;j<companies[i].getEmployees().length;j++){
                if (salary < companies[i].getEmployees()[j].getSalary()) {
                    salary = companies[i].getEmployees()[j].getSalary();
                }
            }

            System.out.println(salary);

        }
    }

    public static Employee[] sortBySalary(Employee[] employees) {
        Employee temp = new Employee();
        for (int i=0; i< employees.length; i++){
                for (int j=i+1;j<employees.length; j++){
                if(employees[i].getSalary() > employees[j].getSalary()){
                    temp = employees[i];
                    employees[i] = employees[j];
                    employees[j] = temp;
                }
            }
        }
        return employees;
    }
    public static Employee[] sortByAge(Employee[] employees) {
        Employee temp = new Employee();
        for (int i=0; i< employees.length; i++){
            for (int j=i+1;j<employees.length; j++){
                if(employees[i].getAge() > employees[j].getAge()){
                    temp = employees[i];
                    employees[i] = employees[j];
                    employees[j] = temp;
                }
            }
        }
        return employees;
    }

    public static Employee[] sortByLastNameLength(Employee[] employees) {
        Employee temp = new Employee();
        for (int i=0; i< employees.length; i++){
            for (int j=i+1;j<employees.length; j++){

                if(employees[i].getSecondName().length()> employees[j].getSecondName().length()){
                    temp = employees[i];
                    employees[i] = employees[j];
                    employees[j] = temp;
                }
            }
        }
        return employees;
    }

    public static void showSubMenu(){
        System.out.println("1. Добавить еще одного сотрудника");
        System.out.println("2. Вывести введенного сотрудника");
        System.out.println("3. Выйти в главное меню");
    };
    public static void addEmployee(){
        boolean add = true;
        while (add) {
            Employee employee = new Employee();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите имя сотрудника");
            employee.setName(scanner.next());
            System.out.println("Введите Фамилию сотрудника");
            employee.setSecondName(scanner.next());
            System.out.println("Введите зарплату сотрудника");
            employee.setSalary(Double.parseDouble(scanner.next()));
            System.out.println("Введите пол сотрудника (f или m)");
            String sex = scanner.next();
            if (sex.equals("f")) employee.setSex("FEMININE");
            if (sex.equals("m")) employee.setSex("MASCULINE");
            System.out.println("Введите возраст сотрудника");
            employee.setAge(Integer.parseInt(scanner.next()));
            System.out.println("Сотрудник добавлен");

            showSubMenu();
            while (scanner.hasNext() && add){
                switch (scanner.next()) {
                    case "1":
                        addEmployee();
                        break;
                    case "2":
                        showEmployee(employee);
                        break;
                    case "3":
                        add = false;
                        break;

                }
                if(add)showSubMenu();
            }

        }
    }



    public static void showSearchName(String searchString) {
        Company[] companies = getCompanies();
        for (int i=0;i<companies.length;i++){
            double salary = 0;
            for (int j=0;j<companies[i].getEmployees().length;j++){
                if (companies[i].getEmployees()[j].getName().indexOf(searchString)!= -1 ||
                    companies[i].getEmployees()[j].getSecondName().indexOf(searchString)!= -1 ) {
                    System.out.println( companies[i].getCompanyName() + " "+
                                        companies[i].getEmployees()[j].getSecondName()+  " "+
                                        companies[i].getEmployees()[j].getName()
                    );
                }
            }



        }
    }

}
