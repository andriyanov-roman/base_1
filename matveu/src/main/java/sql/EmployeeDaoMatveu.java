package sql;


import apps.Employees.Employee;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDaoMatveu implements GenericDaoMatveu<Employee>  {


    @Override
    public void selectAllEntities() {
        final String SELECT_NEW="SELECT * FROM matveuhome.employee";
        try(Connection conn = new DBWorker().getConnection();
            PreparedStatement preparedStatement = conn.prepareStatement(SELECT_NEW)) {
            ResultSet resultSet = preparedStatement.executeQuery(SELECT_NEW);
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
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public Employee getEntities(int rowNumber) {
        return null;
    }

    @Override
    public void updateEntities(Employee employee) {

    }

    @Override
    public void deleteEntities(Employee employee) {

    }

    @Override
    public boolean insertEntities(Employee employee) {
        final String INSERT_NEW="INSERT INTO matveuhome.employee (name,secondname,sex,age,salary) " +
                "VALUES(?,?,?,?,?)";
        try (Connection conn = DBWorker.getConnection();
              PreparedStatement preparedStatement = conn.prepareStatement(INSERT_NEW)) {
            preparedStatement.setString(1, employee.getName());
            preparedStatement.setString(2, employee.getSecondName());
            preparedStatement.setString(3, employee.getSex());
            preparedStatement.setInt(4, employee.getAge());
            preparedStatement.setDouble(5, employee.getSalary());
            preparedStatement.execute();
            return true;
        } catch (SQLException se) {
            se.printStackTrace();
            return false;
        }
    }
}
