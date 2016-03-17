/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.MyApp;


import SystemNpruPool.Staff;
import SystemNpruPool.User;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author Boss
 */
public class regis_member extends javax.swing.JFrame {
                User u = new User();
                Staff st = new Staff();
    /**
     * Creates new form regis_member
     */
    public regis_member() {
     
        initComponents();
           u.CheckUser(u.getU_Id());
            if(u.getU_Age() > 12){
           rid_Mtype1.setVisible(false);
        }
        else if(u.getU_Age() < 12){
            rid_Mtype2.setVisible(false);
        }
        st.CheckStaff(st.getSt_Id());
        st.CheckLogin(st.getSt_Id(),st.getSt_Password());
        txt_Uid.setText(String.valueOf(u.getU_Id()));
        txt_UcardId.setText(u.getU_CardId());
        txt_fname.setText(u.getU_Firstname());
            txt_lname.setText(u.getU_Lastname());
            txt_birthday.setText(u.getU_Birthday());
    }
public void close(){
        WindowEvent winclose = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winclose);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_member = new javax.swing.JButton();
        btn_user = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txt_UcardId = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_fname = new javax.swing.JLabel();
        txt_birthday = new javax.swing.JLabel();
        rid_Mtype2 = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        rid_Mtype1 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        txt_lname = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("TH Sarabun New", 0, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Add User-50.png"))); // NOI18N
        jLabel1.setText("ชำระค่าบริการสมัครสมาชิกรายปี");

        btn_member.setFont(new java.awt.Font("TH Sarabun New", 0, 18)); // NOI18N
        btn_member.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/File-complete-icon.png"))); // NOI18N
        btn_member.setText("เสร็จสิ้น");
        btn_member.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_memberActionPerformed(evt);
            }
        });

        btn_user.setFont(new java.awt.Font("TH Sarabun New", 0, 18)); // NOI18N
        btn_user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/home-icon.png"))); // NOI18N
        btn_user.setText("กลับหน้าหลัก");
        btn_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_userActionPerformed(evt);
            }
        });

        txt_UcardId.setFont(new java.awt.Font("TH Sarabun New", 0, 18)); // NOI18N
        txt_UcardId.setText("...........................................");

        jLabel2.setFont(new java.awt.Font("TH Sarabun New", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("รหัสสมาชิก");

        jLabel3.setFont(new java.awt.Font("TH Sarabun New", 0, 18)); // NOI18N
        jLabel3.setText("รหัสบัตรประชาชน");

        jLabel4.setFont(new java.awt.Font("TH Sarabun New", 0, 18)); // NOI18N
        jLabel4.setText("ชื่อ");

        txt_fname.setFont(new java.awt.Font("TH Sarabun New", 0, 18)); // NOI18N
        txt_fname.setText(".........................................");

        txt_birthday.setFont(new java.awt.Font("TH Sarabun New", 0, 18)); // NOI18N
        txt_birthday.setText(".........................................");

        rid_Mtype2.setFont(new java.awt.Font("TH Sarabun New", 0, 18)); // NOI18N
        rid_Mtype2.setText("อายุมากกว่า 12 ปี ค่าบริการ 1200 บาท");
        rid_Mtype2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rid_Mtype2ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("TH Sarabun New", 0, 18)); // NOI18N
        jLabel12.setText("ค่าบริการ");

        rid_Mtype1.setFont(new java.awt.Font("TH Sarabun New", 0, 18)); // NOI18N
        rid_Mtype1.setText("อายุไม่เกิน 12 ปี ค่าบริการ 1000 บาท");
        rid_Mtype1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rid_Mtype1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("TH Sarabun New", 0, 18)); // NOI18N
        jLabel6.setText("นามสกุล");

        txt_lname.setFont(new java.awt.Font("TH Sarabun New", 0, 18)); // NOI18N
        txt_lname.setText(".........................................");

        jLabel8.setFont(new java.awt.Font("TH Sarabun New", 0, 18)); // NOI18N
        jLabel8.setText("อายุ");

        jTextField1.setFont(new java.awt.Font("TH Sarabun New", 0, 18)); // NOI18N

        jButton1.setText("OK");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel12)
                        .addComponent(rid_Mtype1)
                        .addComponent(rid_Mtype2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_birthday)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txt_UcardId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txt_fname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txt_lname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGap(6, 6, 6)))
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_UcardId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_fname))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_lname))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_birthday))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rid_Mtype1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rid_Mtype2)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_member, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_user, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_member, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_user, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_userActionPerformed
        // TODO add your handling code here:
             user u =new user();
        u.setVisible(true);
        close();
         
    }//GEN-LAST:event_btn_userActionPerformed

    private void btn_memberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_memberActionPerformed
        // TODO add your handling code here:
         Calendar c = Calendar.getInstance();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                SimpleDateFormat df1 = new SimpleDateFormat("HH:mm:ss");
        String currentDate = df.format(c.getTime());//ปีเดือนวัน
        String currentDate1= df1.format(c.getTime());//ปีเดือนวัน+เวลาล
       User me =new User();
       System.out.println(rid_Mtype1.getText());
        if(rid_Mtype1.isSelected()){
            me.InsertMember(String.valueOf(u.getU_Id()),rid_Mtype1.getText(),currentDate1,currentDate1);
        }
        else if (rid_Mtype2.isSelected()){
              me.InsertMember(String.valueOf(u.getU_Id()),rid_Mtype2.getText(),currentDate1,currentDate1);
        }
        
    }//GEN-LAST:event_btn_memberActionPerformed

    private void rid_Mtype2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rid_Mtype2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rid_Mtype2ActionPerformed

    private void rid_Mtype1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rid_Mtype1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rid_Mtype1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(regis_member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(regis_member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(regis_member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(regis_member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new regis_member().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_member;
    private javax.swing.JButton btn_user;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JRadioButton rid_Mtype1;
    private javax.swing.JRadioButton rid_Mtype2;
    private javax.swing.JLabel txt_UcardId;
    private javax.swing.JLabel txt_birthday;
    private javax.swing.JLabel txt_fname;
    private javax.swing.JLabel txt_lname;
    // End of variables declaration//GEN-END:variables
}
