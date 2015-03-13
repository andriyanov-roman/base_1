package homeTask1;

public class EmployeesUtil {
    public static Employee[] getEmployees() {
        Employee e1=new Employee();
        e1.name="Grisha";
        e1.secondName="Popov";
        e1.salary=10000;

        Employee e2=new Employee();
        e2.name="Alisa";
        e2.secondName="Bragina";
        e2.salary=7000;

        Employee e3=new Employee();
        e3.name="Alisa";
        e3.secondName="Bragina";
        e3.salary=7500;

        Employee e4=new Employee();
        e4.name="Vova";
        e4.secondName="Petrenko";
        e4.salary=12000;

        Employee e5=new Employee();
        e5.name="Misha";
        e5.secondName="Zaec";
        e5.salary=13000;

        Employee[] employees=new Employee[5];
        employees[0]=e1;
        employees[1]=e2;
        employees[2]=e3;
        employees[3]=e4;
        employees[4]=e5;
        return employees;

    }
}
