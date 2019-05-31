
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

public class GestionCliente extends Conexion{
    public GestionCliente(){}
    
     //  método listarcliente
    public ResultSet listarClientes () {
        try {
            // Nombre del procedimiento almacenado y como espera 4 parametros
            String call = "{CALL ps_cliente_listar}";
            
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
    
    // método insertarCliente
    public boolean insertarClientes (Cliente cliente) {
        boolean rpta = false;
        
        try {
            // Nos conectamos
            conectarBD();
            String call = "{CALL ps_cliente_insertar(?,?,?,?,?,?,?,?,?,?,?)}";
            
            // Preparamos la sentencia
            obj_Procedimiento = conexion.prepareCall(call);
            
            // Preparamos la sentencia
            obj_Procedimiento.setString(1, cliente.getIdCliente());
            obj_Procedimiento.setString(2, cliente.getNombreEmpresa());
            obj_Procedimiento.setString(3, cliente.getNombreContacto());
            obj_Procedimiento.setString(4, cliente.getCargoContacto());
            obj_Procedimiento.setString(5, cliente.getDireccion());
            obj_Procedimiento.setString(6, cliente.getCiudad());
            obj_Procedimiento.setString(7, cliente.getRegion());
            obj_Procedimiento.setString(8, cliente.getCodPostal());
            obj_Procedimiento.setString(9, cliente.getPais());
            obj_Procedimiento.setString(10, cliente.getTelefono());
            obj_Procedimiento.setString(11, cliente.getFax());
            
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
    
     // método editarCliente 
    public boolean editarCliente (Cliente cliente) {
        boolean rpta = false;
        
        try {
            // Nos conectamos
            conectarBD();
            
            String call = "{CALL ps_cliente_editar(?,?,?,?,?,?,?,?,?,?,?)}";
            
            // Preparamos la sentencia
            obj_Procedimiento = conexion.prepareCall(call);
            
            // Preparamos la sentencia
            obj_Procedimiento.setString(1, cliente.getIdCliente());
            obj_Procedimiento.setString(2, cliente.getNombreEmpresa());
            obj_Procedimiento.setString(3, cliente.getNombreContacto());
            obj_Procedimiento.setString(4, cliente.getCargoContacto());
            obj_Procedimiento.setString(5, cliente.getDireccion());
            obj_Procedimiento.setString(6, cliente.getCiudad());
            obj_Procedimiento.setString(7, cliente.getRegion());
            obj_Procedimiento.setString(8, cliente.getCodPostal());
            obj_Procedimiento.setString(9, cliente.getPais());
            obj_Procedimiento.setString(10, cliente.getTelefono());
            obj_Procedimiento.setString(11, cliente.getFax());
            
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
    
     //  método eliminarCliente  
    public boolean eliminarCliente (String idCliente) {
        boolean rpta = false;
        
        try {
            // Nos conectamos
            conectarBD();
            
            String call = "{CALL ps_cliente_eliminar(?)}";
            
            // Preparamos la sentencia
            obj_Procedimiento = conexion.prepareCall(call);
            
            // Identificacipon
            obj_Procedimiento.setString(1, idCliente);
                   
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
    
    //  método buscarCliente 
    public Cliente buscarCliente (String idCliente) {
        Cliente cliente = null;
        
        try {
            // Nos conectamos
            conectarBD();
            
            String call = "{CALL ps_cliente_buscar_Id(?)}";
            
            // Preparamos la sentencia
            obj_Procedimiento = conexion.prepareCall(call);
            
            // Identificacipon
            obj_Procedimiento.setString(1, idCliente);
            rs = obj_Procedimiento.executeQuery();
            
            if (rs.next()) {
                cliente = new Cliente();
                cliente.setIdCliente(rs.getString(1));
                cliente.setNombreEmpresa(rs.getString(2));
                cliente.setNombreContacto(rs.getString(3));
                cliente.setCargoContacto(rs.getString(4));
                cliente.setDireccion(rs.getString(5));
                cliente.setCiudad(rs.getString(6));
                cliente.setRegion(rs.getString(7));
                cliente.setCodPostal(rs.getString(8));
                cliente.setPais(rs.getString(9));
                cliente.setTelefono(rs.getString(10));
                cliente.setFax(rs.getString(11));
            }
           
            desconectarBD();
            
        } catch (SQLException ex) {
            desconectarBD();
            System.err.println(ex);
        } catch (Exception ex) {
            desconectarBD();
            System.err.println(ex);
        }
        return cliente;
    }
    
     public boolean buscarIdCliente (String idCliente) {
        boolean rpta = false;
        
        try {
            // Nos conectamos
            conectarBD();
            
            // Buscar los datos de la Categoria
            String call = "{CALL ps_cliente_buscar_Id(?)}";
            
            // Preparamos la sentencia
            obj_Procedimiento = conexion.prepareCall(call);
            
            // Identificacipon
            obj_Procedimiento.setString(1, idCliente);
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
     public void cargarReporteCliente() {
        conectarBD();
        JasperReport reporte;
        JasperPrint reporte_view;
        
        try { 
            URL in = this.getClass().getResource("/reportes/rptCliente.jasper");
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
