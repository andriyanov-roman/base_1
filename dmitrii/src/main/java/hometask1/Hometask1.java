package hometask1;

import entity.Employee;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by mit_OK! on 14.03.2015.
 */
public class Hometask1 {
    public static void startProgram () {
        Scanner scanner = new Scanner(System.in);
        welcome();
        while (scanner.hasNext()){

            switch (scanner.next()) {
                case "0":
                    showUsers();
                    break;
                case "1":
                    showUsersEqLogin();
                    break;
                case "2":
                    showUsersDuplicate();
                    break;
                case "3":
                    sortById();
                    break;
                case "4":
                    showEmployees();
                    break;
                case "5":
                    showEmployeesDuplicates();
                    break;
                case "6":
                    sortBySalary();
                    break;
                case "Exit":
                    System.exit(0);
                case "exit":
                    System.exit(0);
                default:
                    System.out.println ("No such case");
            }
            welcome();
        }
    }


    public static void welcome(){
        System.out.print (
                "\n 0.Show all users"+
                        "\n 1.Show users with equal parameters"+
                        "\n 2.Show duplicate users"+
                        "\n 3.Sort users by ID"+
                        "\n 4.Show employees"+
                        "\n 5.Show duplicate employees with higher salary"+
                        "\n 6.Sort employees by salary"+
                        "\n Exit. End program." +
                        "\nEnter command key:");
    }
    public static void showUsers() {
        User[] users = UsersUtil.getUsers();
        System.out.println("======== Total users: "+users.length+" =======\n\tShow all:");
        for (int i = 0; i < users.length; i++) {
            System.out.println(users[i].id+"). Name: "+users[i].name + "\nSurname: "+users[i].secondName);
            System.out.println("Age: "+users[i].age);
            System.out.println("Login: "+users[i].login);
            System.out.println("--------------------------");
        }
        System.out.println();
    }

    public static void showUsersEqLogin() {
        User[] users = UsersUtil.getUsers();
        for (int i = 0; i < users.length; i++) {
            if (users[i].login.equals(users[i].name) ) {
                System.out.println("Login Eq Name. Login:"+users[i].login+" = Name:"+users[i].name+" (user id="+users[i].id+")");
            }
            if ( users[i].login.equals(users[i].secondName)) {
                System.out.println("Login Eq Surname. Login:"+users[i].login + " = Surname:"+users[i].secondName+" (user id="+users[i].id+")");
            }
        }
        System.out.println();
    }

    public static void showUsersDuplicate(){
        System.out.println();
        User[] users = UsersUtil.getUsers();
        String s = "";
        Boolean iFind = false;
        for (int i = 0; i < users.length; i++) {
            for (int j = i+1; j < users.length; j++) {
                if ( users[i].name.equals(users[j].name) && users[i].secondName.equals(users[j].secondName) && !(users[j].name.isEmpty()) ) {
                    s=s+users[j].id+" ";
                    users[j].name="";
                    iFind=true;
                }
            }
            if (iFind) {
                s=s+users[i].id;
                System.out.println("Duplicates:" + users[i].name + " " + users[i].secondName + " with IDs: " + s);
                iFind=false;
                s="";
            }
        }
        System.out.println();
    }
    public static void sortById() {
        User[] users = UsersUtil.getUsers();
        int i =0;
        Random r = new Random();
        System.out.println("\nMixing IDs:");
        for (int j = 0; j < users.length; j++) {
            users[j].id=r.nextInt(10)*users[j].id+1;
            System.out.print(users[j].id+")"+users[j].login+" ");
        }
        System.out.println("\nSorting by IDs:");
        User bubble;
        for (int j = 0; j < users.length-1; j++) {
            for (int k = 0; k < users.length-1-j; k++) {
                if (users[k+1].id < users[k].id){
                    bubble = users[k+1];
                    users[k+1]=users[k];
                    users[k]=bubble;
                }
            }
        }
        for (int j = 0; j < users.length; j++) {
            System.out.print(users[j].id+")"+users[j].login+" ");
        }
        System.out.println();
    }

    public static void showEmployees() {
        Employee[] empl = EmployeeUtil.getEmployees();
        System.out.println("======== Total employees: "+empl.length+" =======\n\tShow all:");
        for (int i = 0; i < empl.length; i++) {
            System.out.println((i+1)+")"+empl[i].getName()+" "+empl[i].getSurname()+" ("+empl[i].getSalary()+"$)");
        }
        System.out.println();
    }


    public  static  void showEmployeesDuplicates (){
        System.out.println();
        Employee [] empl = EmployeeUtil.getEmployees();
        Double salCont = 0.0;
        Boolean iFind = false;
        int iCount = 1;
        for (int i = 0; i < empl.length; i++) {
            for (int j = i+1; j < empl.length; j++) {
                if (empl[i].getName().equals(empl[j].getName()) && empl[i].getSurname().equals(empl[j].getSurname()) && !(empl[j].getName().isEmpty()) ) {
                    salCont=Math.max(empl[i].getSalary(), empl[j].getSalary());
                    iCount++;
                    empl[j].setName("");
                    iFind = true;
                }
            }
            if (iFind) {
                System.out.println(empl[i].getName() + " " + empl[i].getSurname() +
                        " ("+iCount+" persons)." + " One of them with higher Salary: "+salCont+"$");
            }
            iCount=1;
            salCont=0.0;
            iFind = false;
        }
        System.out.println();
    }

    public static void sortBySalary () {
        System.out.println("\n Sorted by Salary:");
        Employee[] empl = EmployeeUtil.getEmployees();
        Employee bubble;
        for (int j = 0; j < empl.length - 1; j++) {
            for (int k = 0; k < empl.length - 1 - j; k++) {
                if (empl[k + 1].getSalary() < empl[k].getSalary()) {
                    bubble=empl[k+1];
                    empl[k+1]=empl[k];
                    empl[k]=bubble;
                }
            }
        }
        for (int j = 0; j < empl.length; j++) {
            System.out.println(empl[j].getSalary() + "$ " + empl[j].getName() + " " + empl[j].getSurname());
        }
    }
}
