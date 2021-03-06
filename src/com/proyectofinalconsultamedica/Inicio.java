package com.proyectofinalconsultamedica;


import com.proyectofinalconsultamedica.Insertar;
import com.proyectofinalconsultamedica.Consultar;
import com.proyectofinalconsultamedica.Actualizar;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Esta clase constituye el menú de inicio de la aplicación
 * a travéz de un Menú abre todas las demás clases de la aplicación
 * @author Emilio Moreno Orduña
 * @version 1.0 (28/07/2014)
 * 
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Inicio() {
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

        jPanel1 = new javax.swing.JPanel();
        etiTitulo = new javax.swing.JLabel();
        barraMenus = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        menuItemInsertar = new javax.swing.JMenuItem();
        menuItemConsultar = new javax.swing.JMenuItem();
        menuItemEliminar = new javax.swing.JMenuItem();
        menuItemActualizar = new javax.swing.JMenuItem();
        menuInforme = new javax.swing.JMenu();
        menuItemGenerarInforme = new javax.swing.JMenuItem();
        menuItemMostrarInforme = new javax.swing.JMenuItem();
        menuItemBorrarInforme = new javax.swing.JMenuItem();
        menuItemSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));

        etiTitulo.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        etiTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/proyectofinalconsultamedica/fondo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etiTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etiTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        menuArchivo.setText("Inicio");

        menuItemInsertar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        menuItemInsertar.setText("Insertar");
        menuItemInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemInsertarActionPerformed(evt);
            }
        });
        menuArchivo.add(menuItemInsertar);

        menuItemConsultar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        menuItemConsultar.setText("Consultar");
        menuItemConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemConsultarActionPerformed(evt);
            }
        });
        menuArchivo.add(menuItemConsultar);

        menuItemEliminar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        menuItemEliminar.setText("Eliminar");
        menuItemEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemEliminarActionPerformed(evt);
            }
        });
        menuArchivo.add(menuItemEliminar);

        menuItemActualizar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        menuItemActualizar.setText("Actualizar");
        menuItemActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemActualizarActionPerformed(evt);
            }
        });
        menuArchivo.add(menuItemActualizar);

        menuInforme.setText("Informe");

        menuItemGenerarInforme.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        menuItemGenerarInforme.setText("Generar Informe");
        menuItemGenerarInforme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemGenerarInformeActionPerformed(evt);
            }
        });
        menuInforme.add(menuItemGenerarInforme);

        menuItemMostrarInforme.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        menuItemMostrarInforme.setText("Mostrar Informe");
        menuItemMostrarInforme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemMostrarInformeActionPerformed(evt);
            }
        });
        menuInforme.add(menuItemMostrarInforme);

        menuItemBorrarInforme.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        menuItemBorrarInforme.setText("Borrar Informe");
        menuItemBorrarInforme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemBorrarInformeActionPerformed(evt);
            }
        });
        menuInforme.add(menuItemBorrarInforme);

        menuArchivo.add(menuInforme);

        menuItemSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        menuItemSalir.setText("Salir");
        menuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSalirActionPerformed(evt);
            }
        });
        menuArchivo.add(menuItemSalir);

        barraMenus.add(menuArchivo);

        setJMenuBar(barraMenus);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Evento que muestra el frame Insertar al hacer click en el item del menu Insertar
     * @param evt 
     */
    private void menuItemInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemInsertarActionPerformed
        
        Insertar insertar = new Insertar();
        insertar.setVisible(true);
        
    }//GEN-LAST:event_menuItemInsertarActionPerformed
    /**
     * Evento que muestra el frame Consultar al hacer click en el item del menu Consultar
     * @param evt 
     */
    private void menuItemConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemConsultarActionPerformed

        Consultar consultar = new Consultar();
        consultar.setVisible(true);
    }//GEN-LAST:event_menuItemConsultarActionPerformed
    /**
     * Evento que muestra el frame Eliminar al hacer click en el item del menu Eliminar
     * @param evt 
     */
    private void menuItemEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemEliminarActionPerformed
        Eliminar eliminar = new Eliminar();
        eliminar.setVisible(true);
    }//GEN-LAST:event_menuItemEliminarActionPerformed
    /**
     * Evento que muestra el frame Actualizar al hacer click en el item del menu Actualizar
     * @param evt 
     */
    private void menuItemActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemActualizarActionPerformed
        Actualizar actualizar = new Actualizar();
        actualizar.setVisible(true);
    }//GEN-LAST:event_menuItemActualizarActionPerformed
    /**
     * Evento que ejecuta el método escribirConsultaInforme de la clase Informe al hacer click en el item del menu GenerarInforme
     * @param evt 
     */
    private void menuItemGenerarInformeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemGenerarInformeActionPerformed
      Informe informe = new Informe();
        try {
            informe.escribirConsultaInforme();
        } catch (ClassNotFoundException | IOException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_menuItemGenerarInformeActionPerformed
    /**
     * Evento que cierra el programa al hacer click sobre el item del menú Salir
     * @param evt 
     */
    private void menuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuItemSalirActionPerformed
    /**
     * Evento que ejecuta el método abrir informe de la clase Informe al hacer click en el item del menu MostrarInforme
     * @param evt 
     */
    private void menuItemMostrarInformeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemMostrarInformeActionPerformed
        Informe informe = new Informe();
        informe.abrirInforme();
    }//GEN-LAST:event_menuItemMostrarInformeActionPerformed
    /**
     * Evento que ejecuta el método borrarInforme de la clase Informe al hacer click en el item del menu BorrarInforme
     * @param evt 
     */
    private void menuItemBorrarInformeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemBorrarInformeActionPerformed
        Informe informe = new Informe();
        try {
            informe.borrarInforme();
        } catch (IOException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_menuItemBorrarInformeActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenus;
    private javax.swing.JLabel etiTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenu menuInforme;
    private javax.swing.JMenuItem menuItemActualizar;
    private javax.swing.JMenuItem menuItemBorrarInforme;
    private javax.swing.JMenuItem menuItemConsultar;
    private javax.swing.JMenuItem menuItemEliminar;
    private javax.swing.JMenuItem menuItemGenerarInforme;
    private javax.swing.JMenuItem menuItemInsertar;
    private javax.swing.JMenuItem menuItemMostrarInforme;
    private javax.swing.JMenuItem menuItemSalir;
    // End of variables declaration//GEN-END:variables
}
