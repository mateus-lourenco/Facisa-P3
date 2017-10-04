package br.facisa.si.p3.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import br.facisa.si.p3.entities.Account;
import br.facisa.si.p3.queue.Queue;

public class QueueTest {

	@Test
	public void testEnqueue() {
		Queue<Account> queue = new Queue<>();
		
		queue.enqueue(new Account(1, 1000));
		queue.enqueue(new Account(2, 2000));
		queue.enqueue(new Account(3, 3000));
		queue.enqueue(new Account(4, 4000));
		
		assertEquals(1, queue.peek().getAgency());
	}

	@Test
	public void testDequeue() {
		Queue<Account> queue = new Queue<>();
		
		queue.enqueue(new Account(1, 1000));
		queue.enqueue(new Account(2, 2000));
		queue.enqueue(new Account(3, 3000));
		queue.enqueue(new Account(4, 4000));
		
		assertEquals(1, queue.dequeue().getAgency());
	}
	
	@Test
	public void testSize() {
		Queue<Account> queue = new Queue<>();
		
		queue.enqueue(new Account(1, 1000));
		queue.enqueue(new Account(2, 2000));
		queue.enqueue(new Account(3, 3000));
		queue.enqueue(new Account(4, 4000));
		
		assertEquals(4, queue.size());
	}
	
	@Test
	public void testPeek() {
		Queue<Account> queue = new Queue<>();
		
		queue.enqueue(new Account(1, 1000));
		queue.enqueue(new Account(2, 2000));
		queue.enqueue(new Account(3, 3000));
		queue.enqueue(new Account(4, 4000));
		
		assertEquals(1, queue.peek().getAgency());
	}
}
