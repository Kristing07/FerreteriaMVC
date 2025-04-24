/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import DAO.CategoriaDAO;
import DAO.ClientesDAO;
import Modelo.Clientes;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author portatiles
 */
public class ClientesControlador {
   
    private final ClientesDAO ClientesDAO;
    
    public ClientesControlador() {
        this.ClientesDAO = new ClientesDAO();
    }
    
    // Método para crear un nuevo cliente
    public void crearCliente(String primerNombre, String segundoNombre, String primerApellido,
            String segundoApellido, String celular, String direccion, String cedula) {
        try {
            Clientes cliente = new Clientes();
            cliente.setPrimerNombre(primerNombre);
            cliente.setSegundoNombre(segundoNombre);
            cliente.setPrimerApellido(primerApellido);
            cliente.setSegundoApellido(segundoApellido);
            cliente.setCelular(celular);
            cliente.setDireccion(direccion);
            cliente.setCedula(cedula);
            ClientesDAO.crearCliente(cliente);
            JOptionPane.showMessageDialog(null, "Cliente creado exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al crear el cliente: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Método para obtener todos los clientes
    public List<Clientes> obtenerTodosClientes() {
        try {
            return ClientesDAO.leerTodosClientes();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al leer los clientes: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    // Método para actualizar un cliente existente
    public void actualizarCliente(int idCliente, String primerNombre, String segundoNombre, String primerApellido,
            String segundoApellido, String celular, String direccion, String cedula) {
        try {
            Clientes cliente = new Clientes();
            cliente.setIdCliente(idCliente);
            cliente.setPrimerNombre(primerNombre);
            cliente.setSegundoNombre(segundoNombre);
            cliente.setPrimerApellido(primerApellido);
            cliente.setSegundoApellido(segundoApellido);
            cliente.setCelular(celular);
            cliente.setDireccion(direccion);
            cliente.setCedula(cedula);
            ClientesDAO.actualizarCliente(cliente);
            JOptionPane.showMessageDialog(null, "Cliente actualizado exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar el cliente: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Método para eliminar un cliente
    public void eliminarCliente(int idCliente) {
        try {
            ClientesDAO.eliminarCliente(idCliente);
            JOptionPane.showMessageDialog(null, "Cliente eliminado exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el cliente: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Método main para pruebas
    public static void main(String[] args) {
        ClientesControlador controlador = new ClientesControlador();

        // Crear un cliente
        controlador.crearCliente("Juan", "Antonio", "Pérez", "Gómez", "12345678", "Calle 123", "1234567890");

        // Leer todos los clientes
        List<Clientes> clientes = controlador.obtenerTodosClientes();
        if (clientes != null) {
            System.out.println("Lista de clientes:");
            for (Clientes c : clientes) {
                System.out.println("ID: " + c.getIdCliente()
                        + ", Nombre: " + c.getPrimerNombre() + " " + c.getPrimerApellido()
                        + ", Cédula: " + c.getCedula());
            }
        }

        // Actualizar un cliente (suponiendo que ID 1 existe)
        controlador.actualizarCliente(1, "Juan", "Manuel", "Pérez", "López", "87654321", "Calle 456", "0987654321");

        // Eliminar un cliente
        controlador.eliminarCliente(1);
    }
}




