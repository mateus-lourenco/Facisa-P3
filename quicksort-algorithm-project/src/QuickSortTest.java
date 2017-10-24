import static org.junit.Assert.*;

import org.junit.Test;

public class QuickSortTest {

	@Test
	public void testInsert() {
		QuickSort qs = new QuickSort();
		
		qs.insert(7);
		qs.insert(5);
		qs.insert(3);
		qs.sort();
		
		int [] sorted = {3,5,7};
		assertArrayEquals(sorted, qs.getValue());
	}

	@Test
	public void testInsert2() {
		QuickSort qs = new QuickSort();
		
		qs.insert(10);
		qs.insert(3);
		qs.insert(7);
		
		qs.insert(2);
		qs.insert(1);
		qs.insert(5);
		qs.sort();
		
		int [] sorted = {1,2,3,5,7,10};
		assertArrayEquals(sorted, qs.getValue());
	}
}
