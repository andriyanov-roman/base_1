/**
 * Created by User on 05.07.2015.
 */
public class ForLoop {
    public static void main(String[] args) {
        int num = 14;
        boolean isPrime;

        if (num < 2) isPrime = false;
        else isPrime = true;

        for (int i = 2; i < num/i; i++){
            if((num%i) == 0){
                isPrime = false;
                break;
            }
        }
        if (isPrime) System.out.println("Prime");
        else System.out.println("Not Prime");
    }
}
