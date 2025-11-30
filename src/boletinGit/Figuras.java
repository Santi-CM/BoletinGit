package boletinGit;

import java.util.Scanner;

public class Figuras {
    public static void figuras(){

        Scanner sc2 = new Scanner(System.in);

        System.out.println("Calculadora de Áreas de Figuras");
        System.out.println("Elige una figura:");
        System.out.println("1. Círculo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Triángulo");
        int opcionFigura = sc2.nextInt();

        double area = 0;

        switch (opcionFigura) {
            case 1:
                System.out.print("Introduce el radio del círculo: ");
                double radio = sc2.nextDouble();
                area = Math.PI * Math.pow(radio, 2);
                System.out.println("El área del círculo es: " + area);
                break;

            case 2:
                System.out.print("Introduce el lado del cuadrado: ");
                double lado = sc2.nextDouble();
                area = Math.pow(lado, 2);
                System.out.println("El área del cuadrado es: " + area);
                break;

            case 3:
                System.out.print("Introduce la base del triángulo: ");
                double base = sc2.nextDouble();
                System.out.print("Introduce la altura del triángulo: ");
                double altura = sc2.nextDouble();
                area = (base * altura) / 2;
                System.out.println("El área del triángulo es: " + area);
                break;

            default:
                System.out.println("Opción no válida.");
        }




    }

}
