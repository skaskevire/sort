package sort;
/**like a{@link QuickSort.java} */
public class ArunSinglePivotQuickSort implements Sort{

	 public int[] sort (int[] input){
	      
	      //KnuthShuffle.shuffle(input);
	      sort (input, 0, input.length-1);
	      
	      
	      return input;
	  }
	
	
	 private void sort(int[] input, int lowIndex, int highIndex) {

	      if (highIndex<=lowIndex){
	          return;
	      }
	      
	      int partIndex=partition (input, lowIndex, highIndex);

	      sort (input, lowIndex, partIndex-1);
	      sort (input, partIndex+1, highIndex);
	  }

	  private int partition(int[] input, int lowIndex, int highIndex) {
	      
	      int i=lowIndex;
	      int pivotIndex=lowIndex;
	      int j=highIndex+1;
	      
	      
	      while (true){
	          
	          while (less(input[++i], input[pivotIndex])){
	              if (i==highIndex) break;
	          }
	          
	          while (less (input[pivotIndex], input[--j])){
	              if (j==lowIndex) break;
	          }
	              
	          if (i>=j) break;
	          
	          exchange(input, i, j);
	          
	      }
	      
	      exchange(input, pivotIndex, j);
	      
	      return j;
	  }
	  
	  
	  private boolean less(int a, int b)
	  {
		  return a < b;
	  }
	  
	  private void exchange(int[] input,int i,int j)
	  {
		  int temp = input[i];
		  input[i] = input[j];
		  input[j] = temp;
	  }

}
