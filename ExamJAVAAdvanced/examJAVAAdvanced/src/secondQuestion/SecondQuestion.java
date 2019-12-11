package secondQuestion;

import java.util.Scanner;

public class SecondQuestion {

	public static void main(String[] args) {

		System.out.println("Ingresa 2 numeros para compararlos y ver cual es mas cercano al 21 :  ");
		Scanner scan = new Scanner(System.in);
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		scan.close();
		SecondQuestion second = new SecondQuestion();
		System.out.println(second.compare(n1, n2));

	}

	public int compare(int n1, int n2) {
		int a = 21 - n1;
		int b = 21 - n2;
		if (n1 < 0 && n2 < 0) {
			System.out.println("los valores deben ser mayores a 0");
		} else {
			if (n1 > 21 && n2 > 21) {
				System.out.println("0");
			} else {
				if (a < b || a == 0) {
					System.out.println(n1);
				} else {
					System.out.println(n2);
				}
			}
		}
		return 0;
	}
}
/*
 * Dados 2 valores enteros mayores a 0, regresar cualquiera que sea el valor mas
 * cercano a 21, sin pasar de este. Regresar 0 si ambos se pasan.
 * 
 * Ejemplo de entrada
 * 
 * 19 21
 * 
 * 17 22
 * 
 * 22 31
 * 
 * Ejemplo de salida
 * 
 * 21
 * 
 * 17
 * 
 * 0
 */