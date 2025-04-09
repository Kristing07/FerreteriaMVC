/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author portatiles
 */

    public class DetallesCompras {
    private int IdDetalleCompra;
    private int IdCompra; // Relación con Compra
    private int IdProducto; // Relación con Producto
    private int cantidad;
    private float precioUnitario;

    public DetallesCompras() {
    }
    
    

    public DetallesCompras(int IdDetalleCompra, int IdCompra, int IdProducto, int cantidad, float precioUnitario) {
        this.IdDetalleCompra = IdDetalleCompra;
        this.IdCompra = IdCompra;
        this.IdProducto = IdProducto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    

    public int getIdDetalleCompra() {
        return IdDetalleCompra;
    }

    public void setIdDetalleCompra(int IdDetalleCompra) {
        this.IdDetalleCompra = IdDetalleCompra;
    }

    public int getIdCompra() {
        return IdCompra;
    }

    public void setIdCompra(int IdCompra) {
        this.IdCompra = IdCompra;
    }

    public int getIdProducto() {
        return IdProducto;
    }

    public void setIdProducto(int IdProducto) {
        this.IdProducto = IdProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(float precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

       
}

