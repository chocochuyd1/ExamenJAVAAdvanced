package fouthQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class FourthQuestion {

	public static void main(String[] args) {
		fillArray();
	}

	public static void fillArray() {
		Scanner scan = new Scanner(System.in);
		int[] arr1 = {};
		int[] arr2 = {};

		System.out.println("Ingresa el tamaño para el arreglo 1");
		int a1 = scan.nextInt();
		arr1 = new int[a1];
		System.out.println("Ingresa valores para el arreglo 1");
		for (int i = 0; i < arr1.length; i++) {
			int intArr1 = scan.nextInt();
			arr1[i] = intArr1;
		}
		System.out.println("Ingresa el tamaño para el arreglo 2");
		int a2 = scan.nextInt();
		arr2 = new int[a2];
		System.out.println("Ingresa valores para el arreglo 2");
		for (int i = 0; i < arr2.length; i++) {
			int intArr2 = scan.nextInt();
			arr2[i] = intArr2;
		}
		scan.close();

		FourthQuestion fourth = new FourthQuestion();
		System.out.println(fourth.medios(arr1, arr2));
	}

	public int medios(int[] arr1, int[] arr2) {
		int a, b;
		a = arr1[arr1.length / 2];
		b = arr2[arr2.length / 2];

		System.out.print(Arrays.toString(arr1) + " = ");
		System.out.println(a);
		System.out.print(Arrays.toString(arr2) + " = ");
		System.out.println(b);

		return 0;

	}

}
/*
 * Dados 2 arrays de enteros j y K, cada uno de tamaño 3, regresar un arreglo
 * nuevo de tamaño 2 que contenga sus elementos medios.
 * 
 * Entrada de ejemplo
 * 
 * {1, 2, 3} {4, 5, 6}
 * 
 * {7, 7, 7} {3, 8, 0}
 * 
 * Salida de ejemplo
 * 
 * {2, 5}
 * 
 * {7, 8}
 */
