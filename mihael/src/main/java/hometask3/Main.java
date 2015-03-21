package hometask3;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Created by user on 16.03.2015.
 */
public class Main {
    public static void main (String[] args){
        /*
        ArrayList employee = new ArrayList();
        employee.add("A");
        employee.add(1);
        ArrayList<Employee> employees = new ArrayList<>();
        employee.add("A");
        employee.add (new Employee("vasia", "ivanov",3000.00));
        if(employee.get(1) instanceof Employee){
            Employee employee1 = (Employee) employee.get(1);
        }
        Employee e = employees.get(0);
        System.out.println(e.getName());
        System.out.println(employee.size());

        employee.add(0,new Employee("Vasya", "Petrov", 7000.00, "MASCULINE",29));

        employee.add(1,new Employee("Artem", "Petrov", 7000.00, "MASCULINE",29));

        employees.forEach(System.out::println);
        */

        start();
    }


    public static void start(){

        boolean first = true;
        showMenu();
        while (CompanyUtil.scanner.hasNext()) {
            if (first) {first=false;}
            else {

                switch (CompanyUtil.scanner.next()) {
                    case "1":
                        CompanyUtil.showAllEmployees();
                        break;
                    case "2":
                        ArrayList<Employee> sorted1 = CompanyUtil.sortBySalary(CompanyUtil.getCompanies().get(0).getEmployees());
                        CompanyUtil.showEmployees(sorted1);
                        break;
                    case "3":
                        ArrayList<Employee> sorted2 = CompanyUtil.sortByAge(CompanyUtil.getCompanies().get(1).getEmployees());
                        CompanyUtil.showEmployees(sorted2);
                        break;

                    case "4":
                        ArrayList<Employee> sorted3 = CompanyUtil.sortByLastNameLength(CompanyUtil.getCompanies().get(2).getEmployees());
                        CompanyUtil.showEmployees(sorted3);
                        break;
                    case "5":
                        CompanyUtil.addEmployee();
                        break;
                    case "6":
                        CompanyUtil.fireEmployees("FEMININE");
                        CompanyUtil.riseSalary("MASCULINE",15.00);
                        break;
                }

            }
            showMenu();
        }

        //CompanyUtil.showSearchName("P");
        //CompanyUtil.showBiggestSallaries();
    }

    public static void showMenu(){
        System.out.println( "-------------------------\n" +
                "1. Show all employees" + "\n" +
                "2. Show company 1 sorted by salary" +  "\n" +
                "3. Show company 2 sorted by Age" + "\n" +
                "4. Show company 3 sorted by Last Name Length" + "\n" +
                "5. Add an Employee" + "\n" +
                "6. Rise sallary for man 15% and fire woman "
                );

    }
}



