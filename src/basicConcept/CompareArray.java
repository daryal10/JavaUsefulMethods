package basicConcept;

import java.util.ArrayList;
import java.util.List;

public class CompareArray {

	public static void main(String[] args) {
		int[] a = { 1, 4, 8, 9, 12, 25,40};

		int[] b = { 3, 4, 7, 9, 13,25,50 ,40};

		List<Integer> num = new ArrayList<Integer>();

		for (int i = 0; i < a.length - 1; i++) {

			if (a[i] == b[i]) {
				num.add(a[i]);
			}

		}
		Object []c=num.toArray();
		for(Object obj:c) {
			System.out.println(obj);
		}
	}
}