/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imatapp_g8;

import java.util.ArrayList;
import java.util.List;
import se.chalmers.ait.dat215.project.*;

/**
 *
 * @author frellAn
 */
public class CartPanel extends javax.swing.JPanel {
    
    // Custom variable declaration
    static Controller controller;
    private double totalPrice;
    
    /**
     * Creates new form ShopPanel
     */
    public CartPanel() {
        controller = Controller.getInstance();
        totalPrice = controller.cart.getTotal();
        initComponents();
        List<ShoppingItem> tempList;
        tempList = Controller.cart.getItems();
        for (ShoppingItem item : tempList) {
            itemsGrid.add(new CartPanelItem(item));
        }
    }
    
    public static void update() {
        if (Controller.cart.getItems().size() < 5) {
        itemsGrid.removeAll();
        itemsGrid.repaint();
            for (int i = 0; i < Controller.cart.getItems().size(); i++) {
                itemsGrid.add(new CartPanelItem(Controller.cart.getItems().get(i)));
            }
        itemsGrid.revalidate();
        }
        totalPriceLabel.setText("Totalsumma: " + Double.toString(Controller.cart.getTotal()) + " kr");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        itemGridScrollPane = new javax.swing.JScrollPane();
        itemsGrid = new javax.swing.JPanel();
        checkoutBtn = new javax.swing.JButton();
        totalPriceLabel = new javax.swing.JLabel();
        headerLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(930, 32767));
        setMinimumSize(new java.awt.Dimension(930, 630));
        setPreferredSize(new java.awt.Dimension(930, 630));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        itemGridScrollPane.setBorder(null);
        itemGridScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        itemsGrid.setBackground(new java.awt.Color(255, 255, 255));
        itemsGrid.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 0, 1, new java.awt.Color(0, 0, 0)));
        itemsGrid.setAlignmentX(0.0F);
        itemsGrid.setAlignmentY(0.0F);
        itemsGrid.setMaximumSize(new java.awt.Dimension(920, 590));
        itemsGrid.setLayout(new java.awt.GridLayout(5, 1));
        itemGridScrollPane.setViewportView(itemsGrid);

        add(itemGridScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 44, 700, 570));

        checkoutBtn.setFont(new java.awt.Font("Myriad Pro Light", 0, 17)); // NOI18N
        checkoutBtn.setForeground(new java.awt.Color(255, 255, 255));
        checkoutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/green_icon.png"))); // NOI18N
        checkoutBtn.setText("Köp");
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
        checkoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkoutBtnActionPerformed(evt);
            }
        });
        add(checkoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 570, -1, -1));

        totalPriceLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        totalPriceLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        totalPriceLabel.setText("Totalsumma: " + Double.toString(totalPrice) + " kr"
        );
        add(totalPriceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(744, 540, -1, -1));

        headerLabel.setFont(new java.awt.Font("Myriad Pro", 0, 24)); // NOI18N
        headerLabel.setText("Produkter i kundvagnen:");
        add(headerLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void checkoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkoutBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkoutBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkoutBtn;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JScrollPane itemGridScrollPane;
    private static javax.swing.JPanel itemsGrid;
    protected static javax.swing.JLabel totalPriceLabel;
    // End of variables declaration//GEN-END:variables
}
