/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imatapp_g8;

import javax.swing.*;
import se.chalmers.ait.dat215.project.*;

/**
 *
 * @author frellAn
 */
public class ShopItem extends javax.swing.JPanel {
    
    // Custom variable declaration
    private ImageIcon icon;
    private String name;
    private double price;
    private String unit;

    /**
     * Creates new form ShopItem
     */
    public ShopItem() {
        initComponents();
    }
    
    public ShopItem(Product item) {
        icon = MainWindow.db.getImageIcon(item,174,132);
        name = item.getName();
        price = item.getPrice();
        unit = item.getUnit();
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

        addToCartBtn = new javax.swing.JButton();
        itemIcon = new javax.swing.JLabel();
        itemName = new javax.swing.JLabel();
        itemPrice = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(182, 208));
        setMinimumSize(new java.awt.Dimension(182, 208));
        setPreferredSize(new java.awt.Dimension(182, 208));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addToCartBtn.setFont(new java.awt.Font("Myriad Pro Light", 0, 16)); // NOI18N
        addToCartBtn.setForeground(new java.awt.Color(255, 255, 255));
        addToCartBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buy_icon.png"))); // NOI18N
        addToCartBtn.setText("Lägg till");
        addToCartBtn.setAlignmentY(0.0F);
        addToCartBtn.setBorder(null);
        addToCartBtn.setBorderPainted(false);
        addToCartBtn.setContentAreaFilled(false);
        addToCartBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addToCartBtn.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        addToCartBtn.setDefaultCapable(false);
        addToCartBtn.setFocusPainted(false);
        addToCartBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        addToCartBtn.setIconTextGap(0);
        addToCartBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        addToCartBtn.setMaximumSize(new java.awt.Dimension(110, 46));
        addToCartBtn.setMinimumSize(new java.awt.Dimension(110, 46));
        addToCartBtn.setPreferredSize(new java.awt.Dimension(110, 46));
        addToCartBtn.setRequestFocusEnabled(false);
        addToCartBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/green_icon_rollover.png"))); // NOI18N
        addToCartBtn.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/green_icon_selected.png"))); // NOI18N
        add(addToCartBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 166, 80, 32));

        itemIcon.setIcon(icon);
        itemIcon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        add(itemIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 0, 160, 120));

        itemName.setFont(new java.awt.Font("Myriad Pro", 0, 16)); // NOI18N
        itemName.setText(name);
        add(itemName, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 124, -1, -1));

        itemPrice.setFont(new java.awt.Font("Myriad Pro Light", 0, 18)); // NOI18N
        itemPrice.setText(Double.toString(price) + " " + unit
        );
        add(itemPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 143, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addToCartBtn;
    private javax.swing.JLabel itemIcon;
    private javax.swing.JLabel itemName;
    private javax.swing.JLabel itemPrice;
    // End of variables declaration//GEN-END:variables
}
