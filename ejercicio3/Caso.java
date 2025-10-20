import java.util.ArrayList;

public class Caso {
    private String idCaso;
    private String nombreCasoClave;
    private String descripcion;
    private Detectives detectiveAsignado;
    private Sospechosos sospechoso;

    private ArrayList<Caso> casos;

    public Caso(ArrayList<Caso> casos) {
        this.casos = casos;
    }

    public String getIdCaso() {
        return idCaso;
    }

    public String getNombreClave() {
        return nombreCasoClave;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Caso registrarCaso(
            String idCaso,
            String nombreClave,
            String descripcion,
            Detectives detectiveAsignado,
            Sospechosos sospechoso) {
        for (Caso caso : this.casos) {
            if (caso.getIdCaso().equals(idCaso)) {
                System.out.println("El caso ya esta registrado");
                return null;
            }
        }
        Caso nuevoCaso = new Caso(casos);
        nuevoCaso.idCaso = idCaso;
        nuevoCaso.nombreCasoClave = nombreClave;
        nuevoCaso.descripcion = descripcion;
        nuevoCaso.detectiveAsignado = detectiveAsignado;
        nuevoCaso.sospechoso = sospechoso;
        this.casos.add(nuevoCaso);

        return nuevoCaso;
    }

    @Override
    public String toString() {
        return "Caso{ idCaso='" + this.idCaso + "', nombreCasoClave='" + this.nombreCasoClave + "', descripcion='" + this.descripcion + "', detectiveAsignado=" + this.detectiveAsignado.getDetective() + ", sospechoso=" + this.sospechoso.getNombre() + " }";
    }
}
