/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author JoeAlv
 */
public class Producto {
    int idProducto;
    String nombre;
    int idCategoria;
    int existencia;
    double precio;
    int nivelNuevoPedido;
    char suspendido;

    public Producto() {
    }
    
    public Producto(int idProducto, String nombre, int idCategoria, int existencia, double precio, int nivelNuevoPedido, char suspendido) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.idCategoria = idCategoria;
        this.existencia = existencia;
        this.precio = precio;
        this.nivelNuevoPedido = nivelNuevoPedido;
        this.suspendido = suspendido;
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

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
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

    public char getSuspendido() {
        return suspendido;
    }

    public void setSuspendido(char suspendido) {
        this.suspendido = suspendido;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", nombre=" + nombre + ", idCategoria=" + idCategoria + ", existencia=" + existencia + ", precio=" + precio + ", nivelNuevoPedido=" + nivelNuevoPedido + ", suspendido=" + suspendido + '}';
    }
    
    
}
