package base_examples.sorting;


public class SortingExamples {
    public static void main(String[] args) {
        int[] array = {54, 1, 4, 7, 2, 7, 8};
        insertExample(array);
        bubbleSort(array);
    }

    public static void insertExample(int[] arr) {
        int counter = 0;
        for (int i = 1; i < arr.length; i++) {
            int currElem = arr[i];
            int prevKey = i - 1;
            while (prevKey >= 0 && arr[prevKey] > currElem) {
                arr[prevKey + 1] = arr[prevKey];
                arr[prevKey] = currElem;
                prevKey--;
                counter++;
            }
        }
        System.out.println(counter);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void bubbleSort(int[] arr) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i ; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = t;
                    counter++;
                }
            }
        }
        System.out.println(counter);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
