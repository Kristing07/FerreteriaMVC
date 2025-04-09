/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author portatiles
 */

    
    public class DetalleVenta {
    private int idDetalleVenta;
    private int Idventa; // Relación con Venta
    private int IdProducto; // Relación con Producto
    private int Cantidad;
    private float PrecioUnitario;

    public DetalleVenta() {
    }

    public DetalleVenta(int idDetalleVenta, int Idventa, int IdProducto, int Cantidad, float PrecioUnitario) {
        this.idDetalleVenta = idDetalleVenta;
        this.Idventa = Idventa;
        this.IdProducto = IdProducto;
        this.Cantidad = Cantidad;
        this.PrecioUnitario = PrecioUnitario;
    }

    public int getIdDetalleVenta() {
        return idDetalleVenta;
    }

    public void setIdDetalleVenta(int idDetalleVenta) {
        this.idDetalleVenta = idDetalleVenta;
    }

    public int getIdventa() {
        return Idventa;
    }

    public void setIdventa(int Idventa) {
        this.Idventa = Idventa;
    }

    public int getIdProducto() {
        return IdProducto;
    }

    public void setIdProducto(int IdProducto) {
        this.IdProducto = IdProducto;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public float getPrecioUnitario() {
        return PrecioUnitario;
    }

    public void setPrecioUnitario(float PrecioUnitario) {
        this.PrecioUnitario = PrecioUnitario;
    }

    

    
    }