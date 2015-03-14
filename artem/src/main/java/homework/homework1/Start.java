package homework.homework1;


import java.util.Scanner;


public class Start {
    public static void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter command key");
        while (scanner.hasNext()) {
            switch (scanner.next()) {
                case "1":
                    homework.homework1.Show.showUsers();
                    break;
                case "2":
                    homework.homework1.CheckLogin.checkLogin();
                    break;
                case "3":
                    homework.homework1.CheckSame.checkSame();
                    break;
                case "4":
                    SortedByID.sortedById();
                    break;
                case "0":
                    System.exit(0);//системный метод завершения программы
                default:
                    System.out.println("No such case");
            }
        }
    }
}
