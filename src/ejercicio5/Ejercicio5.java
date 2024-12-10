package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int rango, numero, contP = 0, contI = 0;

        System.out.println("Ingrese la cantidad de números: ");
        rango = leer.nextInt();

        System.out.println("\nDigite el primer número: ");
        numero = leer.nextInt();

        for (int i = 1; i <= rango; i++) {
            if (numero % 2 == 0) {
                System.out.println("El número " + numero + " es PAR");
                contP++;

            } else {
                System.out.println("El número " + numero + " es IMPAR");
                contI++;

            }

            if (i != rango) {
                System.out.println("\nDigite otro número: ");
                numero = leer.nextInt();
            } else {
                System.out.println("\nHay " + contP + " números PARES y " + contI + " números IMPARES");
            }

        }

    }

}
