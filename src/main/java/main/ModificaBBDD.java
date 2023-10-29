package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ModificaBBDD {

    public static void main(String[] args) {
        try {

            //CREO LA CONEXION
            Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/prueba", "root", "Java@2023");
            System.out.println("Conexion exitosa");
            System.out.println("****************");

            //CREO EL OBJETO STATEMENT
            Statement miStatement = miConexion.createStatement();

            //Utilizo la sentencia Insert
             String instruccionSql = "INSERT INTO ALUMNOS(nombre,apellido,grado,grupo)VALUES('Belen','Rocha','8','A')";
             miStatement.executeUpdate(instruccionSql);
             System.out.println("Datos insertados correctamente");

            // Utilizo la sentencia Update
//            String instruccionSql = "UPDATE ALUMNOS SET APELLIDO = 'Martinez' WHERE ID = 2" ;
//            miStatement.executeUpdate(instruccionSql);
//            System.out.println("Datos actualizados correctamente");

            //Utilizo la sentencia Delete          
//            String instruccionesSql = "DELETE FROM ALUMNOS WHERE ID = '3'";
//            miStatement.executeUpdate(instruccionesSql);
//            System.out.println("Datos eliminados correctamente");

            //Cierro la conexion    
            miStatement.close();
        } catch (Exception e) {
            System.out.println("No conecta");
            e.printStackTrace();
        }
    }
}
