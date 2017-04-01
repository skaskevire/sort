package sort;

public class ChoiceSort implements Sort{

	@Override
	public int[] sort(int[] arrayToSort) {
		for (int i = 0; i < arrayToSort.length; i++) {
			int min = i;
			for (int j = i + 1; j < arrayToSort.length; j++) {
				if(arrayToSort[j] < arrayToSort[min])
				{
					min = j;
				}
			}
			
			int temp = arrayToSort[i];
			arrayToSort[i] = arrayToSort[min];
			arrayToSort[min] = temp;			
		}
		
		return arrayToSort;
		
		
		/*boolean changed = false;
		for (int i = 0; i < arrayToSort.length; i++) {
			for (int j = 0; j < arrayToSort.length; j++) {
				if(arrayToSort[i] > arrayToSort[j])
				{
					int temp = arrayToSort[i];
					arrayToSort[i] = arrayToSort[j];
					arrayToSort[j] = temp;
					changed = true;
				}
			}
			if(!changed)
			{
				break;
			}
			changed = false;
		}
		return arrayToSort;*/
	}

}
