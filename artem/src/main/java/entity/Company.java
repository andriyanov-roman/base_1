package entity;

import java.util.ArrayList;

public class Company { // Создаем класс-шаблон ("формочку для печенек")
    private String companyName; // Объявляем поле ("филд", "состояние", "параметр") класса
    private ArrayList<Employee> employees; // Объявляем еще одно поле класса. Их может быть сколько угодно
    // Поскольку поля класса "приватные", нам нужно обеспечить доступ к ним из других методов программы.
    // Доступ для чтения/изменения внутри класса-шаблона не зависит от модификатора (public/private)
    public void setCompanyName(String companyName) { this.companyName = companyName; }
    public String getCompanyName() { return companyName;}
    public void setEmployees(ArrayList<Employee> employees) { this.employees = employees; }
    public ArrayList<Employee> getEmployees() { return employees; }
}
