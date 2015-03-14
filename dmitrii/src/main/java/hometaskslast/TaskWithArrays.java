package hometaskslast;

/**
 * Created by Dmitriy Lisunov on 09.03.2015.
 *  ================== !!!!!!!!!!! НЕЗАКОНЧЕНО !!!!!!!!!!!!!!!! ================
 *
 */
public class TaskWithArrays {
    public static void main(String[] args) {
        /*
        Минимум
1.	Вывести в консоль все парные числа одномерного массива:
 (парные = чётные ?)
int [] arr = {0, 1, 2, 3, 4, 5, 6};
for(int i = 0; i < arr.length; i++) {
	if (arr[i] % 2 == 0) {
		System.out.println(arr[i]);
	}
} // 0, 2, 4, 6
2.	Вывести все числа одномерного массива в обратном порядке:
int [] arr = {0, 1, 2, 3, 4, 5, 6};
        for(int i = arr.length; i > 0; i--) {
            System.out.println(arr[i-1]);
        }
3.	Вывести первую и вторую половину одномерного массива:
int [] arr = {0, 1, 2, 3, 4, 5, 6, 7};
        int x = (int)(arr.length/2);
        for(int i = 0; i < x; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("=== SEPARATOR ===");
         for(int i = x; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
4.	Вывести первую и вторую половину одномерного массива в обратном порядке:
int [] arr = {0, 1, 2, 3, 4, 5, 6, 7};
        int x = (int)(arr.length/2);
        for(int i = x; i >= 0; i--) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n=== SEPARATOR ===");
         for(int i = arr.length; i >=x; i--) {
            System.out.print(arr[i-1]+" ");
        }
5.	Найти сумму всех элементов в массиве:
        int [] arr = {0, 1, 2, 3, 4, 5, 6, 7};
        int sum = 0;
        for (int i = 0; i<arr.length;i++) {
            sum+=arr[i];
        }
        System.out.println(sum);
6.	Найти среднеарифметическое всех чисел массива:
int [] arr = {0, 1, 2, 3, 4, 5, 6, 7};
        int sum = 0;
        for (int i = 0; i<arr.length;i++) {
            sum+=arr[i];
        }
        float ar_mean = (float)sum /arr.length;
        System.out.println(ar_mean);
7.	Найти минимальное и максимальное число в массиве:
        int [] arr = {0, 1, 7256, -5, 4, -99, 6, 1024};
        int min_v = arr[0];
        int max_v = arr[0];
        for (int i = 1; i<arr.length;i++){
            if (min_v>arr[i]) {min_v=arr[i];}
            else if (max_v<arr[i]) {max_v=arr[i];}
        }
         System.out.println("Min value="+min_v);
         System.out.println("Max value="+max_v);
8.	Заменить все отрицательные числа в массиве на 0:
int [] arr = {-150, 1, 7256, -5, 4, -99, 6, 1024};
        for (int i = 0; i<arr.length;i++) {
            if (arr[i]<0) {arr[i]=0;}
            System.out.print(arr[i]+" ");
        }
9.	Подсчитать одинаковые числа в одномерном массиве:
// без проверки на нули будет примерно так:
int [] arr = {5, 1, 7256, 5, 5, -99, 5, 4, 1024, 1, 4};
        int  spec_arr [][];
        spec_arr = new int [2][arr.length] ;
        for (int j=0; j<arr.length; j++){
            spec_arr [1][j]=1;
            for (int i = 1; i<arr.length;i++) {

                if (arr[j]==arr[i]&&arr[j]!=0) {
                   spec_arr [0][j] = arr[i];
                   spec_arr [1][j]++;
                   arr[i]=0;
               }
            }
        }

            for (int i = 0; i<spec_arr[0].length;i++){
                if (spec_arr[0][i]>1 && spec_arr[1][i]>1 ){
                    System.out.println(spec_arr[0][i]+" повторялось "+spec_arr[1][i]+" раз;");
                }
            }
10.	Поменять минимальное и максимальное числа в массиве местами
11.	Инвертировать массив
Среднее
12.	Вывести в консоль половину массива, среднеарифметическое которых является наибольшим
13.	Найти индексы положительных чисел и сумму отрицательных чисел в одномерном массиве
14.	Дан массив чисел, среди которых имеется один ноль. Вывести на печать все числа до нуля включительно.
15.	Написать программу, меняющую местами два наибольших элемента одномерного массива с первым и последним.
16.	Написать программу, которая выводит на экран элементы одномерного массива, которые расположены до минимального элемента всего массива

Сложные
17.	Найти сумму всех чисел находящихся между минимальным и максимальным числом в массиве:

18.	Вывести в консоль половину массива в которой находиться наименьшее число массива

Очень сложное
19.	Написать программу, которая перемещает в конец массива все элементы, значения которых находится в отрезке [a,b]


        * */
    }
}
