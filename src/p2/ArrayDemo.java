package p2;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		//starts from index 0 and to (length-1)
		float[] marks= new float[5]; //5 subject marks: float (32 bits)= 160 bits
		marks[0]= 34.5f; //index 0
		marks[3]= 78f;
	//	marks[4]= 54.6;
	//	marks[4]= "hello";
		for(int i=0; i< marks.length; i++) {
			System.out.println(marks[i]);
		}
		
		System.out.println(marks[2]);//print out value of element at index 2
		
		//Array: String: 4 fruits: print out the values
		
		
		String[] fruits= {"apple", "pear", "orange"};
		for(int i=0; i< fruits.length; i++) {
			System.out.println(fruits[i]);
		}
		
		for(String elem: fruits) {
			System.out.println(elem);
		}
		System.out.println(Arrays.toString(fruits));
		
	
	//	fruits[4]= "grapes"; //ArrayIndexOutOfBoundsException
		
		//fruits[2]= null;
		System.out.println(fruits.length); //3
		System.out.println(fruits[2]);//null
		
		
		//pear: search
		
		//sort
		
		//copy of array
		
		String[] copyFruits= new String[fruits.length];
		for(int i=0; i< copyFruits.length; i++) {
			copyFruits[i]= fruits[i];
		}
		
		String[] copyArr=Arrays.copyOf(fruits, fruits.length);
		System.out.println(Arrays.toString(copyArr));
		
		Arrays.sort(copyFruits);
		System.out.println(Arrays.toString(copyFruits));
		//remove a element from array
		
		//print
		
		
		int[][] roomDimensions = {{50, 120}, {70, 240}, {114, 150}};
		for( int i=0; i<roomDimensions.length; i++) { //3
			int[] room1= roomDimensions[0]; // {50, 120}
		System.out.println(room1[0]+""+ room1[1]); // 50, 120
		}
		
	}
}
