package sql;

import java.sql.*;

public class DBWorker {
    private static final String URL="jdbc:mysql://localhost:3306/matveuhome";
    private static final String USERNAME="root";
    private static final String PASSWORD="root";
    public static Connection connection;


    public DBWorker() {
        try {
            connection= DriverManager.getConnection(URL, USERNAME, PASSWORD);
            if(!connection.isClosed()) {
                System.out.println("Соединение с БД установлено!");
            }
           //MethodsEmployeeSql.selectFromBD();
            //MethodsEmployeeSql.insertInToBD();
            //connection.close();
        } catch (SQLException e) {
            System.err.println("Не удалось установить соединение с БД!");
        }
    }




    public static Connection getConnection() {
        return connection;
    }



    //statement.execute("INSERT INTO employee(name,secondname,sex,age,salary) " +
    //       "VALUES('Igor','Matviichuk','man',5,30000);");
    //statement.executeUpdate("UPDATE employee SET name='Igoooo' WHERE idemployee=20;");
    //statement.addBatch("INSERT INTO employee(name,secondname,sex,age,salary) VALUES('Tolik','KKK','man',15,323100)");
    //statement.addBatch("INSERT INTO employee(name,secondname,sex,age,salary) " +
      //      "VALUES('Gosha','Pppp','man',12,3100)");
    //statement.addBatch("INSERT INTO employee(name,secondname,sex,age,salary) " +
      //      "VALUES('Lena','Ooo','woman',33,352)");
    //statement.executeBatch();
}
