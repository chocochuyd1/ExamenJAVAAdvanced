package fifthQuestion;

import java.util.Scanner;

public class FifthQuestion{
    public static void main(String[] args) {
        Overrs ope = new Overrs();
    	
    	System.out.println("Ingresa 2 numerocon lo que deses hacer operaciones");
        Scanner scan = new Scanner(System.in);
		int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int i = 0;
        System.out.println("Elija la opcopn de la operacion que desea realizar");
        System.out.println("1.-Suma de " + n1 + " + " + n2 );
        System.out.println("2.-Resta de " + n1 + " + " + n2 );
        System.out.println("3.-Multiplicacion de " + n1 + " + " + n2 );
        System.out.println("4.-Division de " + n1 + " + " + n2 );
        i = scan.nextInt();
        switch (i) {
		case 1:
//			ope.Suma(n1,n2);
			System.out.print(ope.Suma(n1, n2));
			break;
		case 2:
//			ope.Resta(n1,n2);
			System.out.print(ope.Resta(n1, n2));
			break;
		case 3:
//			ope.Multiplicacion(n1,n2);
			System.out.print(ope.Multiplicacion(n1, n2));
			break;
		case 4:
//			ope.Division(n1,n2);
			System.out.print(ope.Division(n1, n2));
			break;

		default:
			break;
			}
        
    }
    }
