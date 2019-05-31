

package logica;

public class Producto {
    int idProducto;
    String nombre;
    int existencia;
    double precio;
    int nivelNuevoPedido;
    int suspendido;
    int idCategoria;
    int idProveedor;

    public Producto() {
    }

    public Producto(int idProducto, String nombre, int existencia, double precio, int nivelNuevoPedido, int suspendido, int idCategoria, int idProveedor) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.existencia = existencia;
        this.precio = precio;
        this.nivelNuevoPedido = nivelNuevoPedido;
        this.suspendido = suspendido;
        this.idCategoria = idCategoria;
        this.idProveedor = idProveedor;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getNivelNuevoPedido() {
        return nivelNuevoPedido;
    }

    public void setNivelNuevoPedido(int nivelNuevoPedido) {
        this.nivelNuevoPedido = nivelNuevoPedido;
    }

    public int getSuspendido() {
        return suspendido;
    }

    public void setSuspendido(int suspendido) {
        this.suspendido = suspendido;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }
    
    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", nombre=" + nombre + ", existencia=" + existencia + ", precio=" + precio + ", nivelNuevoPedido=" + nivelNuevoPedido + ", suspendido=" + suspendido + ", idCategoria=" + idCategoria + ", idProveedor=" + idProveedor + '}';
    }

   
}
