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
    
    private String IdCliente;
    private String nombreEmpresa;
    private String nombreContacto;
    private String cargoContacto;
    private String direccion;
    private String ciudad;
    private String region;
    private String codPostal;
    private String pais;
    private String telefono;
    private String fax;

    public Cliente() {
    }

    public Cliente(String IdCliente, String nombreEmpresa, String nombreContacto, String cargoContacto, String direccion, String ciudad, String region, String codPostal, String pais, String telefono, String fax) {
        this.IdCliente = IdCliente;
        this.nombreEmpresa = nombreEmpresa;
        this.nombreContacto = nombreContacto;
        this.cargoContacto = cargoContacto;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.region = region;
        this.codPostal = codPostal;
        this.pais = pais;
        this.telefono = telefono;
        this.fax = fax;
    }

   

    public String getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(String IdCliente) {
        this.IdCliente = IdCliente;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getNombreContacto() {
        return nombreContacto;
    }

    public void setNombreContacto(String nombreContacto) {
        this.nombreContacto = nombreContacto;
    }

    public String getCargoContacto() {
        return cargoContacto;
    }

    public void setCargoContacto(String cargoContacto) {
        this.cargoContacto = cargoContacto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(String codPostal) {
        this.codPostal = codPostal;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    @Override
    public String toString() {
        return "Cliente{" + "IdCliente=" + IdCliente + ", nombreEmpresa=" + nombreEmpresa + ", nombreContacto=" + nombreContacto + ", cargoContacto=" + cargoContacto + ", direccion=" + direccion + ", ciudad=" + ciudad + ", region=" + region + ", codPostal=" + codPostal + ", pais=" + pais + ", telefono=" + telefono + ", fax=" + fax + '}';
    }
        
}
