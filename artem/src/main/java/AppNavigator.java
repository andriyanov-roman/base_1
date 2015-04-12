import view.BaseView;

import java.util.Scanner;


public class AppNavigator {
    protected Scanner scanner = new Scanner(System.in);

    public void startProgram(){
        BaseView.startProgram();
        while (scanner.hasNext()) {
            switch (scanner.next()){
                case "1":
                    break;
                case "2":
                    break;
                case "0": System.exit(0); break;
                default: System.out.println("No such case! Try again:"
                        + "\n 1 for Console Programs"
                        + "\n 2 for Swing Program"
                        + "\n 0 for Exit");
            }
        }
    }
}
