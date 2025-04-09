/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.util.Date;
import java.util.List;
/**
 *
 * @author portatiles
 */
public class Venta {
    
    private int idVenta;
    private int idCliente; // Relación con Cliente
    private int idEmpleado; // Relación con Empleado
    private Date FechaVenta;
    private float TotalVenta;
    private List<DetalleVenta> detalles; // Relación con DetalleVenta

    public Venta() {
    }
    
    

    public Venta(int idVenta, int idCliente, int ideEmpleado, Date FechaVenta, float TotalVenta, List<DetalleVenta> detalles) {
        this.idVenta = idVenta;
        this.idCliente = idCliente;
        this.idEmpleado = ideEmpleado;
        this.FechaVenta = FechaVenta;
        this.TotalVenta = TotalVenta;
        this.detalles = detalles;
    }

  

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdeEmpleado() {
        return idEmpleado;
    }

    public void setIdeEmpleado(int ideEmpleado) {
        this.idEmpleado = ideEmpleado;
    }

    public Date getFechaVenta() {
        return FechaVenta;
    }

    public void setFechaVenta(Date FechaVenta) {
        this.FechaVenta = FechaVenta;
    }

    public float getTotalVenta() {
        return TotalVenta;
    }

    public void setTotalVenta(float TotalVenta) {
        this.TotalVenta = TotalVenta;
    }

    public List<DetalleVenta> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<DetalleVenta> detalles) {
        this.detalles = detalles;
    }

    public int getidEmpleado() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setIdEmpleado(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
}
