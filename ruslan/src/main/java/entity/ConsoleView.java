package entity;


import home_works.ProjectNavigator;
import home_works.car_factory.view.car_factory.CarFactoryView;
import home_works.geometric_shapes.view_shapes.ShapesView;
import home_works.university.view_university.UniversityView;

import home_works.сompany.view_company.CompanyView;
import home_works.сompany.view_company.UserView;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by user on 08.04.2015.
 */
public class ConsoleView extends ProjectNavigator {
    protected Scanner scanner;


    public ConsoleView(Scanner scanner) {
        this.scanner = scanner;
    }

    public String chooseMenu() throws Exception {
        System.out.println("Виберіть пункт, інформації, яка Вас цікавить " + "\n" +
                "1. Компанія" + "\n" +
                "2. Юзери" + "\n" +
                "3. Геометричні фігури" + "\n" +
                "4. Фабрика автомобілів" + "\n" +
                "5. Університет" + "\n" +
                "6. Вийти з меню");
        while (scanner.hasNext()) {
            switch (scanner.next()) {
                case "1":
                    new CompanyView(scanner).start();
                case "2":
                    new UserView(scanner).start();
                case "3":
                    new ShapesView(scanner).start();
                case "4":
                    new CarFactoryView(scanner).start();
                case "5":
                    new UniversityView(scanner).start();
                case "6":
                    System.exit(0);
            }
        }
        return null;
    }

}
