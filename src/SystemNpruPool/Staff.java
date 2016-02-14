/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemNpruPool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Godonlyknows
 */
public class Staff {
    public String St_Id;
    public String St_Password;
    public String St_Name ;
    public String St_Age; 
    public String St_Workday;
    public String St_Startday;
    public String St_Start_Time;
    public String St_End_Time; 
    
    public boolean CheckLogin(int id,String passWord){
          Connection connect = null;
    boolean ch =false  ;
                Statement stmt = null;
		
		try {

                    Class.forName("com.mysql.jdbc.Driver");
                    String urlConnection = "jdbc:mysql://127.0.0.1/npru_pool?useUnicode=true&characterEncoding=UTF-8";
                    connect = DriverManager.getConnection ( urlConnection, "root", "" );
                    stmt=connect.createStatement();
		
             
			
			
			String sql = "SELECT St_ID,St_Password FROM staff WHERE St_ID ='" + id + "' and St_Password ='" + passWord + "'   ";
			
			ResultSet rec = stmt.executeQuery(sql);
                        
			while((rec!=null) && (rec.next()))
            {
                int chid = rec.getInt("St_ID");
                String chpass = rec.getString("St_Password");
                        if(chid == id && passWord.equals(chpass)){
                            ch = true;
                        }
                        else {
                            ch=false;
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
                return  ch ;
    }
}
