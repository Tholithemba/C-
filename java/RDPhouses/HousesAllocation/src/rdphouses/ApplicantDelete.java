/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rdphouses;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author tholithemba
 */
public class ApplicantDelete extends javax.swing.JFrame {

    /**
     * Creates new form ApplicantDelete
     */
    public ApplicantDelete() {
        initComponents();
    }
    
    private boolean validateInput()
    {
        if(txtApplicantUsername.getText().equals(""))
        {
            lblerror_text.setText("Enter Applicant username");
            return false;
        }
        
        return true;
    }
    
    private void setValue()
    {
        Registration reg = new Registration();
        reg.setUsername(txtApplicantUsername.getText());
    }
    
    private boolean deleteApplicant()
    {
        Crud crud = new Crud();
        String query = "delete from APPLICANT where applicant_username=?";
        boolean success = crud.deleteData(query);
        
        if(!success)
        {
            lblerror_text.setText("Applicant username does not exist");
            clearText();
            return success;
        }
        
        return success;
    }
    
    
    private void clearText()
    {
        txtApplicantUsername.setText("");
    }
    
    private void clearErrorMessage()
    {
        lblerror_text.setText("");
    }
    
    private void successMessage()
    {
        JOptionPane.showMessageDialog(null, "data deleted successfully....");
    }
    
    private void activeUser()
    {
        Login login = new Login();
        if(login.getapplicantActive())
        {
            login.setVisible(true);
            this.setVisible(false);
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

        documents = new javax.swing.JPanel();
        closeApplicantDelete = new javax.swing.JLabel();
        BackTApplicantHome = new javax.swing.JLabel();
        txtApplicantUsername = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btndeleteApplicant = new javax.swing.JButton();
        lblerror_text = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        documents.setBackground(new java.awt.Color(53, 66, 74));
        documents.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(232, 73, 29), 3));

        closeApplicantDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rdphouses/close.png"))); // NOI18N
        closeApplicantDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeApplicantDeleteMouseClicked(evt);
            }
        });

        BackTApplicantHome.setBackground(new java.awt.Color(53, 66, 74));
        BackTApplicantHome.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        BackTApplicantHome.setForeground(java.awt.Color.white);
        BackTApplicantHome.setText("Back");
        BackTApplicantHome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(53, 66, 74), 0));
        BackTApplicantHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackTApplicantHomeMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("Username");

        btndeleteApplicant.setBackground(java.awt.Color.red);
        btndeleteApplicant.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        btndeleteApplicant.setForeground(java.awt.Color.white);
        btndeleteApplicant.setText("Delete");
        btndeleteApplicant.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btndeleteApplicantMouseClicked(evt);
            }
        });

        lblerror_text.setAlignment(java.awt.Label.CENTER);
        lblerror_text.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblerror_text.setForeground(java.awt.Color.red);

        javax.swing.GroupLayout documentsLayout = new javax.swing.GroupLayout(documents);
        documents.setLayout(documentsLayout);
        documentsLayout.setHorizontalGroup(
            documentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, documentsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BackTApplicantHome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 870, Short.MAX_VALUE)
                .addComponent(closeApplicantDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(documentsLayout.createSequentialGroup()
                .addGap(305, 305, 305)
                .addGroup(documentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(documentsLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(documentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtApplicantUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(documentsLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(btndeleteApplicant, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(lblerror_text, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        documentsLayout.setVerticalGroup(
            documentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(documentsLayout.createSequentialGroup()
                .addGroup(documentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(closeApplicantDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BackTApplicantHome, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(lblerror_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtApplicantUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(btndeleteApplicant)
                .addContainerGap(114, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(documents, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(documents, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeApplicantDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeApplicantDeleteMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeApplicantDeleteMouseClicked

    private void BackTApplicantHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackTApplicantHomeMouseClicked
        new AdminApplicant().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BackTApplicantHomeMouseClicked

    private void btndeleteApplicantMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndeleteApplicantMouseClicked
        
        clearErrorMessage();
        if(!validateInput())return;
        setValue();
        if(!deleteApplicant())return;
        successMessage();
        clearText();
        activeUser();
    }//GEN-LAST:event_btndeleteApplicantMouseClicked

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
            java.util.logging.Logger.getLogger(ApplicantDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ApplicantDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ApplicantDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ApplicantDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ApplicantDelete().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackTApplicantHome;
    private javax.swing.JButton btndeleteApplicant;
    private javax.swing.JLabel closeApplicantDelete;
    private javax.swing.JPanel documents;
    private javax.swing.JLabel jLabel1;
    private java.awt.Label lblerror_text;
    private javax.swing.JTextField txtApplicantUsername;
    // End of variables declaration//GEN-END:variables
}
