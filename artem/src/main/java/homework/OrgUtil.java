package homework;


public class OrgUtil { // Создаем класс штампующий Организации("печеньки") из определенного шаблона Org
    public static Org[] getOrganizations() { // Создаем метод возвращающий "печеньки"
        Employee[] employees = EmployeeUtil.getEmployees(); // Создаем массив из наштампованных "печенек" employees
                                                            // созданных посредством класса EmployeeUtil по шаблону Еmployees

        Org o1 = new Org(); // Создаем первую организзацию ("печеньку")
        o1.setOrgName("C#"); // Поле для названия заполнили сеттером setOrgName
        o1.setEmployees(new Employee[]{employees[0], employees[3], employees[7]}); // Поле-массив сотрудников наполнили сеттером setEmployees

        Org o2 = new Org();
        o2.setOrgName("C++");
        o2.setEmployees(new Employee[]{employees[2], employees[4], employees[6], employees[8]});

        Org o3 = new Org();
        o3.setOrgName("Java");
        o3.setEmployees(new Employee[]{employees[1], employees[5], employees[6]});

        Org[] orgs = new Org[10];
        orgs[0] = o1;
        orgs[1] = o2;
        orgs[2] = o3;

        return orgs;
        //return new Org[]{o1, o2, o3}; // Возвращаем массив созданных "печенек"
    }
}
