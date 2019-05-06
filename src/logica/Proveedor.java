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

public class Proveedor {
    
    private int idProveedor;
    private String compañia;
    private String representante;
    private String telefono;

    public Proveedor() {
    }

    public Proveedor(int idProveedor, String compañia, String representante, String telefono) {
        this.idProveedor = idProveedor;
        this.compañia = compañia;
        this.representante = representante;
        this.telefono = telefono;
    }

    public int getidProveedor() {
        return idProveedor;
    }

    public void setidProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getCompañia() {
        return compañia;
    }

    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Proveedor{" + "idProveedor=" + idProveedor + ", compa\u00f1ia=" + compañia + ", representante=" + representante + ", telefono=" + telefono + '}';
    }

}
