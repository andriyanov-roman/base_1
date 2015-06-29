package lections.lection27;

import entities.company.Employee;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Programmer on 20.06.2015.
 */
public class Lection27 {
    Map<Employee,String> map = new TreeMap<>(new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return 0;
        }
    });

}
