package sort;

public enum SortEnum {
	BUBBLE(new BubbleSort()),
	CHOICE(new ChoiceSort()),
	INSERTION(new InsertionSort()),
	SHELL(new ShellSort()),
	QUICK(new QuickSort()),
	MERGE(new MergeSort()),
	HEAP(new HeapSort()),
	
	JAVA_DOUBLE_PIVOT_QUICK(new GodfatherJavaDoublePivotQuickSort()),
	
	ARUN_SINGLE_PIVOT(new ArunSinglePivotQuickSort()),
	ARUN_THREE_WAY(new ArunThreeWaySort()),
	ARUN_DOUBLE_PIVOT_QUICK_SORT(new ArunDoublePivotQuickSort());
	private Sort sortAlgoritm;
	SortEnum(Sort sortAlgoritm)
	{
		this.sortAlgoritm = sortAlgoritm;
	}
	public Sort getSortAlgoritm() {
		return sortAlgoritm;
	}
	public void setSortAlgoritm(Sort sortAlgoritm) {
		this.sortAlgoritm = sortAlgoritm;
	}
}
