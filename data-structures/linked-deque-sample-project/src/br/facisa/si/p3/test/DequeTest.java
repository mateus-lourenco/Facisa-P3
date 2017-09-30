package br.facisa.si.p3.test;

import static org.junit.Assert.assertEquals;

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
		assertEquals("a",deque.getLastElement());
	}
}
