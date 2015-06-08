package entities;

import entities.mvc.CommonModel;
import entities.mvc.CommonView;

/**
 * Created by R-Tem on 17.05.2015.
 */
abstract public class CommonApp {// абстрактный класс-родитель всех програмок моего модуля
    protected CommonView view;
    protected CommonModel model;
    //---------------------------------------
    abstract public void run(); // абстрактный метод который необходимо переопределять всем наследникам класса
}
