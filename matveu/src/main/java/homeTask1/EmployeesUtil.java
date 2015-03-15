package homeTask1;

public class EmployeesUtil {
    public static Employee[] getEmployees() {
        Employee e1=new Employee("Grisha","Popov","man",25,10000.0);
        Employee e2=new Employee("Alisa","Bragina","woman",20,7000.0);
        Employee e3=new Employee("Alisa","Bragina","woman",45,7500.0);
        Employee e4=new Employee("Vova","Petrenko","man",33,12000.0);
        Employee e5=new Employee("Misha","Zaec","man",18,13000.0);
        Employee e6=new Employee("Olga","Emec","woman",21,6000.0);

        Employee[] employees=new Employee[6];
        employees[0]=e1;
        employees[1]=e2;
        employees[2]=e3;
        employees[3]=e4;
        employees[4]=e5;
        employees[5]=e6;
        return employees;

    }
}
