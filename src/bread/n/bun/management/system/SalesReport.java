/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bread.n.bun.management.system;

/**
 *
 * @author Ron Carl
 */
public class SalesReport extends javax.swing.JFrame {

    /**
     * Creates new form SalesReport
     */
    public SalesReport() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"3/2/22", "Pizza Bun", "2", "1,500"},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Date", "Ordered", "Quantity", "Total"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 235, 834, 297));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 232, 202));
        jButton1.setText("Search");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(524, 573, -1, 40));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 570, 345, 40));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/20220330_095642.png"))); // NOI18N
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 55, 40));

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit .png"))); // NOI18N
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 10, 55, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        jLabel1.setText("Sales Report");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 70, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ui design main.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(SalesReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SalesReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SalesReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SalesReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SalesReport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
