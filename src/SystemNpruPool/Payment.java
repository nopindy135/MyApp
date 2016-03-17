/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemNpruPool;

import static SystemNpruPool.ConnectDB.passwordDB;
import static SystemNpruPool.ConnectDB.urlConnection;
import static SystemNpruPool.ConnectDB.usernameDB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Godonlyknows
 */
public class Payment {
    public void InsertPaymet(int money,  String Datepay ,
           String time,
           String type,
           int uid,
           int stid
          ){
       
		Connection connect = null;
                Statement stmt = null;
		
		try {
                        Class.forName("com.mysql.jdbc.Driver");
                        connect = DriverManager.getConnection ( urlConnection,usernameDB,passwordDB);
			stmt = connect.createStatement();
			String sql = "INSERT INTO payment " +
					"(P_Money,P_Date,P_Time,P_Type,U_Id,St_Id) " + 
					"VALUES ('" + money+ "','" + Datepay + "'"
                                + "" +
					",'" + time + "','" + type + "','" + uid + "','" + stid + "') ";
                         stmt.execute(sql);
             System.out.printf("insert payment Suc");
                         
             
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Close
		try {
			if(connect != null){
				stmt.close();
				connect.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
public int CountCheckPayment(int uid){
    int countpay = 0;
     Connection connect = null;
    boolean ch =false  ;
                Statement stmt = null;
		
		try {

Class.forName("com.mysql.jdbc.Driver");
connect = DriverManager.getConnection ( urlConnection,usernameDB,passwordDB);
stmt=connect.createStatement();
		
             
			
			
			String sql = "SELECT count(*) FROM payment WHERE U_Id ='" + uid + "'  ";
			
			ResultSet rec = stmt.executeQuery(sql);
                    
			
		
          
             
    
                       
			while((rec!=null) && (rec.next()))
            {
                        if(rec.getInt("U_Id") == uid ){
                          countpay= rec.getInt("U_Id)");
                          System.out.println(countpay);
                          //  u_Firstname = rec.getString("U_Firstname");
                             //   System.out.println(u_Firstname);
                          //   System.out.print("befor"+u_Firstname);
           
                            
                           //     System.out.print("after"+u_Firstname);
                        }
                        else {
                 countpay= rec.getInt("U_Id)");
                        }
            }
             
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Close
		try {
			if(connect != null){
				stmt.close();
				connect.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
              return countpay;
}

public String SumPayment() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
   String name ="";
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1:3306/npru_pool", "root", "");
        Statement st = conn.createStatement();
 
        st = conn.createStatement();
        ResultSet rs = st.executeQuery("  SELECT SUM(P_Money)from payment ");
 
        while (rs.next()) {
          name = rs.getString(1);
            System.out.println(name);
 
        }
 
        rs.close();
        st.close();
        conn.close();
 
    
    return name;
}
}

