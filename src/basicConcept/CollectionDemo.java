package basicConcept;

import java.util.ArrayList;

public class CollectionDemo {

	public static void main(String[] args) {
		int a[] = { 4, 5, 6, 7, 4, 6, 5, 9, 4, 9, 12 };
		ArrayList<Integer> ab = new ArrayList<Integer>();

		for (int i = 0; i < a.length; i++) {
			int k = 0;
			if (!ab.contains(a[i])) {
				ab.add(a[i]);
				k++;
				for (int j = i + 1; j < a.length; j++) {
					if (a[i] == a[j]) {
						k++;

					}
				}

				//System.out.println(a[i] + " " + k);
				// System.out.println(k);

				if (k == 1) {
					System.out.println(a[i] + " is unique number");

				}
			}
		}
	}
}
