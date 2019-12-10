package secondQuestion;

import java.util.Scanner;

public class SecondQuestion {

	public static void main(String[] args) {

		System.out.println("Ingresa 2 numero para compararlos y ver cual es mas cercano al 21 :  ");
		Scanner scan = new Scanner(System.in);
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		SecondQuestion second = new SecondQuestion();
		System.out.println(second.compare(n1, n2));

	}

	public int compare(int n1, int n2) {
		int a = 21 - n1;
		int b = 21 - n2;
		if (n1 > 21 && n2 > 21) {
			System.out.println("0");
		} else {
			if (a < b || a == 0) {
				System.out.println(n1);
			} else {
				System.out.println(n2);
			}
		}

		return 0;

	}

}
