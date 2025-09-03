import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
        Ejercicio1.ejericicio1();
        MayorMenor.resolver();       
        ContadorVocales.contarVocales();
        Mcd.resolverMCD();
        Factorial.factorial();

        ImprimirNum.resolver();
        MostrarTabla.resolver();
        CompararNumeros.resolver();
        ClasificarEdad.resolver();
        ValidarNumero.resolver();
    }
}

class Ejercicio1 {
	static void ejericicio1(){
		Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
		int numero = scanner.nextInt();

		if(numero % 2 == 0) {
            System.out.println(false);
		} else {
			System.out.println(true);
		}
	}
}

class MayorMenor{
    static void resolver() {
        int matriz[] = {1,2,3,4,5};
       
        int mayor = 0;
        int i;
        for (i=0;i<matriz.length;i++){
            if (matriz[i]>mayor){
                mayor = matriz[i];
            }    
        }
        System.out.println(mayor);
    }
}

class ContadorVocales {
    static void contarVocales() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una palabra o frase: ");
        String texto = scanner.nextLine();

        int contador = 0;
        String vocales = "aeiouAEIOU";

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (vocales.indexOf(c) != -1) {
                contador++;
            }
        }

        System.out.print("Cantidad de vocales: " + contador);

        scanner.close();
    }
}

class Mcd{        
    static void resolverMCD() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        int a = sc.nextInt();
        System.out.print("Introduce el segundo número: ");
        int b = sc.nextInt();

        // Algoritmo de Euclides para el MCD
        int mcd = calcularMCD(a, b);

        System.out.println("El MCD de " + a + " y " + b + " es: " + mcd);
    }

    static int calcularMCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

class Factorial {
    static void factorial() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        String entrada = scanner.nextLine(); // lee la línea completa
        int n = Integer.parseInt(entrada);

        long resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }

        System.out.println("El factorial de " + n + " es: " + resultado);
        scanner.close();
    }
}

// Ejercicios de ciclos y condicionales
class ImprimirNum {
    static void resolver() {
        int[] array = new int[50];
        int index = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                array[index] = i;
                index++;
            }
        }

        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}

class MostrarTabla {
    static void resolver() {
        int num = 8;
        int i;
        for (i=1;i<=10;i++){
            System.out.println(num+"*"+i+"="+(i*num));
        }
    }
}

class CompararNumeros {
    static void resolver() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int a = sc.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println(a + " es mayor que " + b);
        } else if (b > a) {
            System.out.println(b + " es mayor que " + a);
        } else {
            System.out.println("Ambos números son iguales");
        }
        sc.close();
    }
}

class ClasificarEdad {
    public static void resolver() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la edad: ");
        int edad = sc.nextInt();

        if (edad >= 0 && edad <= 12) {
            System.out.println("Es un niño");
        } else if (edad <= 17) {
            System.out.println("Es un adolescente");
        } else if (edad <= 64) {
            System.out.println("Es un adulto");
        } else {
            System.out.println("Es un adulto mayor");
        }

        sc.close();
    }
}

class ValidarNumero {
    public static void resolver() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int n = scanner.nextInt();

        if (n > 0) {
            System.out.println("El número es positivo");
        } else if (n < 0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es cero");
        }

        scanner.close();
    }
}
