package sort;

public class HeapSort implements Sort{
	private int[] pq;
	private int N = 0;
	private void swim(int k, int [] array)
	{
		while(k > 1 && (array[k/2] < array[k]))
		{
			int temp = array[k];
			array[k] = array[k/2];
			array[k/2] = temp;
			
			k = k / 2;
		}
	}
	
	private void sink(int k)
	{
		while(2*k <= N)
		{
			int j = 2*k;
			if(j<N && (pq[j] < pq[j+1]))
			{
				j++;
			}
			if(pq[j] < pq[k])
			{
				break;
			}
			
			int temp = pq[k];
			pq[k] = pq[j];
			pq[j] = temp;
			
			k = j;
		}
	}
	
	private void insert(int value)
	{
		pq[++N] = value;
		swim(N, pq);
		
		
	}
	
	private int delMax()
	{
		int max = pq[1];
		
		pq[1] = pq[N--];
		sink(1);
		
		return max;		
	}
	
	@Override
	public int[] sort(int[] arrayToSort) {
		
		pq = new int[arrayToSort.length+1];
		
		for(int i = 0; i< arrayToSort.length; i++)
		{
			insert(arrayToSort[i]);
		}
		
		for(int i = 0; i< arrayToSort.length; i++)
		{
			arrayToSort[arrayToSort.length - 1 - i] = delMax();
		}
		return arrayToSort;
	}
}
