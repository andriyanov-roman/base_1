package Lessons.LessonTwo;


import entity.Employee;
import Lessons.LessonTwo.lesson_3.Admin;
import Lessons.LessonTwo.lesson_3.Manager;

import java.util.ArrayList;

/**
 * Created by user on 14.03.2015.
 */
public class Start {
   /* public void main(String[] args) throws IOException {
        CompanyUtil.findMaxSalary();
    }*/


    public void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        ArrayList<Manager> managers = new ArrayList<>();
        ArrayList<Manager> admins = new ArrayList<>();
        ArrayList<Manager> programmers = new ArrayList<>();
       /* Manager managerMaxSalary = getMaxSalaryManager(managers);
        Admin adminsMaxSalary = getMaxSalaryAdmins(admins);
     *//*   if (managerMaxSalary.getSalary()> adminsMaxSalary.getSalary() && )*/
        Manager m = new Manager();
        employees.add(m);
        m.getEmployees();




    }


    public void getMaxSalary() {
        ArrayList entyties = new ArrayList();
        Manager managerMax;
        for (int i = 0; i < entyties.size(); i++) {
            if(entyties.get(i) instanceof Manager){
            managerMax = (Manager)entyties.get(i);
               /* if (managerMax.getSalary())*/
            }

        }
    }

    private Admin getMaxSalaryAdmins(ArrayList<Manager> admins) {
        return null;
    }

    private Manager getMaxSalaryManager(ArrayList<Manager> managers) {
        Manager max = managers.get(0);
        for (int i = 0; i < managers.size(); i++) {
            if (max.getSalary() < managers.get(0).getSalary()) {
            max = managers.get(i);
            }
        } return max;
    }


}
