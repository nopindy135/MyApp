/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.MyApp;

import static SystemNpruPool.ConnectDB.passwordDB;
import static SystemNpruPool.ConnectDB.urlConnection;
import static SystemNpruPool.ConnectDB.usernameDB;
import SystemNpruPool.Payment;
import SystemNpruPool.Staff;
import SystemNpruPool.User;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Boss
 */
public class history_use extends javax.swing.JFrame {
User us = new User();
Staff st = new Staff();
    /**
     * Creates new form history_use
     */
    public history_use() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        initComponents();
        Payment pp = new Payment();
        txt_money.setText(pp.SumPayment());
        
                    System.out.println(pp.SumPayment());
        
       // us.ShowUser();
        	DefaultTableModel model = (DefaultTableModel)showdata.getModel();
	
        	//Header Sort
		TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<DefaultTableModel> (model);
		showdata.setRowSorter(sorter);
                Connection connect = null;
		Statement stmt = null;
		
		try {
                    Class.forName("com.mysql.jdbc.Driver");
                   connect = DriverManager.getConnection ( urlConnection,usernameDB,passwordDB);
                 
                    stmt=connect.createStatement();
			
			String sql = "SELECT * FROM  user join payment WHERE user.U_ID = payment.U_Id ORDER BY user.U_ID ASC";
			
			ResultSet rec = stmt.executeQuery(sql);
			int row = 0;
			while((rec!=null) && (rec.next()))
            {			
				model.addRow(new Object[0]);
				model.setValueAt(rec.getString("U_ID"), row, 0);
				model.setValueAt(rec.getString("U_Firstname"), row, 1);
				model.setValueAt(rec.getString("P_Date"), row, 2);
				model.setValueAt(rec.getString("P_Time"), row, 3);
				model.setValueAt(rec.getFloat("U_Type"), row, 4);
                                model.setValueAt(st.getSt_Id(), row, 5);
			//	model.setValueAt(rec.getFloat("Used"), row, 5);
				row++;
            }

			rec.close();
             
		} catch (Exception e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, e.getMessage());
			e.printStackTrace();
		}
		
		try {
			if(stmt != null) {
				stmt.close();
				connect.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
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

        jScrollPane1 = new javax.swing.JScrollPane();
        showdata = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btn_menu = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        type_s = new javax.swing.JComboBox<String>();
        jLabel3 = new javax.swing.JLabel();
        in_keys = new javax.swing.JTextField();
        btn_s = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txt_money = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        showdata.setAutoCreateRowSorter(true);
        showdata.setFont(new java.awt.Font("TH Sarabun New", 0, 18)); // NOI18N
        showdata.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "รหัสสมาชิก", "ชื่อ", "วันที่เข้าใช้งาน", "เวลาเข้าใช้งาน", "ประเภทการใช้งาน", "Title 6"
            }
        ));
        showdata.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        showdata.setDoubleBuffered(true);
        showdata.setDragEnabled(true);
        showdata.setEditingColumn(5);
        showdata.setEditingRow(5);
        showdata.setFillsViewportHeight(true);
        showdata.setFocusCycleRoot(true);
        showdata.setFocusTraversalPolicyProvider(true);
        showdata.setName(""); // NOI18N
        showdata.setSurrendersFocusOnKeystroke(true);
        jScrollPane1.setViewportView(showdata);

        jLabel1.setFont(new java.awt.Font("TH Sarabun New", 0, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Swimming Pool-64.png"))); // NOI18N
        jLabel1.setText("แสดงประวัติผู้เข้าใช้งานสระว่ายน้ำ");

        btn_menu.setFont(new java.awt.Font("TH Sarabun New", 0, 18)); // NOI18N
        btn_menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/home-icon.png"))); // NOI18N
        btn_menu.setText("กลับหน้าหลัก");
        btn_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menuActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("TH Sarabun New", 0, 18)); // NOI18N
        jLabel2.setText("ค้นหาข้อมูลจาก");

        type_s.setFont(new java.awt.Font("TH Sarabun New", 0, 18)); // NOI18N
        type_s.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "รหัสสมาชิก", "ชื่อ", "วันที่เข้าใช้งาน", "เวลาเข้าใช้งาน", " " }));

        jLabel3.setFont(new java.awt.Font("TH Sarabun New", 0, 18)); // NOI18N
        jLabel3.setText("ข้อมูลที่ต้องการค้นหา");

        in_keys.setFont(new java.awt.Font("TH Sarabun New", 0, 18)); // NOI18N

        btn_s.setFont(new java.awt.Font("TH Sarabun New", 0, 18)); // NOI18N
        btn_s.setText("ค้นหา");
        btn_s.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("TH Sarabun New", 0, 18)); // NOI18N
        jLabel4.setText("จำนวนเงิน");

        txt_money.setFont(new java.awt.Font("TH Sarabun New", 0, 18)); // NOI18N
        txt_money.setForeground(new java.awt.Color(0, 0, 255));
        txt_money.setText("...........");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_money)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_money))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(203, 203, 203)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(type_s, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(31, 31, 31)
                        .addComponent(in_keys, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_s))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addComponent(btn_menu)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(type_s, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(in_keys, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_s))
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_menu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("แสดงประวัติผู้เข้าใช้สระว่ายน้ำ");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menuActionPerformed
        // TODO add your handling code here:
          user form5 = new user();
        form5.setVisible(true);
        close();
    }//GEN-LAST:event_btn_menuActionPerformed

    private void btn_sActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sActionPerformed
        // TODO add your handling code here:
        String type = "" ;
       String key  =  "";
         if(type_s.getSelectedItem().equals("รหัสสมาชิก")){
                type="U_ID";
                  key = "SELECT * FROM  user join payment WHERE user.U_ID = payment.U_Id and user." + type + " = '" + Integer.valueOf(in_keys.getText()) + "' ORDER BY user.U_ID ASC";
            }
            else if(type_s.getSelectedItem().equals("ชื่อ")){
                type="U_Firstname";
          key = "SELECT * FROM  user join payment WHERE user.U_ID = payment.U_Id and user." + type + " = '" + in_keys.getText() + "' ORDER BY user.U_ID ASC";
            
     }
            else if(type_s.getSelectedItem().equals("วันที่เข้าใช้งาน")){
           type="P_Date";
              key = "SELECT * FROM  user join payment WHERE user.U_ID = payment.U_Id and payment." + type + " = '" + in_keys.getText() + "' ORDER BY user.U_ID ASC";
            
     }
          else if(type_s.getSelectedItem().equals("เวลาเข้าใช้งาน")){
           type="P_Time";
              key = "SELECT * FROM  user join payment WHERE user.U_ID = payment.U_Id and payment." + type + " = '" + in_keys.getText() + "' ORDER BY user.U_ID ASC";
            
     }
        DefaultTableModel model = (DefaultTableModel)showdata.getModel();
	         model.setRowCount(0);
        	//Header Sort
		TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<DefaultTableModel> (model);
		showdata.setRowSorter(sorter);
                Connection connect = null;
		Statement stmt = null;
		
		try {
                    Class.forName("com.mysql.jdbc.Driver");
                   connect = DriverManager.getConnection ( urlConnection,usernameDB,passwordDB);
                 
                    stmt=connect.createStatement();
			
			String sql =key;
			
			ResultSet rec = stmt.executeQuery(sql);
			int row = 0;
			while((rec!=null) && (rec.next()))
            {			
                           
				model.addRow(new Object[0]);
				model.setValueAt(rec.getString("U_ID"), row, 0);
				model.setValueAt(rec.getString("U_Firstname"), row, 1);
				model.setValueAt(rec.getString("P_Date"), row, 2);
				model.setValueAt(rec.getString("P_Time"), row, 3);
				model.setValueAt(rec.getFloat("U_Type"), row, 4);
                                //model.setValueAt(st.getSt_Id(), row, 5);
			//	model.setValueAt(rec.getFloat("Used"), row, 5);
				row++;
            }

			rec.close();
             
		} catch (Exception e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, e.getMessage());
			e.printStackTrace();
		}
		
		try {
			if(stmt != null) {
				stmt.close();
				connect.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
    }//GEN-LAST:event_btn_sActionPerformed

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
            java.util.logging.Logger.getLogger(history_use.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(history_use.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(history_use.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(history_use.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new history_use().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(history_use.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(history_use.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(history_use.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(history_use.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_menu;
    private javax.swing.JButton btn_s;
    private javax.swing.JTextField in_keys;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable showdata;
    private javax.swing.JLabel txt_money;
    private javax.swing.JComboBox<String> type_s;
    // End of variables declaration//GEN-END:variables
}
