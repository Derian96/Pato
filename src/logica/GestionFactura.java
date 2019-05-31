

package logica;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import static logica.Conexion.conexion;


public class GestionFactura extends Conexion {
    public void procesarFactura(ArrayList<String> sentencias) {
        try {
            conectarBD();
        stmt = conexion.createStatement();  
        conexion.setAutoCommit(false); 
        for (String sentencia : sentencias) { 
            stmt.addBatch(sentencia);
        }
        stmt.executeBatch(); 
        conexion.commit();
        desconectarBD();
    }catch (SQLException ex) {
        Logger.getLogger(GestionFactura.class.getName()).log(Level.SEVERE, null, ex);
        desconectarBD();
    }
    
    
    }
}
