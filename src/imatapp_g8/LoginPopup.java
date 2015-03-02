/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imatapp_g8;

import java.awt.Color;

/**
 *
 * @author rasmusdavidsson
 */
public class LoginPopup extends javax.swing.JPanel implements java.beans.Customizer {
    
    private Object bean;

    /**
     * Creates new customizer LoginPopup
     */
    public LoginPopup() {
        initComponents();
    }
    
    public void setObject(Object bean) {
        this.bean = bean;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the FormEditor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        passWtxt = new javax.swing.JTextField();
        usernameTxt = new javax.swing.JTextField();
        loginBtn = new javax.swing.JButton();
        registerBtn = new javax.swing.JButton();
        forgottenPwBtn = new javax.swing.JButton();
        backgroundLabel = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(350, 300));
        setMinimumSize(new java.awt.Dimension(350, 300));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(350, 300));
        setSize(new java.awt.Dimension(350, 320));
        setLayout(null);

        passWtxt.setFont(new java.awt.Font("Helvetica", 0, 13)); // NOI18N
        passWtxt.setForeground(new java.awt.Color(153, 153, 153));
        passWtxt.setText("Lösenord..");
        passWtxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passWtxtMouseClicked(evt);
            }
        });
        add(passWtxt);
        passWtxt.setBounds(20, 100, 290, 50);

        usernameTxt.setFont(new java.awt.Font("Helvetica", 0, 13)); // NOI18N
        usernameTxt.setForeground(new java.awt.Color(153, 153, 153));
        usernameTxt.setText("Användarnamn..");
        usernameTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usernameTxtMouseClicked(evt);
            }
        });
        add(usernameTxt);
        usernameTxt.setBounds(20, 40, 290, 50);

        loginBtn.setFont(new java.awt.Font("Helvetica", 0, 22)); // NOI18N
        loginBtn.setForeground(new java.awt.Color(255, 255, 255));
        loginBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/red2_icon.png"))); // NOI18N
        loginBtn.setText("Logga in");
        loginBtn.setAlignmentY(0.0F);
        loginBtn.setBorder(null);
        loginBtn.setContentAreaFilled(false);
        loginBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        loginBtn.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        loginBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        loginBtn.setIconTextGap(0);
        loginBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        loginBtn.setMaximumSize(new java.awt.Dimension(250, 46));
        loginBtn.setMinimumSize(new java.awt.Dimension(250, 46));
        loginBtn.setPreferredSize(new java.awt.Dimension(250, 46));
        loginBtn.setRequestFocusEnabled(false);
        loginBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/red2_icon_rollover.png"))); // NOI18N
        loginBtn.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/red2_icon_selected.png"))); // NOI18N
        add(loginBtn);
        loginBtn.setBounds(20, 240, 290, 40);

        registerBtn.setText("Registrera");
        registerBtn.setBorder(null);
        registerBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(registerBtn);
        registerBtn.setBounds(17, 180, 80, 16);

        forgottenPwBtn.setText("Glömt lösenord");
        forgottenPwBtn.setBorder(null);
        forgottenPwBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(forgottenPwBtn);
        forgottenPwBtn.setBounds(25, 200, 97, 16);

        backgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/popup.png"))); // NOI18N
        add(backgroundLabel);
        backgroundLabel.setBounds(-10, 0, 350, 300);
    }// </editor-fold>//GEN-END:initComponents

    private void usernameTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameTxtMouseClicked

        usernameTxt.setText("");
        usernameTxt.setForeground(Color.black);
    }//GEN-LAST:event_usernameTxtMouseClicked

    private void passWtxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passWtxtMouseClicked
        passWtxt.setText("");
        passWtxt.setForeground(Color.black);
    }//GEN-LAST:event_passWtxtMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundLabel;
    private javax.swing.JButton forgottenPwBtn;
    private javax.swing.JButton loginBtn;
    private javax.swing.JTextField passWtxt;
    private javax.swing.JButton registerBtn;
    private javax.swing.JTextField usernameTxt;
    // End of variables declaration//GEN-END:variables
}
