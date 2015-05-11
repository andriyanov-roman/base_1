package apps;

import apps.shapes.view.CommonView;
import apps.Employees.MethodsEmployees;

import java.io.IOException;
import java.util.Scanner;

public class MainDirector {
    public static void main(String[] args) throws IOException {
        makeAChoice();
    }
    public static void makeAChoice() throws IOException {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Выберите программу, в которой желаете поработать:");
        System.out.println("1. Employees");
        System.out.println("2. carFactory");
        System.out.println("3. shapes");
        while (scanner.hasNext()){
            switch (scanner.next()){
                case "1":
                    MethodsEmployees.start();
                    break;
                case "2":
                    apps.carFactory.view.CommonView.start();
                    break;
                case "3":
                    CommonView.start();
                    break;
            }
        }
    }
}
