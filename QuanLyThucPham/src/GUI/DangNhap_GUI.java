/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class DangNhap_GUI extends javax.swing.JFrame {

    /**
     * Creates new form DangNhap_GUI
     */
    public DangNhap_GUI() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setMinimumSize(new Dimension(830, 556));
        
    }
    public static ResultSet rs=null;
public static PreparedStatement pst=null;
public  String TenDangNhap;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_exit_login = new javax.swing.JLabel();
        TieuDe = new javax.swing.JLabel();
        TitleTenDangNhap = new javax.swing.JLabel();
        TitileMatKhau = new javax.swing.JLabel();
        TenDangNhapTxt = new javax.swing.JTextField();
        PasswordTxt = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();
        btn_dangKi = new javax.swing.JButton();
        BackGround = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(830, 556));
        setMinimumSize(new java.awt.Dimension(830, 556));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(830, 556));
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_exit_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/close-button (1).png"))); // NOI18N
        lb_exit_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_exit_loginMouseClicked(evt);
            }
        });
        getContentPane().add(lb_exit_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 20, -1, 30));

        TieuDe.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        TieuDe.setText("Quản Lý Bán Hàng");
        getContentPane().add(TieuDe, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, -1, -1));

        TitleTenDangNhap.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TitleTenDangNhap.setText("Tên đăng nhập");
        getContentPane().add(TitleTenDangNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, -1, -1));

        TitileMatKhau.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TitileMatKhau.setText("Mật khẩu");
        getContentPane().add(TitileMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, -1, -1));

        TenDangNhapTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TenDangNhapTxt.setText("nhanvien1");
        TenDangNhapTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TenDangNhapTxtActionPerformed(evt);
            }
        });
        TenDangNhapTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TenDangNhapTxtKeyPressed(evt);
            }
        });
        getContentPane().add(TenDangNhapTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 200, 40));

        PasswordTxt.setText("123");
        PasswordTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PasswordTxtMouseClicked(evt);
            }
        });
        PasswordTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordTxtActionPerformed(evt);
            }
        });
        PasswordTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PasswordTxtKeyPressed(evt);
            }
        });
        getContentPane().add(PasswordTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, 200, 40));

        loginButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        loginButton.setText("Đăng nhập");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        getContentPane().add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, -1, -1));

        btn_dangKi.setText("Đăng kí");
        btn_dangKi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dangKiActionPerformed(evt);
            }
        });
        getContentPane().add(btn_dangKi, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, -1, -1));

        BackGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background-login.jpg"))); // NOI18N
        BackGround.setName(""); // NOI18N
        getContentPane().add(BackGround, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TenDangNhapTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TenDangNhapTxtActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_TenDangNhapTxtActionPerformed
    public static int flag = 0;
    
    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        if(TenDangNhapTxt.getText().length()==0 && String.valueOf(PasswordTxt.getText()).length()==0){
            JOptionPane.showMessageDialog(null,"Bạn chưa nhập thông tin tài khoản mật khẩu!!");
        }else{
            BUS.DangNhap_BUS dn= new BUS.DangNhap_BUS();

            if(dn.DangNhap(TenDangNhapTxt.getText(), PasswordTxt.getText())){
                TenDangNhap=this.TenDangNhapTxt.getText();
                Main_Menu menu= new Main_Menu();
                this.setVisible(false);
                menu.setVisible(true);
                menu.login_scr(TenDangNhap);
                flag = dn.check_account(TenDangNhap, PasswordTxt.getText());
                Main_Menu.id_nv = dn.getID_nv(TenDangNhap, PasswordTxt.getText());
                this.dispose();

            }else{
                JOptionPane.showMessageDialog(null, "Tài khoản không tồn tại","Thông báo",1);
            }
        }

    }//GEN-LAST:event_loginButtonActionPerformed

    private void lb_exit_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_exit_loginMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_lb_exit_loginMouseClicked

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            loginButton.doClick();
        }
    }//GEN-LAST:event_formKeyPressed

    private void PasswordTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordTxtActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_PasswordTxtActionPerformed

    private void PasswordTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PasswordTxtKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            loginButton.doClick();
        }
    }//GEN-LAST:event_PasswordTxtKeyPressed

    private void TenDangNhapTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TenDangNhapTxtKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            loginButton.doClick();
        }
    }//GEN-LAST:event_TenDangNhapTxtKeyPressed

    private void PasswordTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PasswordTxtMouseClicked
        // TODO add your handling code here:
        PasswordTxt.setText("");
    }//GEN-LAST:event_PasswordTxtMouseClicked

    private void btn_dangKiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dangKiActionPerformed
        // TODO add your handling code here:
        DangKi_GUI dk = new DangKi_GUI();
        dk.setVisible(true);
    }//GEN-LAST:event_btn_dangKiActionPerformed

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
            java.util.logging.Logger.getLogger(DangNhap_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangNhap_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangNhap_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangNhap_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DangNhap_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackGround;
    private javax.swing.JPasswordField PasswordTxt;
    public static javax.swing.JTextField TenDangNhapTxt;
    private javax.swing.JLabel TieuDe;
    private javax.swing.JLabel TitileMatKhau;
    private javax.swing.JLabel TitleTenDangNhap;
    private javax.swing.JButton btn_dangKi;
    private javax.swing.JLabel lb_exit_login;
    private javax.swing.JButton loginButton;
    // End of variables declaration//GEN-END:variables
}
