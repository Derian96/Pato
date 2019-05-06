/*
    Universidad Nacional de Costa Rica
    Sede Regional Chorotega, Campus Nicoya  
    Ingeniería en Sistemas de Información
    Programación II - EIF204
    Académica: Gloriana Peña Ramírez 

    PROYECTO PROGRAMADO - Facturación JAVA

    Desarrolladores: 
    - Eddie Alfaro 
    - Derian Abarca
    - Diego Aguilar
*/ 

package logica;

import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import static logica.Conexion.conexion;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class GestionProveedor extends Conexion {
    
    public GestionProveedor () {}
    
     // método insertarProveedor
    public boolean insertarProveedor (Proveedor proveedor) {
        boolean rpta = false;
        
        try {
            // Nos conectamos
            conectarBD();
            
            // Buscar los datos del proveedor
            String call = "{CALL ps_proveedor_insertar(?,?,?,?)}";
            
            // Preparamos la sentencia
            obj_Procedimiento = conexion.prepareCall(call);
            
            // Preparamos la sentencia
            obj_Procedimiento.setInt(1, proveedor.getidProveedor());
            obj_Procedimiento.setString(2, proveedor.getCompañia());
            obj_Procedimiento.setString(3, proveedor.getRepresentante());
            obj_Procedimiento.setString(4, proveedor.getTelefono());

            rpta = obj_Procedimiento.executeUpdate() == 1;
           
            desconectarBD();
            
        } catch (SQLException ex) {
            desconectarBD();
            System.err.println(ex);
        } catch (Exception ex) {
            desconectarBD();
            System.err.println(ex);
        }
        return rpta;
    }
    
    // método editarProveedor 
    public boolean editarProveedor (Proveedor proveedor) {
        boolean rpta = false;
        
        try {
            // Nos conectamos
            conectarBD();
            
            // Buscar los datos del Proveedor
            String call = "{CALL ps_proveedor_editar(?,?,?,?)}";
            
            // Preparamos la sentencia
            obj_Procedimiento = conexion.prepareCall(call);
            
            // Preparamos la sentencia
            obj_Procedimiento.setInt(1, proveedor.getidProveedor());
            obj_Procedimiento.setString(2, proveedor.getCompañia());
            obj_Procedimiento.setString(3, proveedor.getRepresentante());
            obj_Procedimiento.setString(4, proveedor.getTelefono());
              
            rpta = obj_Procedimiento.executeUpdate() == 1;
           
            desconectarBD();
            
        } catch (SQLException ex) {
            desconectarBD();
            System.err.println(ex);
        } catch (Exception ex) {
            desconectarBD();
            System.err.println(ex);
        }
        return rpta;
    }
    
    //  método listarProveedores
    public ResultSet listarProveedores () {
        try {
            String call = "{CALL ps_proveedor_listar}";
            
            // Preparamos la sentencia
            obj_Procedimiento = conexion.prepareCall(call);
            rs = obj_Procedimiento.executeQuery();
                   
        } catch (SQLException e) {
            System.err.println(e);
            desconectarBD();
        } catch (Exception e) {
            System.err.println(e);
            desconectarBD();
        }
        return rs;
    }
    
    //  método buscarProveedor
    public Proveedor buscarProveedor (int idProveedor) {
        Proveedor proveedor = null;
        
        try {
            // Nos conectamos
            conectarBD();
            
            String call = "{CALL ps_proveedor_buscar(?)}";
            
            // Preparamos la sentencia
            obj_Procedimiento = conexion.prepareCall(call);
            
            // Identificacipon
            obj_Procedimiento.setInt(1, idProveedor);
            rs = obj_Procedimiento.executeQuery();
            
            if (rs.next()) {
                proveedor = new Proveedor();
                proveedor.setidProveedor(rs.getInt(1));
                proveedor.setCompañia(rs.getString(2));
                proveedor.setRepresentante(rs.getString(3));
                proveedor.setTelefono(rs.getString(4));
            }
           
            desconectarBD();
            
        } catch (SQLException ex) {
            desconectarBD();
            System.err.println(ex);
        } catch (Exception ex) {
            desconectarBD();
            System.err.println(ex);
        }
        return proveedor;
    }
    
    //  método buscarIdProveedor
    public boolean buscarIdProveedor (int idProveedor) {
        boolean rpta = false;
        
        try {
            // Nos conectamos
            conectarBD();
            
            // Buscar los datos del proveedor
            String call = "{CALL ps_proveedor_buscar_Id(?)}";
            
            // Preparamos la sentencia
            obj_Procedimiento = conexion.prepareCall(call);
            
            // Identificacipon
            obj_Procedimiento.setInt(1, idProveedor);
            rs = obj_Procedimiento.executeQuery();
            
            
            if (rs.next()){
                if ( rs.getRow() > 0){
                rpta = true;
                }
            }
            desconectarBD();
        } catch (SQLException ex) {
            desconectarBD();
            System.err.println(ex);
        } catch (Exception ex) {
            desconectarBD();
            System.err.println(ex);
        }

        return rpta;
    }
    
    //  método eliminarProveedor  
    public boolean eliminarProveedor (int idProveedor) {
        boolean rpta = false;
        
        try {
            // Nos conectamos
            conectarBD();
            
            // Buscar los datos del proveedor
            String call = "{CALL ps_proveedor_eliminar(?)}";
            
            // Preparamos la sentencia
            obj_Procedimiento = conexion.prepareCall(call);
            
            // Identificacipon
            obj_Procedimiento.setInt(1, idProveedor);
                   
            rpta = obj_Procedimiento.executeUpdate() == 1;
           
            desconectarBD();
            
        } catch (SQLException ex) {
            desconectarBD();
            System.err.println(ex);
        } catch (Exception ex) {
            desconectarBD();
            System.err.println(ex);
        }
        return rpta;
    }
    
     public void cargarReporteProveedores() {
        conectarBD();
        JasperReport reporte;
        JasperPrint reporte_view;
        
        try { 
            URL in = this.getClass().getResource("/reportes/rptProveedores.jasper");
            reporte = (JasperReport) JRLoader.loadObject(in);
            //Se crea un objeto HashMap 
            Map parametros = new HashMap();
            parametros.clear();  
            parametros.put("logo", this.getClass().getResourceAsStream("/img/company.png")); 
            reporte_view = JasperFillManager.fillReport(reporte, parametros, getConexion()); 
            JasperViewer.viewReport(reporte_view, false);     
        } catch (JRException ex) { 
            System.err.println(ex.toString()); 
        } 
    }
}
