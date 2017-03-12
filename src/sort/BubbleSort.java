package sort;

public class BubbleSort implements Sort{

	@Override
	public int[] sort(int[] arrayToSort) {
		
		boolean changed = false;
		for (int i = 0; i < arrayToSort.length-1; i++) {
			for (int j = 0; j < arrayToSort.length-1; j++) {
				if(arrayToSort[j] > arrayToSort[j+1])
				{
					int temp = arrayToSort[j];
					arrayToSort[j] = arrayToSort[j+1];
					arrayToSort[j+1] = temp;
					changed = true;
				}
			}
			if(!changed)
			{
				break;
			}
			changed = false;
		}
		return arrayToSort;
	}

}
