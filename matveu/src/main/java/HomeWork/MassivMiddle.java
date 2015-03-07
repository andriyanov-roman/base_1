package HomeWork;
import java.io.*;

public class MassivMiddle {

    // Вывести в консоль половину массива, среднеарифметическое которых является наибольшим

    public static void main(String[] args) throws IOException {

        int i=0;
        double sr1=0;
        int sum=0;
        int x;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        do {
            System.out.println("Введите четное положительное число: ");
            String s = br.readLine();
            x = Integer.parseInt(s);
        }while(x%2 !=0);

        if(x>0 && x%2==0){
            int[] mas = new int[x];
            for(i=0;i<mas.length;i++){
                mas[i]=(int)(Math.random()*21-10);
                System.out.print(mas[i]+" ");
            }
            for(i=0;i<mas.length/2;i++){
                sum=sum+mas[i];
                sr1=sum/(double)(mas.length/2);
            }
            System.out.println("Среднеарифметическое первой половины: "+sr1);


        }else{
            System.out.println("Вы ввели отрицательное число!");
        }

    }
}
