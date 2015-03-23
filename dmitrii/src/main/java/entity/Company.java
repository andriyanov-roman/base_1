package entity;

import java.util.ArrayList;

/**
 * Created by user on 14.03.2015.
 */
public class Company {
    private String companyName;
    private ArrayList<Employee> employees;

    public void setEmployees (ArrayList<Employee> employees){
        this.employees = employees;
    }

    public ArrayList<Employee> getEmployees (){
        return employees;
    }

    public void setCompanyName (String name){
        this.companyName = name;
    }

    public String getCompanyName () {
        return companyName;
    }


    @Override
    public String toString() {
        return "Company{" +
                "companyName='" + companyName + '\'' +
                ", employees=" + employees +
                '}';
    }

    public ArrayList <Employee> sort (String sortMethod) {
        Employee temp = employees.get(0);
        for (int i = 0; i < employees.size()-1; i++) {
            for (int j = 0; j < employees.size()-1-i; j++) {
                switch (sortMethod){
                    case "bySalary":
                        if (employees.get(j+1).getSalary() < employees.get(j).getSalary()){Move(temp,j);}
                        break;
                    case "byAge":
                        if (employees.get(j+1).getAge() < employees.get(j).getAge()){Move(temp,j);}
                        break;
                    case "bySurname":
                        if ( employees.get(j+1).getSurname().length() < employees.get(j).getSurname().length() ){Move(temp,j);}
                        break;
                    default:
                        System.out.println("Such Sort Method doesn't exist!");
                        return employees;
                }
            }
        }
        return employees;
    }

    public void Move (Employee temp, int j){
        temp = employees.get(j);
        employees.set(j,employees.get(j+1));
        employees.set(j+1,temp);
    }
}
