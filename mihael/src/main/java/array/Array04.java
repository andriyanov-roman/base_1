package array;

/**
 * Created by Администратор on 09.03.2015.
 */
public class Array04 {
    //4.	Вывести первую и вторую половину одномерного массива в обратном порядке

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
        System.out.println("half is " + half);

        System.out.println("first half");
        showInvertOrder(getArrayFromTo(a,0,half));

        System.out.println("second half");
        showInvertOrder(getArrayFromTo(a,half,a.length));
    }
    public static void showArrayFromTo( int[] ar,int from, int to) {
        for(int i =from; i<to; i++){
            System.out.println(ar[i]);
        }
    }
    public static int[] getArrayFromTo( int[] ar,int from, int to) {
        int lenArray = (to - from);
        int[] array = new int[lenArray];
        for(int i =from,k=0; i<to; i++,k++){
            array[k] = ar[i];
            System.out.println("k " + k +" array[k]" + array[k]);
            System.out.println("i " + i +" ar[i]" + ar[i]);
        }
        return array;
    }
    public static int[] invertedOrderArray( int[] ar) {
        int len = ar.length;
        int [] inverted = new int[len];

        for(int i =len-1; i>=0; i--){
            inverted[len-1-i]=ar[i];
            return inverted;
        }
        return inverted;
    }

    public static void showInvertOrder( int[] ar) {
        for(int i =ar.length-1; i>=0; i--){
            System.out.println(ar[i]);
        }
    }

    public static void showArray( int[] ar) {

        for(int i =0; i<ar.length; i++){
            System.out.println(ar[i]);
        }
    }

}
