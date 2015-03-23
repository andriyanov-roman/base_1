package hometask2_4;

import entity.Company;
import entity.Employee;

import java.util.ArrayList;

/**
 * Created by mit_OK! on 23.03.2015.
 */
public class Methods {
    public static void highSalary() {
        ArrayList<Company> comps = CompanyUtil.getCompanies();
        System.out.println();
        for (int i = 0; i < comps.size(); i++) {
            Employee temp = comps.get(i).getEmployees().get(0);
            for (int j = 0; j < comps.get(i).getEmployees().size(); j++) {
                if (temp.getSalary() < comps.get(i).getEmployees().get(j).getSalary()) {
                    temp = comps.get(i).getEmployees().get(j);
                }
            }
            System.out.println("Company \""+comps.get(i).getCompanyName() + "\". Higher salary: " + temp.getSalary() + "$. It gives " + temp.getName()+" "+temp.getSurname());
        }
    }
    public static ArrayList <Employee> sort (Company com, String sortMethod) {
        ArrayList <Employee> employees = com.getEmployees();
        for (int i = 0; i < employees.size()-1; i++) {
            for (int j = 0; j < employees.size()-1-i; j++) {
                switch (sortMethod){
                    case "bySalary":
                        if (employees.get(j+1).getSalary() < employees.get(j).getSalary()){
                            employees = Move(employees, j);
                        }
                        break;
                    case "byAge":
                        if (employees.get(j+1).getAge() < employees.get(j).getAge()){
                            employees = Move(employees, j);
                        }
                        break;
                    case "bySurname":
                        if ( employees.get(j+1).getSurname().length() < employees.get(j).getSurname().length() ){
                            employees = Move(employees, j);
                        }
                        break;
                    default:
                        System.out.println("Such Sort Method doesn't exist!");
                        return employees;
                }
            }
        }
        return employees;
    }
    private static ArrayList<Employee> Move(ArrayList<Employee> employees, int j){
        Employee temp = employees.get(j);
        employees.set(j,employees.get(j+1));
        employees.set(j+1,temp);
        return employees;
    }

    public static Company IncreaseSalary (Company com, Double percent){
        for (int i = 0; i < com.getEmployees().size(); i++) {
            Employee k = com.getEmployees().get(i);
            if (k.getGender().equals("female") ) { // Нам попалась женщина, поднимаем ей ЗП
                System.out.print(k.getName() + " " + k.getSurname() + " (" + k.getGender() + ") Salary+15%. Old: " + k.getSalary() + "$");
                Double newSalary = k.getSalary()*(1+percent); // на 15%
                k.setSalary(Math.round(newSalary));
                System.out.println(" New: "+k.getSalary()+"$");
            }
        }
        com.setEmployees(com.getEmployees());
        return com;
    }

    public static Company FireStuff (Company com, String Gender){
        for (int i = 0; i < com.getEmployees().size(); i++) {
            Employee k = com.getEmployees().get(i);
            if (k.getGender().equals(Gender)){// Если сия особь ТАКОГО пола - уволить!
                System.out.println(k.getName() + " " + k.getSurname() + " (" + k.getGender() + ") ...FIRED!");
                com.getEmployees().remove(i);
                i--;
            }
        }
        com.setEmployees(com.getEmployees());
        return com;
    }
}
