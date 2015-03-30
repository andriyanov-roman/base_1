package entity;

import lessons.lesson_2.Company;
import lessons.lesson_2.CompanyUtil;
import lessons.lesson_2.Employee;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by user on 23.03.2015.
 */

public class Methods{
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<Company>companies = new ArrayList<>();
    public void start() throws IOException {
        System.out.println("Enter command key: " +
                "\n 0.Show MaxSalary \n ");
        while (scanner.hasNext()) {
            switch (scanner.next()) {
                case "0":
                    //showMaxSalaryAdmin();
                    break;
                case "Exit":
                    System.exit(0);
                default:
                    System.out.println("No such case");
            }
        }
    }


    public static ArrayList<String[]> readFromFile(String path, String regExp) throws IOException {
        File file = new File(path);
        FileReader reader = new FileReader(file);
        BufferedReader buffer = new BufferedReader(reader);
        String line;
        ArrayList<String[]> strings = new ArrayList<>();
        while ((line = buffer.readLine()) != null) {
            String[] pool = line.split(regExp);
            strings.add(pool);
        }
        return strings;
    }

    public ArrayList<Admin> getAdmins (String path, String regExp) throws IOException {
        ArrayList<String[]> strings = readFromFile(path, regExp);
        ArrayList<Admin> admins = new ArrayList<>();
        String line;
        for (int i = 0; i < strings.size(); i++) {
            Admin a = new Admin();
            a.setName(strings.get(i)[1]);
            a.setSurname(strings.get(i)[2]);
            a.setSalary(Double.valueOf(strings.get(i)[3]));
            a.setPlatformName(strings.get(i)[4]);
            admins.add(a);
        }

        return admins;
    }

   /*public void showMaxSalary() throws IOException {
       ArrayList<Admin> admins = getAdmins("alisa\\src\\result\\Admin", ":");
        for (int i = 0; i < admins.size(); i++) {
            Admin temp =admins.get(i).getAdmins().get(0);
            for (int j = 0; j < admins.get(i).getAdmins().size(); j++) {
                double salary = admins.get(i).getAdmins().get(j).getSalary();
                if (temp.getSalary() < salary) {
                    temp = admins.get(i).getAdmins().get(j);
                }
            }
            System.out.println(temp.getName() + " " + temp.getSalary());
        }

    }*/
   /*private   showMaxSalaryAdmin(ArrayList<Admin> admins) {

       Admin max = admins.get(0);
       for (int i = 0; i < admins.size(); i++) {
           if(max.getSalary() < admins.get(i).getSalary()) {
               max = admins.get(i);
           }
       }
       return max;
   }
*/

}
