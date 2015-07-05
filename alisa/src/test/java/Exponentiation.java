/**
 * Created by User on 05.07.2015.
 */
public class Exponentiation {
    public static void main(String[] args) {
        int number = 5;
        int secondNumber = number;
        int degree = 2;
        int i = 0;
        while (i <= degree){

            number = number * secondNumber;
            i++;
        }
        System.out.println(number);
        i = 1;
        int result = 1;
        int factorial = 5;
        while (i<=factorial){
            result=result*i;
            i++;
        }
        System.out.println(result);
    }
}
