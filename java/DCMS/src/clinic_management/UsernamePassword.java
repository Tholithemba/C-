
package clinic_management;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author tholithemba
 */
public class UsernamePassword extends javax.swing.JFrame {

    UpdateDataFields udf = new UpdateDataFields();
    /**
     * Creates new form UsernamePassword
     */
    public UsernamePassword() {
        initComponents();
    }
    
    //validate input from the user
    private boolean validInput()
    {
        GenerateRandomChar grc = new GenerateRandomChar();
        String orig_password = String.valueOf(txtupdate_paswrd.getPassword());
        String retyped_password = String.valueOf(txtretype_paswrd.getPassword());
        if(txtupdate_paswrd.getPassword().length != 10)
        {
            lblerror.setText("the lenght of password must be ten charectors");
            clearCells();
            return false;
        }
        
        if(!orig_password.equals(retyped_password))
        {
            lblerror.setText("Password does not match");
            clearCells();
            return false;           
        }
        udf.setFieldData(grc.passwordEncryption(orig_password));
        
        return true;
    }
    //end of validInput() method
    
    //clear error message
    private void clearErrorText()
    {
        lblerror.setText("");
    }
    
    //clear input textfields
    private void clearCells()
    {
        txtupdate_paswrd.setText("");
        txtretype_paswrd.setText("");
    }
    
    //update password
    private boolean updatePassword(){
        
        String query_statement = quiry_string();
        boolean updated = udf.addUpdatedData(query_statement);
        if(updated){
            lblerror.setForeground(Color.green);
            lblerror.setText("update was successfull....");
        }else{
            JOptionPane.showMessageDialog(null, "Please contact the administrator");
        }
        
        return updated;
    }
    
    
    //return query string base on active user
    private String quiry_string()
    { 
        String quiry = "";
        Login login = new Login();
        
        if(login.getActiveDoctor())
            quiry = "update DOCTOR set PASSWORD=? where PRACTICE_NUMBER=?";
        else if(login.getActivePatien())
            quiry = "update PATIENT set PASSWORD=? where EMAIL=?";
        
        return quiry;
    }
    
    //back to doctor home page if doctor is active
    //otherwise back to patient home page
    private void backTo()
    {
        if(new Login().getActiveDoctor())
        {
            new Doctor().setVisible(true);
            this.setVisible(false);
        }
        else
        {
            new PatientHome().setVisible(true);
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        generatePassword = new javax.swing.JButton();
        closeAllUpdates = new javax.swing.JLabel();
        BackToPatDoc = new javax.swing.JLabel();
        label1 = new java.awt.Label();
        lblerror = new java.awt.Label();
        txtupdate_paswrd = new javax.swing.JPasswordField();
        txtretype_paswrd = new javax.swing.JPasswordField();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(25, 25, 112));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.yellow, 3));

        generatePassword.setBackground(java.awt.Color.green);
        generatePassword.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        generatePassword.setForeground(java.awt.Color.white);
        generatePassword.setText("Update ");
        generatePassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                generatePasswordMouseClicked(evt);
            }
        });

        closeAllUpdates.setIcon(new javax.swing.ImageIcon("/home/tholithemba/Desktop/github/java/RDPhouses/close.png")); // NOI18N
        closeAllUpdates.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeAllUpdatesMouseClicked(evt);
            }
        });

        BackToPatDoc.setBackground(new java.awt.Color(53, 66, 74));
        BackToPatDoc.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        BackToPatDoc.setForeground(java.awt.Color.white);
        BackToPatDoc.setIcon(new javax.swing.ImageIcon("/home/tholithemba/Desktop/github/java/RDPhouses/arrow.png")); // NOI18N
        BackToPatDoc.setText("Back");
        BackToPatDoc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(53, 66, 74), 0));
        BackToPatDoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackToPatDocMouseClicked(evt);
            }
        });

        label1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label1.setForeground(java.awt.Color.white);
        label1.setText("Update password");

        lblerror.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblerror.setForeground(java.awt.Color.red);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BackToPatDoc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 855, Short.MAX_VALUE)
                .addComponent(closeAllUpdates, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(367, 367, 367)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblerror, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtretype_paswrd, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtupdate_paswrd, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(generatePassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(closeAllUpdates, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BackToPatDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(lblerror, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtupdate_paswrd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtretype_paswrd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(generatePassword)
                .addGap(106, 106, 106))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeAllUpdatesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeAllUpdatesMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeAllUpdatesMouseClicked

    private void BackToPatDocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackToPatDocMouseClicked
        backTo();
    }//GEN-LAST:event_BackToPatDocMouseClicked

    private void generatePasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generatePasswordMouseClicked
     
        SendEmail se = new SendEmail();
        clearErrorText();
        udf.setHeadingName("PASSWORD");
        if(!(validInput()))return;
        if(!updatePassword())return;
        clearCells();
        if(new Login().getActiveDoctor())return;
        se.sendEmail();       
    }//GEN-LAST:event_generatePasswordMouseClicked

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
            java.util.logging.Logger.getLogger(UsernamePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UsernamePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UsernamePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UsernamePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UsernamePassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackToPatDoc;
    private javax.swing.JLabel closeAllUpdates;
    private javax.swing.JButton generatePassword;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private java.awt.Label label1;
    private java.awt.Label lblerror;
    private javax.swing.JPasswordField txtretype_paswrd;
    private javax.swing.JPasswordField txtupdate_paswrd;
    // End of variables declaration//GEN-END:variables
}
