package homework.homework3;


import java.util.ArrayList;

public class OrgUtil { // Создаем класс штампующий Организации("печеньки") из определенного шаблона Org
    public static ArrayList<Org> getOrganizations() { // Создаем метод возвращающий "печеньки"
        ArrayList<Org> orgs = new ArrayList<>();
        ArrayList<Employee> employees = EmployeeUtil.getEmployees(); // Создаем массив из наштампованных "печенек" employees
                                                           // созданных посредством класса EmployeeUtil по шаблону Еmployees
        Org o1 = new Org(); // Создаем первую организзацию ("печеньку")
        o1.setOrgName("C#"); // Поле для названия заполнили сеттером setOrgName
        o1.setEmployees(new ArrayList<>()); // Поле-массив сотрудников наполнили сеттером setEmployees
        o1.getEmployees().add(employees.get(0));
        o1.getEmployees().add(employees.get(3));
        o1.getEmployees().add(employees.get(7));
        orgs.add(o1);

        Org o2 = new Org();
        o2.setOrgName("C++");
        o2.setEmployees(new ArrayList<>());
        o2.getEmployees().add(employees.get(2));
        o2.getEmployees().add(employees.get(4));
        o2.getEmployees().add(employees.get(6));
        o2.getEmployees().add(employees.get(8));
        orgs.add(o2);

        Org o3 = new Org();
        o3.setOrgName("Java");
        o3.setEmployees(new ArrayList<>());
        o3.getEmployees().add(employees.get(1));
        o3.getEmployees().add(employees.get(5));
        o3.getEmployees().add(employees.get(8));
        orgs.add(o3);

           return orgs;
           //return new Org[]{o1, o2, o3}; // Возвращаем массив созданных "печенек"
    }
}
