package boletinGit;

import java.util.Scanner;

public class NumerosPrimos {
    public static void numerosPrimos() {
        Scanner sc = new Scanner(System.in);
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



    }
}
