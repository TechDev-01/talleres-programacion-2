public class Detectives {
    private String detective;
    private int casosASignados;

    public Detectives(String detective) {
        this.detective = detective;
    }

    public String getDetective() {
        return detective;
    }

    public int getCasosASignados() {
        return casosASignados;
    }

    public Detectives registrarDetective(String detective) {
        return new Detectives(detective);
    }
}