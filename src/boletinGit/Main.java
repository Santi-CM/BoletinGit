package boletinGit;


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Práctica de Git: ejercicio 2");
        int opcion = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("\nInserte una opción:");
            System.out.println("\t1 - CALCULADORA NÚMEROS" +
                    "\n\t2 - NUMEROS PRIMOS" +
                    "\n\t3 - CALCULADORA FIGURAS" +
                    "\n\t4 - CALCULADORA DE NOTAS" +
                    "\n\t0 - EXIT\n");

            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
// insertar codigo aqui
                    break;
                case 2:
// insertar codigo aqui
                    break;
                case 3:
// insertar codigo aqui
                    break;
                case 4:
                    Notas.notas();
                    break;
                default:
                    System.out.println("Opción no reconocida");
            }
        } while (opcion != 0);





    }
}




