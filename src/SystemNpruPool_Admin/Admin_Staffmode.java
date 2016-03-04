/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemNpruPool_Admin;

/**
 *
 * @author Godonlyknows
 */
public class Admin_Staffmode {
        public  int St_Id;
    public String St_Password;
    public String St_Name ;
    public String St_Age; 
    public String St_Workday;
    public String St_Startday;
    public String St_Start_Time;
    public String St_End_Time; 
    
    public  int getSt_Id(){
       return  St_Id;
    }
    public String getSt_Password(){
        return St_Password;
    }
    public void setSt_Id(int stid){
        St_Id = stid;
    }
    public void setSt_Password(String Stpassword){
        St_Password = Stpassword;
    }
     public void ShowDetailStaff(){
    
    }
    public void AddStaff(int id ,
                         String password,
                         String name,
                         String age,
                         String workday,
                         String startday,
                         String start_time,
                         String end_time){
        
    }
    public void EditStaff(int id ,
                         String password,
                         String name,
                         String age,
                         String workday,
                         String startday,
                         String start_time,
                         String end_time){
        
    }
    public void DeleteStaff(int id){
        
    }
}
