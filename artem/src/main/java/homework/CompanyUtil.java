package homework;


import entity.Company;
import entity.Employee;
import java.util.ArrayList;

public class CompanyUtil { // Создаем класс штампующий Организации("печеньки") из определенного шаблона Org
    public static ArrayList<Company> orgsGLobaL = getOrgs();
    public static int sortselection;
    public static ArrayList<Company> getOrgs(){ // Создаем метод возвращающий "печеньки"
        ArrayList<Company> companies = new ArrayList<>();
        ArrayList<Employee> employees = EmployeeUtil.getEmployees(); // Создаем массив из наштампованных "печенек" employees
                                                           // созданных посредством класса EmployeeUtil по шаблону Еmployees
        Company o1 = new Company(); // Создаем первую организзацию ("печеньку")
        o1.setOrgName("C#"); // Поле для названия заполнили сеттером setOrgName
        o1.setEmployees(new ArrayList<>()); // Поле-массив сотрудников наполнили сеттером setEmployees
        o1.getEmployees().add(employees.get(0));
        o1.getEmployees().add(employees.get(3));
        o1.getEmployees().add(employees.get(7));
        companies.add(o1);

        Company o2 = new Company();
        o2.setOrgName("C++");
        o2.setEmployees(new ArrayList<>());
        o2.getEmployees().add(employees.get(2));
        o2.getEmployees().add(employees.get(4));
        o2.getEmployees().add(employees.get(6));
        o2.getEmployees().add(employees.get(8));
        companies.add(o2);

        Company o3 = new Company();
        o3.setOrgName("Java");
        o3.setEmployees(new ArrayList<>());
        o3.getEmployees().add(employees.get(1));
        o3.getEmployees().add(employees.get(5));
        o3.getEmployees().add(employees.get(8));
        companies.add(o3);

           return companies;
           //return new Org[]{o1, o2, o3}; // Возвращаем массив созданных "печенек"
    }
    public static ArrayList<Company> addOrgs(){
        Company oNew = new Company();
        System.out.print(" Company Name: ");
        oNew.setOrgName(Methods.scanner.next());
        oNew.setEmployees(new ArrayList<>());
        orgsGLobaL.add(oNew);
        return orgsGLobaL;
    }
    public static void showEmployees(){
        for(int i = 0; i < orgsGLobaL.size(); i++){
            for(int j = 0; j < orgsGLobaL.get(i).getEmployees().size(); j++){
                System.out.println(orgsGLobaL.get(i).getOrgName()+" "+orgsGLobaL.get(i).getEmployees().get(j));
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
                        for (int i = 0; i < orgsGLobaL.size(); i++) {
                            for (int j = 0; j < orgsGLobaL.get(i).getEmployees().size(); j++) {
                                double salary = orgsGLobaL.get(i).getEmployees().get(j).getSalary();
                                if (emp.getSalary() < salary) {
                                    emp = orgsGLobaL.get(i).getEmployees().get(j);
                                    company = orgsGLobaL.get(i);
                                }
                            }
                        }
                        System.out.println(" Employee: \n -- "+ company.getOrgName() + " " + emp.toString() + "\n has the max salary.");
                        break;
                    case "b":
                        System.out.println(" Employees: ");
                        for (int i = 0; i < orgsGLobaL.size(); i++) {
                            Employee tmp = orgsGLobaL.get(i).getEmployees().get(0);
                            for (int j = 0; j < orgsGLobaL.get(i).getEmployees().size(); j++) {
                                double salary = orgsGLobaL.get(i).getEmployees().get(j).getSalary();
                                if (tmp.getSalary() < salary) {
                                    tmp = orgsGLobaL.get(i).getEmployees().get(j);
                                }
                            }
                            System.out.println(" -- " + orgsGLobaL.get(i).getOrgName() + " " + tmp.toString());
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
        for(int i = 1; i <= orgsGLobaL.size(); i++){
            System.out.println(" " + (i) + " - " + orgsGLobaL.get(i-1).getOrgName());
        }
        boolean b = true;
        while (b){
            int i = Integer.parseInt(Methods.scanner.next());
            if(i == 0){
                System.out.println(" Select an option:"+"\n 1. Sort by name"+"\n 2. Sort by surname length"+
                        "\n 3. Sort by ZP"+"\n 4. Sort by age");
                switch (Methods.scanner.next()){
                    case "1": for (i = 0; i < orgsGLobaL.size(); i++) { Sort.sortByName(); } break;
                    case "2": for (i = 0; i < orgsGLobaL.size(); i++) { Sort.sortBySurnameLength(); } break;
                    case "3": for (i = 0; i < orgsGLobaL.size(); i++) { Sort.sortByZP(); } break;
                    case "4": for (i = 0; i < orgsGLobaL.size(); i++) { Sort.sortByAge(); } break;
                    default: System.out.println("No such case");
                }
                b = false;
            }
            if(i > 0){
                System.out.println(" Select an option:"+"\n 1. Sort by name"+"\n 2. Sort by surname length"+
                        "\n 3. Sort by ZP"+"\n 4. Sort by age");
                sortselection = Integer.parseInt(Methods.scanner.next());
                boolean bo = true;
                while (bo){
                    switch (sortselection){
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