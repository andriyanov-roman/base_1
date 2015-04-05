package homework;

import entity.company.Employee;
import homework.company.CompanyUtil;
import homework.company.EmployeeUtil;

import java.io.*;
import java.util.*;


public class CommonMethods {
    public static Scanner scanner = new Scanner(System.in);
    public static void welcome() {
        System.out.println(
                "\n1. Get all employees from all companies" +
                "\n2. Get employee with max Salary" +
                "\n3. Sort employees" +
                "\n4. Add employees" +
//                "\n5. Fire employees" +
//                "\n6. Increase the salary for 15%" +
                "\n7. Add company" +
                "\n0. Exit program"   );
    }
    public static void start() throws IOException {
        CompanyUtil.getCompanies("artem/src/main/java/filesPackage/companies");
        do {
            welcome();
            switch (CommonMethods.scanner.next()){
                case "1":
                    for (int i = 0; i < CompanyUtil.companies.length; i++) {
                        ArrayList<Employee> employees = EmployeeUtil.getEmployees(("artem/src/main/java/filesPackage/companies/" + CompanyUtil.companies[i]), ":");
                        EmployeeUtil.showEmployees(CompanyUtil.companies[i], employees);
                    }
                    break;
                case "2": CompanyUtil.getMaxSalary(); break;
                case "3": CompanyUtil.sortBy(); break;
                case "4":
                    boolean b = true;
                    do {
                        System.out.println(" Select company:");
                        for(int i = 1; i <= CompanyUtil.companies.length; i++) System.out.println(" " + (i) + " - " + CompanyUtil.companies[i - 1]);
                        System.out.println(" a - Add company\n c - Come back");
                        String s = CommonMethods.scanner.next();
                        int i = 0;
                        try {i = Integer.parseInt(s);}
                        catch (Exception e) {
                            if (s.equals("c")){ start(); }
                            if (s.equals("a")){ EmployeeUtil.addEmployee(s); start();}
                            System.out.println("Wrong input! The input must be an positive Integer number. Try again.");
                        }
                        if (i > 0 && i <= CompanyUtil.companies.length){
                            EmployeeUtil.addEmployee(CompanyUtil.companies[i-1]);
                            b = false;
                        }
                        if(i < 0 || i > CompanyUtil.companies.length) System.out.println("No such case\nSelect an option!");
                    } while (b);
                case "7":
                    System.out.print(" Enter company name: ");
                    String s = scanner.next();
                    ArrayList<Employee> employees = new ArrayList<>();
                    CompanyUtil.addCompany(s, employees);
                case "0": System.exit(0); break;
                default: System.out.println("No such case");
            }
        } while (true);
    }
    public static ArrayList<String[]> readFromFile (String path, String regExp) throws IOException {
        File file = new File(path);
        FileReader reader = new FileReader(file);
        BufferedReader buffer = new BufferedReader(reader);
        String line;
        ArrayList<String[]> strings = new ArrayList<>();
        while ((line = buffer.readLine()) != null){
            String[] pool = line.split(regExp);
            strings.add(pool);
        }
        return strings;
    }
    public static void writeToFile (String path, ArrayList<Employee> employees) throws IOException{
        FileWriter writer = new FileWriter(path, true);
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < employees.size(); i++) {
            buffer.append(String.valueOf("\n" + employees.get(i).getName()+":"+employees.get(i).getSecondName()+":"+employees.get(i).getSalary()+":"+employees.get(i).getSex()+":"+employees.get(i).getAge()));
        }
        writer.write(String.valueOf(buffer));
        writer.flush();
        writer.close();
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