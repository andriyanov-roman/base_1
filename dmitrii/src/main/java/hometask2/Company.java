package hometask2;
import java.lang.reflect.Method;
/**
 * Created by user on 14.03.2015.
 */
public class Company {
    private String companyName;
    private Employee[] employees;

    public void setEmployees (Employee[] employees){
        this.employees = employees;
    }

    public Employee[] getEmployees (){
        return employees;
    }

    public void setCompanyName (String name){
        this.companyName = name;
    }

    public String getCompanyName () {
        return companyName;
    }

    public Employee[] sortBySalary () {
        Employee temp = employees[0];
        for (int i = 0; i < employees.length-1; i++) {
            for (int j = 0; j < employees.length-1-i; j++) {
                if (employees[j+1].getSalary() < employees[j].getSalary()){
                    temp = employees[j];
                    employees[j]=employees[j+1];
                    employees[j+1]=temp;
                }
            }
        }
        return employees;
    }
    public Employee[] sortByAge () {
        Employee temp = employees[0];
        for (int i = 0; i < employees.length-1; i++) {
            for (int j = 0; j < employees.length-1-i; j++) {
                if (employees[j+1].getAge() < employees[j].getAge()){
                    temp = employees[j];
                    employees[j]=employees[j+1];
                    employees[j+1]=temp;
                }
            }
        }
        return employees;
    }
    public Employee[] sortBySurname () {
        Employee temp = employees[0];
        for (int i = 0; i < employees.length-1; i++) {
            for (int j = 0; j < employees.length-1-i; j++) {
                if ((employees[j+1].getSurname()).length() < (employees[j].getSurname()).length() ){
                    temp = employees[j];
                    employees[j]=employees[j+1];
                    employees[j+1]=temp;
                }
            }
        }
        return employees;
    }

}
