package sort;

public class QuickSort implements Sort{
	int depth = 0;
	@Override
	public int[] sort(int[] arrayToSort) {
		
		performQuickSort( arrayToSort, 0, arrayToSort.length - 1);
		
		return arrayToSort;

	}		
	
	private void performQuickSort(int[] arrayToSort,int b,int e)
	{
		int l = b;
		int r = e;
		
		int referenceNumber = arrayToSort[(l + r) / 2];
		while(l <= r)
		{	
			while(arrayToSort[l] < referenceNumber)
			{
				l++;
			}
			while(arrayToSort[r] > referenceNumber)
			{
				r--;
			}
			if(l <= r)
			{
				int temp = arrayToSort[r];
				arrayToSort[r] = arrayToSort[l];
				arrayToSort[l] = temp;
				l++;
				r--;
			}
		}		
		
		if( b < r)
		{
			performQuickSort(arrayToSort, b, r);
		}
		if( e > l)
		{
			performQuickSort(arrayToSort, l, e);
		}		
	}
}
