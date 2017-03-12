package sort;

public enum SortEnum {
	BUBBLE(new BubbleSort()),
	CHOICE(new ChoiceSort());
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
