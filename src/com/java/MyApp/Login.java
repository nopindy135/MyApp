/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.MyApp;

import SystemNpruPool.CheckConnetDB;
import SystemNpruPool.Staff;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.InputStream;
import static java.lang.Thread.sleep;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import sun.applet.resources.MsgAppletViewer;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Boss
 */
public class Login extends javax.swing.JFrame {
  Staff st = new Staff();
    /**
     * Creates new form Login
     */
    public void CurrentDate(){
         
        
        Thread clock = new Thread(){
            public void run(){
                for(;;){
                    CheckConnetDB ccdb = new CheckConnetDB();
                    if(ccdb.CheckConnect1() ==true){
                    txt_server.setText("Online");
                    }else{
                         txt_server.setText("Offline");
                    }
                    Calendar cal = new GregorianCalendar();
                    int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int second = cal.get(Calendar.SECOND);
        int minute = cal.get(Calendar.MINUTE);
        int hour = cal.get(Calendar.HOUR);
        date_txt.setText("Date"+year+"/"+(month+1)+"/"+day);
        txt_time.setText("Time "+hour+":"+(minute)+":"+second);
                   // System.out.println("p");
                    try{
                    sleep(1000);
                  
                }   catch (InterruptedException ex) {
                        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
        }
                
                };
                clock.start();
                }
                     
    public Login() {
        
       
        
        initComponents();
        
        
         CurrentDate();
        CheckConnetDB ccdb = new CheckConnetDB();
        if(ccdb.CheckConnect1() == true){
                txt_server.setText("Online");}
                    
        
        else{
                txt_server.setText("Offline");}
                    }
    public void close(){
        WindowEvent winclose = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winclose);
    }
    public void AudioInputStream(String address) {
        try {

            InputStream in = this.getClass().getResourceAsStream(address);
            AudioStream au = new AudioStream(in);
            AudioPlayer.player.start(au);

        } catch (Exception e) {
            
        }
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        in_stid = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txt_Staffid = new javax.swing.JLabel();
        txt_StaffPassword = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        in_password = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txt_server = new javax.swing.JLabel();
        txt_time = new javax.swing.JLabel();
        date_txt = new javax.swing.JLabel();

        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Swim_NPRU");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("TH Sarabun New", 0, 24)); // NOI18N
        jLabel1.setText("กรุณาเข้าสู่ระบบ (Please Log-in)");

        jLabel3.setFont(new java.awt.Font("TH Sarabun New", 0, 18)); // NOI18N
        jLabel3.setText("ชื่อผู้ใช้ ( Username )");

        jLabel4.setFont(new java.awt.Font("TH Sarabun New", 0, 18)); // NOI18N
        jLabel4.setText("รหัสผ่าน ( Password )");

        in_stid.setFont(new java.awt.Font("TH Sarabun New", 0, 24)); // NOI18N
        in_stid.setToolTipText("");
        in_stid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                in_stidFocusLost(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("TH Sarabun New", 0, 24)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon-login.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txt_Staffid.setFont(new java.awt.Font("TH Sarabun New", 0, 18)); // NOI18N
        txt_Staffid.setText("..");

        txt_StaffPassword.setFont(new java.awt.Font("TH Sarabun New", 0, 18)); // NOI18N
        txt_StaffPassword.setText("..");

        jLabel2.setFont(new java.awt.Font("TH Sarabun New", 0, 20)); // NOI18N
        jLabel2.setText("ระบบบริการสระว่ายน้ำ มหาวิทยาลัยราชภัฏนครปฐม");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/i_username.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/i_pass.png"))); // NOI18N

        in_password.setFont(new java.awt.Font("TH Sarabun New", 0, 18)); // NOI18N
        in_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                in_passwordActionPerformed(evt);
            }
        });
        in_password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                in_passwordFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(in_stid, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(in_password, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_Staffid)
                    .addComponent(txt_StaffPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(in_stid, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Staffid))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(in_password, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_StaffPassword)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        jLabel7.setFont(new java.awt.Font("TH Sarabun New", 0, 18)); // NOI18N
        jLabel7.setText("Server :");

        txt_server.setFont(new java.awt.Font("TH Sarabun New", 0, 18)); // NOI18N
        txt_server.setText("OFFLINE");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_server)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel7)
                .addComponent(txt_server))
        );

        txt_time.setFont(new java.awt.Font("TH Sarabun New", 0, 18)); // NOI18N
        txt_time.setText("TIME");

        date_txt.setFont(new java.awt.Font("TH Sarabun New", 0, 18)); // NOI18N
        date_txt.setText("DATE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(date_txt)
                    .addComponent(txt_time))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addContainerGap(167, Short.MAX_VALUE))))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(date_txt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_time)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     user sn = new user();
        sn.AudioInputStream("/image/imperial_march.wav");
       //String password = in_password.
       if(in_stid.getText().equals("") || in_password.getPassword().equals("")){
             JOptionPane.showMessageDialog(null,
	    "Please Input Username & Password.",
	    "Please try again.",
	    JOptionPane.WARNING_MESSAGE);
           }
        else{
       String pw = String.valueOf(in_password.getPassword());
       boolean chst = st.CheckLogin(Integer.valueOf(in_stid.getText()),pw);
 //System.out.print(in_password.getPassword());
 if(chst == true){ // ถ้าใส่ถูก
     System.out.println("true");
       st.setSt_Id(Integer.valueOf(in_stid.getText()));
       System.out.println("St id login = "+st.getSt_Id());
       st.setSt_Password(pw);
       
       user form2 = new user();
       Login lo =new Login();
    
        form2.setVisible(true);
        close();
        
        
        
 }else {
      System.out.print("false");
      JOptionPane.showMessageDialog(null,
	    "Username & Password Wrong.",
	    "Please try again.",
	    JOptionPane.WARNING_MESSAGE);
 }
       
        }
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void in_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_in_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_in_passwordActionPerformed

    private void in_passwordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_in_passwordFocusLost
        // TODO add your handling code here:
      
    }//GEN-LAST:event_in_passwordFocusLost

    private void in_stidFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_in_stidFocusLost
        // TODO add your handling code here:
        Staff s1t = new Staff();
        txt_Staffid.setText("");
        if(s1t.ChackStaff_Id(Integer.valueOf(in_stid.getText()))==true){
            
        
        txt_Staffid.setText("IDถูกต้อง");
        }
        else{
                  txt_Staffid.setText("IDไม่ถูกต้อง");
        }
    }//GEN-LAST:event_in_stidFocusLost

    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {
      

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel date_txt;
    private javax.swing.JPasswordField in_password;
    private javax.swing.JTextField in_stid;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel txt_StaffPassword;
    private javax.swing.JLabel txt_Staffid;
    private javax.swing.JLabel txt_server;
    private javax.swing.JLabel txt_time;
    // End of variables declaration//GEN-END:variables

  
      
    
}
