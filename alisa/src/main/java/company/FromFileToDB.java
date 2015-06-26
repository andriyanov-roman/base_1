package company;

import entity.Employee;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Programmer on 26.06.2015.
 */
public class FromFileToDB {
    private static final String INSERT_NEW="INSERT INTO employee VALUES(?,?,?,?,?)";

    public static void main(String [] args) {
        try {
            selectFromBD();
            insertInToBD();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void selectFromBD() throws SQLException {
        Statement statement=ConnectionFactory.getConnection().createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM employee");
        while (resultSet.next()){
            Employee employee=new Employee();
            employee.setId(resultSet.getInt("id"));
            employee.setName(resultSet.getString("name_employee"));
            employee.setSurname(resultSet.getString("second_name"));
            //employee.setSex(resultSet.getString("sex"));
            employee.setAge(resultSet.getInt("age"));
            //employee.setSalary(resultSet.getInt("salary"));
            System.out.println(employee.toString());
        }
    }
    public static void insertInToBD()throws SQLException{
        PreparedStatement preparedStatement=ConnectionFactory.getConnection().prepareStatement(INSERT_NEW);
        preparedStatement.setInt(1,6);
        preparedStatement.setString(2,"Vika");
        preparedStatement.setString(3,"Malina");
        preparedStatement.setInt(4,27);
        preparedStatement.setInt(5,277777);

        preparedStatement.execute();



    }
}
