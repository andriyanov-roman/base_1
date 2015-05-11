package apps.Employees;


import java.util.ArrayList;

public class ProgrammersUtil {
    public static ArrayList<Programmer> getProgrammers() {
        Programmer p1 = new Programmer("Lelik", "Bolik", "man", 25, 10000.0,"pascal");

        ArrayList<Programmer> programmers = new ArrayList<>();
        programmers.add(p1);
        return programmers;
    }
}
