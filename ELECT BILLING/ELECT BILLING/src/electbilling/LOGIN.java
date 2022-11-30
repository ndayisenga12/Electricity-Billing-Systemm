/*
 * LOGIN.java
 *
 * Created on November 21, 2022, 9:24 AM
 */

package electbilling;

import javax.swing.*;
import java.sql.*;

public class LOGIN extends javax.swing.JFrame {

    /** Creates new form LOGIN */
    public LOGIN() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 0, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 20));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setText("USERNAME");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel3.setForeground(new java.awt.Color(255, 0, 51));
        jLabel3.setText("PASSWORD");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jButton1.setFont(new java.awt.Font("Arial", 1, 12));
        jButton1.setText("RESET");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 80, 30));

        jButton3.setFont(new java.awt.Font("Arial", 1, 12));
        jButton3.setText("exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 80, 30));

        jButton4.setFont(new java.awt.Font("Arial", 1, 12));
        jButton4.setText("SIGNUP");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 80, 30));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 140, 20));

        jButton2.setFont(new java.awt.Font("Arial", 1, 12));
        jButton2.setText("LOGIN");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 70, 30));
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 140, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Desktop\\rrrrr.jpg")); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 450));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18));
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("LOGIN TO ELECTRICITY BILLING SYSTEM");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jLabel1)))
                .addContainerGap(152, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

    String USERNAME = jTextField1.getText();
    String PASSWORD = jPasswordField1.getText();
    
      
    
    if(USERNAME.isEmpty()||PASSWORD.isEmpty()){
    JOptionPane.showMessageDialog(null, "THE FIELDS MUST NOT BE INVALID");    
    }

    else{
    
    
    try{
      Class.forName("com.mysql.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/electricityy", "root", "");
         String sql="Select * from logingg where USERNAME=? and PASSWORD=?";
         PreparedStatement pst= con.prepareStatement(sql);
         pst.setString(1, jTextField1.getText());
       pst.setString(2,jPasswordField1.getText());
       ResultSet rs=pst.executeQuery();
        if(rs.next()){
           JOptionPane.showMessageDialog(null, "You have logged in successfull");
           home we=new home();
           we.setVisible(true);
           setVisible(false);
           
           
       }
       else{
           JOptionPane.showMessageDialog(null, "your credentials not Matching");
           
           jTextField1.setText("");
           jPasswordField1.setText("");
       } 
      con.close();
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
    }

    }
}//GEN-LAST:event_jButton2ActionPerformed

private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
System.exit(0);
}//GEN-LAST:event_jButton3ActionPerformed

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  jTextField1.setText(null);
  jPasswordField1.setText(null);
}//GEN-LAST:event_jButton1ActionPerformed

private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
SIGNUP S=new SIGNUP();
S.show();
dispose();// TODO add your handling code here:
}//GEN-LAST:event_jButton4ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LOGIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

}
