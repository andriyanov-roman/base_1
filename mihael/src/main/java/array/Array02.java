package array;

/**
 * Created by Администратор on 09.03.2015.
 */
public class Array02 {
    //2.	Вывести все числа одномерного массива в обратном порядке

    static int[] a = {1,2,3,4,5,6,7,8,9,10};
    public static void main (String[] args){
        showInvertOrder(a);
    }
    public static void showInvertOrder( int[] ar) {
        for(int i =ar.length-1; i>=0; i--){
            System.out.println(a[i]);
        }
    }
}
