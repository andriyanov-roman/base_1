package HomeWork;


public class Recursion {
    public static int[] mas = {10, 15, 9, -3, 12, 6, -9, 0, 11,2,3,5,6};
    static int i = 0;

    public static void main(String[] args) {
        array();
    }

    public static void array() {
        if (i < mas.length / 2) {
            System.out.print(mas[i] + " ,");
            i++;
            array();
            i++;
            System.out.print(mas[i] + " ,");
        }


    }

}


