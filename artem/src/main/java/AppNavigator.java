import view.BaseView;
import view.consoleApp.CommonView;
import view.consoleApp.CompanyView;

import java.util.Scanner;


public class AppNavigator {
    private Scanner scanner = new Scanner(System.in);

    public void startProgram(){
        BaseView.startProgram();
        while (scanner.hasNext()) {
            switch (scanner.next()){
                case "1":
                    CommonView commonView = new CommonView(scanner);
                    if ("return".equals(commonView.selectProject())) startProgram();
                    CompanyView companyView = new CompanyView(scanner);
                    if ("Company Util".equals(commonView.selectProject())) ;
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