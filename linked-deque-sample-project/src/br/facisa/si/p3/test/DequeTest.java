package br.facisa.si.p3.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.facisa.si.p3.deque.Deque;
import br.facisa.si.p3.entities.Student;
/**
 * 
 * @author Mateus Lourenço
 *
 */
public class DequeTest {

	@Test
	public void testInsertFront1() {
		Deque<Student> deque = new Deque<Student>();
		Student st = new Student("Mateus", 1111);
		deque.insertFront(st);
		assertEquals("Mateus", st.getName());
	}

	@Test
	public void testInsertFront2() {
		Deque<String> deque = new Deque<String>();
		deque.insertFront("a");
		deque.insertFront("b");
		deque.insertFront("c");
				
		assertEquals("c",deque.getFirstElement());
	}
	
	@Test
	public void testRemoveFront1() {
		Deque<String> deque = new Deque<String>();
		deque.insertFront("a");
		deque.insertFront("b");
		deque.insertFront("c");
						
		assertEquals("c",deque.removeFront());
	}
	
	@Test
	public void testInsertBack1() {
		Deque<String> deque = new Deque<String>();
		deque.insertBack("a");
		deque.insertBack("s");
		
		assertEquals("s",deque.getLastElement());
	}
	
	@Test
	public void testInsertBack2() {
		Deque<String> deque = new Deque<String>();
		deque.insertFront("a");
		deque.insertBack("s");
		deque.insertBack("d");
		assertEquals("d",deque.getLastElement());
	}
	
	@Test
	public void testInsertBack3() {
		Deque<String> deque = new Deque<String>();
		deque.insertFront("a");
		deque.insertBack("s");
		deque.insertFront("c");
		deque.insertBack("d");
		
		assertEquals("d",deque.getLastElement());
	}
	
	@Test
	public void testRemoveBack1() {
		Deque<String> deque = new Deque<String>();
		deque.insertBack("a");
		deque.insertBack("b");
		deque.insertBack("c");
						
		assertEquals("c",deque.removeBack());
	}
	
	@Before
	public void testGetFirstElement() {
		Deque<String> deque = new Deque<String>();
		deque.insertFront("a");
		deque.insertFront("b");
		deque.insertFront("c");
		
		assertEquals("c",deque.getFirstElement());
	}
	
	@Test
	public void testGetLastElement() {
		Deque<String> deque = new Deque<String>();
		deque.insertBack("a");
		deque.insertBack("b");
		deque.insertBack("c");
		deque.insertBack("Szabo");
		
		assertEquals("Szabo",deque.getLastElement());
	}
	
	@Test
	public void testSize1() {
		Deque<String> deque = new Deque<String>();
		deque.insertFront("a");
		deque.insertFront("b");
		deque.insertFront("c");
		
				
		assertEquals(3, deque.size());
	}
	
	@Test
	public void testSize2() {
		Deque<String> deque = new Deque<String>();
		deque.insertFront("a");
		deque.insertFront("b");
		deque.insertFront("c");
		
		deque.removeFront();
		deque.removeBack();
		assertEquals(2, deque.size());
	}
}
