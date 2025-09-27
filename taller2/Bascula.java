package taller2;

public class Bascula {
    double IMC;
    double calcularIMC(double peso, double altura) {
        IMC = peso / (altura * altura);
        return IMC;
    }
}
