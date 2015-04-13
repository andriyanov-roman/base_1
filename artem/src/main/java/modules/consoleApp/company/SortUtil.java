package modules.consoleApp.company;

import entity.company.Employee;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class SortUtil {
    public static void sortByName(int i, String[] companies) throws IOException{
        if(i==0){
            for (int j = 0; j < companies.length; j++) {
                ArrayList<Employee> employees = EmployeeUtil.getEmployees(("artem/src/main/java/files/companies/" + companies[j]), ":");
                Collections.sort(employees, new Comparator<Employee>() {
                    @Override
                    public int compare(Employee o1, Employee o2) {
                        return o1.getName().compareTo(o2.getName());
                    }
                });
                EmployeeUtil.showEmployees(CompanyUtil.companies[j], employees);
            }
        }
        if(i > 0 && i <= companies.length) {
            ArrayList<Employee> employees = EmployeeUtil.getEmployees(("artem/src/main/java/files/companies/" + companies[i-1]), ":");
            Collections.sort(employees, new Comparator<Employee>() {
                @Override
                public int compare(Employee o1, Employee o2) {
                    return o1.getName().compareTo(o2.getName());
                }
            });
            EmployeeUtil.showEmployees(CompanyUtil.companies[i-1], employees);
        }
    }
    public static void sortBySurnameLength(int i, String[] companies) throws IOException{
        if(i==0){
            for (int j = 0; j < companies.length; j++) {
                ArrayList<Employee> employees = EmployeeUtil.getEmployees(("artem/src/main/java/files/companies/" + companies[j]), ":");
                Collections.sort(employees, new Comparator<Employee>() {
                    @Override
                    public int compare(Employee o1, Employee o2) {
                        return o1.getSecondName().length() - o2.getSecondName().length();
                    }
                });
                EmployeeUtil.showEmployees(CompanyUtil.companies[j], employees);
            }
        }
        if(i > 0 && i <= companies.length) {
            ArrayList<Employee> employees = EmployeeUtil.getEmployees(("artem/src/main/java/files/companies/" + companies[i-1]), ":");
            Collections.sort(employees, new Comparator<Employee>() {
                @Override
                public int compare(Employee o1, Employee o2) {
                    return o1.getSecondName().length() - o2.getSecondName().length();
                }
            });
            EmployeeUtil.showEmployees(CompanyUtil.companies[i-1], employees);
        }
    }
    public static void sortByAge(int i, String[] companies) throws IOException{
        if(i==0){
            for (int j = 0; j < companies.length; j++) {
                ArrayList<Employee> employees = EmployeeUtil.getEmployees(("artem/src/main/java/files/companies/" + companies[j]), ":");
                Collections.sort(employees, new Comparator<Employee>() {
                    @Override
                    public int compare(Employee o1, Employee o2) {
                        return o1.getAge() - o2.getAge();
                    }
                });
                EmployeeUtil.showEmployees(CompanyUtil.companies[j], employees);
            }
        }
        if(i > 0 && i <= companies.length) {
            ArrayList<Employee> employees = EmployeeUtil.getEmployees(("artem/src/main/java/files/companies/" + companies[i-1]), ":");
            Collections.sort(employees, new Comparator<Employee>() {
                @Override
                public int compare(Employee o1, Employee o2) {
                    return o1.getAge() - o2.getAge();
                }
            });
            EmployeeUtil.showEmployees(CompanyUtil.companies[i-1], employees);
        }
    }
    public static void sortByZP(int i, String[] companies) throws IOException{
        if(i==0){
            for (int j = 0; j < companies.length; j++) {
                ArrayList<Employee> employees = EmployeeUtil.getEmployees(("artem/src/main/java/files/companies/" + companies[j]), ":");
//              Внешний цикл каждый раз сокращает фрагмент массива, так как внутренний цикл каждый раз ставит в конец фрагмента максимальный элемент
                for(int l = employees.size()-1 ; l > 0 ; l--){
                    for(int k = 0 ; k < l ; k++){
//                      Сравниваем элементы попарно, если они имеют неправильный порядок, то меняем местами
                        if( employees.get(k).getSalary() > employees.get(k+1).getSalary() ){
                            Employee tmp = employees.get(k);
                            employees.set(k, employees.get(k+1));
                            employees.set(k+1, tmp);
                        }
                    }
                }
                EmployeeUtil.showEmployees(CompanyUtil.companies[j], employees);
            }
        }
        if(i > 0 && i <= companies.length) {
            ArrayList<Employee> employees = EmployeeUtil.getEmployees(("artem/src/main/java/files/companies/" + companies[i-1]), ":");
            for(int l = employees.size()-1 ; l > 0 ; l--){
                for(int k = 0 ; k < l ; k++){
//                      Сравниваем элементы попарно, если они имеют неправильный порядок, то меняем местами
                    if( employees.get(k).getSalary() > employees.get(k+1).getSalary() ){
                        Employee tmp = employees.get(k);
                        employees.set(k, employees.get(k+1));
                        employees.set(k+1, tmp);
                    }
                }
            }
            EmployeeUtil.showEmployees(CompanyUtil.companies[i-1], employees);
        }
        /*Collections.sort(companies.get(i).getEmployees(), new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getSalary() - o2.getSalary();
            }
        });*/
    }
}
