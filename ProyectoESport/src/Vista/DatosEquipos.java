/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vista;

<<<<<<< HEAD
import Controlador.ProyectoESport;
import ModeloUML.Equipo;
import ModeloUML.Persona;
import java.util.ArrayList;

=======
>>>>>>> main
/**
 *
 * @author 1gdaw03
 */
<<<<<<< HEAD

=======
>>>>>>> main
public class DatosEquipos extends javax.swing.JFrame {

    /** Creates new form DatosEquipos */
    public DatosEquipos() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
<<<<<<< HEAD
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taJug = new javax.swing.JTextArea();
=======
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taJugadoresEquipo = new javax.swing.JTextArea();
        tfEntrenadorEquipo = new javax.swing.JTextField();
        tfAsistenteEquipo = new javax.swing.JTextField();
        tfDueñoEquipo = new javax.swing.JTextField();
>>>>>>> main
        tfIDCal = new javax.swing.JTextField();
        tfPuntosEquipo = new javax.swing.JTextField();
        tfPaginaWeb = new javax.swing.JTextField();
        tfNombreE = new javax.swing.JTextField();
        tfIDE = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ID_Equipo");

        jLabel2.setText("Nombre");

        jLabel3.setText("PaginaWeb");

        jLabel4.setText("Puntos");

        jLabel5.setText("ID_Calendario");

<<<<<<< HEAD
        jLabel9.setText("Integrantes");

        taJug.setColumns(20);
        taJug.setRows(5);
        jScrollPane1.setViewportView(taJug);

        tfPaginaWeb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPaginaWebActionPerformed(evt);
            }
        });
=======
        jLabel6.setText("Dueño");

        jLabel7.setText("Asistente");

        jLabel8.setText("Entrenador");

        jLabel9.setText("Jugadores");

        taJugadoresEquipo.setColumns(20);
        taJugadoresEquipo.setRows(5);
        jScrollPane1.setViewportView(taJugadoresEquipo);
>>>>>>> main

        tfIDE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfIDEActionPerformed(evt);
            }
        });

        jButton1.setText("Atras");
<<<<<<< HEAD
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
=======
>>>>>>> main

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
<<<<<<< HEAD
=======
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
>>>>>>> main
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
<<<<<<< HEAD
=======
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
>>>>>>> main
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
<<<<<<< HEAD
=======
                    .addComponent(tfEntrenadorEquipo)
                    .addComponent(tfAsistenteEquipo)
>>>>>>> main
                    .addComponent(tfIDE)
                    .addComponent(tfNombreE)
                    .addComponent(tfPaginaWeb)
                    .addComponent(tfPuntosEquipo)
<<<<<<< HEAD
                    .addComponent(tfIDCal))
=======
                    .addComponent(tfIDCal)
                    .addComponent(tfDueñoEquipo))
>>>>>>> main
                .addGap(85, 85, 85)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfIDE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfNombreE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfPaginaWeb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfPuntosEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfIDCal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
<<<<<<< HEAD
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jScrollPane1))))
                .addGap(140, 140, 140))
=======
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfDueñoEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tfAsistenteEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tfEntrenadorEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
>>>>>>> main
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfIDEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfIDEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfIDEActionPerformed

<<<<<<< HEAD
    private void tfPaginaWebActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPaginaWebActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPaginaWebActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        ProyectoESport.VistaEquipos();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void llenarDatos(int elec) throws Exception
    {
    
        Equipo e = new Equipo();
        e = ProyectoESport.seleccionarUnEquipoConIntegrantes(elec);
        
        tfIDE.setText(String.valueOf(e.getId()));
        tfNombreE.setText(e.getNombre());
        tfPaginaWeb.setText(e.getPaginaWeb());
        tfPuntosEquipo.setText(String.valueOf(e.getPuntos()));
        tfIDCal.setText(String.valueOf(e.getId_calendario()));
        
        String datos="";
        ArrayList<Persona> lista = e.getPersonas();
        for(int x = 0; x < lista.size(); x++)
            datos+= lista.get(x).toString();
        taJug.setText(datos);
        
    }
    
    
=======
>>>>>>> main
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
            java.util.logging.Logger.getLogger(DatosEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DatosEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DatosEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DatosEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DatosEquipos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
<<<<<<< HEAD
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea taJug;
=======
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea taJugadoresEquipo;
    private javax.swing.JTextField tfAsistenteEquipo;
    private javax.swing.JTextField tfDueñoEquipo;
    private javax.swing.JTextField tfEntrenadorEquipo;
>>>>>>> main
    private javax.swing.JTextField tfIDCal;
    private javax.swing.JTextField tfIDE;
    private javax.swing.JTextField tfNombreE;
    private javax.swing.JTextField tfPaginaWeb;
    private javax.swing.JTextField tfPuntosEquipo;
    // End of variables declaration//GEN-END:variables

}
