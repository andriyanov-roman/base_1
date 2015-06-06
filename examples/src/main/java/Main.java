import cons.company.Employee;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

/**
 * Created by Администратор on 25.04.2015.
 */
public class Main {
    private static final int PERCENTAGE = 5;
    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
    public static void main(String[] args) throws ParseException {
        ArrayList<Employee> employees = getFromFile();
        for (int i = 0; i < employees.size(); i++) {
            Random random = new Random();
            int day = random.nextInt(28);
            int month = random.nextInt(12);
            employees.get(i).setDateOfEmployment(LocalDate.of(1999 + i, month, day));
        }
        writeToFile(employees);
        List<Double> doubles = new ArrayList<>();
        doubles = new LinkedList<>();
        doSomething(doubles);
    }

    private static void writeToFile(ArrayList<Employee> employees) {

    }

    private static ArrayList<Employee> getFromFile() {
        return null;
    }

    public  ArrayList<ReportObject> getFullYears(Employee e) {
        ArrayList<ReportObject> report = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            ReportObject object = new ReportObject();
            if((i % 12) == 0) {
                Integer percenteg = object.getPercentage();
                object.setPercentage(percenteg += PERCENTAGE);
            }
        }
        return report;
    }

    public static List<? extends Number> doSomething(Collection<? extends Number> list) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        return integerList;
    }
}
