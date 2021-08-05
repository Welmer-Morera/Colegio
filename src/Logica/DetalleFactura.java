/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.ArrayList;

/**
 *
 * @author welmer
 */
public class DetalleFactura {
   
    private int numFactura;
    private String Nombre;
      private double Precio;
    private int Cantidad;
  private double Total;
   private ArrayList<ContenidoFactura > detalleFactura;

    public DetalleFactura() {
    }

    public DetalleFactura(int numFactura, String Nombre, double Precio, int Cantidad, double Total) {
        this.numFactura = numFactura;
        this.Nombre = Nombre;
        this.Precio = Precio;
        this.Cantidad = Cantidad;
        this.Total = Total;
    }

    public int getNumFactura() {
        return numFactura;
    }

    public void setNumFactura(int numFactura) {
        this.numFactura = numFactura;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double Total) {
        this.Total = Total;
    }
   

    
 

    
    
    
    
    
    
            
}
