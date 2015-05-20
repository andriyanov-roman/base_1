package lections.lection20;

import entities.company.Employee;

import java.util.HashSet;

/**
 * Created by Programmer on 20.05.2015.
 */
public class equal {
    public static void main(String[] args){
        Employee e = new Employee();
        e.setName("Ivan");
        Employee e2 = new Employee();
        e2.setName("Ivan");
        //e2=e;
        System.out.println(e2.hashCode());
        System.out.println(e.hashCode());
        System.out.println(e.equals(e2));
        System.out.println(e==e2);

        String str = new String("test");
        String str2 = new String("test");
        System.out.println(str.equals(str2));
        System.out.println(str==str2);
        System.out.println(str.hashCode());
        System.out.println(str2.hashCode());

        String str3 = "test";
        String str4 = "test";
        System.out.println(str.equals(str3));
        System.out.println(str3==str4);
        System.out.println(str3.hashCode());
        System.out.println(str4.hashCode());


        HashSet<Employee> employeeHashSet = new HashSet<>();
        employeeHashSet.add(e2);
        employeeHashSet.contains(e2);


    }
    @Override
    public boolean equals (Object obj) {
        if (this == obj) {return true;}
        if (null == obj) {return false;}
        Employee employee = (Employee) obj;
        if(getClass()!=obj.getClass()) return false;
        //if (this.name != employee.getName()) return false;
        //if (this.name != employee.getName()) return false;
        return  true;
    }


}
