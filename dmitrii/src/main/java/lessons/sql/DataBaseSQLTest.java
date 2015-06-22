package lessons.sql;

import java.sql.*;

/**
 * Created by Programmer on 22.06.2015.
 */
public class DataBaseSQLTest {
    String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    String DB_URL = "jdbc:mysql://localhost/mydb";
    String USER = "root";
    String PASS = "root";
    public void testUpdate(){
        Statement stmt = null;
        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);){
            Class.forName(JDBC_DRIVER);
            stmt = conn.createStatement();
            String sql = "SELECT id,salary,second_name FROM employee";
            ResultSet rs = stmt.executeQuery(sql);

            // Parse DB answer
            while (rs.next()){
                int id = rs.getInt("id");
                System.out.print(id);
                String secondName = rs.getString("second_name");
                System.out.println(" "+secondName);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {

            e.printStackTrace();
        }

    }
}
