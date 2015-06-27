import entity.Employee;
import db.ConnectionFactory;
import entity.EmployeeDaoImpl;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.sql.*;


public class DbConnectorTest {

    @Test
    public void testUpdate() {
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement()) {
            String sql = "SELECT id,salary,name_employee FROM employee";
            ResultSet rs = stmt.executeQuery(sql);
            System.out.println(rs.getClass());
            //STEP 5: Extract data from result set
            while (rs.next()) {
                //Retrieve by column name
                int id = rs.getShort("id");
                BigDecimal salary = rs.getBigDecimal("salary");
                String first = rs.getString("name_employee");
                //Display values
                System.out.print("ID: " + id);
                System.out.print(", Salary: " + salary);
                System.out.print(", First: " + first);
                System.out.println();
            }
        } catch (SQLException se) {
            for (Throwable t : se.getNextException()) {
                t.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Goodbye!");
    }

    @Test
    public void testInsert() {
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement()) {
            StringBuilder builder = new StringBuilder();
            Employee e = new Employee();
            e.setName("Ivan");
            e.setSecondName("Ivanov");
            e.setAge(21);
            builder.append("insert into employee (name_employee, second_name,age) ")
                    .append("values (")
                    .append("'")
                    .append(e.getName())
                    .append("'")
                    .append(",")
                    .append("'")
                    .append(e.getSecondName())
                    .append("'")
                    .append(",")
                    .append(e.getAge()).append(");");
            stmt.executeUpdate(builder.toString());
            String sql = "SELECT id,salary,name_employee FROM employee ";
            ResultSet rs = stmt.executeQuery(sql);
            System.out.println(rs.getClass());
            //STEP 5: Extract data from result set
            while (rs.next()) {
                //Retrieve by column name
                int id = rs.getShort("id");
                BigDecimal salary = rs.getBigDecimal("salary");
                String first = rs.getString("name_employee");
                //Display values
                System.out.print("ID: " + id);
                System.out.print(", Salary: " + salary);
                System.out.print(", First: " + first);
                System.out.println();
            }
        } catch (SQLException se) {
            for (Throwable t : se.getNextException()) {
                t.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Hello!");
    }

    @Test
    public void testPrepareSt() {
        String sql = "insert into employee (name_employee, second_name,age)" +
                " values (?,?,?)";
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, "Ivan");
            stmt.setString(2, "Petrovich");
            stmt.setInt(3, 50);
            stmt.execute();
            //-------------

            String sqlGet = "SELECT * FROM employee WHERE name_employee=?";
            stmt.setString(1, "Ivan");
            ResultSet rs = stmt.executeQuery(sqlGet);
            //System.out.println(rs.getClass());
            //STEP 5: Extract data from result set
            while (rs.next()) {
                //Retrieve by column name
                int id = rs.getShort("id");
                BigDecimal salary = rs.getBigDecimal("salary");
                String first = rs.getString("name_employee");
                //Display values
                System.out.print("ID: " + id);
                System.out.print(", Salary: " + salary);
                System.out.println();
            }
        } catch (SQLException se) {
           se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Goodbye!");
    }

    @Test
    public void employeeDaoTest() {
        Employee e = new Employee();
        e.setAge(16);
        e.setName("Ira");
        e.setSecondName("Ivanova");
        EmployeeDaoImpl impl = new EmployeeDaoImpl();
        boolean result = impl.insertEntities(e);
        Assert.assertTrue(result);
    }
}
