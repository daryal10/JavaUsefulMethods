package basicConcept;

public class ArraySorting {

	public static void main(String[] args) {
		int[] a = { 14, 1, 3, 4, 17, 90, 12, 2, 7, 81 };
		int temp;

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

}
