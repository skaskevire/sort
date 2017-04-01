package sort;

import java.util.Arrays;
import java.util.Random;

public class Main {
	
	private static final boolean DEBUG_ENABLED = false;
	
	public static void main(String[] args) {
		int[] arrayToSort = generateArrayToSort(100000);
		//int[] arrayToSort = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,2,3,4,5,6,7,8 };
		
		
		sortArray(arrayToSort, DEBUG_ENABLED);
	}
	
	private static int[] generateArrayToSort(int size)
	{
		int [] array = new int[size];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = new Random().nextInt((int)Math.pow(10, Math.log10((double)size)));
		}
		
		return array;
	}
	
	private static void sortArray(int[] arrayToSort, boolean debugEnabled)
	{		
			if(debugEnabled)
			{
				printNotSortedArray(arrayToSort);
			}
		
			SortEnum[] sortAlgoritms = SortEnum.values();
			for (int i = 0; i < sortAlgoritms.length; i++) {
				
				int[] arrayToSortLocal = Arrays.copyOf(arrayToSort, arrayToSort.length);
				long startTime =System.nanoTime();
				int[] resultingArray = sortAlgoritms[i].getSortAlgoritm().sort(arrayToSortLocal);
				long endTime =  System.nanoTime();

				printResultsOfSorting(sortAlgoritms[i].getSortAlgoritm().getClass().toString(),
						startTime,
						endTime,
						resultingArray,
						debugEnabled);
			}
	}
	
	private static void printNotSortedArray(int[] arrayToSort)
	{
		for (int j = 0; j < arrayToSort.length; j++) {
			System.out.print(arrayToSort[j] + " ");
		}

		System.out.println("");
		System.out.println("----------------------");
		System.out.println("----------------------");
	}
	
	private static void printResultsOfSorting(String algoritmName, long startTime, long endTime, int[] resultingArray, boolean debugEnabled)
	{
		System.out.println(algoritmName);
		System.out.println("Time elapsed: " + (endTime - startTime));
		
		if(debugEnabled)
		{
			printSortedArray(resultingArray);
		}

		System.out.println("");
		System.out.println("----------------------");
	}
	
	private static void printSortedArray(int[] array)
	{
		for (int j = 0; j < array.length; j++) {
			System.out.print(array[j] + " ");
		}
	}	
}
