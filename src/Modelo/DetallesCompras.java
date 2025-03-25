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
    
    public class DetalleCompra {
    private int idDetalleCompra;
    private Compras compra; // Relación con Compra
    private Producto producto; // Relación con Producto
    private int cantidad;
    private float precioUnitario;

        public DetalleCompra(int idDetalleCompra, Compras compra, Producto producto, int cantidad, float precioUnitario) {
            this.idDetalleCompra = idDetalleCompra;
            this.compra = compra;
            this.producto = producto;
            this.cantidad = cantidad;
            this.precioUnitario = precioUnitario;
        }

        public int getIdDetalleCompra() {
            return idDetalleCompra;
        }

        public void setIdDetalleCompra(int idDetalleCompra) {
            this.idDetalleCompra = idDetalleCompra;
        }

        public Compras getCompra() {
            return compra;
        }

        public void setCompra(Compras compra) {
            this.compra = compra;
        }

        public Producto getProducto() {
            return producto;
        }

        public void setProducto(Producto producto) {
            this.producto = producto;
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
}
