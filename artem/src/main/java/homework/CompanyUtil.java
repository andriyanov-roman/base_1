package homework;


import entity.Company;
import entity.Employee;
import java.io.*;
import java.util.ArrayList;

public class CompanyUtil { // Создаем класс штампующий Организации("печеньки") из определенного шаблона Org
    public static ArrayList<Company> companies = new ArrayList<>();
    public static int sortSelection;
    public static ArrayList<Company> getCompanies() throws IOException { // Создаем метод возвращающий "печеньки"
        File file = new File("artem/src/main/java/additionalFiles/companies");
        FileReader reader = new FileReader(file);
        BufferedReader buffer = new BufferedReader(reader);
        String line;
        while((line = buffer.readLine()) != null) {
            String[] pool = line.split(":");
            Company newCompany = new Company();
            newCompany.setCompanyName(pool[0]);
            Employee e = new Employee();
            e.setName(pool[1]);
            e.setSecondName(pool[2]);
            e.setSalary(Double.valueOf(pool[3]));
            e.setSex(pool[4]);
            e.setAge(Integer.valueOf(pool[5]));
            ArrayList<Employee> emp = new ArrayList<>();
            emp.add(e);
            newCompany.setEmployees(emp);
            companies.add(newCompany);
        }
        for (int i = 0; i < companies.size(); i++) {
            for (int j = companies.size()-1; j > i; j--) {
                if (companies.get(i).getCompanyName().equals(companies.get(j).getCompanyName())){
                    companies.get(i).getEmployees().add(companies.get(j).getEmployees().get(0));
                    companies.remove(j);
                }
            }
        }
        return companies;
    }
    //return new Org[]{o1, o2, o3}; // Возвращаем массив созданных "печенек"
    public static void saveCompaniesToFile() throws IOException{
        FileWriter writer = new FileWriter("artem/src/main/java/additionalFiles/test");
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < companies.size(); i++) {
            for (int j = 0; j < companies.get(i).getEmployees().size(); j++) {
                buffer.append(String.valueOf(companies.get(i).getCompanyName()+":"+companies.get(i).getEmployees().get(j).getName()+":"+companies.get(i).getEmployees().get(j).getSecondName()+":"+companies.get(i).getEmployees().get(j).getSalary()+":"+companies.get(i).getEmployees().get(j).getSex()+":"+companies.get(i).getEmployees().get(j).getAge()+":"+ "\n"));
            }
        }
        writer.write(String.valueOf(buffer));
        writer.flush();
        writer.close();
    }
    /*public static void ArrayList<Company> addOrgs(){

    }*/
    public static void showCompanies(){
        for (int i = 0; i < companies.size(); i++) {
            for (int j = 0; j < companies.get(i).getEmployees().size(); j++) {
                System.out.println(companies.get(i).getCompanyName()+" "+companies.get(i).getEmployees().get(j));
            }
        }
    }
    public static void getMaxSalary(){
        System.out.println(" a - Among all companies\n b - For each company");
        boolean b = true;
        while (b){
            String s = Methods.scanner.next();
            if(s.equals("a")||s.equals("b")) {
                switch (s) {
                    case "a":
                        Employee emp = new Employee();
                        Company company = new Company();
                        for (int i = 0; i < companies.size(); i++) {
                            for (int j = 0; j < companies.get(i).getEmployees().size(); j++) {
                                double salary = companies.get(i).getEmployees().get(j).getSalary();
                                if (emp.getSalary() < salary) {
                                    emp = companies.get(i).getEmployees().get(j);
                                    company = companies.get(i);
                                }
                            }
                        }
                        System.out.println(" Employee: \n -- "+ company.getCompanyName() + " " + emp.toString() + "\n has the max salary.");
                        break;
                    case "b":
                        System.out.println(" Employees: ");
                        for (int i = 0; i < companies.size(); i++) {
                            Employee tmp = companies.get(i).getEmployees().get(0);
                            for (int j = 0; j < companies.get(i).getEmployees().size(); j++) {
                                double salary = companies.get(i).getEmployees().get(j).getSalary();
                                if (tmp.getSalary() < salary) {
                                    tmp = companies.get(i).getEmployees().get(j);
                                }
                            }
                            System.out.println(" -- " + companies.get(i).getCompanyName() + " " + tmp.toString());
                        }
                        System.out.println(" have the max salary among etch company.");
                        break;
                    default: System.out.println("No such case");
                }
                b = false;
            }
            else {
                System.out.println("Select an option!");
                System.out.println(" a - Among all companies\n b - For each company");
            }
        }
    }
    public static void sortBy(){
        System.out.println(" 0 - For all companies, or Select company:");
        for(int i = 1; i <= companies.size(); i++){
            System.out.println(" " + (i) + " - " + companies.get(i-1).getCompanyName());
        }
        boolean b = true;
        while (b){
            int i = Integer.parseInt(Methods.scanner.next());
            if(i == 0){
                System.out.println(" Select an option:"+"\n 1. Sort by name"+"\n 2. Sort by surname length"+
                        "\n 3. Sort by ZP"+"\n 4. Sort by age");
                switch (Methods.scanner.next()){
                    case "1": for (i = 0; i < companies.size(); i++) { Sort.sortByName(); } break;
                    case "2": for (i = 0; i < companies.size(); i++) { Sort.sortBySurnameLength(); } break;
                    case "3": for (i = 0; i < companies.size(); i++) { Sort.sortByZP(); } break;
                    case "4": for (i = 0; i < companies.size(); i++) { Sort.sortByAge(); } break;
                    default: System.out.println("No such case");
                }
                b = false;
            }
            if(i > 0){
                System.out.println(" Select an option:"+"\n 1. Sort by name"+"\n 2. Sort by surname length"+
                        "\n 3. Sort by ZP"+"\n 4. Sort by age");
                sortSelection = Integer.parseInt(Methods.scanner.next());
                boolean bo = true;
                while (bo){
                    switch (sortSelection){
                        case 1: Sort.sortByName(); bo = false; break;
                        case 2: Sort.sortBySurnameLength(); bo = false; break;
                        case 3: Sort.sortByZP(); bo = false; break;
                        case 4: Sort.sortByAge(); bo = false; break;
                        default: System.out.println("No such case\nSelect an option!");
                    }
                }
                b = false;
            }
            if(i < 0) { System.out.println("No such case\nSelect an option!"); }
        }
    }
}