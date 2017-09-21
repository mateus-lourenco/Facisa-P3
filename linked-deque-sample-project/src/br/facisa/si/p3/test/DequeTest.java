package br.facisa.si.p3.test;

import static org.junit.Assert.*;

import org.junit.Test;

import br.facisa.si.p3.deque.Deque;
import br.facisa.si.p3.entities.Student;
import junit.framework.Assert;

public class DequeTest {

	@Test
	public void testInsertFront1() {
		Deque deque = new Deque();
		Student st = new Student("Mateus", 1111);
		deque.insertFront(st);
		assertEquals("Mateus", st.getName());
	}

	@Test
	public void testInsertFront2() {
		Deque deque = new Deque();
		deque.insertFront("a");
		deque.insertFront("b");
		deque.insertFront("c");
				
		assertEquals("c",deque.getFirstElement());
	}
	
	@Test
	public void testRemoveFront1() {
		Deque deque = new Deque();
		deque.insertFront("a");
		deque.insertFront("b");
		deque.insertFront("c");
						
		assertEquals("c",deque.removeFront());
	}
}
