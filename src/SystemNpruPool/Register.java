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
public class Register {
    public void InsertRegister( int rType,String rTime ,String rDate ,int uId , int cId){
        
		Connection connect = null;
                Statement stmt = null;
		
		try {
                        Class.forName("com.mysql.jdbc.Driver");
                        connect = DriverManager.getConnection ( urlConnection,usernameDB,passwordDB);
			stmt = connect.createStatement();
			String sql = "INSERT INTO register " +
					"(R_Type,R_Time,R_Date,U_ID,C_ID,Count_ID) " + 
					"VALUES ('" + rType + "','" + rTime + "'"
                                + "" +
					",'" + rDate + "','" + uId + "','" + cId + "',10) ";
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

      public void CheckinCourse( int U_ID,int Count_ID){
        
		Connection connect = null;
                Statement stmt = null;
		
		try {
                           Class.forName("com.mysql.jdbc.Driver");
                        connect = DriverManager.getConnection ( urlConnection,usernameDB,passwordDB);
			stmt = connect.createStatement();
                        String sql = "UPDATE register " +
					"SET Count_ID = '" + Count_ID + "' " +
                               
					" WHERE U_ID = '" + U_ID + "' ";
             stmt.execute(sql);
            
             System.out.println("Record Update Successfully");
             
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
     public int Chackoldtime(int id ){
          Connection connect = null;
    boolean ch =false  ;
    int chtime  =0;
                Statement stmt = null;
		
		try {

                    Class.forName("com.mysql.jdbc.Driver");
                    connect = DriverManager.getConnection ( urlConnection,usernameDB,passwordDB);
                    stmt=connect.createStatement();
		
             
			
			
			String sql = "SELECT * FROM register WHERE U_ID ='" + id + "'";
			
			ResultSet rec = stmt.executeQuery(sql);
                        
			while((rec!=null) && (rec.next()))
            {
                 chtime = rec.getInt("Count_ID");
               // String chpass = rec.getString("St_Password");
                        if(chtime > 0 ){
                           chtime =chtime - 1;
                            //setSt_Id(rec.getInt("St_ID"));
                          //  System.out.println("st on select id = "+getSt_Id());
                            
                          //  setSt_Password(rec.getString("St_Password"));
                        }
                        else {
                          
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
                return  chtime ;
     }

}
