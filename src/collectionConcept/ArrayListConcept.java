package collectionConcept;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListConcept {
	public static <E> void main(String[] args) {
		List<E> names = new ArrayList<>();
		names.add((E) "Awadesh");
		names.add((E) "Aniska");
		names.add((E) "Kalawati");
		names.add((E) "Saroj");
		names.add((E) "Prasanna");

		System.out.println(names.size());
		System.out.println(names);
		
		//Printing all the array
		Iterator<E> it = names.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
