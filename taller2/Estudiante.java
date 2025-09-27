import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class Estudiante {
    private String nombre;
    private int edad;
    private String carrera;
    private float notaFinal;

    void solicitarDatos() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del estudiante:");
        this.nombre = sc.nextLine();

        System.out.println("Ingrese la edad del estudiante:");
        this.edad = sc.nextInt();

        sc.nextLine();

        System.out.println("Ingrese la carrera del estudiante:");
        this.carrera = sc.nextLine();

        System.out.println("Ingrese la nota final del estudiante:");
        this.notaFinal = sc.nextFloat();

        if (!validarDatos()) {
            throw new IllegalArgumentException("Datos inválidos proporcionados para el estudiante.");
        }

        // Crear un JFrame invisible como parent
        JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true);

        JOptionPane.showMessageDialog(frame,
                "Datos del estudiante:\n" +
                        "Nombre: " + this.nombre + "\n" +
                        "Edad: " + this.edad + "\n" +
                        "Carrera: " + this.carrera + "\n" +
                        "Nota Final: " + this.notaFinal);
        frame.dispose(); 
    }

    boolean validarDatos() {
        return ((this.nombre != null && !this.nombre.isEmpty()) &&
                (this.edad > 0) &&
                (this.carrera != null && !this.carrera.isEmpty()) &&
                (this.notaFinal >= 0.0 && this.notaFinal <= 10.0));
    }
}