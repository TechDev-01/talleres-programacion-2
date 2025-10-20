import java.util.ArrayList;

public class Sospechosos {
    private String nombre;
    private String alias = null;
    private int edad;
    private String ultimaDireccion;
    private String descripcionFisica;

    ArrayList<Sospechosos> sospechosos;

    public Sospechosos(ArrayList<Sospechosos> sospechosos) {
        this.sospechosos = sospechosos;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getAlias() {
        return alias;
    }

    public String getUltimaDireccion() {
        return ultimaDireccion;
    }

    public String getDescripcionFisica() {
        return descripcionFisica;
    }

    public Sospechosos registrarSospechos(String nombre, String alias, int edad, String ultimaDireccion,
    String descripcionFisica) {
        for (Sospechosos sospechosos : this.sospechosos) {
            if (sospechosos.getNombre().equals(nombre)) {
                System.out.println("Sospechoso ya registrado");
                return null;
            }
        }
        Sospechosos nuevoSospechoso = new Sospechosos(sospechosos);
        nuevoSospechoso.nombre = nombre;
        nuevoSospechoso.alias = alias;
        nuevoSospechoso.edad = edad;
        nuevoSospechoso.ultimaDireccion = ultimaDireccion;
        nuevoSospechoso.descripcionFisica = descripcionFisica;
        this.sospechosos.add(nuevoSospechoso);
        return nuevoSospechoso;
    }
}
