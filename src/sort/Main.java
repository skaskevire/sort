package sort;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		System.out.println("----------------------");
		int[] arrayToSort = generateArrayToSort(9999);
		SortEnum[] sortAlgoritms = SortEnum.values();
		for (int i = 0; i < sortAlgoritms.length; i++) {
			long startTime =System.nanoTime();
			int[] resultingArray = sortAlgoritms[i].getSortAlgoritm().sort(arrayToSort);
			long endTime =  System.nanoTime();

			System.out.println(sortAlgoritms[i].getSortAlgoritm().getClass());
			System.out.println("Time elapsed: " + (endTime - startTime));
			for (int j = 0; j < resultingArray.length; j++) {
				System.out.print(resultingArray[j] + " ");
			}
			System.out.println("");
			System.out.println("----------------------");
		}
	}
	
	
	
	public static int[] generateArrayToSort(int size)
	{
		int [] array = new int[size];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = new Random().nextInt((int)Math.pow(10, Math.log10((double)size)));
		}
		
		return array;
	}
}
