package carFactory;

import entity.Car;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by lbondarenko on 08.05.2015.
 */
public class FactoryController {
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<Car> cars = new ArrayList<>();


    public static void letsBegin (){
        System.out.println ("�������� ��������: " +
        "\n 0. ��������� �����" +
                "\n 1. ����������� ��� ������ " +
        "\n 2. �������� ����� ������� ������" +
        "\n 3. �������� ������ ������ �����" );

    }
}
