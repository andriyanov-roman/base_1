package sql;

import apps.Employees.Employee;

public class MainEmployeeSql {
    public static void main(String[] args) {
       //DBWorker worker=new DBWorker();
        EmployeeDaoMatveu employeeDaoMatveu=new EmployeeDaoMatveu();
        employeeDaoMatveu.selectAllEntities();



    }
}
