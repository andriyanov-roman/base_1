import CarFactory.MethodsCarFactory;
import Employees.MethodsEmployees;
import Shapes.view.CommonView;

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
        System.out.println("2. CarFactory");
        System.out.println("3. Shapes");
        while (scanner.hasNext()){
            switch (scanner.next()){
                case "1":
                    MethodsEmployees.start();
                    break;
                case "2":
                    MethodsCarFactory.start();
                    break;
                case "3":
                    CommonView.start();
                    break;
            }
        }
    }
}
