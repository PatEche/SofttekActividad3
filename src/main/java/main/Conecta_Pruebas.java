
package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Conecta_Pruebas {
    
    public static void main(String[] args) {
        
        try{
        
        //CREO LA CONEXION
            Connection miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/prueba", "root", "");
                System.out.println("Conexion exitosa");
                System.out.println("****************");
        
        //CREO EL OBJETO STATEMENT
            Statement miStatement = miConexion.createStatement();
            
        //EJECUTO INSTRUCCIONES SQL
           
            ResultSet miResultSet = miStatement.executeQuery("select * from alumnos");
            
            
            while(miResultSet.next()){
            
                System.out.println(miResultSet.getInt("id") + " " + miResultSet.getString("nombre") + " " + miResultSet.getString("apellido") + " " +miResultSet.getString("grado")+ " " +miResultSet.getString("grupo"));
                System.out.println("");
            }
        
        //Cierro la conexion    
        miStatement.close();
        }catch(Exception e){
            System.out.println("No conecta");
            e.printStackTrace();
        }
    }
}
