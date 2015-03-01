/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imatapp_g8;

import javax.swing.JPanel;
import se.chalmers.ait.dat215.project.*;

/**
 *
 * @author frellAn
 */
public class MainWindow extends javax.swing.JFrame {
    
    // Custom variable declaration
    protected static IMatDataHandler db;
    private boolean switchViewloginPanel = false;
    private boolean switchViewDetailedPanel = false;
    private boolean switchViewRegisterPanel = false;
    public JPanel activePane;

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        db = IMatDataHandler.getInstance();
        initComponents();
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/appicon.png")).getImage());
        setVisiblePanes();
        activePane = shopPanel;
        
        
    }
    
                
    public void createInstanceOfmain(MainWindow main){
        
        LoginPopup.setInstance(main);
        
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginPopup1 = new imatapp_g8.LoginPopup();
        topPanel = new javax.swing.JPanel();
        storeBtn = new javax.swing.JButton();
        recipeBtn = new javax.swing.JButton();
        searchIcon = new javax.swing.JLabel();
        searchField = new javax.swing.JTextField();
        cartIcon = new javax.swing.JLabel();
        cartLabel = new javax.swing.JLabel();
        cartInfoLabel = new javax.swing.JLabel();
        arrowIcon = new javax.swing.JLabel();
        checkoutBtn = new javax.swing.JButton();
        cartBtn = new javax.swing.JButton();
        loginBtn = new javax.swing.JButton();
        shopPanel = new imatapp_g8.ShopPanel();
        detailedPanel2 = new imatapp_g8.DetailedPanel();
        register1 = new imatapp_g8.Register();
        categoryPanel = new imatapp_g8.CategoryPanel();
        menuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("iMat");
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setMaximumSize(new java.awt.Dimension(1156, 1000));
        setMinimumSize(new java.awt.Dimension(1156, 750));
        setPreferredSize(new java.awt.Dimension(1156, 780));
        setResizable(false);
        getContentPane().setLayout(null);
        getContentPane().add(loginPopup1);
        loginPopup1.setBounds(650, 40, 340, 300);

        topPanel.setBackground(new java.awt.Color(226, 87, 76));
        topPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        topPanel.setPreferredSize(new java.awt.Dimension(1050, 47));
        topPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        storeBtn.setFont(new java.awt.Font("Myriad Pro", 0, 22)); // NOI18N
        storeBtn.setForeground(new java.awt.Color(255, 255, 255));
        storeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/red_icon.png"))); // NOI18N
        storeBtn.setAlignmentY(0.0F);
        storeBtn.setContentAreaFilled(false);
        storeBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        storeBtn.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        storeBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        storeBtn.setIconTextGap(0);
        storeBtn.setLabel("Butik");
        storeBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        storeBtn.setMaximumSize(new java.awt.Dimension(110, 46));
        storeBtn.setMinimumSize(new java.awt.Dimension(110, 46));
        storeBtn.setPreferredSize(new java.awt.Dimension(110, 46));
        storeBtn.setRequestFocusEnabled(false);
        storeBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/red_icon_rollover.png"))); // NOI18N
        storeBtn.setSelected(true);
        storeBtn.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/red_icon_selected.png"))); // NOI18N
        topPanel.add(storeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 46));

        recipeBtn.setFont(new java.awt.Font("Myriad Pro", 0, 22)); // NOI18N
        recipeBtn.setForeground(new java.awt.Color(255, 255, 255));
        recipeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/red_icon.png"))); // NOI18N
        recipeBtn.setText("Recept");
        recipeBtn.setAlignmentY(0.0F);
        recipeBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(0, 0, 0)));
        recipeBtn.setContentAreaFilled(false);
        recipeBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        recipeBtn.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        recipeBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        recipeBtn.setIconTextGap(0);
        recipeBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        recipeBtn.setMaximumSize(new java.awt.Dimension(110, 46));
        recipeBtn.setMinimumSize(new java.awt.Dimension(110, 46));
        recipeBtn.setPreferredSize(new java.awt.Dimension(110, 46));
        recipeBtn.setRequestFocusEnabled(false);
        recipeBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/red_icon_rollover.png"))); // NOI18N
        recipeBtn.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/red_icon_selected.png"))); // NOI18N
        topPanel.add(recipeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 110, 46));

        searchIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/search.png"))); // NOI18N
        searchIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        topPanel.add(searchIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(715, 7, 32, 32));

        searchField.setText("Sök...");
        searchField.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.MatteBorder(null), javax.swing.BorderFactory.createEmptyBorder(1, 8, 1, 8)));
        topPanel.add(searchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 7, 520, 32));

        cartIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cart2.png"))); // NOI18N
        cartIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        topPanel.add(cartIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(883, 6, 33, 34));

        cartLabel.setFont(new java.awt.Font("Myriad Pro", 0, 15)); // NOI18N
        cartLabel.setForeground(new java.awt.Color(255, 255, 255));
        cartLabel.setText("12 varor");
        cartLabel.setAlignmentY(0.0F);
        cartLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        topPanel.add(cartLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(924, 7, 60, -1));

        cartInfoLabel.setFont(new java.awt.Font("Myriad Pro", 0, 15)); // NOI18N
        cartInfoLabel.setForeground(new java.awt.Color(255, 255, 255));
        cartInfoLabel.setText("123 kr");
        cartInfoLabel.setAlignmentY(0.0F);
        cartInfoLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        topPanel.add(cartInfoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(924, 25, 60, -1));

        arrowIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arrow.png"))); // NOI18N
        arrowIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        topPanel.add(arrowIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 10, 29, 28));

        checkoutBtn.setFont(new java.awt.Font("Myriad Pro Light", 0, 17)); // NOI18N
        checkoutBtn.setForeground(new java.awt.Color(255, 255, 255));
        checkoutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/green_icon.png"))); // NOI18N
        checkoutBtn.setText("Till kassan");
        checkoutBtn.setAlignmentY(0.0F);
        checkoutBtn.setBorder(null);
        checkoutBtn.setBorderPainted(false);
        checkoutBtn.setContentAreaFilled(false);
        checkoutBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        checkoutBtn.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        checkoutBtn.setDefaultCapable(false);
        checkoutBtn.setFocusPainted(false);
        checkoutBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        checkoutBtn.setIconTextGap(0);
        checkoutBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        checkoutBtn.setMaximumSize(new java.awt.Dimension(110, 46));
        checkoutBtn.setMinimumSize(new java.awt.Dimension(110, 46));
        checkoutBtn.setPreferredSize(new java.awt.Dimension(110, 46));
        checkoutBtn.setRequestFocusEnabled(false);
        checkoutBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/green_icon_rollover.png"))); // NOI18N
        checkoutBtn.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/green_icon_selected.png"))); // NOI18N
        topPanel.add(checkoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1028, 6, 118, 36));

        cartBtn.setFont(new java.awt.Font("Open Sans Semibold", 0, 20)); // NOI18N
        cartBtn.setForeground(new java.awt.Color(255, 255, 255));
        cartBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/red2_icon.png"))); // NOI18N
        cartBtn.setAlignmentY(0.0F);
        cartBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(0, 0, 0)));
        cartBtn.setContentAreaFilled(false);
        cartBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cartBtn.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        cartBtn.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        cartBtn.setIconTextGap(0);
        cartBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        cartBtn.setMaximumSize(new java.awt.Dimension(110, 46));
        cartBtn.setMinimumSize(new java.awt.Dimension(110, 46));
        cartBtn.setPreferredSize(new java.awt.Dimension(150, 46));
        cartBtn.setRequestFocusEnabled(false);
        cartBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/red2_icon_rollover.png"))); // NOI18N
        cartBtn.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/red2_icon_selected.png"))); // NOI18N
        cartBtn.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        topPanel.add(cartBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(874, 0, 276, 46));

        loginBtn.setFont(new java.awt.Font("Myriad Pro Light", 0, 17)); // NOI18N
        loginBtn.setForeground(new java.awt.Color(255, 255, 255));
        loginBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/green_icon.png"))); // NOI18N
        loginBtn.setText("Logga in");
        loginBtn.setAlignmentY(0.0F);
        loginBtn.setBorder(null);
        loginBtn.setBorderPainted(false);
        loginBtn.setContentAreaFilled(false);
        loginBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        loginBtn.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        loginBtn.setDefaultCapable(false);
        loginBtn.setFocusPainted(false);
        loginBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        loginBtn.setIconTextGap(0);
        loginBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        loginBtn.setMaximumSize(new java.awt.Dimension(110, 46));
        loginBtn.setMinimumSize(new java.awt.Dimension(110, 46));
        loginBtn.setPreferredSize(new java.awt.Dimension(110, 46));
        loginBtn.setRequestFocusEnabled(false);
        loginBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/green_icon_rollover.png"))); // NOI18N
        loginBtn.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/green_icon_selected.png"))); // NOI18N
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });
        topPanel.add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(752, 6, 118, 36));

        getContentPane().add(topPanel);
        topPanel.setBounds(0, 0, 1150, 50);
        getContentPane().add(shopPanel);
        shopPanel.setBounds(220, 50, 1150, 728);
        getContentPane().add(detailedPanel2);
        detailedPanel2.setBounds(220, 50, 930, 680);
        getContentPane().add(register1);
        register1.setBounds(220, 50, 930, 680);

        categoryPanel.setPreferredSize(new java.awt.Dimension(220, 550));
        getContentPane().add(categoryPanel);
        categoryPanel.setBounds(0, 50, 1150, 728);

        jMenu1.setText("File");
        menuBar.add(jMenu1);

        jMenu2.setText("Edit");
        menuBar.add(jMenu2);

        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setVisiblePanes(){
        setIfShowLoginScreen(false);
        setIfShowDetailedView(false);
        setIfShowRegisterWindow(false);
    }
    
    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        // Klickar på login knappen
        setIfShowLoginScreen(switchViewloginPanel);

    }//GEN-LAST:event_loginBtnActionPerformed

    public void setIfShowDetailedView(boolean b){
        if(b){
            activePane.setVisible(false);
            activePane = detailedPanel2;
        }
        detailedPanel2.setVisible(b);
        switchViewDetailedPanel = !b;
        
    }
    public void setIfShowLoginScreen(boolean b){
            loginPopup1.setVisible(b);
            switchViewloginPanel = !b;
    }
    public void setIfShowRegisterWindow(boolean b){
         if(b){
            activePane.setVisible(false);
            activePane = register1;
        }
        register1.setVisible(b);
        switchViewRegisterPanel = !b;
    }
    
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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MainWindow main = new MainWindow();
                main.setVisible(true);
                main.createInstanceOfmain(main);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel arrowIcon;
    private javax.swing.JButton cartBtn;
    private javax.swing.JLabel cartIcon;
    private javax.swing.JLabel cartInfoLabel;
    private javax.swing.JLabel cartLabel;
    private imatapp_g8.CategoryPanel categoryPanel;
    private javax.swing.JButton checkoutBtn;
    private imatapp_g8.DetailedPanel detailedPanel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JButton loginBtn;
    private imatapp_g8.LoginPopup loginPopup1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JButton recipeBtn;
    private imatapp_g8.Register register1;
    private javax.swing.JTextField searchField;
    private javax.swing.JLabel searchIcon;
    private imatapp_g8.ShopPanel shopPanel;
    private javax.swing.JButton storeBtn;
    private javax.swing.JPanel topPanel;
    // End of variables declaration//GEN-END:variables
}
