/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formulario_Integradores;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Charlie Cordova
 */
public class frm10_Empresa_Encomienda extends javax.swing.JFrame {

    /**
     * Creates new form frm10_Empresa_Encomienda
     */
    public frm10_Empresa_Encomienda() {
        initComponents();
        setSize(415,325);
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
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Empresa Transportista de Encomiendas");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Por favor, ingrese el peso de su encomienda:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Seleccione un camion :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Seleccione uno>", "Camion 1", "Camion 2", "Camion 3" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 130, 30));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 90, 30));

        jButton1.setText("Ingresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        jButton2.setText("Imprimir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, -1, -1));

        jButton3.setText("Informar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, -1, -1));

        jButton6.setText("Cancelar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Tabla de Precios segun su peso: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Peso mayor a 40 kilos se cobrara 15 $ ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Peso menor o igual a 10 kilos se cobrara 5 $ ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Peso mayor a 10 kilos o menor o igual a 40 kilos se cobrara 10 $ ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setForeground(new java.awt.Color(204, 204, 255));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 380, 100));

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    List<Integer> Camion1 = new ArrayList<>();
    List<Integer> Camion2 = new ArrayList<>();
    List<Integer> Camion3 = new ArrayList<>();
    List<Integer> Camion4 = new ArrayList<>();
    List<Integer> Camion5 = new ArrayList<>();

    String Camion = "";
    int  peso = 0, tpesoc1 = 0,tpesoc2 = 0,tpesoc3 = 0, importeT1 = 0, importea1 = 0, importeb1 = 0, importec1 = 0,
            importeT2 = 0, importea2 = 0, importeb2 = 0, importec2 = 0,
            importeT3 = 0, importea3 = 0, importeb3 = 0, importec3 = 0,
            ntc1 = 0, ntc2 = 0, ntc3 = 0, cantidadextraida = 0,
            contc1 = 0, contc2 = 0, contc3 = 0;
    double promedioc1 = 0, promedioc2 = 0, promedioc3 = 0;
    
    public void proced_ingresodedatos() {
        if (Camion.equals("Camion 1")) {
            contc1++;
            if (peso <= 10) {
                importeT1 += peso * 5;
                tpesoc1 += peso;
                Camion1.add(peso);
            } else if (peso > 10 && peso <= 40) {
                importeT1 += peso * 10;
                tpesoc1 += peso;
                Camion1.add(peso);
            } else if (peso > 40) {
                importeT1 += peso * 15;
                tpesoc1 += peso;
                Camion1.add(peso);
            }
            if (tpesoc1 > 2000) {
                JOptionPane.showMessageDialog(null, "Debido a que el peso de las encomiendas " + "\n"
                        + "del camion 1 ha sobrepasado los 2000 kilos" + "\n"
                        + "se transferira al Camion 2");
                int sobrante = tpesoc1 - 2000;
                cantidadextraida = tpesoc1 - sobrante;
                tpesoc1 = 2000;
                Camion1.add(sobrante);

                tpesoc2 += sobrante;
            }
        } else if (Camion.equals("Camion 2")) {
            contc2++;
            if (peso <= 10) {
                importeT2 += peso * 5;
                tpesoc2 += peso;
                Camion2.add(peso);
            } else if (peso > 10 && peso <= 40) {
                importeT2 += peso * 10;
                tpesoc2 += peso;
                Camion2.add(peso);
            } else if (peso > 40) {
                importeT2 += peso * 15;
                tpesoc2 += peso;
                Camion2.add(peso);
            }
            if (tpesoc2 > 2000) {
                JOptionPane.showMessageDialog(null, "Debido a que el peso de las encomiendas " + "\n"
                        + "del Camion 2 ha sobrepasado los 2000 kilos" + "\n"
                        + "se transferira al Camion 3");
                int sobrante = tpesoc2 - 2000;
                cantidadextraida = tpesoc2 - sobrante;
                tpesoc2 = 2000;
                Camion2.add(sobrante);

                tpesoc3 += sobrante;
            }

        } else if (Camion.equals("Camion 3")) {
            contc3++;
            JOptionPane.showMessageDialog(null, "En el caso del camion 3, no se podra mover el peso de "
                    + "\n" + "la encomienda a otro camion, ya que este es el ultimo" + "\n"
                    + "PRECAUCION CON EL PESO QUE INGRESE (NO EXCEDERSE DE 2000 KILOS");
            if (peso <= 10) {
                importeT3 += peso * 5;
                tpesoc3 += peso;
                Camion3.add(peso);
            } else if (peso > 10 && peso <= 40) {
                importeT3 += peso * 5;
                tpesoc3 += peso;
                Camion3.add(peso);
            } else if (peso > 40) {
                importeT3 += peso * 5;
                tpesoc3 += peso;
                Camion3.add(peso);
            }
        }
    }

    public void proced_infomar_promedio_camiones() {
        promedioc1 = importeT1 / contc1;
        promedioc2 = importeT2 / contc2;
        promedioc3 = importeT3 / contc3;
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Camion = jComboBox1.getSelectedItem().toString();
        peso = Integer.parseInt(jTextField1.getText());

        proced_ingresodedatos();

        jTextField1.setText("");
        jComboBox1.setSelectedIndex(0);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here: 
        JOptionPane.showMessageDialog(null, "Numero del Camion: " + "1" + "\n"
                + "Kg. Transportados: " + Camion1 + "\n"
                + "Importe Cobrado: " + importeT1);

        JOptionPane.showMessageDialog(null, "Numero del Camion: " + "2" + "\n"
                + "Kg. Transportados: " + Camion2 + "\n"
                + "Importe Cobrado: " + importeT2);

        JOptionPane.showMessageDialog(null, "Numero del Camion: " + "3" + "\n"
                + "Kg. Transportados: " + Camion3 + "\n"
                + "Importe Cobrado: " + importeT3);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        proced_infomar_promedio_camiones();
        JOptionPane.showMessageDialog(null, "IMPORTE PROMEDIO RECAUDADO ENTRE TODOS LOS CAMIONES: " + "\n"
                + "Promedio Camion 1: " + promedioc1 + "\n"
                + "Promedio Camion 2: " + promedioc2 + "\n"
                + "Promedio Camion 3: " + promedioc3 + "\n");

    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(frm10_Empresa_Encomienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm10_Empresa_Encomienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm10_Empresa_Encomienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm10_Empresa_Encomienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm10_Empresa_Encomienda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
