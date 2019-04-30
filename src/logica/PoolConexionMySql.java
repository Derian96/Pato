package logica;

import com.mysql.jdbc.jdbc2.optional.MysqlConnectionPoolDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.PooledConnection;
import javax.swing.JOptionPane;

/**
 *
 * @author 
 */
public class PoolConexionMySql {

    MysqlConnectionPoolDataSource ds_con;
    PooledConnection pool;

    public PoolConexionMySql() {
        try {
            ds_con = new MysqlConnectionPoolDataSource();
            ds_con.setURL("jdbc:mysql://localhost:3366/bdempresa");
            ds_con.setUser("root");
            ds_con.setPassword("root");
            pool = ds_con.getPooledConnection();
            System.out.println("Unica conexión establecida (Piscina de conexiones creadas)");
        } catch (SQLException ex) {
            Logger.getLogger(PoolConexionMySql.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   

    public Connection getConexion() {
        try {
            return pool.getConnection();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Se perdio la conexión con el servidor :(", "Conexion al servidor", JOptionPane.ERROR_MESSAGE);
            System.err.println(ex);
        }
        return null;
    }
}
