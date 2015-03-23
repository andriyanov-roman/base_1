package entity;

import java.util.ArrayList;

/**
 * Created by user on 14.03.2015.
 */
public class Company {
    private String companyName;
    private ArrayList<Employee> employees;
    private String filePath;

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

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getFilePath() {
        return filePath;
    }

    @Override
    public String toString() {
        String str = companyName+"\n";
        for (int i = 0; i < employees.size(); i++) {
            Boolean GenderType = false;
            Employee e = employees.get(i);
            if (e.getGender().equals("male")){GenderType=true;}
            str=str+e.getName()+":"+e.getSurname()+":"+e.getSalary()+":"+GenderType+":"+e.getAge()+"\n";
        }
        return str;
    }
}
