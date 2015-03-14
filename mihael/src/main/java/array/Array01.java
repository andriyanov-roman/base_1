package array;

/**
 * Created by Администратор on 09.03.2015.
 */
public class Array01 {
    //1.	Вывести в консоль все парные числа одномерного массива

    static int[] a = {1,2,3,4,5,6,7,8,9,10};
    public static void main (String[] args){
        showPar(a);
    }
    public static void showPar( int[] ar) {

        for(int i =0; i<ar.length; i++){
            if (a[i]%2==0){
                System.out.println(a[i]);
            }
        }
    }

}