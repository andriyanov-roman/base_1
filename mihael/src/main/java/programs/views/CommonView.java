package programs.views;

import java.util.Scanner;

/**
 * Created by Администратор on 20.04.2015.
 */
public class CommonView {
    protected Scanner scanner = new Scanner(System.in);
    public Scanner getScanner(){
        return scanner;
    }
}
