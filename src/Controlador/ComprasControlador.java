/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import DAO.ComprasDAO;
import DAO.DetallesComprasDAO;
import Modelo.Compras;
import Modelo.DetallesCompras;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author portatiles
 */
public class ComprasControlador {
    
    private final ComprasDAO compraDAO;
    private final DetallesComprasDAO detalleCompraDAO;

    public ComprasControlador() {
        this.compraDAO = new ComprasDAO();
        this.detalleCompraDAO = new DetallesComprasDAO();
    }

    // Método para crear una nueva compra con sus detalles
    public void crearCompra(int idEmpleado, Date fechaCompra, float totalCompra, List<DetallesCompras> detalles) {
        try {
            Compras compra = new Compras();
            compra.setIdEmpleado(idEmpleado);
            compra.setFechaCompra(fechaCompra);
            compra.setTotalCompra(totalCompra);
            int idCompra = compraDAO.crearCompra(compra);

            if (idCompra == -1) {
                throw new SQLException("No se pudo obtener el ID de la compra.");
            }

            // Asignar el id_compra a cada detalle y guardarlos
            for (DetallesCompras detalle : detalles) {
                detalle.setIdCompra(idCompra);
                detalleCompraDAO.crearDetalleCompra(detalle);
            }

            JOptionPane.showMessageDialog(null, "Compra y detalles creados exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al crear la compra: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Método para obtener todas las compras
    public List<Compras> obtenerTodasCompras() {
        try {
            return compraDAO.leerTodasCompras();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al leer las compras: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    // Método para actualizar una compra existente
    public void actualizarCompra(int idCompra, int idEmpleado, Date fechaCompra, float totalCompra) {
        try {
            Compras compra = new Compras();
            compra.setIdCompra(idCompra);
            compra.setIdEmpleado(idEmpleado);
            compra.setFechaCompra(fechaCompra);
            compra.setTotalCompra(totalCompra);
            compraDAO.actualizarCompra(compra);
            JOptionPane.showMessageDialog(null, "Compra actualizada exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar la compra: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Método para eliminar una compra
    public void eliminarCompra(int idCompra) {
        try {
            compraDAO.eliminarCompra(idCompra);
            JOptionPane.showMessageDialog(null, "Compra eliminada exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar la compra: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Método main para pruebas
    public static void main(String[] args) {
        ComprasControlador controlador = new ComprasControlador();

        // Crear una lista de detalles de compra
        List<DetallesCompras> detalles = new ArrayList<>();
        DetallesCompras detalle1 = new DetallesCompras();
        detalle1.setIdProducto(4);
        detalle1.setCantidad(11);
        detalle1.setPrecioUnitario(51.51f);
        detalles.add(detalle1);

        // Crear una compra con detalles
        controlador.crearCompra(1, new Date(), 150.50f, detalles);

        // Leer todas las compras
        List<Compras> compras = controlador.obtenerTodasCompras();
        if (compras != null) {
            System.out.println("Lista de compras:");
            for (Compras c : compras) {
                System.out.println("ID: " + c.getIdCompra()
                        + ", Empleado: " + c.getIdEmpleado()
                        + ", Total: " + c.getTotalCompra());
            }
        }

        // Actualizar una compra (suponiendo que ID 1 existe)
        controlador.actualizarCompra(1, 2, new Date(), 200.75f);

        // Eliminar una compra
        controlador.eliminarCompra(1);
    }
}




