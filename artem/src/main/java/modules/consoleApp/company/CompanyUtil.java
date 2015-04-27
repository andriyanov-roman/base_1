package modules.consoleApp.company;


import entity.company.Employee;
import homework.Body;

import java.io.*;
import java.util.ArrayList;

public class CompanyUtil { // Создаем класс штампующий Организации("печеньки") из определенного шаблона Org
    public static String[] companies;

    public static String[] getCompanies(String dirPath) throws IOException { //
        File f = new File(dirPath);
        companies = f.list();
        return companies;
    }
    public static void getMaxSalary() throws IOException {
        boolean b = true;
        do {
            ArrayList<Employee> employees;
            System.out.println(" a - Among all companies\n b - For each company\n c - Come back");
                switch (Body.scanner.next()) {
                    case "a":
                        Employee emp = new Employee();
                        String companyName = "";
                        for (String company : companies) {
                            employees = EmployeeUtil.getEmployees(("artem/src/main/java/files/companies/" + company), ":");
                            for (int j = 0; j < employees.size(); j++) {
                                double salary = employees.get(j).getSalary();
                                if (emp.getSalary() < salary) {
                                    emp = employees.get(j);
                                    companyName = company;
                                }
                            }
                        }
                        System.out.println(" Employee: \n -- "+ companyName + " " + emp.toString() + "\n has the max salary.");
                        b = false;
                        break;
                    case "b":
                        System.out.println(" employees: ");
                        for (int i = 0; i < companies.length; i++) {
                            employees = EmployeeUtil.getEmployees(("artem/src/main/java/files/companies/" + companies[i]), ":");
                            Employee tmp = employees.get(0);
                            for (int j = 0; j < employees.size(); j++) {
                                double salary = employees.get(j).getSalary();
                                if (tmp.getSalary() < salary) {
                                    tmp = employees.get(j);
                                }
                            }
                            System.out.println(" -- " + companies[i] + " " + tmp.toString());
                        }
                        System.out.println(" have the max salary among etch company.");
                        b = false;
                        break;
                    case "c":
                        b = false;
                        break;
                    default: System.out.println("No such case\n Select an option please:\n");
            }
        } while (b);
    }
    public static void sortBy() throws IOException{
        boolean b = true;
        do {
            System.out.println(" 0 - For all companies, or Select company:");
            for(int i = 1; i <= companies.length; i++) System.out.println(" " + (i) + " - " + companies[i - 1]);
            System.out.println(" c - Come back");
            String s = Body.scanner.next();
            int i = 0;
            try {i = Integer.parseInt(s);}
            catch (Exception e) {
                if (s.equals("c")){ break; }
                System.out.println("Wrong input! The input must be an positive Integer number. Try again.");
                sortBy();
            }
            if (i==0){
                System.out.println(" Select an option:"+"\n 1. Sort by name"+"\n 2. Sort by surname length"+
                        "\n 3. Sort by ZP"+"\n 4. Sort by age"+"\n c - Come back");
                switch (Body.scanner.next()){
                    case "1": SortUtil.sortByName(i, companies); break;
                    case "2": SortUtil.sortBySurnameLength(i, companies); break;
                    case "3": SortUtil.sortByZP(i, companies); break;
                    case "4": SortUtil.sortByAge(i, companies); break;
                    case "c": break;
                    default: System.out.println("No such case");
                }
            }
            if(i > 0 && i <= companies.length) {
                System.out.println(" Select an option:"+"\n 1. Sort by name"+"\n 2. Sort by surname length"+
                        "\n 3. Sort by ZP"+"\n 4. Sort by age"+"\n c - Come back");
                switch (Body.scanner.next()){
                    case "1": SortUtil.sortByName(i, companies); break;
                    case "2": SortUtil.sortBySurnameLength(i, companies); break;
                    case "3": SortUtil.sortByZP(i, companies); break;
                    case "4": SortUtil.sortByAge(i, companies); break;
                    case "c": break;
                    default: System.out.println("No such case");
                }
                b = false;
            }
            if(i < 0 || i > companies.length) System.out.println("No such case\nSelect an option!");
        } while (b);
    }
    public static void addCompany (String companyName, ArrayList<Employee> employees) throws IOException{
        FileWriter writer = new FileWriter("artem/src/main/java/files/companies/"+companyName, true);
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < employees.size(); i++) {
            buffer.append(String.valueOf("\n" + employees.get(i).getName()+":"+employees.get(i).getSecondName()+":"+employees.get(i).getSalary()+":"+employees.get(i).getSex()+":"+employees.get(i).getAge()));
        }
        writer.write(String.valueOf(buffer));
        writer.flush();
        writer.close();
    }
    //return new Org[]{o1, o2, o3}; // Возвращаем массив созданных "печенек"
}