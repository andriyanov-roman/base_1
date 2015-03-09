package base_examples.LoopsHomeTasks;

/**
 * Created by b0gut on 09.03.15.
 */
public class Loops_examples {
    public static void main(String[] args) {
        int[] array = {7, 19, 15};
        int[] arrayTwo = {49, 36, 51, 50};
        int[] arrayThree = {};
        homeWorkOne(5, 8);
        homeWorkTwo(4, 9);
        homeWorkThree(array);
        homeWorkFour(arrayTwo);
        homeWorkFive(arrayThree);
        homeWorkSix(arrayThree);
        homeWorkSeven(arrayThree);
        homeWorkEight(arrayThree);
        homeWorkNinght(arrayThree);
        homeWorkTen(arrayThree);
        homeWorkEleven(arrayThree);
        homeWorkTwelve(arrayThree);
        homeWorkArrayOne(arrayTwo);
        homeWorkArrayTwo(arrayTwo);
        homeWorkArrayThree(arrayTwo);
    }

    static void homeWorkOne(int firstNumber, int secondNumber) {
        secondNumber = firstNumber + secondNumber;
        firstNumber = secondNumber - firstNumber;
        secondNumber = secondNumber - firstNumber;
        System.out.println(" change firstNumber = " + firstNumber);
        System.out.println(" change secondNumber = " + secondNumber);
        System.out.println("-------------------------------");
    }

    static void homeWorkTwo(int firstNumber, int secondNumber) {
        int c = firstNumber;
        firstNumber = secondNumber;
        secondNumber = c;
        System.out.println(" change firstNumber = " + firstNumber);
        System.out.println(" change secondNumber = " + secondNumber);
        System.out.println("-------------------------------");
    }

    public static void homeWorkThree(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("maximum is - " + max);
        System.out.println("-------------------------------");
    }

    public static void homeWorkFour(int[] arrayTwo) {
        {
            int max = arrayTwo[0];
            int preMax = arrayTwo[0];
            for (int i = 0; i < arrayTwo.length; i++) {
                if (arrayTwo[i] > max) {
                    max = arrayTwo[i];
                }
                if (arrayTwo[i] > preMax && arrayTwo[i] < max) {
                    preMax = arrayTwo[i];
                }
            }
            System.out.println("Maximum is - " + max);
            System.out.println("preMaximum is - " + preMax);

        }
        System.out.println("-------------------------------");
        System.out.println("HOME WORK CIRCLE");
        System.out.println();
    }

    public static void homeWorkFive(int[] arrayThree) {
        for (int i = 1000; i < 10000; i += 3) {
            System.out.print("  " + i);
        }
        System.out.println();
        System.out.println("-------------------------------");
    }

    public static void homeWorkSix(int[] arrayThree) {
        int firstNumber = 1;
        for (int i = 1; i <= 55; i++) {
            System.out.print("  " + firstNumber);
            firstNumber += 2;

        }
        System.out.println();
        System.out.println("-------------------------------");
    }

    public static void homeWorkSeven(int[] arrayThree) {

        for (int i = 90; i >= 0; i -= 5) {

            System.out.print("  " + i);
        }
        System.out.println();
        System.out.println("-------------------------------");
    }

    public static void homeWorkEight(int[] arrayThree) {
        int firstNumber = 2;
        for (int i = 1; i <= 20; i++) {

            System.out.print("  " + firstNumber);
            firstNumber *= 2;
        }
        System.out.println();
        System.out.println("-------------------------------");
    }

    public static void homeWorkNinght(int[] arrayThree) {
        int firstNumber = 0;
        int secondNumber = 1;
        System.out.print("Fibonacci number  : ");
        for (int i = 0; i < 20; i++) {
            firstNumber = firstNumber + secondNumber;
            secondNumber = firstNumber - secondNumber;

            System.out.print("");
            System.out.print("  " + firstNumber);
        }
        System.out.println();
        System.out.println("-------------------------------");
    }

    public static void homeWorkTen(int[] arrayThree) {
        int naturalNumber = 100;
        System.out.println("naturalNumber - " + naturalNumber);
        for (int i = 1; i <= naturalNumber; i++) {
            if ((naturalNumber % i) == 0) {
                System.out.println("denominator - " + i);
            }
        }
        System.out.println();
        System.out.println("-------------------------------");
    }

    public static void homeWorkEleven(int[] arrayThree) {
        int naturalNumberFirst = 200;
        System.out.println("natural Number First - " + naturalNumberFirst);
        int naturalNumberSecond = 440;
        System.out.println("natural Number Second - " + naturalNumberSecond);
        for (int i = 1; i <= naturalNumberFirst; i++) {
            for (; i <= naturalNumberSecond; i++) {
                if ((naturalNumberFirst % i) == 0 && (naturalNumberSecond % i) == 0) {
                    System.out.println("denominator for two natural numbers - " + i);
                }
            }
        }
        System.out.println();
        System.out.println("-------------------------------");
    }

    public static void homeWorkTwelve(int[] arrayThree) {
        int numberOfLuckyTickets = 0;
        for (int i = 0000001; i <= 999999; i++) {
            int firstPoint = i % 10;
            int secondPoint = (i / 10) % 10;
            int thirdPoint = (i / 100) % 10;
            int fourPoint = (i / 1000) % 10;
            int fifthPoint = (i / 10000) % 10;
            int sixPoint = (i / 100000) % 10;
            if ((firstPoint + secondPoint + thirdPoint) == (fourPoint + fifthPoint + sixPoint)) {
                numberOfLuckyTickets++;
            }
        }
        System.out.println("number Of Lucky Tickets : " + numberOfLuckyTickets);
        System.out.println();
        System.out.println("-------------------------------");
        System.out.println("HOME WORK ARRAY");
        System.out.println();
    }

    public static void homeWorkArrayOne(int[] arrayTwo) {
        for (int i = 0; i < arrayTwo.length; i++) {
            if (arrayTwo[i] % 2 == 0) {
                System.out.println("парные числа одномерного массива - " + arrayTwo[i]);
            }
        }
        System.out.println("-------------------------------");
    }

    public static void homeWorkArrayTwo(int[] arrayTwo) {
        for (int i = arrayTwo.length - 1; i >= 0; i--) {
            System.out.println("число массива в обратном порядке " + arrayTwo[i] + " index - " + i);

        }
        System.out.println("-------------------------------");
    }

    public static void homeWorkArrayThree(int[] arrayTwo) {
        for (int i = 0; i < arrayTwo.length / 2; i++) {
            System.out.println("first part of array : " + arrayTwo[i] + " index - " + i);
        }
        for (int i = arrayTwo.length / 2; i < arrayTwo.length; i++) {
            System.out.println("second part of array : " + arrayTwo[i] + " index - " + i);
        }
        System.out.println("-------------------------------");
    }

}

