package HomeWork;
import java.io.*;

public class MassivMiddle {

    // Вывести в консоль половину массива, среднеарифметическое которых является наибольшим

    public static void main(String[] args) throws IOException {

        int i=0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        do {
            System.out.println("Введите четное положительное число: ");
            String s = br.readLine();
            int x = Integer.parseInt(s);
        }while(x%2 !=0);

        if(x>0 && x%2==0){
            int[] mas = new int[x];
            for(i=0;i<mas.length;i++){
                mas[i]=(int)(Math.random()*21-10);
            }
        }else{
            System.out.println("Вы ввели отрицательное число!");
        }

    }
}
