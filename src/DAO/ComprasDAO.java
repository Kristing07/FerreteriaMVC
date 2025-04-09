/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
    package DAO;
    import Modelo.Compras;
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
    public class ComprasDAO {
        public void crearCompra(Compras compra) throws SQLException {
    String sql = """
        INSERT INTO Compras (
            id_empleado, 
            fecha_compra, 
            total_compra
        ) VALUES (?, ?, ?)""";
    
    try (Connection c = ConexionBD.getConnection();
         PreparedStatement stmt = c.prepareStatement(sql)) {
        stmt.setInt(1, compra.getIdEmpleado());
        stmt.setDate(2, new java.sql.Date(compra.getFechaCompra().getTime()));
        stmt.setFloat(3, compra.getTotalCompra());
        stmt.executeUpdate();
    } 
      
    }
         public List<Compras> leerTodasCompras() throws SQLException {
        String sql = "SELECT * FROM Compras";
        List<Compras> compras = new ArrayList<>();

        try (Connection c = ConexionBD.getConnection();
             PreparedStatement stmt = c.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Compras compra = new Compras();
                compra.setIdCompra(rs.getInt("id_compra"));
                compra.setIdEmpleado(rs.getInt("id_empleado"));
                compra.setFechaCompra(rs.getDate("fecha_compra"));
                compra.setTotalCompra(rs.getFloat("total_compra"));
                compras.add(compra);
            }
        }
        return compras;
    }
            public static void main(String[] args) {
        try {
            DetallesComprasDAO dao = new DetallesComprasDAO();
            List<DetallesCompras> detalles = dao.leerTodosDetallesCompra();
            System.out.println("Lista de detalles de compra:");
            for (DetallesCompras det : detalles) {
                System.out.println("ID: " + det.getIdDetalleCompra() + 
                                 ", Compra ID: " + det.getIdCompra() + 
                                 ", Producto ID: " + det.getIdProducto() + 
                                 ", Cantidad: " + det.getCantidad() + 
                                 ", Precio Unitario: " + det.getPrecioUnitario());
            }
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
    }

    

   