/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemNpruPool;

import static SystemNpruPool.ConnectDB.passwordDB;
import static SystemNpruPool.ConnectDB.urlConnection;
import static SystemNpruPool.ConnectDB.usernameDB;
import java.util.Date;
import java.sql.*;
/**
 *
 * @author Godonlyknows
 */
public class TestClass {
   public static void main(String[] args) throws Exception {
 
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1:3306/npru_pool", "root", "");
        Statement st = conn.createStatement();
 
        st = conn.createStatement();
        ResultSet rs = st.executeQuery("  SELECT SUM(P_Money)from payment ");
 
        while (rs.next()) {
            String name = rs.getString(1);
            System.out.println(name);
 
        }
 
        rs.close();
        st.close();
        conn.close();
 
    }
}
