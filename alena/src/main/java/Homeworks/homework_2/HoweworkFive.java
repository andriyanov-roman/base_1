package Homeworks.homework_2;

/**
 * Created by lbondarenko on 11.12.2014.
 */
public class HoweworkFive {
    public static void main(String[] args) {

        System.out.println("* first task *");
        int [] arrayOne = {2, 4, 7, 22, 23, 44, 33, 13, 25, 30};
        for (int i = 0; i < arrayOne.length; i++) {
            System.out.println(arrayOne[i]);
        }

        System.out.println("* second task *");

        for (int i = 0; i < arrayOne.length / 2; i++){
            System.out.println(arrayOne[i]);
        }

        System.out.println("* third task *");

        for (int i = arrayOne.length / 2; i < arrayOne.length; i++) {
            System.out.println(arrayOne[i]);
        }

        System.out.println("* fourth task *");

        for (int i = 1; i < arrayOne.length; i+=2 ) {
            System.out.println(arrayOne[i]);
        }

        System.out.println("* fifth task *");

        for (int i = arrayOne.length-1; i >= 0; i--){
            System.out.println(arrayOne[i]);
        }

        System.out.println("* sixth task *");

        for (int i = arrayOne.length - 1; i >= arrayOne.length / 2; i--){
            System.out.println(arrayOne[i]);
        }

        System.out.println("* seventh task *");

        for (int i = arrayOne.length / 2; i > 0; i--) {
            System.out.println(arrayOne[i]);
        }

        System.out.println("* eighth task *");

        int sum = 0;

        for (int i = 0; i < arrayOne.length; i++ ) {
            sum = sum + arrayOne[i];
        }
        System.out.println(sum);

        System.out.println("* ninth task *");

        System.out.println(sum / arrayOne.length);

        System.out.println("* tenth task *");

        int sum1 = 0;

        for (int i = 0; i < arrayOne.length/2; i++) {
            sum1 = arrayOne[i] + sum1;
        }
        System.out.println(sum1 / arrayOne.length);

        System.out.println("* eleventh task *");

        int sum2 = 0;

        for (int i = arrayOne.length / 2; i < arrayOne.length; i++) {
            sum2 = sum2 + arrayOne[i];
        }
        System.out.println(sum2 / arrayOne.length);

        System.out.println("* twelfth task *");

        if ((sum1/arrayOne.length) > (sum2/ arrayOne.length)) {
            for (int i = 0; i < arrayOne.length/2; i++) {
                System.out.println(arrayOne[i]);
            }

        } else if ((sum1 / arrayOne.length) < (sum2 / arrayOne.length)) {
           for (int o = arrayOne.length / 2; o < arrayOne.length; o++){
               System.out.println(arrayOne[o]);
           }

        }



    }


}
