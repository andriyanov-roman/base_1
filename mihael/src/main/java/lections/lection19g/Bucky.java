package lections.lection19g;

/**
 * Created by Администратор on 19.05.2015.
 * thenewboston
 */
public class Bucky {
    public static void main(String []args){
        Integer[] iray = {1,2,3,4};
        Character[] cray = {'b','u','c','y'};

        printMe(iray);
        printMe(cray);
    }

    //not generic (overload)
    /*
    public static void printMe(Integer[] i){
        for( Integer x : i)
            System.out.printf("%s ", x);
        System.out.println();
    }
    public static void printMe(Character[] i){
        for( Character x : i)
            System.out.printf("%s ", x);
        System.out.println();
    }
    */

    //generic method
    public static <T> void printMe(T[] x) {
        for(T b: x)
            System.out.printf("%s ",b);
        System.out.println();

    }
}
