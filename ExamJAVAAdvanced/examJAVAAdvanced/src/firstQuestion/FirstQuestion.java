package firstQuestion;

import java.util.Scanner;

public class FirstQuestion {

    public static void main(String[] args) {
        System.out.println("Ingresa un numero del \"2 - 20\" para ver sus multiplos del 1 - 10 :  ");
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.close();
        System.out.println("-----------------------------------------------------");
        if (N > 20 || N < 2) {
            System.out.println("Numero no valido");
        } else {
            for (int i = 1; i <= 10; i++) {
                System.out.println(N + " x " + i + " = " + (N * i));
            }
        }

    }
}
/*
 * 1.Dado un entero N, imprimir sus primeros 10 multiplos. Cada multiplo N x I
 * (donde 1 <= i <= 10) debe ser impreso en una nueva linea en la forma
 * "N x i = resultado".
 * 
 * Restricciones
 * 
 * 2 <= N <= 20
 * 
 * Ejemplo de entrada
 * 
 * 2
 * 
 * Ejemplo de salida
 * 
 * 2 x 1 = 2 2 x 2 = 4 2 x 3 = 6 2 x 4 = 8 2 x 5 = 10 2 x 6 = 12 2 x 7 = 14 2 x
 * 8 = 16 2 x 9 = 18 2 x 10 = 20
 */