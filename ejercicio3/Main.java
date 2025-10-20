import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Sospechosos> listaSospechosos = new ArrayList<>();
        ArrayList<Caso> listaCasos = new ArrayList<>();

        Sospechosos gestorSospechosos = new Sospechosos(listaSospechosos);
        Caso gestorCasos = new Caso(listaCasos);

        Detectives detective1 = new Detectives("Sherlock Holmes");

        Caso caso1 = gestorCasos.registrarCaso("C001", "El Misterio de la Calle Falsa", "Un caso intrigante", detective1, gestorSospechosos);
        Caso caso2 = gestorCasos.registrarCaso("C002", "El Secreto del Templo", "Un caso misterioso", detective1, gestorSospechosos);

        Sospechosos sospechoso1 = gestorSospechosos.registrarSospechos("John Doe", "El Fantasma", 30, "123 Calle Falsa", "Alto, delgado");
        Sospechosos sospechoso2 = gestorSospechosos.registrarSospechos("Jane doe", "El Mudo", 30, "123 Calle Falsa", "Alto, delgado");


        for (Sospechosos sospechoso : listaSospechosos) {
            System.out.println("Sospechoso: " + sospechoso.getNombre() + ", Alias: " + sospechoso.getAlias());
        }

        for (Caso caso : listaCasos) {
            System.out.println(caso.toString());
        }
        
    }
}