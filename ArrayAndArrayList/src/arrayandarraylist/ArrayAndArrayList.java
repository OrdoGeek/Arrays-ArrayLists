package arrayandarraylist;

//import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayAndArrayList {

	public static void main(String[] args) {
		ArrayAndArrayList arrayandarraylist = new ArrayAndArrayList();

		/*
		 Calling hoyMany
		 - For a defined array: int[] array = {1, 3, 5, 7, 9, 1, 2, 3, 4, 5};
		   Calling howMany(array, 1) would return 2
           Calling howMany(array, 10) would return 0
		 - For a defined array: int[] array = new int[0];
          Calling howMany(array, 1) would return 0
		*/
		/*System.out.println("Calling howMany with array = {1, 3, 5, 7, 9, 1, 2, 3, 4, 5}");
		System.out.println("Calling howMany(array, 1)");
		int[] array = {1, 3, 5, 7, 9, 1, 2, 3, 4, 5};
		System.out.println(arrayandarraylist.howMany(array, 1));
		System.out.println("Calling howMany(array, 10)");
		System.out.println(arrayandarraylist.howMany(array, 10));
		System.out.println("Calling howMany(array, 1) with array = new int [0]");
		array = new int[0];
		System.out.println(arrayandarraylist.howMany(array, 1));*/
		
		//-------------------------
		
		/*-
		Calling	findMax	
		- For a defined array: int[] array = {1, 3, 5, 7, 9, 1, 2, 3, 4, 5};
          Calling findMax(array) would return 9
	  
	    - For a defined array: int[] array = {2, 4, 8, 12, 12, 4};
          Calling findMax(array) would return 12
      
        - For a defined array: int[] array = new int[0];
          Calling findMax(array) would return -1
		*/
		/*System.out.println("Calling findMax");
		int [] array = {1, 3, 5, 7, 9, 1, 2, 3, 4, 5};
		System.out.println(arrayandarraylist.findMax(array));
		int [] array2 = {2, 4, 8, 12, 12, 4};
		System.out.println(arrayandarraylist.findMax(array2));
		int[] array3 = new int[0];
		System.out.println(arrayandarraylist.findMax(array3));*/

		//--------------------

		/*
		Calling maxArray
		 - For a defined array: int[] array = {1, 3, 5, 7, 9, 1, 2, 3, 4, 5};
           Calling maxArray(array) would return an ArrayList containing 9
      
         - For a defined array: int[] array = {2, 4, 8, 12, 12, 4};
           Calling maxArray(array) would return an ArrayList containing 12 and 12
      
      	 - For a defined array: int[] array = new int[0];
           Calling maxArray(array) would return null
		*/
		/*System.out.println("Calling maxArray");
		int[] array = {1, 3, 5, 7, 9, 1, 2, 3, 4, 5};
		System.out.println(arrayandarraylist.maxArray(array));
		int [] array2 = {2, 4, 8, 12, 12, 4};
		System.out.println(arrayandarraylist.maxArray(array2));
		int[] array3 = new int[0];
		System.out.println(arrayandarraylist.maxArray(array3));*/

		//--------------------------

		/*
		Calling swapZero
		 - For a defined array: int[] array = {0, 1, 0, 2, 0, 3, 0, 5};
          Calling swapZero(array) would change the array to be: {1, 2, 3, 5, 0, 0, 0, 0};
      
         - For a defined array: int[] array = {1, 3, 5, 7, 9, 10};
          Calling swapZero(array) wouldn't change the array, it would still be: {1, 3, 5, 7, 9, 10};
      
         - For a defined array: int[] array = new int[0];
          Calling swapZero(array) wouldn't change the array, it would still be empty
		*/
		System.out.println("Calling swapZero");
		int[] array = {0, 1, 0, 2, 0, 3, 0, 5};
		arrayandarraylist.swapZero(array);
		System.out.println(Arrays.toString(array));
		int[] array2 = {1, 3, 5, 7, 9, 10};
		System.out.println(Arrays.toString(array2));
		int[] array3 = new int[0];
		System.out.println(Arrays.toString(array3));


		//int[] array = {1, 3, 5, 7, 9, 10};
		//1, 3, 5, 7, 9, 1, 2, 3, 4, 5
		/**if (arrayandarraylist.maxArray(array) == null){
			System.out.println("null");
		};*/
		//System.out.println(arrayandarraylist.swapZero(array));
		//System.out.println(array.length);
		//arrayandarraylist.swapZero(array);
		//System.out.println(array.length);
	}
	
	/**
	 * Counts the number of occurrences of the given element in the given array.
	 * 
	 * Example(s):
     * - For a defined array: int[] array = {1, 3, 5, 7, 9, 1, 2, 3, 4, 5};
     * - Calling howMany(array, 1) would return 2
     * - Calling howMany(array, 10) would return 0
     * 
     * - For a defined array: int[] array = new int[0];
     * - Calling howMany(array, 1) would return 0
     * 
	 * @param array to search
	 * @param element to search for
	 * @return number of times element is in array
	 */
	public int howMany(int[] array, int element) {
		int cont = 0;
		for (int i = 0;i<array.length;i++) {
			if (array[i] == element) {
				cont += 1;
			}
		}
		return cont;
	}
	
	/**
	 * Finds the max number in the given array.
	 * If the array is empty, returns -1.
	 * 
	 * Example(s):
     * - For a defined array: int[] array = {1, 3, 5, 7, 9, 1, 2, 3, 4, 5};
     * - Calling findMax(array) would return 9
	 * 
	 * - For a defined array: int[] array = {2, 4, 8, 12, 12, 4};
     * - Calling findMax(array) would return 12
     * 
     * - For a defined array: int[] array = new int[0];
     * - Calling findMax(array) would return -1
     * 
	 * @param array to search
	 * @return max number in array
	 */
	public int findMax(int[] array) {
		if (array.length == 0) {
			return -1;
		}else {
			int maxNumber = 0;
			for (int i = 0;i<array.length;i++) {
				if (array[i] > maxNumber) {
					maxNumber = array[i];
				}
			}
			return maxNumber;
		}
	}
	
	/**
	 * Keeps track of every occurrence of the max number in the given array.
	 * Returns an ArrayList that contains every occurrence of the max number.
	 * Uses the findMax(int[] array) method.
	 * If the array is empty, returns null.
	 * 
	 * Example(s):
     * - For a defined array: int[] array = {1, 3, 5, 7, 9, 1, 2, 3, 4, 5};
     * - Calling maxArray(array) would return an ArrayList containing 9
     * 
     * - For a defined array: int[] array = {2, 4, 8, 12, 12, 4};
     * - Calling maxArray(array) would return an ArrayList containing 12 and 12
     * 
     * - For a defined array: int[] array = new int[0];
     * - Calling maxArray(array) would return null
     * 
	 * @param array to search
	 * @return ArrayList containing every instance of the max
	 */
	public ArrayList<Integer> maxArray(int[] array) {
		int x;
		int y;
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		if (array.length == 0) {
			return null;
		}else {
			x = findMax(array);
			System.out.println("Max int: " + x);
			y = howMany(array, x);
			System.out.println("Times: " + y);
			
			for(int j = 0;j<y;j++){
				arrayList.add(x); 
			}
			return arrayList;
		}
		
	}
	
	/**
	 * Puts all of the zeros in the given array, at the end of the given array.
	 * Updates the array itself.
	 * Maintains the order of the non-zeros.
	 * 
	 * Example(s):
     * - For a defined array: int[] array = {0, 1, 0, 2, 0, 3, 0, 5};
     * - Calling swapZero(array) would change the array to be: {1, 2, 3, 5, 0, 0, 0, 0};
     * 
     * - For a defined array: int[] array = {1, 3, 5, 7, 9, 10};
     * - Calling swapZero(array) wouldn't change the array, it would still be: {1, 3, 5, 7, 9, 10};
     * 
     * - For a defined array: int[] array = new int[0];
     * - Calling swapZero(array) wouldn't change the array, it would still be empty
     * 
	 * @param array to search for zeros
	 */
	public void swapZero(int[] array) {
		int aux = 0;
		for (int i = 0;i<array.length;i++) {
			if (array[aux] == 0) {
				for (int k = aux;k<array.length-1;k++) {
					array[k] = array[k+1];
					array[k+1] = 0;
				}
			}else {
				aux += 1;
			}
		}	
	}
	
}
