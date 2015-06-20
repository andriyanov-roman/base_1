package db;

import com.mysql.jdbc.Driver;
import db.entities.Abonent;

import java.sql.*;
import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;

/**
 * Created by user on 6/20/2015.
 */
public class SimpleJDBCRunner {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testphones";
        Properties prop = new Properties();
        prop.put("user", "root");
        prop.put("password", "pass");
        prop.put("autoReconnect", "true");
        prop.put("characterEncoding", "UTF-8");
        prop.put("useUnicode", "true");
        Connection cn = null;
        try { // 1 ????
            DriverManager.registerDriver(new Driver());
            cn = DriverManager.getConnection(url, prop);
            Statement st = null;
            try { // 2 ????
                st = cn.createStatement();
                ResultSet rs = null;
                try { // 3 ????
                    rs = st.executeQuery("SELECT * FROM phonebook");
                    ArrayList<Abonent> lst = new ArrayList<>();
                    while (rs.next()) {
                        int id = rs.getInt(1);
                        int phone = rs.getInt(3);
                        String name = rs.getString(2);
                        lst.add(new Abonent(id, phone, name));
                    }
                    if (lst.size() > 0) {
                        System.out.println(lst);
                    } else {
                        System.out.println("Not found");
                    }
                } finally { // ??? 3-?? ????? try
 /*
  * ??????? ResultSet, ???? ?? ??? ??????
  * ??? ?????? ????????? ?? ?????
  * ?????? ?? ???? ??????
  */
                    if (rs != null) { // ??? ?? ?????? ResultSet
                        rs.close();
                    } else {
                        System.err.println(
                                "?????? ?? ????? ?????? ?? ??");
                    }
                }
            } finally {
 /*
  * ??????? Statement, ???? ?? ??? ?????? ??? ??????
 * ????????? ?? ????? ???????? Statement
  */
                if (st != null) { // ??? 2-?? ????? try
                    st.close();
                } else {
                    System.err.println("Statement ?? ??????");
                }
            }
        } catch (SQLException e) { // ??? 1-?? ????? try
            System.err.println("DB connection error: " + e);
  /*
  * ????? ????????? ? ???? SQLException
  */
        } finally {
 /*
  * ??????? Connection, ???? ?? ??? ??????
 */
            if (cn != null) {
                try {
                    cn.close();
                } catch (SQLException e) {
                    System.err.println("?onnection close error: " + e);
                }
            }
        }
    }
}
