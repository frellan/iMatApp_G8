/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imatapp_g8;

import javax.swing.JLabel;

/**
 *
 * @author frellAn
 */
public class Breadcrumbs extends javax.swing.JPanel {

    /**
     * Creates new form Breadcrumbs
     */
    public Breadcrumbs() {
        initComponents();
    }
    
    public Breadcrumbs(String first, String second, String third) {
        initComponents();
        JLabel one = new JLabel(first);
        one.setFont(new java.awt.Font("Myriad Pro", 0, 19));
        add(one);
        if (second != null) {
            JLabel two = new JLabel(" > " + second);
            two.setFont(new java.awt.Font("Myriad Pro", 0, 19));
            add(two);
        }
        if (third != null) {
            JLabel three = new JLabel(" > " + third);
            three.setFont(new java.awt.Font("Myriad Pro", 0, 19));
            add(three);
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

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        setMaximumSize(new java.awt.Dimension(930, 32767));
        setMinimumSize(new java.awt.Dimension(930, 0));
        setPreferredSize(new java.awt.Dimension(930, 30));
        setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
