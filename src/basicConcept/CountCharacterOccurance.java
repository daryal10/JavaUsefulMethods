package basicConcept;

public class CountCharacterOccurance {

	public static void main(String[] args) {
		int count = countOccurances("aandagjadsajajp", 'a');
		System.out.println(count);
		
		int count1 = countOccurances("aandagjadsajajp", 'j');
		System.out.println(count1);
		

	}

	public static int countOccurances(String word, char character) {

		int count = 0;
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == character) {
				count++;
			}
		}
		return count;
	}

}
