package fifthQuestion;

import java.util.Scanner;

public class FifthQuestion {
	public static void main(String[] args) {
		Overrs ope = new Overrs();

		System.out.println("Ingresa 2 numerocon lo que deses hacer operaciones");
		Scanner scan = new Scanner(System.in);
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		int i = 0;
		System.out.println("Elija la opcopn de la operacion que desea realizar");
		System.out.println("\n1.-Suma de " + n1 + " + " + n2);
		System.out.println("2.-Resta de " + n1 + " - " + n2);
		System.out.println("3.-Multiplicacion de " + n1 + " x " + n2);
		System.out.println("4.-Division de " + n1 + " / " + n2);
		i = scan.nextInt();
		scan.close();

		switch (i) {
		case 1:
			System.out.print("El resultado es : ");
			System.out.print(ope.Suma(n1, n2));
			break;
		case 2:
			System.out.print("El resultado es : ");
			System.out.print(ope.Resta(n1, n2));
			break;
		case 3:
			System.out.print("El resultado es : ");
			System.out.print(ope.Multiplicacion(n1, n2));
			break;
		case 4:
			System.out.print("El resultado es : ");
			System.out.printf("%.3f", ope.Division(n1, n2));
			break;

		default:
			break;
		}

	}
}
/*
 * Crear una interfaz de Java (en su propio paquete) que defina las cuatro
 * operaciones aritmeticas suma, resta, multiplicacion y division usando 2
 * numeros enteros. Enseguida, crear una clase de Java que implemente dicha
 * interfaz (en un paquete diferente) que permita llevar a cabo estas
 * operaciones.
 */