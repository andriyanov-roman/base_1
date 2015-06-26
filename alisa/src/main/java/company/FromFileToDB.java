package company;

import entity.Employee;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Programmer on 26.06.2015.
 */
public class FromFileToDB {
    public static void main(String [] args) {
        try {
            selectFromBD();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void selectFromBD() throws SQLException {
        Statement statement=ConnectionFactory.createConnection().createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM matveutest.employee");
        while (resultSet.next()){
            Employee employee=new Employee();
            //employee.setId(resultSet.getInt("idemployee"));
            employee.setName(resultSet.getString("name"));
            employee.setSurname(resultSet.getString("secondname"));
            employee.setSex(resultSet.getString("sex"));
            employee.setAge(resultSet.getInt("age"));
            employee.setSalary(resultSet.getInt("salary"));
            System.out.println(employee.toString());
        }
    }
}
