package tmp;

import homework.homework3.OrgUtil;

import java.util.Scanner;

/**
 * Created by R-Tem on 19.03.2015.
 */
public class DmitriyCopy {
    public static Scanner scanner = new Scanner(System.in);
    public static void welcome() {
        System.out.println(
                "\n1. Get all employees from all companies" +
                "\n2. Get employee with max Salary" +
                "\n3. Sort employees" +
                "\n4. Add employees" +
                "\n5. Fire employees" +
                "\n6. Increase the salary for 15%" +
                "\n7. Add company" +
                "\n0. Exit program"
                /*"\n3. Sort employees by name" +
                "\n4. Sort employees by surname" +
                "\n5. Sort employees by salary" +
                "\n6. Sort employees by sex" +
                "\n7. Sort employees by age" +
                "\n7.Добавить сотрудника" +
                "\n8.Fire all female" +
                "\n9.Increase the salary for 15% to all" +*/

        );
    }
    /*public static void start(){
        welcome();
        while (scanner.hasNext()){
            switch (scanner.next()){
                //Каждой задаче присваивается Номер, чтобы пользователь не вводил название задачи вручную
                case "1": OrgUtil.showEmployee(); break;
                case "2": OrgUtil.getMaxSalary(); break;
                case "3": OrgUtil.sortBySecodnName(); break;
                case "4": OrgUtil.sortByAge(); break;
                case "5": OrgUtil.sortByNameLength(); break;
                case "6": OrgUtil.sortByZP(); break;
                case "7": addEmployee(); break;
                case "8": fireFemale(); break;
                case "0": System.exit(0);
                default: System.out.println ("No such case");
            }
        }
    }*/
}
