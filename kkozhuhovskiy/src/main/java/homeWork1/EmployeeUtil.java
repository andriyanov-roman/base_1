package homeWork1;

/**
 * Created by Kirill on 12.03.2015.
 */
public class EmployeeUtil implements Comparable {
    public  static EmployeeUser[] getEmployeeUser(){
        EmployeeUser  eU1 = new EmployeeUser();
        eU1.salary = 20000;
        eU1.name = "Arina";
        eU1.secondName = "Bashik";

        EmployeeUser  eU2 = new EmployeeUser();
        eU2.salary = 40000;
        eU2.name = "Dima";
        eU2.secondName = "Kozh";


        EmployeeUser  eU3 = new EmployeeUser();
        eU3.salary = 60000;
        eU3.name = "Kir";
        eU3.secondName = "Kozh";

        return new EmployeeUser[]{eU1, eU2, eU3};

    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
