package arrayandarraylist;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArrayAndArrayListTest {
	// declare myArrayAndArrayList which is the object for testing
		ArrayAndArrayList myArrayAndArrayList;
		
		@BeforeEach
		void setUp() throws Exception {
			// initialize myArrayAndArrayList for testing
			this.myArrayAndArrayList = new ArrayAndArrayList();
		}
		
		/**
		 * Test howMany method in ArrayAndArrayList.
		 */
		@Test
		void testHowMany() {
			// element in the array
			int[] array = {1, 3, 5, 7, 9, 1, 2, 3, 4, 5};
			assertEquals(2, this.myArrayAndArrayList.howMany(array, 1));
			
			// TODO write at least 3 additional test cases 
			assertEquals(1, this.myArrayAndArrayList.howMany(array, 4));
			
			assertEquals(0, this.myArrayAndArrayList.howMany(array, 8));
			
			assertEquals(2, this.myArrayAndArrayList.howMany(array, 5));
		}
		
		/**
		 * Test findMax method in ArrayAndArrayList.
		 */
		@Test
		void testFindMax() {
			// findMax in an nonEmpty array
			int[] array = {1, 3, 5, 7, 9, 1, 2, 3, 4, 5};
			assertEquals(9, this.myArrayAndArrayList.findMax(array));
			
			// TODO write at least 3 additional test cases 
			int[] array2 = {3, 9, 1, 5, 6, 8, 12};
			assertEquals(12, this.myArrayAndArrayList.findMax(array2));
			
			int[] array3 = {21, 22, 23, 24};
			assertEquals(24, this.myArrayAndArrayList.findMax(array3));
			
			int[] array4 = {100, 1001, 10};
			assertEquals(1001, this.myArrayAndArrayList.findMax(array4));
		}

		/**
		 * Test maxArray method in ArrayAndArrayList.
		 */
		@Test
		void testMaxArray() {
			// test a valid array. 
			int[] array = {1, 3, 5, 7, 9, 1, 2, 3, 4, 5};
			ArrayList<Integer> testArrayList = new ArrayList<Integer>();
			testArrayList.add(9);
			assertEquals(testArrayList, this.myArrayAndArrayList.maxArray(array));
			
			// TODO write at least 3 additional test cases
			int[] array2 = {1, 3, 5, 7, 9, 9, 2, 3, 4, 5};
			ArrayList<Integer> testArrayList2 = new ArrayList<Integer>();
			testArrayList2.add(9);
			testArrayList2.add(9);
			assertEquals(testArrayList2, this.myArrayAndArrayList.maxArray(array2));
			
			int[] array3 = {4, 2, 3, 4, 4};
			ArrayList<Integer> testArrayList3 = new ArrayList<Integer>();
			testArrayList3.add(4);
			testArrayList3.add(4);
			testArrayList3.add(4);
			assertEquals(testArrayList3, this.myArrayAndArrayList.maxArray(array3));
			
			int[] array4 = {1, 3, 5, 100, 100, 7};
			ArrayList<Integer> testArrayList4 = new ArrayList<Integer>();
			testArrayList4.add(100);
			testArrayList4.add(100);
			assertEquals(testArrayList4, this.myArrayAndArrayList.maxArray(array4));
			
		}

		/**
		 * Test swapZero method in ArrayAndArrayList.
		 */
		@Test
		void testSwapZero() {
			// test an array containing 0
			int[] array = {0, 1, 0, 2, 0, 3, 0, 5};
			int[] testArray = {1, 2, 3, 5, 0, 0, 0, 0};
			this.myArrayAndArrayList.swapZero(array);
			assertArrayEquals(testArray, array);
			
			// TODO write at least 3 additional test cases
			int[] array2 = {0, 1, 0, 2};
			int[] testArray2 = {1, 2, 0, 0};
			this.myArrayAndArrayList.swapZero(array2);
			assertArrayEquals(testArray2, array2);
			
			int[] array3 = {1,2,3,4};
			int[] testArray3 = {1, 2, 3, 4};
			this.myArrayAndArrayList.swapZero(array3);
			assertArrayEquals(testArray3, array3);
			
			int[] array4 = {1, 0, 2, 0, 0};
			int[] testArray4 = {1, 2, 0, 0, 0};
			this.myArrayAndArrayList.swapZero(array4);
			assertArrayEquals(testArray4, array4);
			
		}
		
}
