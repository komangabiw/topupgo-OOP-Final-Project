/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package MainDialog;

import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author anoth
 */
public class Login extends javax.swing.JDialog {

    /**
     * Creates new form Register
     */
    public Login(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    
    
    public boolean cekUsername(String usernameRegist){
        String sqlcon = "select * from user";
                
        try{
            ResultSet cek = Main.mainConnectionDB.con.createStatement().executeQuery(sqlcon);
            while(cek.next()){
                if(usernameRegist.equals(cek.getString("username"))){
                    return true;
                }
            }
        }catch(SQLException ex){
            System.out.print(ex.toString());
        }
        return false;
    }
    
    public boolean cekLogin(String username, String password){
        String sqlcon = "select * from user";
        try{
            ResultSet cek = Main.mainConnectionDB.con.createStatement().executeQuery(sqlcon);
            while(cek.next()){
                String hassPasswordLogin = Main.passEncrypt.generateSecurePassword(password, cek.getString("salt"));
                if(username.equals(cek.getString("username")) && hassPasswordLogin.equals(cek.getString("password"))){
                    return true;
                }
            }
        }catch(SQLException ex){
            System.out.print(ex.toString());
        }
        return false;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        username = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        Backlogin = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnlogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        username.setBackground(new java.awt.Color(248, 249, 251));
        username.setBorder(null);
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 270, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("X");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 30, 30));

        password.setBackground(new java.awt.Color(247, 249, 251));
        password.setBorder(null);
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 460, 270, 40));

        Backlogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Backlogin.setText("Back");
        Backlogin.setContentAreaFilled(false);
        Backlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackloginActionPerformed(evt);
            }
        });
        getContentPane().add(Backlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Lupa Password ?");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 510, 290, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/project3.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 700));

        btnlogin.setContentAreaFilled(false);
        btnlogin.setBackground(new java.awt.Color(85, 85, 85));
        btnlogin.setFont(new java.awt.Font("Wide Latin", 1, 14)); // NOI18N
        btnlogin.setForeground(new java.awt.Color(255, 255, 255));
        btnlogin.setText("LOGIN");
        btnlogin.setBorder(null);
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });
        getContentPane().add(btnlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 540, 230, 60));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
        if(username.getText().length() > 0){
            if(password.getText().length() > 0){
                if(cekUsername(username.getText())){
                    if(cekLogin(username.getText(), password.getText())){
                        JOptionPane.showMessageDialog(null, "Happy Topup, " + username.getText());
                        Main.main.buttonLogin.setText("Hi, " + username.getText());
                        Main.main.buttonLogin.setBackground(new Color (40, 0, 49));
                        Main.main.exitIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/exit.png")));
                        dispose();
                    }else{
                        JOptionPane.showMessageDialog(null, "Password salah",
                        "Warning", JOptionPane.ERROR_MESSAGE);
                        password.setText("");
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Username ini tidak terdaftar",
                        "Warning", JOptionPane.ERROR_MESSAGE);
                    username.setText("");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Kamu belum input password",
            "Coba Lagi", JOptionPane.INFORMATION_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Kamu belum input username",
            "Coba Lagi", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnloginActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void BackloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackloginActionPerformed
        MainDialog.LoginRegister login = new MainDialog.LoginRegister(null, true);
        dispose();
        login.setVisible(true);
    }//GEN-LAST:event_BackloginActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        MainDialog.ForgetPassword lupa = new MainDialog.ForgetPassword(null, true);
        dispose();
        lupa.setVisible(true);
        
       
    }//GEN-LAST:event_jLabel3MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Login dialog = new Login(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Backlogin;
    private javax.swing.JButton btnlogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
