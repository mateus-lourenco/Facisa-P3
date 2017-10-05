package br.facisa.si.p3.test;

import static org.junit.Assert.*;

import org.junit.Test;

import br.facisa.si.p3.entities.Account;
import br.facisa.si.p3.queue.LinkedQueue;

public class LinkedQueueTest {

	@Test
	public void testEnqueue() {
		LinkedQueue<Account> queue = new LinkedQueue<>();

		Account ac1 = new Account();
		Account ac2 = new Account();
		Account ac3 = new Account();
		Account ac4 = new Account();

		queue.enqueue(ac1);
		queue.enqueue(ac2);
		queue.enqueue(ac3);
		queue.enqueue(ac4);

		ac1.setAgency(1);
		ac2.setAgency(2);
		ac3.setAgency(3);
		ac4.setAgency(4);

		assertEquals(1, queue.peek().getAgency());
	}

	@Test
	public void testDequeue() {
		LinkedQueue<Account> queue = new LinkedQueue<>();

		Account ac1 = new Account();
		Account ac2 = new Account();
		Account ac3 = new Account();
		Account ac4 = new Account();

		queue.enqueue(ac1);
		queue.enqueue(ac2);
		queue.enqueue(ac3);
		queue.enqueue(ac4);

		ac1.setAgency(1);
		ac2.setAgency(2);
		ac3.setAgency(3);
		ac4.setAgency(4);

		assertEquals(1, queue.dequeue().getAgency());
	}

	@Test
	public void testSize() {
		LinkedQueue<Account> queue = new LinkedQueue<>();

		Account ac1 = new Account();
		Account ac2 = new Account();
		Account ac3 = new Account();
		Account ac4 = new Account();

		queue.enqueue(ac1);
		queue.enqueue(ac2);
		queue.enqueue(ac3);
		queue.enqueue(ac4);

		ac1.setAgency(1);
		ac2.setAgency(2);
		ac3.setAgency(3);
		ac4.setAgency(4);

		assertEquals(4, queue.size());
	}

}
