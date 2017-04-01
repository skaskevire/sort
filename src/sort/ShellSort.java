package sort;

public class ShellSort implements Sort{

	@Override
	public int[] sort(int[] arrayToSort) {
		
		int h = 1;
		int N = arrayToSort.length;
		while(h < ( N / 3 ))
		{
			h = 3*h + 1;
		}
		
		while(h >= 1)
		{
		for (int i = h; i < N; i++) {

			int arrayToSortI = arrayToSort[i];
			int j = i - h;
			while (j >= 0 && arrayToSort[j] > arrayToSortI) {
				arrayToSort[j + h] = arrayToSort[j];
				j = j - h;
			}
			arrayToSort[j + h] = arrayToSortI;
			
		}
		
		h = h / 3;
		}
		
		
		return arrayToSort;
	}

}
