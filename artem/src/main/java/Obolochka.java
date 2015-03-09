

/**
 * Created by R-Tem on 05.03.2015.
 */
import java.util.Scanner;

public class Obolochka {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in); //создаем переменную in класса Scanner
        boolean go = true; //объявляем переменную логического типа и присваиваем ей значение
        while (go) { //цикл будет повторяться пока go == true
            go = false;

            System.out.println("Продолжить:\tвведите - go\nВыйти:\t\tнажмите - Enter");
            String c = in.nextLine(); //считываем одну строку целиком
            if(c.equals("go")) go = true;
            //else go = false;
        }
    }
}
