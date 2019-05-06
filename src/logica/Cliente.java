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

public class Cliente {
    
    private int IdCliente;
    private String nombre;
    private String direccion;
    private String telefono;

    public Cliente() {
    }

    public Cliente(int IdCliente, String nombre, String direccion, String telefono) {
        this.IdCliente = IdCliente;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public int getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(int IdCliente) {
        this.IdCliente = IdCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente{" + "IdCliente=" + IdCliente + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + '}';
    }
        
}
