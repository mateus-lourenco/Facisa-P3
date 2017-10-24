package br.facisa.si.p3.quicksort;

public class QuickSort {

	public static void quicksort(int a[], int lef, int rig) {
		int i = partition(a, lef, rig);

		if (lef < i - 1)
			quicksort(a, lef, i - 1);
		if (rig > i)
			quicksort(a, i, rig);
	}

	private static int partition(int[] a, int begin, int end) {
		int pivot = a[begin];

		while (begin <= end) {
			while (a[begin] < pivot)
				begin++;
			while (a[end] > pivot)
				end--;
			if (begin <= end) {
				swap(a, begin, end);
				begin++;
				end--;
			}
		}

		return begin;
	}

	private static void swap(int a[], int i, int j) {
		int temp;
		temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}
