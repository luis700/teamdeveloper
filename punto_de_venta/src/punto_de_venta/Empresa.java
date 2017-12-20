/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto_de_venta;

/**
 *
 * @author Carlinne
 */
public class Empresa {
    
    private String rfc ="";
    private String razon_social ="";
    private String calle = "";
    private String num_ext = "";
    private String num_int = "";
    private String colonia = "";
    private String localidad = "";
    private String municipio = "";
    private String estado = "";
    private int cp = 0;

   
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


    public String getNum_ext() {
        return num_ext;
    }


    public void setNum_ext(String num_ext) {
        this.num_ext = num_ext;
    }


    public String getNum_int() {
        return num_int;
    }


    public void setNum_int(String num_int) {
        this.num_int = num_int;
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


    public int getCp() {
        return cp;
    }


    public void setCp(int cp) {
        this.cp = cp;
    }
}
