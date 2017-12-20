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
public class Compra {
    private String rfc_proveedor = "";
    private String moneda = "";
    private String forma_pago = "";
    private String metodo_pago = "";
    private String numero_cuenta = "";
    private float subtotal = 0;
    private float iva = 0;
    private float total = 0;
    private String fecha = "";
    private String hora = "";


    public String getRfc_proveedor() {
        return rfc_proveedor;
    }


    public void setRfc_proveedor(String rfc_proveedor) {
        this.rfc_proveedor = rfc_proveedor;
    }


    public String getMoneda() {
        return moneda;
    }


    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }


    public String getForma_pago() {
        return forma_pago;
    }

 
    public void setForma_pago(String forma_pago) {
        this.forma_pago = forma_pago;
    }


    public String getMetodo_pago() {
        return metodo_pago;
    }


    public void setMetodo_pago(String metodo_pago) {
        this.metodo_pago = metodo_pago;
    }


    public String getNumero_cuenta() {
        return numero_cuenta;
    }


    public void setNumero_cuenta(String numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
    }


    public float getSubtotal() {
        return subtotal;
    }


    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }


    public float getIva() {
        return iva;
    }

 
    public void setIva(float iva) {
        this.iva = iva;
    }

 
    public float getTotal() {
        return total;
    }

 
    public void setTotal(float total) {
        this.total = total;
    }


    public String getFecha() {
        return fecha;
    }


    public void setFecha(String fecha) {
        this.fecha = fecha;
    }


    public String getHora() {
        return hora;
    }


    public void setHora(String hora) {
        this.hora = hora;
    }
    
}
