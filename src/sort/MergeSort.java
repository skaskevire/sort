package sort;

public class MergeSort implements Sort{

	int [] arrayLocal;
	@Override
	public int[] sort(int[] arrayToSort) {
		arrayLocal = new int[arrayToSort.length];
		sort(arrayToSort, 0, arrayToSort.length-1);		
		return arrayToSort;
	}
	
	
	private void sort(int [] array, int lowerBound, int upperBound)
	{		
		if(upperBound <= lowerBound)
		{
			return;
		}
		
	int middle = (lowerBound+upperBound)/2;
			sort(array, lowerBound, middle);
			sort(array, middle+1, upperBound);

				merge(array, lowerBound, middle, upperBound);		

			
	}

	private void merge(int [] array, int lowerBound,  int middle, int upperBound)
	{
		for (int i = lowerBound; i <= upperBound; i++) {
			arrayLocal[i] = array[i];
		}
		int left = lowerBound;
		int right = middle+1;
		for (int i = lowerBound; i <= upperBound; i++) {
			if(left > middle)
			{
				array[i] = arrayLocal[right++];
			}
			else if(right > upperBound)
			{
				array[i] = arrayLocal[left++];
			}
			else if(arrayLocal[right] < arrayLocal[left])
			{
				array[i] = arrayLocal[right++];
			}
			else
			{
				array[i] = arrayLocal[left++];
			}
		}
	}

}
