/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author Usuario
 */
public class VistaAdmin extends javax.swing.JFrame {

    /**
     * Creates new form VistaAdmin
     */
    public VistaAdmin() {
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

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        jGeneral = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jIntroResult = new javax.swing.JMenuItem();
        jVerResult = new javax.swing.JMenuItem();
        jAñadirPartido = new javax.swing.JMenuItem();
        jBorrarPartido = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jcJug = new javax.swing.JMenuItem();
        jvJug = new javax.swing.JMenuItem();
        jmJug = new javax.swing.JMenuItem();
        jbJug = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jcEki = new javax.swing.JMenuItem();
        jvEki = new javax.swing.JMenuItem();
        jmEki = new javax.swing.JMenuItem();
        jbEki = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jcDue = new javax.swing.JMenuItem();
        jvDue = new javax.swing.JMenuItem();
        jmDue = new javax.swing.JMenuItem();
        jbDue = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jcUsu = new javax.swing.JMenuItem();
        jvUsu = new javax.swing.JMenuItem();
        jmUsu = new javax.swing.JMenuItem();
        jbUsu = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jGeneral.setText("CLASIFICACION");
        jGeneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGeneralActionPerformed(evt);
            }
        });
        jMenuBar1.add(jGeneral);

        jMenu5.setText("JORNADAS");

        jIntroResult.setText("INTRODUCIR RESULTADO");
        jIntroResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jIntroResultActionPerformed(evt);
            }
        });
        jMenu5.add(jIntroResult);

        jVerResult.setText("VER TODAS");
        jMenu5.add(jVerResult);

        jAñadirPartido.setText("AÑADIR PARTIDO");
        jMenu5.add(jAñadirPartido);

        jBorrarPartido.setText("BORRAR PARTIDO");
        jMenu5.add(jBorrarPartido);

        jMenuBar1.add(jMenu5);

        jMenu3.setText("JUGADORES");

        jcJug.setText("CREAR");
        jcJug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcJugActionPerformed(evt);
            }
        });
        jMenu3.add(jcJug);

        jvJug.setText("VER");
        jvJug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jvJugActionPerformed(evt);
            }
        });
        jMenu3.add(jvJug);

        jmJug.setText("MODIFICAR");
        jmJug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmJugActionPerformed(evt);
            }
        });
        jMenu3.add(jmJug);

        jbJug.setText("BORRAR");
        jbJug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbJugActionPerformed(evt);
            }
        });
        jMenu3.add(jbJug);

        jMenuBar1.add(jMenu3);

        jMenu6.setText("EQUIPOS");

        jcEki.setText("CREAR");
        jcEki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcEkiActionPerformed(evt);
            }
        });
        jMenu6.add(jcEki);

        jvEki.setText("VER");
        jvEki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jvEkiActionPerformed(evt);
            }
        });
        jMenu6.add(jvEki);

        jmEki.setText("MODIFICAR");
        jmEki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmEkiActionPerformed(evt);
            }
        });
        jMenu6.add(jmEki);

        jbEki.setText("BORRAR");
        jbEki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEkiActionPerformed(evt);
            }
        });
        jMenu6.add(jbEki);

        jMenuBar1.add(jMenu6);

        jMenu7.setText("DUEÑOS");

        jcDue.setText("CREAR");
        jcDue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcDueActionPerformed(evt);
            }
        });
        jMenu7.add(jcDue);

        jvDue.setText("VER");
        jvDue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jvDueActionPerformed(evt);
            }
        });
        jMenu7.add(jvDue);

        jmDue.setText("MODIFICAR");
        jmDue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmDueActionPerformed(evt);
            }
        });
        jMenu7.add(jmDue);

        jbDue.setText("BORRAR");
        jbDue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDueActionPerformed(evt);
            }
        });
        jMenu7.add(jbDue);

        jMenuBar1.add(jMenu7);

        jMenu8.setText("USUARIOS");

        jcUsu.setText("CREAR");
        jcUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcUsuActionPerformed(evt);
            }
        });
        jMenu8.add(jcUsu);

        jvUsu.setText("VER");
        jvUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jvUsuActionPerformed(evt);
            }
        });
        jMenu8.add(jvUsu);

        jmUsu.setText("MODIFICAR");
        jmUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmUsuActionPerformed(evt);
            }
        });
        jMenu8.add(jmUsu);

        jbUsu.setText("BORRAR");
        jbUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbUsuActionPerformed(evt);
            }
        });
        jMenu8.add(jbUsu);

        jMenuBar1.add(jMenu8);

        jMenu4.setText("CALENDARIO");

        jMenuItem1.setText("AÑADIR JORNADA");
        jMenu4.add(jMenuItem1);

        jMenuItem2.setText("BORRAR JORNADA");
        jMenu4.add(jMenuItem2);

        jMenuItem3.setText("CREAR CALENDARIO");
        jMenu4.add(jMenuItem3);

        jMenuBar1.add(jMenu4);

        jMenu9.setText("EMPAREJAMIENTOS");
        jMenuBar1.add(jMenu9);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 998, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 643, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jvEkiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jvEkiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jvEkiActionPerformed

    private void jGeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGeneralActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jGeneralActionPerformed

    private void jIntroResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jIntroResultActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jIntroResultActionPerformed

    private void jcJugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcJugActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcJugActionPerformed

    private void jvJugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jvJugActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jvJugActionPerformed

    private void jmJugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmJugActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmJugActionPerformed

    private void jbJugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbJugActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbJugActionPerformed

    private void jbEkiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEkiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbEkiActionPerformed

    private void jmEkiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmEkiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmEkiActionPerformed

    private void jcEkiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcEkiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcEkiActionPerformed

    private void jcDueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcDueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcDueActionPerformed

    private void jvDueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jvDueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jvDueActionPerformed

    private void jmDueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmDueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmDueActionPerformed

    private void jbDueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbDueActionPerformed

    private void jcUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcUsuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcUsuActionPerformed

    private void jvUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jvUsuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jvUsuActionPerformed

    private void jmUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmUsuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmUsuActionPerformed

    private void jbUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbUsuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbUsuActionPerformed

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
            java.util.logging.Logger.getLogger(VistaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jAñadirPartido;
    private javax.swing.JMenuItem jBorrarPartido;
    private javax.swing.JMenu jGeneral;
    private javax.swing.JMenuItem jIntroResult;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jVerResult;
    private javax.swing.JMenuItem jbDue;
    private javax.swing.JMenuItem jbEki;
    private javax.swing.JMenuItem jbJug;
    private javax.swing.JMenuItem jbUsu;
    private javax.swing.JMenuItem jcDue;
    private javax.swing.JMenuItem jcEki;
    private javax.swing.JMenuItem jcJug;
    private javax.swing.JMenuItem jcUsu;
    private javax.swing.JMenuItem jmDue;
    private javax.swing.JMenuItem jmEki;
    private javax.swing.JMenuItem jmJug;
    private javax.swing.JMenuItem jmUsu;
    private javax.swing.JMenuItem jvDue;
    private javax.swing.JMenuItem jvEki;
    private javax.swing.JMenuItem jvJug;
    private javax.swing.JMenuItem jvUsu;
    // End of variables declaration//GEN-END:variables
}
