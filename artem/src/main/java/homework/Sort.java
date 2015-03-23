package homework;

import entity.Employee;
import java.util.Collections;
import java.util.Comparator;


public class Sort {
    public static void sortByName(){
        Collections.sort(CompanyUtil.companies.get(CompanyUtil.sortSelection).getEmployees(), new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        for (int j = 0; j < CompanyUtil.companies.get(CompanyUtil.sortSelection).getEmployees().size(); j++) {
            System.out.println(CompanyUtil.companies.get(CompanyUtil.sortSelection).getCompanyName()+" "+CompanyUtil.companies.get(CompanyUtil.sortSelection).getEmployees().get(j));
        }
    }
    public static void sortBySurnameLength(){
        Collections.sort(CompanyUtil.companies.get(CompanyUtil.sortSelection).getEmployees(), new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getSecondName().length() - o2.getSecondName().length();
            }
        });
        for (int j = 0; j < CompanyUtil.companies.get(CompanyUtil.sortSelection).getEmployees().size(); j++) {
            System.out.println(CompanyUtil.companies.get(CompanyUtil.sortSelection).getCompanyName()+" "+CompanyUtil.companies.get(CompanyUtil.sortSelection).getEmployees().get(j));
        }
    }
    public static void sortByAge(){
        Collections.sort(CompanyUtil.companies.get(CompanyUtil.sortSelection).getEmployees(), new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        for (int j = 0; j < CompanyUtil.companies.get(CompanyUtil.sortSelection).getEmployees().size(); j++) {
            System.out.println(CompanyUtil.companies.get(CompanyUtil.sortSelection).getCompanyName()+" "+CompanyUtil.companies.get(CompanyUtil.sortSelection).getEmployees().get(j));
        }
    }
    public static void sortByZP(){
        /*Collections.sort(companies.get(i).getEmployees(), new Comparator<Employee>() {
                @Override
                public int compare(Employee o1, Employee o2) {
                    return o1.getSalary() - o2.getSalary();
                }
            });*/
            /*for (int j = 0; j < orgs.get(i).getEmployees().size(); j++) {
                for (int k = 0; k < orgs.get(i).getEmployees().size() - j - 1; k++) {
                    if(orgs.get(i).getEmployees().get(k).getSalary() > orgs.get(i).getEmployees().get(k + 1)){
                        Employee tmp =
                    }
                }
            }*/
    }
}
