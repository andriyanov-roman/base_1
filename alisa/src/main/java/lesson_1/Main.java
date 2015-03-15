package lesson_1;

import java.util.Scanner;

/**
 * Created by user on 09.03.2015.
 */
public class Main {
    public static void main(String args[]) {
        start();
    }

    public static void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter command key" + " " +
                "0.Show all users \t 1. Login coincides with the name \n " +
                "2. Login coincides with the secondName \t 3.Sort by id \n 4. Identical Employees \t 5.MaxSalary"+
        "6. sort by salary");
        while (scanner.hasNext()) {
            switch (scanner.next()) {
                case "0":
                    showUsers();
                    break;
                case "1":
                    checkUsersLogin();
                    break;
                case "2":
                    checkUsersName();
                    break;
                case "3":
                sortById();
                    break;
                case "4":
                  getIdenticalEmployees();
                 break;
              case "5":
                 EmployeeMaxSalary();
                break;
                case "6":
                    sortBySalary();
                    break;
                //case "Exit":
                // System.exit(0);
                //default:
                //System.out.println("No such case");
            }
        }

    }


    public static void showUsers() {
        User[] users = UsersUtil.getUsers();
        for (int i = 0; i < users.length; i++) {
            System.out.println(users[i].name + " " + users[i].secondName);

        }
    }

    public static void checkUsersLogin() {
        User[] users = UsersUtil.getUsers();
        for (int i = 0; i < users.length; i++) {
            if (users[i].name.equals(users[i].login)) {
                System.out.println(users[i].name + " " + "" + users[i].secondName + " " + "" + users[i].login);
            }if (users[i].login.equals(users[i].secondName)) {
                System.out.println(users[i].name + " " + "" + users[i].secondName + " " + "" + users[i].login);
            }
        }
    }

    public static void checkUsersName() {
        User[] users = UsersUtil.getUsers();
        for (int i = 0; i < users.length; i++) {
            for (int j = 0; j < users.length; j++) {
                if (users[i].name.equals(users[j].name)) {
                    System.out.println(users[i].name + " " + "" + users[i].secondName + " " + "" + users[i].login);
                }
                break;
            }
        }
    }
    public static void sortById() {
        User[] users = UsersUtil.getUsers();
        for (int i = users.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (users[j].id > users[j + 1].id) {
                    User tmp = users[j];
                    users[j] = users[j + 1];
                    users[j + 1] = tmp;
                }
            }
        }
        for (int i = 0; i < users.length; i++) {
            System.out.println(users[i].name + " " + users[i].secondName + " "+ users[i].id);

        }

    }
   public static void getIdenticalEmployees (){
      Employee [] employees = EmployeeUtil.getEmployees();
      for (int i = 0; i < employees.length; i++) {
           for (int j = 0; j < employees.length; j++) {
              if (employees[i].name.equals(employees[j].name)) {
                 System.out.println(employees[i].name + " " + "" + employees[i].surname);
              }
              break;
           }
       }
   }
  public static void EmployeeMaxSalary(){
      Employee [] employees = EmployeeUtil.getEmployees();
      Employee maxSalary = employees [0];
      for (int i = 0; i <employees.length ; i++) {
          if(employees[i].salary > maxSalary.salary ){
                maxSalary = employees[i];
                }

           }
      System.out.println(maxSalary.name + " "+ maxSalary.surname + " "+ maxSalary.salary);
        }
    public static void sortBySalary(){
        Employee [] employees = EmployeeUtil.getEmployees();
        for (int i = employees.length -1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (employees[j].salary < employees[j - 1].salary) {
                    Employee tmp = employees[j];
                    employees[j] = employees[j - 1];
                    employees[j - 1] = tmp;
                }
            }
        }
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].name + " " + employees[i].surname + " "+ employees[i].salary);

        }

    }
    }






