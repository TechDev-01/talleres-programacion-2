package taller2;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class GestionProductos {
    Scanner scanner = new Scanner(System.in);

    private String nombreProducto;
    private double precioProducto;
    private int cantidadProducto;
    private ArrayList<Producto> productosList = new ArrayList<>();
    private int contadorProductos = 0;

    public void mostrarMenuInicio() {
        boolean condition = true;
        while (condition) {
            System.out.println("=== Gestión de Productos ===");
            System.out.println("1. Agregar Producto");
            System.out.println("2. Mostrar Productos");
            System.out.println("3. Buscar Productos");
            System.out.println("4. Salir");

            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    agregarProducto();
                    break;
                case 2:
                    mostrarProductos();
                    break;
                case 3:
                    buscarProducto();
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    condition = false;
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
                    mostrarMenuInicio();
                    break;
            }
        }
    }

    public void agregarProducto() {
        System.out.println("=== Agregar Producto ===");
        System.out.print("Nombre del producto: ");
        this.nombreProducto = scanner.nextLine();

        System.out.println("Precio del producto: ");
        this.precioProducto = scanner.nextDouble();

        System.out.println("Cantidad del producto: ");
        this.cantidadProducto = scanner.nextInt();
        scanner.nextLine();

        if (!validarDatos()) {
            throw new IllegalArgumentException("Datos Invalidos, intente otra vez");
        }

        Producto nuevoProducto = new Producto(nombreProducto, precioProducto, cantidadProducto);
        productosList.add(nuevoProducto);
        contadorProductos++;

    }

    public void mostrarProductos() {
        System.out.println("=== Lista de Productos ===");
        if (contadorProductos == 0) {
            System.out.println("No hay productos para mostrar.");
        } else {
            for (Producto producto : productosList) {
                System.out.println(producto.toString());
            }
        }
    }

    public void buscarProducto() {
        System.out.println("=== Buscar Producto ===");
        System.out.print("Ingrese el nombre del producto a buscar: ");
        String nombreBusqueda = scanner.nextLine();
        boolean encontradoFlag = false;

        JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true);

        for (int i = 0; i < contadorProductos; i++) {
            if (productosList.get(i).getNombre().toLowerCase().contains(nombreBusqueda.toLowerCase())) {
                JOptionPane.showMessageDialog(frame, "Producto encontrado: " + productosList.get(i).toString());
                encontradoFlag = true;
            } else {
                System.out.println("No se encontró el producto: " + nombreBusqueda);
            }
        }

        if (!encontradoFlag) {
            JOptionPane.showMessageDialog(frame, "No se encontró el producto: " + nombreBusqueda);
        }
        frame.dispose();
    }

    public boolean validarDatos() {
        return (nombreProducto != null && !nombreProducto.trim().isEmpty() &&
                precioProducto >= 0 &&
                cantidadProducto >= 0);
    }
}
