/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

<<<<<<< HEAD
import Controlador.ProyectoESport;

=======
>>>>>>> main
/**
 *
 * @author 1gdaw03
 */
public class Equipos extends javax.swing.JFrame {

    /**
     * Creates new form Equipos
     */
<<<<<<< HEAD
    public int elec;
    
=======
>>>>>>> main
    public Equipos() {
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

        G2 = new javax.swing.JButton();
        sentinels = new javax.swing.JButton();
        liquid = new javax.swing.JButton();
        A100thieves = new javax.swing.JButton();
        fnatic = new javax.swing.JButton();
        V1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        G2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fotos/G2.png"))); // NOI18N
        G2.setBorder(null);
        G2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G2ActionPerformed(evt);
            }
        });

        sentinels.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fotos/sentinels.png"))); // NOI18N
        sentinels.setBorder(null);
        sentinels.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sentinelsActionPerformed(evt);
            }
        });

        liquid.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fotos/liquid.png"))); // NOI18N
        liquid.setBorder(null);
        liquid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                liquidActionPerformed(evt);
            }
        });

        A100thieves.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fotos/100thieves.png"))); // NOI18N
        A100thieves.setBorder(null);
        A100thieves.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A100thievesActionPerformed(evt);
            }
        });

        fnatic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fotos/fnatic.png"))); // NOI18N
        fnatic.setBorder(null);
        fnatic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnaticActionPerformed(evt);
            }
        });

        V1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fotos/V1.png"))); // NOI18N
        V1.setBorder(null);
        V1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                V1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sentinels, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A100thieves, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(153, 153, 153)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(G2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fnatic, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(153, 153, 153)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(V1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(liquid, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
<<<<<<< HEAD
<<<<<<< HEAD
                .addContainerGap(76, Short.MAX_VALUE))
=======
                .addContainerGap(140, Short.MAX_VALUE))
>>>>>>> main
=======
                .addContainerGap(76, Short.MAX_VALUE))
>>>>>>> parent of 02320b4... tabla clasificaciones
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(liquid, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sentinels, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(G2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(153, 153, 153)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(A100thieves, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fnatic, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(V1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
<<<<<<< HEAD
<<<<<<< HEAD
                .addContainerGap(92, Short.MAX_VALUE))
=======
                .addContainerGap(113, Short.MAX_VALUE))
>>>>>>> main
=======
                .addContainerGap(92, Short.MAX_VALUE))
>>>>>>> parent of 02320b4... tabla clasificaciones
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sentinelsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sentinelsActionPerformed
<<<<<<< HEAD
    
        elec = 01;
        ProyectoESport.VistaDatosEquipos(elec);
        
        
=======
        // TODO add your handling code here:
>>>>>>> main
    }//GEN-LAST:event_sentinelsActionPerformed

    private void G2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_G2ActionPerformed

    private void liquidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_liquidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_liquidActionPerformed

    private void A100thievesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A100thievesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_A100thievesActionPerformed

    private void fnaticActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnaticActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnaticActionPerformed

    private void V1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_V1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_V1ActionPerformed

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
            java.util.logging.Logger.getLogger(Equipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Equipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Equipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Equipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Equipos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton A100thieves;
    private javax.swing.JButton G2;
    private javax.swing.JButton V1;
    private javax.swing.JButton fnatic;
    private javax.swing.JButton liquid;
    private javax.swing.JButton sentinels;
    // End of variables declaration//GEN-END:variables
}
