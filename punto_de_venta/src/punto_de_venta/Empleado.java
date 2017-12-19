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
public class Empleado {
    
    private String nombre = "";
    private String a_paterno = "";
    private String a_materno = "";
    private String puesto = "";
    private int id_usuario = 0;
    private String direccion = "";
    private String fecha_contrato = "";
    private String telefono = "";
    private String fecha_nac = "";
    private float sueldo = 0;


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getA_paterno() {
        return a_paterno;
    }


    public void setA_paterno(String a_paterno) {
        this.a_paterno = a_paterno;
    }

    
    public String getA_materno() {
        return a_materno;
    }


    public void setA_materno(String a_materno) {
        this.a_materno = a_materno;
    }


    public String getPuesto() {
        return puesto;
    }


    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }


    public int getId_usuario() {
        return id_usuario;
    }


    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }


    public String getDireccion() {
        return direccion;
    }


    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    public String getFecha_contrato() {
        return fecha_contrato;
    }


    public void setFecha_contrato(String fecha_contrato) {
        this.fecha_contrato = fecha_contrato;
    }


    public String getTelefono() {
        return telefono;
    }


    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    public String getFecha_nac() {
        return fecha_nac;
    }


    public void setFecha_nac(String fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    
    public float getSueldo() {
        return sueldo;
    }


    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

}
