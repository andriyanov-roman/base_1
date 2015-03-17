package homework.homework2;
import java.util.ArrayList;

public class Org { // Создаем класс-шаблон ("формочку для печенек")
    private String orgName; // Объявляем поле ("филд", "состояние", "параметр") класса
    private Employee[] employees; // Объявляем еще одно поле класса. Их может быть сколько угодно
    // Поскольку поля класса "приватные", нам нужно обеспечить доступ к ним из других методов программы.
    // Доступ для чтения/изменения внутри класса-шаблона не зависит от модификатора (public/private)
    public void setOrgName(String orgName) { this.orgName = orgName; }
    public String getOrgName() { return orgName;}
    public void setEmployees(Employee[] employees) { this.employees = employees; }
    public Employee[] getEmployees() { return employees; }
}
