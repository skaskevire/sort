package sort;

public enum SortEnum {
	BUBBLE(new BubbleSort()),
	CHOICE(new ChoiceSort()),
	INSERTION(new InsertionSort()),
	QUICK(new QuickSort()),
	MERGE(new MergeSort());
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
