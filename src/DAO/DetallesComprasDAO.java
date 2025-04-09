/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import Modelo.DetallesCompras;
import Util.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author portatiles
 */
public class DetallesComprasDAO {
   
    public void crearDetalleCompra(DetallesCompras detalle) throws SQLException {
    String sql = """
        INSERT INTO Detalles_Compras (
            id_compra, 
            id_producto, 
            cantidad, 
            precio_unitario
        ) VALUES (?, ?, ?, ?)""";
    
    try (Connection c = ConexionBD.getConnection();
         PreparedStatement stmt = c.prepareStatement(sql)) {
        stmt.setInt(1, detalle.getIdCompra());
        stmt.setInt(2, detalle.getIdProducto());
        stmt.setInt(3, detalle.getCantidad());
        stmt.setFloat(4, detalle.getPrecioUnitario());
        stmt.executeUpdate();
    }
}

    public static void main(String[] args) {
        try {
        DetallesComprasDAO dao = new DetallesComprasDAO();
        DetallesCompras d1 = new DetallesCompras();
        d1.setIdCompra(1);
        d1.setIdProducto(1);
        d1.setCantidad(5);
        d1.setPrecioUnitario(25.75f);
        dao.crearDetalleCompra(d1);
        System.out.println("Detalle de compra creado con éxito!");
    } catch (SQLException e) {
        System.err.println("Error: " + e.getMessage());
    }
}
    public List<DetallesCompras> leerTodosDetallesCompra() throws SQLException {
        String sql = "SELECT * FROM Detalles_Compras";
        List<DetallesCompras> detalles = new ArrayList<>();

        try (Connection c = ConexionBD.getConnection();
             PreparedStatement stmt = c.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                DetallesCompras detalle = new DetallesCompras();
                detalle.setIdDetalleCompra(rs.getInt("id_detalle_compra"));
                detalle.setIdCompra(rs.getInt("id_compra"));
                detalle.setIdProducto(rs.getInt("id_producto"));
                detalle.setCantidad(rs.getInt("cantidad"));
                detalle.setPrecioUnitario(rs.getFloat("precio_unitario"));
                detalles.add(detalle);
            }
        }
        return detalles;
    }

}
