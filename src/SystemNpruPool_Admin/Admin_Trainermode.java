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
public class Admin_Trainermode {
    int t_id ;
    String t_name;
    int t_age ;
    String t_code;
    String t_tel;
    String t_work_date;
    String t_work_time ;
    public  int gett_id(){
        return t_id;
    }
    public void sett_id(int id){
        t_id=id;
    }
     public  String gett_name(){
        return t_name;
    }
    public void sett_name(String name){
        t_name=name;
    }
     public  int gett_age(){
        return t_age;
    }
    public void sett_age(int a){
        t_age=a;
    }
     public  String gett_code(){
        return t_code;
    }
    public void sett_code(String code){
         t_code=code;
    }
     public  String gett_tel(){
        return t_tel;
    }
    public void sett_tel(String tel){
        t_tel=tel;
    }
     public  String gett_work_date(){
        return t_work_date;
    }
    public void sett_work_date(String work_date){
        t_work_date = work_date;
    }
       public  String gett_work_time(){
        return t_work_time;
    }
    public void sett_work_time(String work_time){
        t_work_date = work_time;
    }

    public void ShowDetailTrainer(){
    
    }
    public void AddTrainer(int id ,String name,
                                    int age,
                                    String code,
                                    String tel,
                                    String work_date,
                                    String work_time){
        
    }
    public void EditTrainer(int id ,String name,
                                    int age,
                                    String code,
                                    String tel,
                                    String work_date,
                                    String work_time){
        
    }
    public void DeleteTrainer(int id){
        
    }
}
