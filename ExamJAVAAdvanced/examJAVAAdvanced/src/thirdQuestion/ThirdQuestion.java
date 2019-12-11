package thirdQuestion;

import java.util.Scanner;

public class ThirdQuestion {

	public static void main(String[] args) {
		System.out.println("Ingrse una palabra o frase para descubrir si es un palindromo");
		Scanner scan = new Scanner(System.in);
		String palindromo = scan.nextLine();
		scan.close();
		StringBuilder input1 = new StringBuilder();
		palindromo = palindromo.replaceAll("\\s+", "");
		input1.append(palindromo);
		input1.reverse();
		if (palindromo.equals(input1.toString())) {

			System.out.println(palindromo);
			System.out.println(input1);

			System.out.println("Si es un palindromo");
		} else {
			System.out.println("No es un palindromo");
			System.out.println(palindromo);
			System.out.println(input1);
		}
	}

}
/*
 * Un palíndromo es una palabra, frase o secuencia de caracteres que se leen
 * igual al derecho que al reves.
 * 
 * Dada una cadena cualquiera A, imprimir "Si", si es un palíndromo. De lo
 * contrario, imprimir "No".
 * 
 * 
 * Restricciones
 * 
 * Cadena A consistira de maximo 50 caracteres minusculos del alfabeto Ingles.
 * 
 * Entrada de ejemplo
 * 
 * madam
 * 
 * Salida de ejemplo
 * 
 * Si
 */