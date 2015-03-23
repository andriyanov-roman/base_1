package homework;

import entity.Company;
import entity.Employee;
import java.util.*;


public class Methods {
    public static Scanner scanner = new Scanner(System.in);
    public static void welcome() {
        System.out.println(
                "1. Get all employees from all companies" +
                "\n2. Get employee with max Salary" +
                "\n3. Sort employees" +
                "\n4. Add employees" +
                "\n5. Fire employees" +
                "\n6. Increase the salary for 15%" +
                "\n7. Add company" +
                "\n0. Exit program"
        );
    }
    public static void start(){
        welcome();
        while (scanner.hasNext()){
            switch (scanner.next()){
                //Каждой задаче присваивается Номер, чтобы пользователь не вводил название задачи вручную
//                case "1": CompanyUtil.showEmployees(); break;
//                case "2": CompanyUtil.getMaxSalary(); break;
//                case "3": CompanyUtil.sortBy(); break;
//                case "7": addEmployee(); break;
//                case "8": fireFemale(); break;
                case "0": System.exit(0);
                    default: System.out.println ("No such case");
            }
        }
    }

   /* public static void fireFemale(){
        ArrayList<Company> companies = CompanyUtil.getOrgs();
        for (int i = 0; i < companies.size(); i++) {
            for (int j = companies.get(i).getEmployees().size()-1; j >= 0; j--) {
                if(companies.get(i).getEmployees().get(j).getSex().equals("female")){
                    companies.get(i).getEmployees().remove(j);}
            }
            for (int j = 0; j < companies.get(i).getEmployees().size(); j++) {
                System.out.println(companies.get(i).getOrgName()+" "+ companies.get(i).getEmployees().get(j));
            }
        }
    }*/

}