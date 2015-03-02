/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imatapp_g8;

import se.chalmers.ait.dat215.project.*;

/**
 *
 * @author Michel
 */
public class DetailedPanel extends javax.swing.JPanel {
    
    Controller tempController = Controller.getInstance();
    Product prod;

    /**
     * Creates new form DetailedPanel
     */
    public DetailedPanel() {
        initComponents();
    }
    
    public DetailedPanel(Product prod) {
        initComponents();
        productIcon.setIcon(MainWindow.db.getImageIcon(prod, 300, 225));
        productTitleLabel.setText(prod.getName());
        priceLabel.setText("Pris: " + prod.getPrice() + " " + prod.getUnit());
        altPriceLabel.setText("Jmf pris: " + prod.getPrice() + " " + prod.getUnit());
        
        this.prod = prod;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        productIcon = new javax.swing.JLabel();
        mainInfoPanel = new javax.swing.JPanel();
        infoScrollPane = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        productTitleLabel = new javax.swing.JLabel();
        infoHeaderLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        buyPanel = new javax.swing.JPanel();
        jSpinner1 = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        altPriceLabel = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        returnButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(930, 630));
        setMinimumSize(new java.awt.Dimension(930, 630));
        setPreferredSize(new java.awt.Dimension(930, 630));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        productIcon.setBackground(java.awt.Color.orange);
        productIcon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        productIcon.setOpaque(true);
        add(productIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 300, 225));

        mainInfoPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainInfoPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        infoScrollPane.setBorder(null);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("...");
        jTextArea1.setBorder(null);
        infoScrollPane.setViewportView(jTextArea1);

        mainInfoPanel.add(infoScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 109, 509, 300));

        productTitleLabel.setBackground(new java.awt.Color(255, 255, 255));
        productTitleLabel.setFont(new java.awt.Font("Myriad Pro Light", 0, 36)); // NOI18N
        productTitleLabel.setText("<Varunamn>");
        productTitleLabel.setOpaque(true);
        mainInfoPanel.add(productTitleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 293, -1));

        infoHeaderLabel.setFont(new java.awt.Font("Myriad Pro Light", 0, 18)); // NOI18N
        infoHeaderLabel.setText("Produktinformation:");
        mainInfoPanel.add(infoHeaderLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 70, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        mainInfoPanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 96, 519, 10));

        add(mainInfoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 45, -1, -1));

        buyPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));

        jButton1.setFont(new java.awt.Font("Myriad Pro Light", 0, 18)); // NOI18N
        jButton1.setText("Lägg till");

        jLabel5.setText("st");

        priceLabel.setFont(new java.awt.Font("Myriad Pro", 1, 18)); // NOI18N
        priceLabel.setText("Pris: <Pris> kr");

        altPriceLabel.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        altPriceLabel.setText("Jmf pris: <Pris> kr/kg");

        javax.swing.GroupLayout buyPanelLayout = new javax.swing.GroupLayout(buyPanel);
        buyPanel.setLayout(buyPanelLayout);
        buyPanelLayout.setHorizontalGroup(
            buyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(buyPanelLayout.createSequentialGroup()
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(priceLabel)
                    .addComponent(altPriceLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        buyPanelLayout.setVerticalGroup(
            buyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(priceLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(altPriceLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(buyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        add(buyPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        jLabel14.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        jLabel14.setText("Ingår i dessa recept:");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 441, -1, -1));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 461, 890, 10));

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 833, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );

        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 477, 835, -1));

        returnButton.setText("Tillbaka");
        returnButton.setActionCommand("Tillbaka");
        returnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButtonActionPerformed(evt);
            }
        });
        add(returnButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
        
        if(Controller.categoryCheck == 0){
            tempController.showShopCategory(prod.getCategory());
        }else{
            tempController.showShopAllProducts();
        }
        
    }//GEN-LAST:event_returnButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel altPriceLabel;
    private javax.swing.JPanel buyPanel;
    private javax.swing.JLabel infoHeaderLabel;
    private javax.swing.JScrollPane infoScrollPane;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPanel mainInfoPanel;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JLabel productIcon;
    private javax.swing.JLabel productTitleLabel;
    private javax.swing.JButton returnButton;
    // End of variables declaration//GEN-END:variables
}
