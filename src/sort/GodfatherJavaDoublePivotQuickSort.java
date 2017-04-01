package sort;

import java.util.Arrays;

public class GodfatherJavaDoublePivotQuickSort implements Sort{

	

		/**
		 *
		 * 
		 * 
    **
     * Sorts the specified array into ascending numerical order.
     *
     * <p>Implementation note: The sorting algorithm is a Dual-Pivot Quicksort
     * by Vladimir Yaroslavskiy, Jon Bentley, and Joshua Bloch. This algorithm
     * offers O(n log(n)) performance on many data sets that cause other
     * quicksorts to degrade to quadratic performance, and is typically
     * faster than traditional (one-pivot) Quicksort implementations.
     *
     * @param a the array to be sorted
     */
		@Override
    public int[] sort(int[] arrayToSort) {
		 Arrays.sort(arrayToSort);
		return arrayToSort;
	}

}
