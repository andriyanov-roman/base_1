package fx;

import entity.Employee;

/**
 * Created by user on 25.04.2015.
 */
public class Main {
    public static void main(String[]args){
        Employee menu = new Employee();
       new SimpleMenu().startProgram(args);

    }
}
