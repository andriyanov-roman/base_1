package base_examples;

import java.util.Scanner;


public class ConsoleReader {
    public static void main(String[] args) {
        start();
    }

    public static void start() {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            switch (scanner.next()) {
                case "1":
                    System.out.println("Hello");
                    break;
                case "2":
                    System.out.println("How are you?");
                    break;
                default:
                    System.out.println("do not have such option");
            }
        }
    }

}
