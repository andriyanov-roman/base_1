package entity;

import db.ConnectionFactory;
import db.GenericDao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Programmer on 27.06.2015.
 */
public class EmployeeDaoImpl implements GenericDao<Employee> {

    @Override
    public List<Employee> getAllEntities() {
        return null;
    }

    @Override
    public Employee getEntities(int rollNo) {
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
        String sql = "insert into employee (name_employee, second_name,age)" +
                " values (?,?,?)";
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, employee.getName());
            stmt.setString(2, employee.getSecondName());
            stmt.setInt(3, employee.getAge());
            stmt.execute();
            return true;
        } catch (SQLException se) {
            se.printStackTrace();
            return false;
        }
    }
}
