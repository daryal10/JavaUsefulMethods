package basicConcept;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		int abc[][]= {{2,4,5},{3,4,7,22,50},{1,2,9,-3,12,-36}};
		int min=abc[0][0];
		int max=abc[0][0];
		
		for(int i=0;i<abc.length;i++) {
			
			for(int j=0;j<abc[i].length;j++) {
				
				if(abc[i][j]<min) {
					min=abc[i][j];
				}	
				
				if(abc[i][j]>max) {
					max=abc[i][j];
				}
			}
		}
		System.out.println("Minimum is: "+min);
		System.out.println("Maximum is: "+max);
		

	}

}
