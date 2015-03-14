package homeWork1;

import java.util.Scanner;

/**
 * Created by Kirill on 12.03.2015.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter comman key");
        while (scanner.hasNext()) {
            switch (scanner.next()) {
                case "1":
                    showUsers();
                case "2":
                    findMatches();
                    break;
                case "3":
                    showIdUsers();
                case "4":
                    findEmployeeUserSalary();
            }
        }
    }

    public static void findMatches() {
        User[] users = UserUtil.getUsers();
        for (int i = 0; i < users.length; i++) {
            if (users[i].login.equals(users[i].name))
                System.out.println("User " + i + " have matched login with name");
            for (int c = 0; c < users.length; c++) {
                if (users[c].login.equals(users[c].secondName))
                    System.out.println("User" + c + " have matched login with second name");
            }
        }

    }

    public static void showUsers() {
        User[] users = UserUtil.getUsers();
        for (int i = 0; i < users.length; i++) {
            System.out.print(users[i].name + " " + users[i].secondName);
        }
        System.out.println();
    }

    public static void showIdUsers() {
        User[] users = UserUtil.getUsers();
        for (int i = 0; i < users.length; i++) {
            System.out.println(users[i].name + "have id" + users[i].id);
        }
    }

    public static void maxSalary() {
       /* EmployeeUser[]  = EmployeeUtil.getEmployeeUser();
        int maxSalary=0;
        int i;
        int max=0;
        for(i=0;i<employees.length;i++){
            if(employees[i].salary>maxSalary){
                maxSalary=employees[i].salary;
                max=i;
            }*/
        EmployeeUser[] salary = EmployeeUtil.getEmployeeUser();
        int maxSalary = 0;



        }


    public static void findEmployeeUserSalary() {

        EmployeeUser[] workers = EmployeeUtil.getEmployeeUser();
        for (int i = 0; i < workers.length; i++) {
            if (workers[i].equals(workers)) ;
            System.out.println(workers[i].name + workers[i].salary + workers[i].secondName + " the same " + workers);
            }

        }

    }

