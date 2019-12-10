package fouthQuestion;

public class FourthQuestion {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = { 7, 9, 8 };

		FourthQuestion fourth = new FourthQuestion();
		System.out.print(fourth.medios(arr1, arr2));

	}

	public int medios(int[] arr1, int[] arr2) {
		int a, b;
		a = arr1[1];
		b = arr2[1];

		System.out.println(a);
		System.out.println(b);

		return 0;

	}

}
