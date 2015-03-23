package array;

/**
 * Created by Администратор on 21.03.2015.
 */
public class Array {
    static int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    static int[] a2 = {6, 7, 8, 9, 10};

    public static void main(String[] args) {
        System.out.println("1.\t1.\tВывести в консоль все парные числа одномерного массива");
        //showPar(a);
        System.out.println("2.\tВывести все числа одномерного массива в обратном порядке");
        //showInvertOrder(a);
        System.out.println("3.\tВывести первую и вторую половину одномерного массива");
        //show2HalfOfArray(a);
        System.out.println("4.\tВывести первую и вторую половину одномерного массива в обратном порядке");
        //show2HalfOfArrayInvertOrder();
        System.out.println("5.\tНайти сумму все элементов в массиве");
        sumArray(a);

    }

    //	1.	Вывести в консоль все парные числа одномерного массива
    public static void showPar(int[] ar) {

        for (int i = 0; i < ar.length; i++) {
            if (a[i] % 2 == 0) {
                System.out.println(a[i]);
            }
        }
    }

    //2.	Вывести все числа одномерного массива в обратном порядке
    public static void showInvertOrder(int[] ar) {
        for (int i = ar.length - 1; i >= 0; i--) {
            System.out.println("i "+ i + " a[i] " + ar[i]);
            //System.out.println(a[i]);
        }
    }



    //3.	Вывести первую и вторую половину одномерного массива");
    public static void show2HalfOfArray (int[] a){
        int half = getHalfOfArray(a);
        System.out.println("first half");

        showArrayFromTo(a, 0,half);

        System.out.println("second half");

        showArrayFromTo(a, half, a.length);
    }
    public static int getHalfOfArray( int[] ar) {
        int len= ar.length;
        if (len%2 ==0){
            return (len/2);
        }else {
            return (len +1)/2;
        }
    }

    public static void showArrayFromTo( int[] ar,int from, int to) {
        for (int i = from; i < to; i++) {
            System.out.println(ar[i]);
        }
    }


    //4.	Вывести первую и вторую половину одномерного массива в обратном порядке


    public static void  show2HalfOfArrayInvertOrder(){
        int half = getHalfOfArray(a);
        System.out.println("half is " + half);

        System.out.println("first half");
        showInvertOrder(getArrayFromTo(a,0,half));

        System.out.println("second half");
        showInvertOrder(getArrayFromTo(a,half,a.length));
    }

    public static int[] getArrayFromTo( int[] ar,int from, int to) {
        int lenArray = (to - from);
        int[] array = new int[lenArray];
        for(int i =from,k=0; i<to; i++,k++){
            array[k] = ar[i];
            //System.out.println("k " + k +" array[k]" + array[k]);
            //System.out.println("i " + i +" ar[i]" + ar[i]);
        }
        for(int j=0; j < array.length;j++){
            System.out.println(array[j]);
        }
        return array;

    }

    //5.	Найти сумму все элементов в массиве
    public static void sumArray(int[] a){
        int summ = 0;
        for (int i = 0; i<a.length;i++){
            summ += a[i];
        }
        System.out.println("Summ of arrays elements is " + summ);
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

    public static void showArray( int[] ar) {

        for(int i =0; i<ar.length; i++){
            System.out.println(ar[i]);
        }
    }
}
