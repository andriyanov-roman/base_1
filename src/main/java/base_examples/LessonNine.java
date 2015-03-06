package base_examples;


public class LessonNine {
    public static void main(String[] args) {
        int a = 1, b = 3, c = 3;
        findMax(a, b, c);
        int[] array = {4, 2, 5, 2, 56};
        for (int i : array) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int[] summArr(int[] arrOne, int[] arrTwo) {
        int[] summArr = new int[arrOne.length + arrTwo.length];
        int index = 0;
        for (int i = 0; i < summArr.length; i++) {
            if (i < arrOne.length) {
                summArr[i] = arrOne[i];
            } else {
                summArr[i] = arrTwo[index];
                index++;
            }
        }
        return summArr;
    }

    public static void findMax(int a, int b, int c) {
        if (a > b) {
            if (a > c) {
                System.out.println("a is max");
            } else if (a == c) {
                System.out.println("a=c & they're max");
            } else {
                System.out.println("c is max");
            }
        } else {
            if (a == b) {
                if (b > c) {
                    System.out.println("a=b & they're max");
                } else if (b == c) {
                    System.out.println("they're all equal");
                } else {
                    System.out.println("c is max");
                }
            } else if (b > c) {
                System.out.println("b is max");
            } else if (b == c) {
                System.out.println("b=c & they're max");
            }
        }
        System.out.println("\n");
    }

    public static int[] returnArray(int[] arrayOne, int[] arrayTwo) {
        int[] resultArray = new int[arrayOne.length + arrayTwo.length];
        for (int i = 0; i < resultArray.length; i++) {
            if (i < arrayOne.length) {
                resultArray[i] = arrayOne[i];
            } else {

                resultArray[i] = arrayTwo[i - arrayOne.length];
            }

        }
        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(" " + resultArray[i]);
        }
        return resultArray;

    }
}
