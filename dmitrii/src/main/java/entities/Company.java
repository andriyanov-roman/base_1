package entities;

import java.util.ArrayList;

/**
 * Created by user on 14.03.2015.
 */
public class Company {
    private String companyName;
    private ArrayList<Employee> employees;
    private ArrayList<Programmer> programmers;
    private ArrayList<Admin> admins;
    private ArrayList<Manager> managers;
    private ArrayList stuff;
    private String filePath;

    public void setCompanyName (String name){
        this.companyName = name;
    }

    public ArrayList getStuff() {
        return stuff;
    }

    public void setStuff(ArrayList ... stuffDivisions) {
        ArrayList stuff = new ArrayList();
        for (int i = 0; i < stuffDivisions.length; i++) {
            stuff.add(stuffDivisions[i]);
        }
        this.stuff = stuff;
        /*stuff.add(getEmployees());
        stuff.add(getAdmins());
        stuff.add(getManagers());
        stuff.add(getProgrammers());
        this.stuff = stuff;*/
    }

    public String getCompanyName () {
        return companyName;
    }
    public void setEmployees (ArrayList<Employee> employees){
        this.employees = employees;
    }

    public ArrayList<Employee> getEmployees (){
        return employees;
    }

    public ArrayList<Programmer> getProgrammers() {
        return programmers;
    }

    public void setProgrammers(ArrayList<Programmer> programmers) {
        this.programmers = programmers;
    }

    public ArrayList<Admin> getAdmins() {
        return admins;
    }

    public void setAdmins(ArrayList<Admin> admins) {
        this.admins = admins;
    }

    public ArrayList<Manager> getManagers() {
        return managers;
    }

    public void setManagers(ArrayList<Manager> managers) {
        this.managers = managers;
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
