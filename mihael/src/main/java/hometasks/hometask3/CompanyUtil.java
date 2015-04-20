package hometasks.hometask3;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by user on 14.03.2015.
 */
public class CompanyUtil {
    private static  ArrayList<Company> companies;
    static {
        companies = setupCompanies();
    }
    public static ArrayList<Company> getCompanies() {
        return companies;
    }
    public static ArrayList<Company> setupCompanies() {
        ArrayList<Employee> employees = EmployeeUtil.getEmployees();

        ArrayList<Employee> employeesC1 = new ArrayList<>();
        ArrayList<Employee> employeesC2 = new ArrayList<>();
        ArrayList<Employee> employeesC3 = new ArrayList<>();

        employeesC1.add(employees.get(0));
        employeesC1.add(employees.get(1));
        employeesC1.add(employees.get(2));

        employeesC2.add(employees.get(3));
        employeesC2.add(employees.get(4));
        employeesC2.add(employees.get(5));

        employeesC3.add(employees.get(6));
        employeesC3.add(employees.get(7));
        employeesC3.add(employees.get(8));

        Company c1 = new Company("Apple", new ArrayList<>() );
        Company c2 = new Company("Microsoft", new ArrayList<>() );
        Company c3 = new Company("IBM", new ArrayList<>() );

        c1.setEmployees(employeesC1);
        c2.setEmployees(employeesC2);
        c3.setEmployees(employeesC3);

        ArrayList<Company> companies = new ArrayList<>();
        companies.add(c1);
        companies.add(c2);
        companies.add(c3);

        return companies;

    }
    public static void showAllEmployees(){
        ArrayList<Company> companies = getCompanies();
        for (int i=0; i< companies.size();i++) {
            showCompanysEmployees(companies.get(i));
        }

    }
    public static void showCompanysEmployees(Company company) {
        System.out.println(company.getCompanyName());
        for (int i=0;i<company.getEmployees().size(); i++) {
            showEmployee(company.getEmployees().get(i));
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
    public static void showEmployees(ArrayList<Employee> employees) {
        for (int i=0;i<employees.size(); i++) {
            showEmployee(employees.get(i));
        }
    }

    public static void showBiggestSallaries() {
        ArrayList<Company> companies = getCompanies();
        for (int i=0;i<companies.size();i++){
            System.out.println(companies.get(i).getCompanyName());
            double salary = 0;
            for (int j=0;j<companies.get(i).getEmployees().size();j++){
                if (salary < companies.get(i).getEmployees().get(j).getSalary()) {
                    salary = companies.get(i).getEmployees().get(j).getSalary();
                }
            }

            System.out.println(salary);

        }
    }

    public static ArrayList<Employee> sortBySalary(ArrayList<Employee> employees) {
        Employee temp = new Employee();
        for (int i=0; i< employees.size(); i++){
                for (int j=i+1;j<employees.size(); j++){
                if(employees.get(i).getSalary() > employees.get(j).getSalary()){
                    temp = employees.get(i);
                    employees.set(i,employees.get(j));
                    employees.set(j, temp);
                }
            }
        }
        return employees;
    }
    public static ArrayList<Employee> sortByAge(ArrayList<Employee> employees) {
        Employee temp = new Employee();
        for (int i=0; i< employees.size(); i++){
            for (int j=i+1;j<employees.size(); j++){
                if(employees.get(i).getAge() > employees.get(j).getAge()){
                    temp = employees.get(i);
                    employees.set(i,employees.get(i));
                    employees.set(j,temp);
                }
            }
        }
        return employees;
    }

    public static ArrayList<Employee> sortByLastNameLength(ArrayList<Employee> employees) {
        Employee temp = new Employee();
        for (int i=0; i< employees.size(); i++){
            for (int j=i+1;j<employees.size(); j++){

                if(employees.get(i).getSecondName().length()> employees.get(j).getSecondName().length()){
                    temp = employees.get(i);
                    employees.set(i,employees.get(j));
                    employees.set(j,temp);
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
    public static Scanner scanner = new Scanner(System.in);
    public static void addEmployee() throws IOException {
        boolean add = true;
        while (add) {
            Employee employee = new Employee();

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

            System.out.println("Введите Номер компании сотрудника (1 или 2 или 3)");
            String companyNum = scanner.next();
            int company = -1;
            if (companyNum.equals("1")) company =0;
            if (companyNum.equals("2")) company =1;
            if (companyNum.equals("3")) company =2;

            //EmployeeUtil.addEmployee(employee);
            //getCompanies().get(company).getEmployees().add(EmployeeUtil.getEmployees().get(EmployeeUtil.getEmployees().size() - 1));
            addEmployeeToFile(employee);
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
    public static void addEmployeeToFile  (Employee employee)throws IOException {
    try {
        System.out.println("I am inside addEmployeeToFile");
        System.out.println("Employee to String");
        System.out.println(employee.toString());
        FileWriter writer = new FileWriter("mihael/src/main/java/hometask3/test_write_dm.txt", true);

        writer.append(
                employee.getName() + ":" +
                        employee.getSecondName() + ":" +
                        employee.getSalary() + ":" +
                        employee.getSex() + ":" +
                        employee.getAge() + "\n"
        );
        writer.flush();
        writer.close();
    }catch (IOException ex){
        System.out.println("I am inside catch addEmployeeToFile");
    }
    }
    public static void riseSalary(String sex, double persent){
        ArrayList<Company> companies = getCompanies();
        for (int k=0; k< companies.size(); k++){
            for (int i=0; i< companies.get(k).getEmployees().size(); i++) {
                if(companies.get(k).getEmployees().get(i).getSex().equals(sex)){

                    double newsalary = (double) companies.get(k).getEmployees().get(i).getSalary()*(persent+100)/100;
                    companies.get(k).getEmployees().get(i).setSalary(newsalary);
                }
            }
        }
    }
    public static void fireEmployees(String sex){
        ArrayList<Company> companies = getCompanies();
        for (int k=0; k< companies.size(); k++){
            for (int i=0; i< companies.get(k).getEmployees().size(); i++) {
                if(companies.get(k).getEmployees().get(i).getSex().equals(sex)){
                    companies.get(k).getEmployees().remove(i);
                }
            }
        }
    }

    public static void showSearchName(String searchString) {
        ArrayList<Company> companies = getCompanies();
        for (int i=0;i<companies.size();i++){
            double salary = 0;
            for (int j=0;j<companies.get(i).getEmployees().size();j++){
                if (companies.get(i).getEmployees().get(j).getName().indexOf(searchString)!= -1 ||
                    companies.get(i).getEmployees().get(j).getSecondName().indexOf(searchString)!= -1 ) {
                    System.out.println( companies.get(i).getCompanyName() + " "+
                                        companies.get(i).getEmployees().get(j).getSecondName()+  " "+
                                        companies.get(i).getEmployees().get(j).getName()
                    );
                }
            }



        }
    }

    public static void WriteToFile (String txt, String FileURL, Boolean AddToEnd) throws IOException {
        // AddToEnd:::::: TRUE - дописывать в конец, FALSE - перезаписать всё
        FileWriter writer = new FileWriter(FileURL, AddToEnd);
        writer.write(txt);
        writer.flush();
        writer.close();
    }

}
