package taller2;

public class Rectangulo {
    double base;
    double altura;

    double calcularArea(double base, double altura) {
        return base * altura;
    }

    double calcularPerimetro(double base, double altura) {
        return 2 * (base + altura);
    }
}
