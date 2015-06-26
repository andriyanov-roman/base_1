package company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Programmer on 26.06.2015.
 */
public class ConnectionFactory {
    private static final String URL="jdbc:mysql://localhost:3306/matveutest";
    private static final String USERNAME="root";
    private static final String PASSWORD="root";
    public static Connection connection;


    public static Connection createConnection()  {
        try {
            connection= DriverManager.getConnection(URL, USERNAME, PASSWORD);
            if(!connection.isClosed()) {
                System.out.println("Соединение с БД установлено!");
            }

            return connection;
        } catch (SQLException e) {
            System.err.println("Не удалось установить соединение с БД!");
        } finally {
            try {
                if(connection!=null)
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }


    public static Connection getConnection() {
        return connection;
    }
}
