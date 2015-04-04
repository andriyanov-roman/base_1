package univer_project;


/**
 * Created by mit_OK! on 04.04.2015.
 */
public class UniController {
    public static void run() {
        UniView.menu();
        while (UniView.hasNext()) {
            switch (UniView.next()) {
                case "0":

                    break;
                case "1":
                    findBestUniver();
                    break;
                case "2":
                    addStudent();
                    break;
                case "3":
                    showAverageStudent();
                    break;
                case "4":
                    increaseTeacherSalary();
                    break;
                case "exit":
                case "Exit":
                case "e":
                case "E":
                    System.exit(0);
                default:
                    UniView.toPrintLN("No such case");
            }
            UniView.menu();
        }
    }

    private static void findBestUniver() {

    }

    private static void addStudent() {

    }

    private static void showAverageStudent() {

    }

    private static void increaseTeacherSalary() {

    }
}
