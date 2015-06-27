import cons.company.Employee;
import db.ConnectionFactory;
import org.junit.Test;

import java.math.BigDecimal;
import java.sql.*;

/**
 * Created by Programmer on 22.06.2015.
 */
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
            e.setSurname("Ivanov");
            e.setAge(21);
            builder.append("insert into employee (name_employee, second_name,age) ")
                    .append("values (")
                    .append("'")
                    .append(e.getName())
                    .append("'")
                    .append(",")
                    .append("'")
                    .append(e.getSurname())
                    .append("'")
                    .append(",")
                    .append(e.getAge()).append(");");
            stmt.executeUpdate(builder.toString());
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
        System.out.println("Hello!");
    }
}
