package com.proyectofinalconsultamedica;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * La clase Informe, genera un archivo *.txt que guarda todos los datos de la tabla
 * pacientes de la base de datos. Además dicha clase permite asignar la apertura directamente
 * en un bloc de notas.
 * @author Emilio Moreno Orduña
 * @version 1.0 28/7/2014
 */
public class Informe {
    /**
     * Constructor por defecto
     */
    public Informe(){}
   /**
    * Métod que guarda una sentencia SQl en una variable tipo String para ejecutar el método ficheroInforme()
    * @throws ClassNotFoundException
    * @throws IOException 
    */
    public void escribirConsultaInforme() throws ClassNotFoundException, IOException {
          try {
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:ConsultaMedica.sqlite");
            Statement stat = conn.createStatement();
            ResultSet rs = stat.executeQuery("SELECT * FROM pacientes");
            inicioInforme();
            while(rs.next())                                        
        {
         
         String consulta="",separacion="";    
         consulta = "Nombre: "+rs.getString(1)+" Apellidos: "+rs.getString(2)+" DNI: "+rs.getString(3)
                 +" Dirección: "+rs.getString(4)+" Teléfono: "+rs.getString(5)+" Dolencia: "+rs.getString(6);
            ficheroInforme(consulta);
            separacion = "-----------------------------------------------------------------------------------------";
            ficheroInforme(separacion);
        }
            finInforme();
            stat.close();
            conn.close();
            
        } catch (SQLException ex) {
            System.out.println("Error");
            
        }

    }
    /**
     * Método que escribe lineas completas pasádas como parámetro por el método 
     * escribirConsultaInforme en el fichero de tipo  *.txt guardado en la ráiz del proyecto
     * @param linea tipo String
     * @throws IOException 
     */
    public void ficheroInforme(String linea) throws IOException{
        BufferedWriter informe = new BufferedWriter(new FileWriter("informe.txt",true));
        informe.write(linea);
        informe.newLine();
        informe.close();
    }
    /**
     * Método que escribe lineas completas para marcar el inicio de un informe
     * en el fichero de tipo  *.txt guardado en la ráiz del proyecto
     * @throws IOException 
     */
    public void inicioInforme() throws IOException{

        BufferedWriter inicioInforme = new BufferedWriter(new FileWriter("informe.txt",true));
        inicioInforme.newLine();
        inicioInforme.write("****************************** Inicio Informe ******************************");
        inicioInforme.newLine();
        inicioInforme.newLine();
        inicioInforme.close();
    }
    /**
     * Método que escribe lineas completas para marcar el fin de un informe
     * en el fichero de tipo  *.txt guardado en la ráiz del proyecto
     * @throws IOException 
     */
    public void finInforme() throws IOException{
        BufferedWriter finInforme = new BufferedWriter(new FileWriter("informe.txt",true));
        finInforme.newLine();
        finInforme.write("****************************** Fin Informe ******************************");
        finInforme.newLine();
        finInforme.newLine();
        finInforme.close();
    }
    /**
     * Método para abrir en el bloc de notas el informe generado
     */
    public void abrirInforme(){
          try {
            Runtime obj = Runtime.getRuntime();
            //La instrucción es notepad para abrir el bloc de notas, espacio
            //y la ruta donde esta el archivo
            obj.exec("notepad "+System.getProperty("user.dir")+"\\informe.txt");
            //System.getProperty("user.dir") Obtiene la ruta del proyecto
        } catch (IOException ex) {
             System.out.println("IOException "+ex.getMessage());
        }
    }
    /**
     * /**
     * Método que borra el contenido del fichero de tipo  *.txt guardado en la ráiz del proyecto
     * @throws IOException 
     */
    public void borrarInforme() throws IOException{
        BufferedWriter informeNuevo = new BufferedWriter(new FileWriter("informe.txt",false));
        informeNuevo.newLine();
        informeNuevo.close();
    }
    
}
