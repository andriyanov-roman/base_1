package cons;

import cons.company.Employee;

/**
 * Created by user on 4/5/2015.
 */
public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{1, 4, 2, 54};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int a;
        a = 5;
        int[] arr;
        arr = new int[]{1, 4, 2, 54, 6};
        Employee e = new Employee();
        e.setName("Ivan");
        check(e);
        System.out.println(e.getName());

    }

    public static void check(Employee e) {
        e.setName("Vasya");
    }
}
