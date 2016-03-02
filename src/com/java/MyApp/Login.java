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
import javax.swing.JOptionPane;
import sun.applet.resources.MsgAppletViewer;

/**
 *
 * @author Boss
 */
public class Login extends javax.swing.JFrame {
  Staff st = new Staff();
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
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
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        in_stid = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        in_password = new javax.swing.JPasswordField();
        txt_Staffid = new javax.swing.JLabel();
        txt_StaffPassword = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_server = new javax.swing.JLabel();

        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Swim_NPRU");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("TH Sarabun New", 0, 24)); // NOI18N
        jLabel1.setText("กรุณาเข้าสู่ระบบ (Please Log-in)");

        jLabel2.setFont(new java.awt.Font("TH Sarabun New", 0, 20)); // NOI18N
        jLabel2.setText("ระบบบริการสระว่ายน้ำ มหาวิทยาลัยราชภัฏนครปฐม");

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

        jLabel3.setFont(new java.awt.Font("TH Sarabun New", 0, 18)); // NOI18N
        jLabel3.setText("ชื่อผู้ใช้ ( Username )");

        jLabel4.setFont(new java.awt.Font("TH Sarabun New", 0, 18)); // NOI18N
        jLabel4.setText("รหัสผ่าน ( Password )");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/i_username.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/i_pass.png"))); // NOI18N

        in_password.setFont(new java.awt.Font("TH Sarabun New", 0, 18)); // NOI18N
        in_password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                in_passwordFocusLost(evt);
            }
        });
        in_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                in_passwordActionPerformed(evt);
            }
        });

        txt_Staffid.setText("..");

        txt_StaffPassword.setText("..");

        jLabel7.setText("Server :");

        txt_server.setText("..");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(216, 216, 216)
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(56, 56, 56)
                                .addComponent(in_password))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                                .addComponent(in_stid, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_Staffid)
                    .addComponent(txt_StaffPassword))
                .addGap(72, 72, 72))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jLabel1)
                        .addGap(59, 59, 59)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(txt_server)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7)
                    .addComponent(txt_server))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(in_stid, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_Staffid)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(in_password)
                        .addComponent(txt_StaffPassword)))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     
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
    private javax.swing.JLabel txt_StaffPassword;
    private javax.swing.JLabel txt_Staffid;
    private javax.swing.JLabel txt_server;
    // End of variables declaration//GEN-END:variables

  
      
    
}
