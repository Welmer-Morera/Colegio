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
public class Factura {
    
    private  String Descripcion;
    private String idAlumno;
    private String Fecha;
    private double TotalG;
    private ArrayList<DetalleFactura> detalleFactura;

   public Factura() {
        detalleFactura = new ArrayList<>();
    }

    public Factura( String Descripcion, String idAlumno, String Fecha, double TotalG, ArrayList<DetalleFactura> detalleFactura) {
        
        this.Descripcion = Descripcion;
        this.idAlumno=idAlumno;
        this.Fecha = Fecha;
        this.TotalG = TotalG;
        this.detalleFactura = new ArrayList<>();
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(String idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public double getTotalG() {
        return TotalG;
    }

    public void setTotalG(double TotalG) {
        this.TotalG = TotalG;
    }

    public ArrayList<DetalleFactura> getDetalleFactura() {
        return detalleFactura;
    }

    public void setDetalleFactura(ArrayList<DetalleFactura> detalleFactura) {
        this.detalleFactura = detalleFactura;
    }

    @Override
    public String toString() {
        return "Factura{" + "Descripcion=" + Descripcion + ", idAlumno=" + idAlumno + ", Fecha=" + Fecha + ", TotalG=" + TotalG + ", detalleFactura=" + detalleFactura + '}';
    }

  

   

   

    
    
    
    
}
