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
public class frm08_Temperatura extends javax.swing.JFrame {

    /**
     * Creates new form frm08_Temperatura
     */
    public frm08_Temperatura() {
        initComponents();
        setLocationRelativeTo(this);
        setSize(300, 161);
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Medicion de Temperatura");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel2.setText("Botones de accion para las mediciones de temperatura: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, 20));

        jButton1.setText("Mostrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jButton2.setText("Literal A");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, -1, -1));

        jButton3.setText("Literal B");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, -1, -1));

        jButton4.setText("Literal C");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        jButton5.setText("Cancelar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "INFORMACION SOBRE LOS APARATOS Y SUS VALORES: " + "\n"
                + "Aparato 1: " + Aparato1 + "\n"
                + "Aparato 2: " + Aparato2 + "\n"
                + "Aparato 3: " + Aparato3 + "\n");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "VALOR PROMEDIO DE TEMPERATURAS " + "\n"
                + "REGISTRADO POR CADA APARATO:" + "\n"
                + "Aparato 1: " + metod_valor_promedio_aparato1(Aparato1) + "\n"
                + "Aparato 2: " + metod_valor_promedio_aparato2(Aparato2) + "\n"
                + "Aparato 3: " + metod_valor_promedio_aparato3(Aparato3) + "\n");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "EL MAYOR VALOR REGISTRADO" + "\n"
                + "POR CADA APARATO: " + "\n"
                + "Aparato 1: " + metod_mayor_valor_registradoAparato1(Aparato1) + "\n"
                + "Aparato 2: " + metod_mayor_valor_registradoAparato2(Aparato2) + "\n"
                + "Aparato 3: " + metod_mayor_valor_registradoAparato3(Aparato3) + "\n");

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"El numero de aparato que registro el menor promedio es: " 
                + proced_numero_aparato_menor());
    }//GEN-LAST:event_jButton4ActionPerformed

    List<Integer> Aparato1 = new ArrayList<>(Arrays.asList(4, 5, 8, 14, 46, 25, 24, 76, 23, 44));
    List<Integer> Aparato2 = new ArrayList<>(Arrays.asList(1, 7, 2, 12, 54, 67, 34, 26, 31, 66));
    List<Integer> Aparato3 = new ArrayList<>(Arrays.asList(6, 8, 9, 21, 35, 65, 75, 36, 87, 69));
    
    ///LITERAL A:
    
    public int metod_valor_promedio_aparato1(List<Integer> Aparato1){
        int suma1 = 0;
        for(int numero : Aparato1){
            suma1 += numero;
        }
        return suma1/Aparato1.size();
    }
    
    public int metod_valor_promedio_aparato2(List<Integer> Aparato2){
        int suma2 = 0;
        for(int numero : Aparato2){
            suma2 += numero;
        }
        return suma2/Aparato2.size();
    }
    
    public int metod_valor_promedio_aparato3(List<Integer> Aparato3){
        int suma3 = 0;
        for(int numero : Aparato3){
            suma3 += numero;
        }
        return suma3/Aparato3.size();
    }

    ///LITERAL B:
    
    public int metod_mayor_valor_registradoAparato1(List<Integer> Aparato1) {
        int maxnumero1 = -1;
        for (int numero : Aparato1) {
            if (numero >= maxnumero1) {
                maxnumero1 = numero;
            }
        }
        return maxnumero1;
    }
    
    public int metod_mayor_valor_registradoAparato2(List<Integer> Aparato2) {
        int maxnumero2 = -1;
        for (int numero : Aparato2) {
            if (numero >= maxnumero2) {
                maxnumero2 = numero;
            }
        }
        return maxnumero2;
    }
    
    public int metod_mayor_valor_registradoAparato3(List<Integer> Aparato3) {
        int maxnumero3 = -1;
        for (int numero : Aparato3) {
            if (numero >= maxnumero3) {
                maxnumero3 = numero;
            }
        }
        return maxnumero3;
    }

    ///LITERAL C
    
    public String proced_numero_aparato_menor(){
        int menorregistro = Integer.MAX_VALUE;
        String MenorRegistro = "";
        if(menorregistro >= metod_valor_promedio_aparato1(Aparato1)){
            menorregistro = metod_valor_promedio_aparato1(Aparato1);
            MenorRegistro = "1";
        }
        if(menorregistro >= metod_valor_promedio_aparato2(Aparato2)){
            menorregistro = metod_valor_promedio_aparato2(Aparato2);
            MenorRegistro = "2";
        }
        if(menorregistro >= metod_valor_promedio_aparato3(Aparato3)){
            menorregistro = metod_valor_promedio_aparato3(Aparato3);
            MenorRegistro = "3";
        }
        return MenorRegistro;
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
            java.util.logging.Logger.getLogger(frm08_Temperatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm08_Temperatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm08_Temperatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm08_Temperatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm08_Temperatura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
