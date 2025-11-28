package boletinGit;

import java.util.Scanner;

public class Notas {
    public static void notas(){


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



    }



    }

