package company;

import entity.Employee;
import entity.staff.Admin;
import entity.staff.Manager;
import entity.staff.Programmer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by user on 23.03.2015.
 */

public class TechnicalStaffMethods {
    private Scanner scanner = new Scanner(System.in);


    public void start() throws IOException {
        System.out.println("Enter command key: " +
                "\n 0.Show Admin MaxSalary " +
                "\n 1. Show Manager MaxSalary" +
                "\n 2. Show Programmer MaxSalary" +
                "\n 3. Show Technical Staff MaxSalary \n");
        while (scanner.hasNext()) {
            switch (scanner.next()) {
                case "0":
                    getAdminMaxSalary();
                    break;
                case "1":
                    getManagerMaxSalary();
                    break;
                case "2":
                    getProgrammerMaxSalary();
                    break;
                case "3":
                    getTechnicalStaffMaxSalary();
                    break;
                case "Exit":
                    System.exit(0);
                default:
                    System.out.println("No such case");
            }
        }
    }


    public ArrayList<Admin> getAdmins(String path, String regExp) throws IOException {
        ArrayList<String[]> strings = CompanyUtil.readFromFile(path, regExp);
        ArrayList<Admin> admins = new ArrayList<>();
        for (int i = 0; i < strings.size(); i++) {
            Admin a = new Admin();
            a.setName(strings.get(i)[0]);
            a.setSurname(strings.get(i)[1]);
            a.setSalary(Double.valueOf(strings.get(i)[2]));
            a.setPlatformName(strings.get(i)[3]);
            admins.add(a);
        }

        return admins;
    }

    public ArrayList<Manager> getManagers(String path, String regExp) throws IOException {
        ArrayList<String[]> strings = CompanyUtil.readFromFile(path, regExp);
        ArrayList<Manager> managers = new ArrayList<>();
        for (int i = 0; i < strings.size(); i++) {
            Manager m = new Manager();
            m.setName(strings.get(i)[0]);
            m.setSurname(strings.get(i)[1]);
            m.setSalary(Double.valueOf(strings.get(i)[2]));
            m.setProjectName(strings.get(i)[3]);
            managers.add(m);
        }

        return managers;
    }

    public ArrayList<Programmer> getProgrammers(String path, String regExp) throws IOException {
        ArrayList<String[]> strings = CompanyUtil.readFromFile(path, regExp);
        ArrayList<Programmer> programmers = new ArrayList<>();
        for (int i = 0; i < strings.size(); i++) {
            Programmer p = new Programmer();
            p.setName(strings.get(i)[0]);
            p.setSurname(strings.get(i)[1]);
            p.setSalary(Double.valueOf(strings.get(i)[2]));
            p.setLanguageName(strings.get(i)[3]);
            programmers.add(p);
        }

        return programmers;
    }


    public Admin getAdminMaxSalary() throws IOException {
        ArrayList<Admin> admins = getAdmins("alisa\\src\\result\\Admin.txt", ":");
        Admin AdminMaxSalary = admins.get(0);
        for (int i = 0; i < admins.size(); i++) {
            if (admins.get(i).getSalary() > AdminMaxSalary.getSalary()) {
                AdminMaxSalary = admins.get(i);

            }
        }
        System.out.println(AdminMaxSalary.toString());
        return AdminMaxSalary;
    }

    public Manager getManagerMaxSalary() throws IOException {
        ArrayList<Manager> managers = getManagers("alisa\\src\\result\\Manager.txt", ":");
        Manager ManagerMaxSalary = managers.get(0);
        for (int i = 0; i < managers.size(); i++) {
            if (managers.get(i).getSalary() > ManagerMaxSalary.getSalary()) {
                ManagerMaxSalary = managers.get(i);

            }
        }
        System.out.println(ManagerMaxSalary.toString());
        return ManagerMaxSalary;
    }

    public Programmer getProgrammerMaxSalary() throws IOException {
        ArrayList<Programmer> programmers = getProgrammers("alisa\\src\\result\\Programmer.txt", ":");
        Programmer ProgrammerMaxSalary = programmers.get(0);
        for (int i = 0; i < programmers.size(); i++) {
            if (programmers.get(i).getSalary() > ProgrammerMaxSalary.getSalary()) {
                ProgrammerMaxSalary = programmers.get(i);

            }
        }
        System.out.println(ProgrammerMaxSalary.toString());
        return ProgrammerMaxSalary;
    }

    private void getTechnicalStaffMaxSalary() throws IOException {
        ArrayList staff = new ArrayList();
        staff.add(getAdminMaxSalary());
        staff.add(getManagerMaxSalary());
        staff.add(getProgrammerMaxSalary());
        Object bestWorker = staff.get(0);
        for (int i = 0; i < staff.size(); i++) {
            if (((Employee) staff.get(i)).getSalary() > ((Employee) bestWorker).getSalary()) {
                bestWorker = staff.get(i);
            }
        }
        Employee e = (Employee) bestWorker;
        System.out.println(e.toString());

    }
}



