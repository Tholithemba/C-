/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rdphouses;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author tholithemba
 */
public class Application extends javax.swing.JFrame {

    private final double requested_amount = 120000;
    private double balance;
    private int admin_id;
    private int applicant_ID;
    private String status;    
    
    /**
     * Creates new form Application
     */
    public Application() {
        initComponents();
    }
    
    public Application(int applicant_id){
        this.applicant_ID = applicant_id;
    }
    
    public Application(int applicant_id, int admin_id){
        this.applicant_ID = applicant_id;
        this.admin_id = admin_id; 
    }
    
    public int getAdminID(){
        return admin_id;
    }
    
    public int getApplicantID(){
        return applicant_ID;
    }
    
    public void setBalance(double bal){
        this.balance = bal;
    }
    
    public double getBalance(){
        return balance;
    }
    
    public void setStatus(String set_status){
        this.status = set_status;
    }
    
    public String getStatus(){
        return status;
    }

    
    private void createApplication(){
        
        PreparedStatement ps;
        String query_statement = "insert into APPLICATION(application_status,"
                + "application_amount,application_balance,application_date,"
                + "Admin_id,applicant_id)"
                + "values(?,?,?,?,?,?)";
        
        
        try{
            ps = Connect2database.getConnection().prepareStatement(query_statement);
            
            ps.setString(1, getStatus());
            ps.setDouble(2, requested_amount);
            ps.setDouble(3, getBalance());
            //ps.setDate(4, "");
            ps.setInt(5, getAdminID());
            ps.setInt(6, getApplicantID());
            
            if(ps.executeUpdate() > 0){
                JOptionPane.showMessageDialog(null, "Application was created successfull....");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Application.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        application = new javax.swing.JPanel();
        appl_status = new java.awt.Label();
        label3app1 = new java.awt.Label();
        ApplicationBackToAdmin = new javax.swing.JLabel();
        label11 = new java.awt.Label();
        label12 = new java.awt.Label();
        txtrequested_amount = new java.awt.Label();
        Application_status = new java.awt.Label();
        txtapplication_balance = new java.awt.Label();
        Applicationclose = new javax.swing.JLabel();

        jLabel1.setBackground(new java.awt.Color(53, 66, 74));
        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("Back");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(232, 73, 29), 3, true));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        application.setBackground(new java.awt.Color(53, 66, 74));
        application.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(232, 73, 29), 3));

        appl_status.setBackground(new java.awt.Color(53, 66, 74));
        appl_status.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        appl_status.setForeground(java.awt.Color.white);
        appl_status.setText("Application Status");

        label3app1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        label3app1.setForeground(java.awt.Color.white);
        label3app1.setText("Application");

        ApplicationBackToAdmin.setBackground(new java.awt.Color(53, 66, 74));
        ApplicationBackToAdmin.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        ApplicationBackToAdmin.setForeground(java.awt.Color.white);
        ApplicationBackToAdmin.setText("Back");
        ApplicationBackToAdmin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(53, 66, 74), 0));
        ApplicationBackToAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ApplicationBackToAdminMouseClicked(evt);
            }
        });

        label11.setBackground(new java.awt.Color(53, 66, 74));
        label11.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label11.setForeground(java.awt.Color.white);
        label11.setText("Requested Amount");

        label12.setBackground(new java.awt.Color(53, 66, 74));
        label12.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label12.setForeground(java.awt.Color.white);
        label12.setText("Balance");

        txtrequested_amount.setBackground(new java.awt.Color(53, 66, 74));
        txtrequested_amount.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtrequested_amount.setForeground(java.awt.Color.white);
        txtrequested_amount.setText("Amount");

        Application_status.setBackground(new java.awt.Color(53, 66, 74));
        Application_status.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Application_status.setForeground(java.awt.Color.white);
        Application_status.setText("status");

        txtapplication_balance.setBackground(new java.awt.Color(53, 66, 74));
        txtapplication_balance.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtapplication_balance.setForeground(java.awt.Color.white);
        txtapplication_balance.setText("current amount");

        Applicationclose.setBackground(new java.awt.Color(53, 66, 74));
        Applicationclose.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        Applicationclose.setForeground(java.awt.Color.white);
        Applicationclose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rdphouses/close.png"))); // NOI18N
        Applicationclose.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(53, 66, 74), 0));
        Applicationclose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ApplicationcloseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout applicationLayout = new javax.swing.GroupLayout(application);
        application.setLayout(applicationLayout);
        applicationLayout.setHorizontalGroup(
            applicationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(applicationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(applicationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, applicationLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(label3app1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(276, 276, 276))
                    .addGroup(applicationLayout.createSequentialGroup()
                        .addComponent(ApplicationBackToAdmin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Applicationclose, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(applicationLayout.createSequentialGroup()
                .addGap(199, 199, 199)
                .addGroup(applicationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Application_status, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(applicationLayout.createSequentialGroup()
                        .addGroup(applicationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(appl_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(applicationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtrequested_amount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtapplication_balance, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 261, Short.MAX_VALUE))
        );
        applicationLayout.setVerticalGroup(
            applicationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, applicationLayout.createSequentialGroup()
                .addGroup(applicationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ApplicationBackToAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Applicationclose, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(label3app1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97)
                .addGroup(applicationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(applicationLayout.createSequentialGroup()
                        .addComponent(Application_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtrequested_amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtapplication_balance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(applicationLayout.createSequentialGroup()
                        .addComponent(appl_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(140, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(application, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(application, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ApplicationBackToAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ApplicationBackToAdminMouseClicked
        new AdminHome().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ApplicationBackToAdminMouseClicked

    private void ApplicationcloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ApplicationcloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_ApplicationcloseMouseClicked

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
            java.util.logging.Logger.getLogger(Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Application().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ApplicationBackToAdmin;
    private java.awt.Label Application_status;
    private javax.swing.JLabel Applicationclose;
    private java.awt.Label appl_status;
    private javax.swing.JPanel application;
    private javax.swing.JLabel jLabel1;
    private java.awt.Label label11;
    private java.awt.Label label12;
    private java.awt.Label label3app1;
    private java.awt.Label txtapplication_balance;
    private java.awt.Label txtrequested_amount;
    // End of variables declaration//GEN-END:variables
}