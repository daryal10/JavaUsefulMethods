package basicConcept;

public class AdjacentArray {

	public static void main(String[] args) {
		int[] a = { 1, 4, 8, 9, 12, 25 };// 3,4,1,3,24
		int diff = 0;
		for (int i = 0; i < a.length - 1; i++) {

			if (a[i + 1] - a[i] > diff) {
				diff = a[i + 1] - a[i];
			}
		}
		System.out.println(diff);
	}

}
