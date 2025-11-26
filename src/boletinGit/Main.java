package boletinGit;


import java.util.Scanner;
public class Main {
    static void main(String[] args) {
        System.out.println("Pr ́actica de Git: ejercicio 2");
        int opcion = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("\nInserte una opci ́on:");
            System.out.println("\t1 - CALCULADORA N ́UMEROS" +
                    "\n\t2 - NUMEROS PRIMOS" +
                    "\n\t3 - CALCULADORA FIGURAS" +
                    "\n\t4 - CALCULADORA DE NOTAS" +
                    "\n\t0 - EXIT\n");

            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    // Pedir primer número entero
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















        break;
                case 2:
                    System.out.println("Introduce un numero entero: ");
                    int numero = sc.nextInt();
                    int contadorDivisores=0;

                    if(numero<=2) {
                        System.out.println("El numero es primo.");
                    } else if (numero>2) {
                        for(int i = 2; i<numero;i++) {
                            if(numero%i==0) {
                                contadorDivisores++;
                            }

                        }
                        if(contadorDivisores==0) {
                            System.out.println("El numero es primo");
                        } else {
                            System.out.println("El numero no es primo");
                        }

                    }


                    break;
                case 3:
// insertar codigo aqui
                    break;
                case 4:
// insertar codigo aqui
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.err.println("ERROR: Opci ́on no reconocida.");
            }
        } while (opcion != 0);





    }
}




