package entities;

import java.util.Date;

/**
 * Created by Администратор on 28.03.2015.
 */
public class Car {
    //1. Название
    String name;
    //2. Тип (типов может быть сколько угодно)
    String type;
    //3. Владелец
    String ownerName;
    //4. Номер
    String number;
    //5. Цвет
    String color;
    //6. Название фабрики на которой он может быть произведен
    String factoryName;
    //7. Статус готовности(завершена или нет)
    Boolean isReady;
    //8. Описание машины
    String description;
    //9. Цена
    double price;
    //10. Дата производства
    Date date;
}
