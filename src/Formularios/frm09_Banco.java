/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import javax.swing.JOptionPane;

/**
 *
 * @author Charlie Cordova
 */
public class frm09_Banco extends javax.swing.JFrame {

    /**
     * Creates new form frm09_Banco
     */
    public frm09_Banco() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(this);
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
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Banco Pichincha");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        jLabel2.setText("Codigo de la Zona:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jLabel3.setText("C. de la Sucursal:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel4.setText("Nombre del Cliente:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabel5.setText("Saldo del Cliente:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Seleccione uno>", "Zona 1 a 5", "Zona 6 a 10" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 230, 30));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Seleccione uno>", "Codigo 1 - 10", "Codigo 11 - 20", "Codigo 21 - 30", "Codigo 31 - 35" }));
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 230, 30));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 230, 30));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 230, 30));

        jButton1.setText("Ingresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, -1, -1));

        jButton4.setText("T. General");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 90, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    String Zona = "", Codigo_s = "", Nombrecl = "";
    double saldo = 0, total = 0, totals1 = 0, totals2 = 0,
            totals3 = 0, totals4 = 0, totals12 = 0,
            totals22 = 0, totals32 = 0, totals42 = 0,
            totalz1_5 = 0, totalz6_10 = 0, totalg = 0;

    public void proced_sueldo_acumulado() {
        if (Zona.equals("Zona 1 a 5")) {
            if (Codigo_s.equals("Codigo 1 - 10")) {
                total = saldo;
                totals1 += total;
                totalz1_5 += total;
                JOptionPane.showMessageDialog(null, "Sucursal: " + Codigo_s + "\n"
                        + "Saldo acumulado de todos los clientes: " + totals1 + "\n");
            } else if (Codigo_s.equals("Codigo 11 - 20")) {
                total = saldo;
                totals2 += total;
                totalz1_5 += total;
                JOptionPane.showMessageDialog(null, "Sucursal: " + Codigo_s + "\n"
                        + "Saldo acumulado de todos los clientes: " + totals2 + "\n");
            } else if (Codigo_s.equals("Codigo 21 - 30")) {
                total = saldo;
                totals3 += total;
                totalz1_5 += total;
                JOptionPane.showMessageDialog(null, "Sucursal: " + Codigo_s + "\n"
                        + "Saldo acumulado de todos los clientes: " + totals3 + "\n");
            } else if (Codigo_s.equals("Codigo 31 - 35")) {
                total = saldo;
                totals4 += total;
                totalz1_5 += total;
                JOptionPane.showMessageDialog(null, "Sucursal: " + Codigo_s + "\n"
                        + "Saldo acumulado de todos los clientes: " + totals4 + "\n");
            }
            JOptionPane.showMessageDialog(null, "Total de la Zona 1 - 5: " + totalz1_5);
        }
    }

    public void proced_sueldo_acumulado2() {
        if (Zona.equals("Zona 6 a 10")) {
            if (Codigo_s.equals("Codigo 1 - 10")) {
                total = saldo;
                totals12 += total;
                totalz6_10 += total;
                JOptionPane.showMessageDialog(null, "Sucursal: " + Codigo_s + "\n"
                        + "Saldo acumulado de todos los clientes: " + totals12 + "\n");
            } else if (Codigo_s.equals("Codigo 11 - 20")) {
                total = saldo;
                totals22 += total;
                totalz6_10 += total;
                JOptionPane.showMessageDialog(null, "Sucursal: " + Codigo_s + "\n"
                        + "Saldo acumulado de todos los clientes: " + totals22 + "\n");
            } else if (Codigo_s.equals("Codigo 21 - 30")) {
                total = saldo;
                totals32 += total;
                totalz6_10 += total;
                JOptionPane.showMessageDialog(null, "Sucursal: " + Codigo_s + "\n"
                        + "Saldo acumulado de todos los clientes: " + totals32 + "\n");
            } else if (Codigo_s.equals("Codigo 31 - 35")) {
                total = saldo;
                totals42 += total;
                totalz6_10 += total;
                JOptionPane.showMessageDialog(null, "Sucursal: " + Codigo_s + "\n"
                        + "Saldo acumulado de todos los clientes: " + totals42 + "\n");
            }
            JOptionPane.showMessageDialog(null, "Total de la Zona 6 - 10: " + totalz6_10);
        }
    }

    public double metod_general() {
        totalg = totalz1_5 + totalz6_10;
        return totalg;
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Zona = jComboBox1.getSelectedItem().toString();
        Codigo_s = jComboBox2.getSelectedItem().toString();
        Nombrecl = jTextField1.getText();
        saldo = Double.parseDouble(jTextField2.getText());

        proced_sueldo_acumulado();
        proced_sueldo_acumulado2();
        metod_general();

        jComboBox1.setSelectedIndex(0);
        jComboBox2.setSelectedIndex(0);
        jTextField1.setText("");
        jTextField2.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "El total General del Banco es de: " + totalg + " $");
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(frm09_Banco.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm09_Banco.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm09_Banco.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm09_Banco.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm09_Banco().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
