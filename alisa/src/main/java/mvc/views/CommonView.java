package mvc.views;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by admin on 22.04.15.
 */
public abstract class CommonView {
    private Scanner scanner = new Scanner(System.in);//public


    public abstract void showMenu()throws IOException ;

    public Scanner getScanner() {
        return scanner;
    }


}
