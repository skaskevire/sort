package sort;

public class ArunThreeWaySort implements Sort{

	@Override
	public int[] sort(int[] input) {
	     //input=shuffle(input);
	      sort (input, 0, input.length-1);
	      
	      return input;
	      
	}
	
	public void sort(int[] input, int lowIndex, int highIndex) {
	      
	      
	      if (highIndex<=lowIndex) return;
	      
	      int lt=lowIndex;
	      int gt=highIndex;
	      int i=lowIndex+1;
	      
	      int pivotIndex=lowIndex;
	      int pivotValue=input[pivotIndex];
	      
	      
	      while (i<=gt){
	          
	          
	          if (less(input[i],pivotValue)){
	              exchange(input, i++, lt++);
	          }
	          else if (less (pivotValue, input[i])){
	              exchange(input, i, gt--);
	          }
	          else{
	              i++;
	          }
	              
	          
	      }
	      
	      sort (input, lowIndex, lt-1);
	      sort (input, gt+1, highIndex);
	      
	      
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
