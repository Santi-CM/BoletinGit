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
// insertar codigo aqui
                    break;
                case 2:
// insertar codigo aqui
                    break;
                case 3:
// insertar codigo aqui
                    break;
                case 4:

                    Scanner sc4 = new Scanner(System.in);

                    System.out.println("¿Cuantos alumnos hay en la clase?");
                    int numeroAlumnos = sc4.nextInt();

                    double nota;

                    double suma = 0;

                    for (int i = 1; i <= numeroAlumnos; i++){
                        System.out.println("¿Cual es la nota del alumno " + i + "?");
                        nota = sc4.nextDouble();
                        suma += nota;
                    }

                    double media = suma / numeroAlumnos;

                    System.out.println("La media de las notas de la clase es: " + media);

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




