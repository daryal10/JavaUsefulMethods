package collectionConcept;

import java.util.LinkedList;
import java.util.List;

public class LinkedListConcept {

	public static void main(String[] args) {

		List<Integer> list = new LinkedList<Integer>();
		
		list.add(1);
		list.add(5);
		list.add(3);
		list.add(9);
		list.add(7);
		list.add(13);
		list.add(11);
		list.add(15);
		list.add(13);
		System.out.println(list.size());//7
		System.out.println(list);
		System.out.println(list.indexOf(13));//5
		System.out.println(list.contains(12));//false
		System.out.println(list.contains(11));//true
		System.out.println(list.isEmpty());//false
		System.out.println(list.lastIndexOf(13));//8
		System.out.println(list.remove(2));//3
		

	}

}
