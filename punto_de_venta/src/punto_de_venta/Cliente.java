/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto_de_venta;



/**
 *
 * @author luisf
 */
public class Cliente {
    private String rfc = "";
    private String razon_social = "";
    private String calle = "";
    private String colonia = "";
    private String localidad = "";
    private String municipio = "";
    private String estado = "";
    private String telefono = "";
    private String celular = "";
    private String correo = "";
    private int num_interior = 0;
    private int num_exterior = 0;
    private int codigo_postal = 0;
   

  
    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

   
    public String getRazon_social() {
        return razon_social;
    }

    
    public void setRazon_social(String razon_social) {
        this.razon_social = razon_social;
    }

    
    public String getCalle() {
        return calle;
    }

   
    public void setCalle(String calle) {
        this.calle = calle;
    }

   
    public String getColonia() {
        return colonia;
    }

   
    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    
    public String getLocalidad() {
        return localidad;
    }

   
    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    
    public String getMunicipio() {
        return municipio;
    }

    
    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    
    public String getEstado() {
        return estado;
    }

    
    public void setEstado(String estado) {
        this.estado = estado;
    }

    
    public String getTelefono() {
        return telefono;
    }

   
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

   
    public String getCelular() {
        return celular;
    }

    
    public void setCelular(String celular) {
        this.celular = celular;
    }

   
    public String getCorreo() {
        return correo;
    }

   
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    public int getNum_interior() {
        return num_interior;
    }
    
    public void setNum_interior(int num_interior) {
        this.num_interior = num_interior;
    }

    
    public int getNum_exterior() {
        return num_exterior;
    }

    
    public void setNum_exterior(int num_exterior) {
        this.num_exterior = num_exterior;
    }

   
    public int getCodigo_postal() {
        return codigo_postal;
    }

    
    public void setCodigo_postal(int codigo_postal) {
        this.codigo_postal = codigo_postal;
    }
    
    
}
