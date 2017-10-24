package br.facisa.si.p3.test;

import static org.junit.Assert.*;
import org.junit.Test;

import br.facisa.si.p3.datastructure.Queue;
import br.facisa.si.p3.quicksort.QuickSort;

public class QuickSortTest {

	@Test
	public void testInsert1() {
		Queue q = new Queue();

		q.enqueue(7);
		q.enqueue(5);
		q.enqueue(3);

		int[] aux = q.getArray();

		QuickSort.quicksort(aux, 0, aux.length - 1);

		int[] sorted = { 3, 5, 7 };
		assertArrayEquals(sorted, aux);
	}

	@Test
	public void testInsert2() {
		Queue q = new Queue();

		q.enqueue(7);
		q.enqueue(5);
		q.enqueue(3);

		q.enqueue(10);
		q.enqueue(200);
		q.enqueue(1);

		int[] aux = q.getArray();

		QuickSort.quicksort(aux, 0, aux.length - 1);

		int[] sorted = { 1, 3, 5, 7, 10, 200 };
		assertArrayEquals(sorted, aux);
	}

}
