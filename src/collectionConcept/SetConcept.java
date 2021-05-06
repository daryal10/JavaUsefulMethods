package collectionConcept;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetConcept {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(0);
		set.add(5);
		set.add(10);
		set.add(12);
		set.add(1);
		set.add(2);

		System.out.println(set.size());
		System.out.println(set);

		//printing using for loop
		for (Integer i : set) {
			System.out.println(i);
		}

		//printing using iterator  
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}


	}

}
