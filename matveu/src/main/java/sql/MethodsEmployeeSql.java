package sql;

import apps.Employees.Employee;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MethodsEmployeeSql {
    private static final String INSERT_NEW="INSERT INTO matveuhome.employee (name,secondname,sex,age,salary) " +
            "VALUES(?,?,?,?,?)";


    public static void selectFromBD() throws SQLException {
        Statement statement=DBWorker.getConnection().createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM matveuhome.employee");
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
        PreparedStatement preparedStatement=DBWorker.getConnection().prepareStatement("");
        preparedStatement.setString(1,"kjhhg");
        preparedStatement.setString(2,"Malina");
        preparedStatement.setString(3,"woman");
        preparedStatement.setInt(4,27);
        preparedStatement.setInt(5,7500);
        preparedStatement.execute();



    }
}





