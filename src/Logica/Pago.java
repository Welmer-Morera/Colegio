/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author welmer
 */
public class Pago {
    
    private  String Descripcion;
    private  String  Cliente;
    private  double Monto;

    public Pago() {
    }

    public Pago( String Descripcion, String Cliente, double Monto) {
       
        this.Descripcion = Descripcion;
        this.Cliente = Cliente;
        this.Monto = Monto;
    }

    

   

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getCliente() {
        return Cliente;
    }

    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
    }

    public double getMonto() {
        return Monto;
    }

    public void setMonto(double Monto) {
        this.Monto = Monto;
    }

    @Override
    public String toString() {
        return "Pago{" +  ", Descripcion=" + Descripcion + ", Cliente=" + Cliente + ", Monto=" + Monto + '}';
    }
    
    
}
