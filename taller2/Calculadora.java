import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Calculadora {
    Scanner sc = new Scanner(System.in);
    int num1, num2;
    float resultado;

    void operaciones() {
        System.out.println("Ingrese el primer numero: ");
        num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        num2 = sc.nextInt();
        System.out.println("Ingrese la operacion a realizar (+, -, *, /): ");
        char operacion = sc.next().charAt(0);

        switch (operacion) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                resultado = num1 / (float) num2;
                break;
            default:
                System.out.println("Operacion no valida");
                return;
        }

        JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true);       

        JOptionPane.showMessageDialog(frame, "El resultado es: " + resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);

        frame.dispose();
    }
}
