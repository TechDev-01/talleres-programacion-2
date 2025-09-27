package taller2;

class Main {
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo();
        System.out.println("Area: " + rectangulo.calcularArea(5, 10));
        System.out.println("Perimetro: " + rectangulo.calcularPerimetro(5, 10));

        Bascula bascula = new Bascula();
        System.out.println("IMC: " + bascula.calcularIMC(70, 1.75));
    
        Calculadora calculadora = new Calculadora();
        calculadora.operaciones();

        Estudiante estudiante = new Estudiante();
        estudiante.solicitarDatos();

        GestionProductos gestionProductos = new GestionProductos();
        gestionProductos.mostrarMenuInicio();
    }
}