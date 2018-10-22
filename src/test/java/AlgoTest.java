package test.java;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.Item;
import main.java.SortAlgos;
import main.java.SortDemoData;

public class AlgoTest {

	SortDemoData data = new SortDemoData();
	
	public boolean isArraySorted(Item[] givenArray) {
		boolean isSorted = false;
		if(givenArray.length == 1) {
			isSorted = true;
			return isSorted;
		}
		for(int i=0;i<givenArray.length-1;i++) {
			if(givenArray[i+1].key >= givenArray[i].key) {
				isSorted = true;
			}else {
				isSorted = false;
				break;
			}
		}
		
		return isSorted;
	}

	@Test
	public void IfArrayisSorted() {    
		
			//This test case covers 100% of the lines in the code. So this will be the Node Coverage test case
		    data.initializeArray("16 10 2 3 18 25 12");  
		    
		    Item[] InputArray = new Item[data.myArray.length];
			System.arraycopy(data.myArray, 0, InputArray, 0, data.myArray.length);
					   
			//Bubble sort
		    SortAlgos.bubbleSort(data.myArray);
		    assertTrue("...Array must be sorted after bubble sort...",isArraySorted(data.myArray));
		    assertFalse("...Previous Array must be unsorted...",isArraySorted(InputArray));	
		    
		    //Selection sort
			System.arraycopy(InputArray, 0, data.myArray, 0, InputArray.length);
			SortAlgos.selectionSort(data.myArray);
		    assertTrue("...Array must be sorted after selection sort...",isArraySorted(data.myArray));
		    assertFalse("...Previous Array must be unsorted...",isArraySorted(InputArray));	
		    
		    //Insertion sort
			System.arraycopy(InputArray, 0, data.myArray, 0, InputArray.length);
			SortAlgos.insertionSort(data.myArray);
			assertTrue("...Array must be sorted after insertion sort...",isArraySorted(data.myArray));
			assertFalse("...Previous Array must be unsorted...",isArraySorted(InputArray));
			
			//Merge sort
			System.arraycopy(InputArray, 0, data.myArray, 0,InputArray.length);
			SortAlgos.mergeSort(data.myArray);
			assertTrue("...Array must be sorted after merge sort...",isArraySorted(data.myArray));
			assertFalse("...Previous Array must be unsorted...",isArraySorted(InputArray));
			
			//Quick Sort
			System.arraycopy(InputArray, 0, data.myArray, 0, InputArray.length);
			SortAlgos.quickSort(data.myArray);
			assertTrue("...Array must be sorted after quick sort...",isArraySorted(data.myArray));
			assertFalse("...Previous Array must be unsorted...",isArraySorted(InputArray));


			//Heap Sort
			System.arraycopy(InputArray, 0, data.myArray, 0, InputArray.length);
			SortAlgos.heapSort(data.myArray);
			assertTrue("...Array must be sorted after heap sort...",isArraySorted(data.myArray));
			assertFalse("...Previous Array must be unsorted...",isArraySorted(InputArray));
			
	}
	
	@Test
	public void IfItSortsForRedundancies() {
		 	data.initializeArray("12 4 8 4 12 10 2 3");  
		    
		    Item[] InputArray = new Item[data.myArray.length];
			System.arraycopy(data.myArray, 0,InputArray, 0, data.myArray.length);
			
			//Involves Node and Edge Coverage
		    SortAlgos.bubbleSort(data.myArray);
		    
		    assertTrue("...Array must be sorted after bubble sort...",isArraySorted(data.myArray));
		    assertFalse("...Previous Array must be unsorted...",isArraySorted(InputArray));
	}
	
	
	@Test
	public void IfItSortsSingleElement() {
		data.initializeArray("2");  
			    
		//Involves Conditional and Edge Coverage
	    SortAlgos.bubbleSort(data.myArray);
	    
	    assertTrue("...Array must be sorted after bubble sort...",isArraySorted(data.myArray));
	}
	
	@Test
	public void IfItSortsDoubleElements() {
		data.initializeArray("10 2");  
	    
	    Item[] InputArray = new Item[data.myArray.length];
		System.arraycopy(data.myArray, 0, InputArray, 0, data.myArray.length);
			    
		//Involves Conditional and Edge Coverage
	    SortAlgos.bubbleSort(data.myArray);
	    
	    assertTrue("...Array must be sorted after bubble sort...",isArraySorted(data.myArray));
	    assertFalse("...Previous Array must be unsorted...",isArraySorted(InputArray));

		data.initializeArray("2 10");  
		//Involves Conditional and Edge Coverage
	    SortAlgos.bubbleSort(data.myArray);
	    
	    assertTrue("...Array must be sorted after bubble sort...",isArraySorted(data.myArray));

	}
	
	@Test
	public void IfItSortsWhenZeroIsPresent() {
		data.initializeArray("2 0 6 1 12 1 4");
		
		Item[] InputArray = new Item[data.myArray.length];
		System.arraycopy(data.myArray, 0, InputArray, 0, data.myArray.length);
		
		 SortAlgos.bubbleSort(data.myArray);
		 
		 assertTrue("...Array must be sorted after bubble sort...",isArraySorted(data.myArray));
		 assertFalse("...Previous Array must be unsorted...",isArraySorted(InputArray));
	}
	
	@Test
	public void IfItSortsNegativeNumbers() {
		data.initializeArray("-12 -5 -2 -10 -16 -8 -4");  
	    
	    Item[] InputArray = new Item[data.myArray.length];
		System.arraycopy(data.myArray, 0, InputArray, 0, data.myArray.length);
		
		//Involves Path and Edge Coverage
	    SortAlgos.bubbleSort(data.myArray);
	    
	    assertTrue("...Array must be sorted after bubble sort...",isArraySorted(data.myArray));
	    assertFalse("...Previous Array must be unsorted...",isArraySorted(InputArray));
	}
	
	@Test 
	public void IfItSortsBothPositiveAndNegative() {
		data.initializeArray("-2 -4 12 2 -7 6");  
	    
	    Item[] InputArray = new Item[data.myArray.length];
		System.arraycopy(data.myArray, 0, InputArray, 0, data.myArray.length);
		
		//Involves Path and Edge Coverage
	    SortAlgos.bubbleSort(data.myArray);
	    
	    assertTrue("...Array must be sorted after bubble sort...",isArraySorted(data.myArray));
	    assertFalse("...Previous Array must be unsorted...",isArraySorted(InputArray));
	} 

}
