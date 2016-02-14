/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemNpruPool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Godonlyknows
 */
public class Couse {
    public void register_coues(int r_Type , String r_Time ,String r_Date , int u_Id ,int c_Id){
        
		Connection connect = null;
                Statement stmt = null;
		
		try {
                        Class.forName("com.mysql.jdbc.Driver");
                        String urlConnection = "jdbc:mysql://127.0.0.1/npru_pool?useUnicode=true&characterEncoding=UTF-8";
                        connect = DriverManager.getConnection ( urlConnection, "root", "" );
			stmt = connect.createStatement();
			String sql = "INSERT INTO register " +
					"(R_Type,R_Time,R_Date,U_ID,C_ID) " + 
					"VALUES ('" + r_Type + "','" + r_Time + "'"
                                + "" +
					",'" + r_Date + "','" + u_Id + "','" + c_Id + "') ";
                         stmt.execute(sql);
             
                         System.out.println("Record User Inserted Successfully");
             
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
    }


