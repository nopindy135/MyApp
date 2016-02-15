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
public class attendclass {
    public int ac_Id ;
    public String ac_Time_Start;
    public String ac_Time_End;
        public void InsertAttendClass(int id , String Time_Start, String Time_End, int stid, int rid, int tid ) {
       
		Connection connect = null;
                Statement stmt = null;
		
		try {
                        Class.forName("com.mysql.jdbc.Driver");
                        String urlConnection = "jdbc:mysql://127.0.0.1/npru_pool?useUnicode=true&characterEncoding=UTF-8";
                        connect = DriverManager.getConnection ( urlConnection, "root", "" );
			stmt = connect.createStatement();
			String sql = "INSERT INTO attendclass " +
					"(AC_ID,AC_Time_Start,AC_Time_End,St_ID,R_ID,T_ID) " + 
					"VALUES ('" + id + "','" + Time_Start + "','" + Time_End + "'"
                                + "" +
					",'" + stid + "','" + rid + "','" + tid + "') ";
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
