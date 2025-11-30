package boletinGit;

import java.util.Scanner;

public class CalculadoraBasica {
    public static void calculadoraBasica() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el primer número entero: ");
        int num1 = sc.nextInt();

        // Pedir operador
        System.out.print("Introduce un operador (+, -, *, /): ");
        String operador = sc.next();

        // Pedir segundo número entero
        System.out.print("Introduce el segundo número entero: ");
        int num2 = sc.nextInt();


        int resultado;
        // Evaluar el operador
        switch (operador) {
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    resultado = num1 / num2; // división entera
                } else {
                    System.out.println("Error: división por cero");
                    sc.close();
                    return;
                }
                break;
            default:
                System.out.println("Operador no válido");
                sc.close();
                return;
        }
        // Mostrar resultado
        System.out.println("Resultado: " + resultado);

    }
}
