package array;

/**
 * Created by Администратор on 09.03.2015.
 */
public class Array03 {
    //3.	Вывести первую и вторую половину одномерного массива

    static int[] a = {1,2,3,4,5,6,7,8,9,10,11};

    public static int getHalfOfArray( int[] ar) {
        int len= ar.length;
        if (len%2 ==0){
            return (len/2);
        }else {
            return (len +1)/2;
        }
    }

    public static void main (String[] args){
        int half = getHalfOfArray(a);
        System.out.println("first half");
        showArrayFromTo(a,0,half);
        System.out.println("second half");
        showArrayFromTo(a,half,a.length);
    }
    public static void showArrayFromTo( int[] ar,int from, int to) {
        for(int i =from; i<to; i++){
            System.out.println(ar[i]);
        }
    }
}
