/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imatapp_g8;

import se.chalmers.ait.dat215.project.*;

/**
 *
 * @author frellAn
 */
public class MainWindow extends javax.swing.JFrame {
    
    // Custom variable declaration
    protected static IMatDataHandler db;

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        db = IMatDataHandler.getInstance();
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/appicon.png")).getImage());
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        categoryPanel = new imatapp_g8.CategoryPanel();
        contentPanel = new javax.swing.JPanel();
        featuredPanel = new imatapp_g8.FeaturedPanel();
        shopPanel = new imatapp_g8.ShopPanel();
        detailedPanel = new imatapp_g8.DetailedPanel();
        breadcrumbs = new imatapp_g8.Breadcrumbs();
        loginPopup = new imatapp_g8.LoginPopup();
        menuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("iMat");
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setMaximumSize(new java.awt.Dimension(1156, 1000));
        setMinimumSize(new java.awt.Dimension(1156, 720));
        setPreferredSize(new java.awt.Dimension(1156, 720));
        setResizable(false);
        getContentPane().setLayout(null);

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
        storeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                storeBtnActionPerformed(evt);
            }
        });
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
        searchField.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 10)));
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
        topPanel.add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(752, 6, 118, 36));

        getContentPane().add(topPanel);
        topPanel.setBounds(0, 0, 1150, 47);

        categoryPanel.setPreferredSize(new java.awt.Dimension(220, 550));
        getContentPane().add(categoryPanel);
        categoryPanel.setBounds(0, 47, 220, 681);

        contentPanel.setLayout(new java.awt.BorderLayout());
        contentPanel.add(featuredPanel, java.awt.BorderLayout.CENTER);
        contentPanel.add(shopPanel, java.awt.BorderLayout.CENTER);
        contentPanel.add(detailedPanel, java.awt.BorderLayout.CENTER);

        getContentPane().add(contentPanel);
        contentPanel.setBounds(220, 47, 930, 680);

        javax.swing.GroupLayout breadcrumbsLayout = new javax.swing.GroupLayout(breadcrumbs);
        breadcrumbs.setLayout(breadcrumbsLayout);
        breadcrumbsLayout.setHorizontalGroup(
            breadcrumbsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 930, Short.MAX_VALUE)
        );
        breadcrumbsLayout.setVerticalGroup(
            breadcrumbsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
        );

        getContentPane().add(breadcrumbs);
        breadcrumbs.setBounds(220, 47, 930, 30);
        getContentPane().add(loginPopup);
        loginPopup.setBounds(645, 34, 350, 300);

        jMenu1.setText("File");
        menuBar.add(jMenu1);

        jMenu2.setText("Edit");
        menuBar.add(jMenu2);

        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void storeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_storeBtnActionPerformed
        contentPanel.removeAll();
        contentPanel.add(new FeaturedPanel());
        contentPanel.revalidate();
        storeBtn.setSelected(true);
        recipeBtn.setSelected(false);
    }//GEN-LAST:event_storeBtnActionPerformed

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
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel arrowIcon;
    private imatapp_g8.Breadcrumbs breadcrumbs;
    private javax.swing.JButton cartBtn;
    private javax.swing.JLabel cartIcon;
    private javax.swing.JLabel cartInfoLabel;
    private javax.swing.JLabel cartLabel;
    private imatapp_g8.CategoryPanel categoryPanel;
    private javax.swing.JButton checkoutBtn;
    protected static javax.swing.JPanel contentPanel;
    private imatapp_g8.DetailedPanel detailedPanel;
    private imatapp_g8.FeaturedPanel featuredPanel;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JButton loginBtn;
    private imatapp_g8.LoginPopup loginPopup;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JButton recipeBtn;
    private javax.swing.JTextField searchField;
    private javax.swing.JLabel searchIcon;
    private imatapp_g8.ShopPanel shopPanel;
    private javax.swing.JButton storeBtn;
    private javax.swing.JPanel topPanel;
    // End of variables declaration//GEN-END:variables
}
