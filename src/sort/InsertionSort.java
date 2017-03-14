package sort;

public class InsertionSort implements Sort {

	@Override
	public int[] sort(int[] arrayToSort) {
		for (int i = 1; i < arrayToSort.length; i++) {

			int arrayToSortI = arrayToSort[i];
			int j = i - 1;
			while (j >= 0 && arrayToSort[j] > arrayToSortI) {
				arrayToSort[j + 1] = arrayToSort[j];
				j = j - 1;
			}
			arrayToSort[j + 1] = arrayToSortI;
		}
		return arrayToSort;
	}

}
