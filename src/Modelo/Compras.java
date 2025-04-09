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
public class Compras {
        
    private int IdCompra;
    private int IdEmpleado; // Relación con Empleado
    private Date FechaCompra;
    private float TotalCompra;
    private List<DetallesCompras> Detalles; // Relación con DetalleCompra

    public Compras() {
    }

    
    
    public Compras(int IdCompra, int IdEmpleado, Date FechaCompra, float TotalCompra, List<DetallesCompras> Detalles) {
        this.IdCompra = IdCompra;
        this.IdEmpleado = IdEmpleado;
        this.FechaCompra = FechaCompra;
        this.TotalCompra = TotalCompra;
        this.Detalles = Detalles;
    }

   

    public int getIdCompra() {
        return IdCompra;
    }

    public void setIdCompra(int IdCompra) {
        this.IdCompra = IdCompra;
    }

    public int getIdEmpleado() {
        return IdEmpleado;
    }

    public void setIdEmpleado(int IdEmpleado) {
        this.IdEmpleado = IdEmpleado;
    }

    public Date getFechaCompra() {
        return FechaCompra;
    }

    public void setFechaCompra(Date FechaCompra) {
        this.FechaCompra = FechaCompra;
    }

    public float getTotalCompra() {
        return TotalCompra;
    }

    public void setTotalCompra(float TotalCompra) {
        this.TotalCompra = TotalCompra;
    }

    public List<DetallesCompras> getDetalles() {
        return Detalles;
    }

    public void setDetalles(List<DetallesCompras> Detalles) {
        this.Detalles = Detalles;
    }

    
    }
//

