package sort;

public enum SortEnum {
	BUBBLE(new BubbleSort()),
	CHOICE(new ChoiceSort()),
	INSERTION(new InsertionSort()),
	SHELL(new ShellSort()),
	QUICK(new QuickSort()),
	MERGE(new MergeSort()),
	JAVA_DOUBLE_PIVOT_QUICK(new GodfatherJavaDoublePivotQuickSort());
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
