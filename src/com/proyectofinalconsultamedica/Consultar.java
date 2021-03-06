package com.proyectofinalconsultamedica;


import java.awt.Color;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 * La clase Consultar realiza tres consultas sobre la tabla pacientes de la 
 * base de datos. Muestra pacientes filtrados por dni ó nombre y apellido ó 
 * muestra todos. A la vez genera un log de control de registros realizados correctamete.
 * La clase también permite abrir el log directamente en el blog de notas a través de un
 * botón.
 * @author Emilio Moreno Orduña
 * @version 1.0 28/7/2014
 */
public class Consultar extends javax.swing.JFrame {

    /**
     * Creates new form Consultar
     */
    public Consultar() {
        initComponents();
        optNombreApellido.setSelected(true);
        txtDni.setEnabled(false);
        
        
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
        txtNombre = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        optNombreApellido = new javax.swing.JRadioButton();
        optDni = new javax.swing.JRadioButton();
        optMostrarTodo = new javax.swing.JRadioButton();
        btnConsultar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbTabla = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        btnMostrarLog = new javax.swing.JButton();
        txtComprobar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));

        txtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255), 2));

        txtApellidos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255), 2));

        txtDni.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255), 2));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Apellidos");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("DNI");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Buscar por:");

        optNombreApellido.setSelected(true);
        optNombreApellido.setText("Nombre y Apellidos");
        optNombreApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optNombreApellidoActionPerformed(evt);
            }
        });

        optDni.setText("DNI");
        optDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optDniActionPerformed(evt);
            }
        });

        optMostrarTodo.setText("Mostrar todo");
        optMostrarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optMostrarTodoActionPerformed(evt);
            }
        });

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        tbTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellidos", "DNI", "Dirección", "Teléfono", "Dolencia"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbTabla.setRowSelectionAllowed(false);
        jScrollPane2.setViewportView(tbTabla);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Consulta de pacientes");

        btnMostrarLog.setText("Mostrar Log");
        btnMostrarLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarLogActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(119, 119, 119)
                                .addComponent(jLabel5)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(2, 2, 2)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel2))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel3)))))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(optNombreApellido))
                                    .addGap(215, 215, 215))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(optDni)
                                        .addComponent(optMostrarTodo))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnMostrarLog, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtComprobar, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(10, 10, 10))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(optNombreApellido)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(optDni, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtComprobar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(optMostrarTodo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnMostrarLog, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
    /**
     * Método que devuelve veradero si el dni ó el nombre y los apellidos introducidos 
     * en los campos de texto correspondientes coinciden con uno de
     * la base de datos o falso en el caso contrario.
     * @return boolean existe
     * @throws ClassNotFoundException 
     */
    public boolean comprobarExistencia() throws ClassNotFoundException {
        boolean existe = false;

        try {
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:ConsultaMedica.sqlite");
            Statement stat = conn.createStatement();
            if (optDni.isSelected()) 
            {
                ResultSet rs = stat.executeQuery("SELECT dni FROM pacientes");
                while (rs.next()) {
                    if (rs.getString("dni").equals(txtDni.getText())) {
                        existe = true;
                    }
                }
            }
            if (optNombreApellido.isSelected()) 
            {
                ResultSet rs = stat.executeQuery("SELECT nombre,apellidos FROM pacientes");
                while (rs.next()) {
                    if (rs.getString("nombre").equals(txtNombre.getText()) 
                            & rs.getString("apellidos").equals(txtApellidos.getText()))
                    {
                        existe = true;
                    }
                }
            }
            if(optMostrarTodo.isSelected())
            {
                existe = true;

            }
            stat.close();
            conn.close();

        } catch (SQLException ex) {
            System.out.println("Error");

        }
        return existe;
    }
        /**
         * Método que realiza la consulta SQL recibida mediante parámetro y la vuelca sobre una tabla tipo JTable
         * @param consulta
         * @throws ClassNotFoundException 
         */
        public void seleccionar(String consulta) throws ClassNotFoundException {
            DefaultTableModel tabla = new DefaultTableModel();
            if(comprobarExistencia()){
          try {
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:ConsultaMedica.sqlite");
            Statement stat = conn.createStatement();
            ResultSet rs = stat.executeQuery(consulta);
            ResultSetMetaData rsm=rs.getMetaData();
            ArrayList<Object[]> campos = new ArrayList<>();
            while(rs.next())                                      
        {   
            //Obtenemos el número de columnas de la BBDD y la asignamos a un objeto de la lista columnas
            Object[] columnas = new Object[rsm.getColumnCount()];
            for(int i=0; i<columnas.length;i++)
            {
                columnas[i]=rs.getObject(i+1);
                
            }
            campos.add(columnas);
        }
            //Añadimos las filas de la tabla con los valores de sus campos
            tabla= (DefaultTableModel)tbTabla.getModel();
            for (int i=0; i<campos.size(); i++)
            {
                tabla.addRow(campos.get(i));
            }
            txtComprobar.setBackground(Color.green);
            txtComprobar.setText("Consulta realizada con éxito");
            stat.close();
            conn.close();
            
        } catch (SQLException ex) {
            System.out.println("Error");
           
            
        }
            }else{
            txtComprobar.setBackground(Color.red);
            txtComprobar.setText("Los datos introducidos no corresponden a ningún paciente");
            }
    }
        /**
         * Evento que ejecuta el método seleccionar pasándole como parámentro consulta los
         * valores introducidos en los diferentes JTextField
         * @param evt 
         */
    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
            String consulta = "";
            //Si nombre y apellidos está seleccionado optenemos 
            //los valores de los campos de texto Nombre y Apellidos para la consulta
            if(optNombreApellido.isSelected())
            {

                consulta = "SELECT * FROM pacientes where nombre='"+txtNombre.getText()
                        +"'"+"AND apellidos="+"'"+txtApellidos.getText()+"'";
            }
            //Si dni está seleccionado optenemos el valor del campo dni para la consulta
            if(optDni.isSelected())
            {
            
                consulta = "SELECT * FROM pacientes where dni='"+txtDni.getText()
                        +"'";
            }
            //Si mostrarTodo  está seleccionado optenemos el valor del campo mostrarTodo para la consulta
            if(optMostrarTodo.isSelected())
            {
               
                consulta = "SELECT * FROM pacientes";
            }
        try { 
            
            seleccionar(consulta);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Consultar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
  
  
        
    }//GEN-LAST:event_btnConsultarActionPerformed
    /**
     * Evento que cierra la ventana al hacer click sobre el botón salir
     * @param evt 
     */
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed
/**
 * Evento que activa y descativa propiedades los campos de texto y los botones de opción al hacer click sobre
 * el botón de opcion de Nombre y Apellidos
 * @param evt 
 */
    private void optNombreApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optNombreApellidoActionPerformed
     
        optNombreApellido.setSelected(true);
        optDni.setSelected(false);
        optMostrarTodo.setSelected(false);
        txtNombre.setEnabled(true);
        txtApellidos.setEnabled(true);
        txtDni.setEnabled(false);
        txtDni.setText(null);
     

    }//GEN-LAST:event_optNombreApellidoActionPerformed
    /**
 * Evento que activa y descativa propiedades los campos de texto y los botones de opción al hacer click sobre
 * el botón de opcion de Dni
 * @param evt 
 */
    private void optDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optDniActionPerformed
            optDni.setSelected(true);
            optNombreApellido.setSelected(false);
            optMostrarTodo.setSelected(false);
            txtDni.setEnabled(true);
            txtNombre.setEnabled(false);
            txtNombre.setText(null);
            txtApellidos.setEnabled(false);
            txtApellidos.setText(null);
       
    }//GEN-LAST:event_optDniActionPerformed
    /**
 * Evento que activa y descativa propiedades los campos de texto y los botones de opción al hacer click sobre
 * el botón de opcion de Mostrar todo
 * @param evt 
 */
    private void optMostrarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optMostrarTodoActionPerformed
            optMostrarTodo.setSelected(true);
            optNombreApellido.setSelected(false);
            optDni.setSelected(false);
            txtDni.setEnabled(false);
            txtDni.setText(null);
            txtNombre.setEnabled(false);
            txtNombre.setText(null);
            txtApellidos.setEnabled(false);
            txtApellidos.setText(null);
       
    }//GEN-LAST:event_optMostrarTodoActionPerformed

    private void btnMostrarLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarLogActionPerformed
        try {
            Runtime obj = Runtime.getRuntime();
            //La instrucción es notepad para abrir el bloc de notas, espacio
            //y la ruta donde esta el archivo
            obj.exec("notepad "+System.getProperty("user.dir")+"\\logRegistros.txt");
            //System.getProperty("user.dir") Obtiene la ruta del proyecto
        } catch (IOException ex) {
             System.out.println("IOException "+ex.getMessage());
        }
    }//GEN-LAST:event_btnMostrarLogActionPerformed

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
            java.util.logging.Logger.getLogger(Consultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consultar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnMostrarLog;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton optDni;
    private javax.swing.JRadioButton optMostrarTodo;
    private javax.swing.JRadioButton optNombreApellido;
    private javax.swing.JTable tbTabla;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtComprobar;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
