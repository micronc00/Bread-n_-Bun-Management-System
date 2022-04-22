/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bread.n.bun.management.system;

import javax.swing.JOptionPane;
import model.Product;
import dao.ProductDao;

/**
 *
 * @author Ron Carl
 */
public class NewProduct extends javax.swing.JFrame {

    /**
     * Creates new form NewProduct
     */
    public NewProduct() {
        initComponents();
        btnSave.setEnabled(false);
    }

    public void validateFields() {
        String productName = txtProductName.getText();
        String price = txtPrice.getText();
        String quantity = txtQuantity.getText();
        String dateManufactured = txtDateManufactured.getText();
        String expirationDate = txtExpirationDate.getText();
        if (!productName.equals("") && !price.equals("") && !quantity.equals("") && !dateManufactured.equals("") && !expirationDate.equals("")) {
            btnSave.setEnabled(true);
        } else {
            btnSave.setEnabled(false);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtProductName = new javax.swing.JTextField();
        txtQuantity = new javax.swing.JTextField();
        txtDateManufactured = new javax.swing.JTextField();
        txtExpirationDate = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setText("Product Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, -1, 43));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setText("Price");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, -1, 45));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel3.setText("Date Manufactured");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 500, -1, 45));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel4.setText("Expiration Date");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 590, -1, 45));

        txtProductName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtProductName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtProductNameKeyReleased(evt);
            }
        });
        getContentPane().add(txtProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 210, 305, 45));

        txtQuantity.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtQuantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtQuantityKeyReleased(evt);
            }
        });
        getContentPane().add(txtQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 390, 305, 45));

        txtDateManufactured.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtDateManufactured.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDateManufacturedKeyReleased(evt);
            }
        });
        getContentPane().add(txtDateManufactured, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 490, 305, 45));

        txtExpirationDate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtExpirationDate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtExpirationDateKeyReleased(evt);
            }
        });
        getContentPane().add(txtExpirationDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 580, 305, 45));

        btnSave.setBackground(new java.awt.Color(0, 0, 0));
        btnSave.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 232, 202));
        btnSave.setText("Add");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 650, -1, 35));

        btnClear.setBackground(new java.awt.Color(0, 0, 0));
        btnClear.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 232, 202));
        btnClear.setText("Reset");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        getContentPane().add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 650, -1, 35));

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/20220330_095642.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 55, 40));

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit .png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 10, 55, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        jLabel5.setText("New Product");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 100, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel7.setText("Quantity");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 410, -1, -1));

        txtPrice.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPriceKeyReleased(evt);
            }
        });
        getContentPane().add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 300, 305, 48));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/20220330_122338.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Home().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Do you really want to Close Application", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtProductNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProductNameKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txtProductNameKeyReleased

    private void txtPriceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPriceKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txtPriceKeyReleased

    private void txtQuantityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQuantityKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txtQuantityKeyReleased

    private void txtDateManufacturedKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDateManufacturedKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txtDateManufacturedKeyReleased

    private void txtExpirationDateKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtExpirationDateKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txtExpirationDateKeyReleased

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        Product product = new Product();
        product.setProductName(txtProductName.getText());
        product.setPrice(txtPrice.getText());
        product.setQuantity(txtQuantity.getText());
        product.setDateManufactured(txtDateManufactured.getText());
        product.setExpirationDate(txtExpirationDate.getText());
        ProductDao.save(product);
        setVisible(false);
        new NewProduct().setVisible(true);
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new NewProduct().setVisible(true);
    }//GEN-LAST:event_btnClearActionPerformed

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
            java.util.logging.Logger.getLogger(NewProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtDateManufactured;
    private javax.swing.JTextField txtExpirationDate;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtProductName;
    private javax.swing.JTextField txtQuantity;
    // End of variables declaration//GEN-END:variables
}
