/*
package lesson_5;

import home_works.administrator.SystemAdmUtil;
import home_works.developers.Developer;
import home_works.manager.Manager;
import home_works.administrator.SystemAdm;
import home_works.developers.DeveloperUtil;
import home_works.manager.ManagerUtil;

import java.util.ArrayList;


public class Meth {
    public static void launch() {

        getMaxSalaryManager();
        getMaxSalarySystem_Adm();
        getMaxSalaryDeveloper();
//        getMaxSalaryFromAllEmployee();
    }

   */
/* private static void getMaxSalaryFromAllEmployee() {
        ArrayList<Developer> developer = DeveloperUtil.getDeveloper();
        ArrayList<SystemAdm> adms = SystemAdmUtil.getSystemAdm();
        ArrayList<Manager> manager = ManagerUtil.getManager();
        for (int i = 0; i < developer.get(i).getSalary(); i++) {
            for (int j = 0; j < adms.get(j).getSalary(); j++) {
                for (int k = 0; k < manager.get(k).getSalary(); k++) {
                    if (developer.get(i).getSalary() > adms.get(j).getSalary() && developer.get(i).getSalary() > manager.get(k).getSalary()) {
                        System.out.println(" maxSalary  - " + developer.get(i).getSalary());
                    } else {
                        if (adms.get(j).getSalary() > developer.get(i).getSalary() && adms.get(j).getSalary() > manager.get(k).getSalary()) {
                            System.out.println(" maxSalary  - " + adms.get(j).getSalary());
                        } else {
                            if (manager.get(k).getSalary() > developer.get(i).getSalary() && manager.get(k).getSalary() > adms.get(j).getSalary());
                            System.out.println(" maxSalary  - " + manager.get(k).getSalary());
                        }

                    }

                }
            }
        }
    }*//*


    private static void getMaxSalaryDeveloper() {
        ArrayList<Developer> developer = DeveloperUtil.getDeveloper();
        Developer temp = developer.get(0);
        for (int i = 0; i < developer.size(); i++) {
            if (developer.get(i).getSalary() > temp.getSalary()) {
                temp = developer.get(i);
            }
        }
        System.out.println(temp.getName() + " " + temp.getSecondName() + " " + temp.getSalary());
    }

    private static void getMaxSalarySystem_Adm() {
        ArrayList<SystemAdm> adms = SystemAdmUtil.getSystemAdm();
        SystemAdm temp = adms.get(0);
        for (int i = 0; i < adms.size(); i++) {
            if (adms.get(i).getSalary() > temp.getSalary()) {
                temp = adms.get(i);
            }
        }
        System.out.println(temp.getName() + " " + temp.getSecondName() + " " + temp.getSalary());
    }

    private static Manager getMaxSalaryManager() {
        ArrayList<Manager> manager = ManagerUtil.getManager();
        Manager temp = manager.get(0);
        for (int i = 0; i < manager.size(); i++) {
            if (manager.get(i).getSalary() > temp.getSalary()) {
                temp = manager.get(i);
            }
        }
        System.out.println(temp.getName() + " " + temp.getSecondName() + " " + temp.getSalary());
        return temp;
    }

}


*/
