
public class QuickSort {
	private static final int SIZE_ARRAY = 3;
	private int[] unsortedArray = new int[SIZE_ARRAY];
	private int[] sortedArray = new int[SIZE_ARRAY];
	private int pos;

	public void insert(int value) {
		if (pos == unsortedArray.length) {
			int[] newUnsortedArray = new int[unsortedArray.length * 2];
			int[] newSortedArray = new int[unsortedArray.length * 2];
			for (int i = 0; i < unsortedArray.length; i++) {
				newUnsortedArray[i] = unsortedArray[i];
				
			}

			unsortedArray = newUnsortedArray;
			sortedArray = newSortedArray;
		}

		unsortedArray[pos] = value;
		pos++;
	}

	public int[] getValue() {
		return sortedArray;
	}

	public void sort() {
		int pivot = -1;
		int insertsOnLeft = 0;

		for (int i = 0; i < unsortedArray.length; i++) {
			pivot = unsortedArray[i]; // escolhendo pivot
			for (int j = 0; j < unsortedArray.length; j++) {
				if (pivot > unsortedArray[j]) {
					insertsOnLeft++;
				}
			}

			if (insertsOnLeft >= 0) {
				sortedArray[insertsOnLeft] = pivot;
			}
			insertsOnLeft = 0;

		}
	}
}
