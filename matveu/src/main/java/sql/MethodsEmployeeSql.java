package sql;

import apps.Employees.Employee;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MethodsEmployeeSql {
    private static final String INSERT_NEW="INSERT INTO matveutest.employee VALUES(?,?,?,?,?,?)";


    public static void selectFromBD() throws SQLException {
        Statement statement=DBWorker.getConnection().createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM matveutest.employee");
        while (resultSet.next()){
            Employee employee=new Employee();
            employee.setId(resultSet.getInt("idemployee"));
            employee.setName(resultSet.getString("name"));
            employee.setSecondName(resultSet.getString("secondname"));
            employee.setSex(resultSet.getString("sex"));
            employee.setAge(resultSet.getInt("age"));
            employee.setSalary(resultSet.getInt("salary"));
            System.out.println(employee.toString());
        }
    }
    public static void insertInToBD()throws SQLException{
        PreparedStatement preparedStatement=DBWorker.getConnection().prepareStatement(INSERT_NEW);
        preparedStatement.setInt(1,5);
        preparedStatement.setString(2,"Vika");
        preparedStatement.setString(3,"Malina");
        preparedStatement.setString(4,"woman");
        preparedStatement.setInt(5,27);
        preparedStatement.setInt(6,7500);
        preparedStatement.execute();



    }
}





