package br.facisa.si.p3.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import br.facisa.si.p3.deque.Deque;
import br.facisa.si.p3.entities.Account;

public class DequeTest {

	@Test
	public void testInsertFront1() {
		Deque<Account> deque = new Deque<>();
		
		deque.insertFront(new Account(1, 1000));
		
		assertEquals(1, deque.front().getAgency());
	}
	
	@Test
	public void testInsertFront2() {
		Deque<Account> deque = new Deque<>();
		
		deque.insertFront(new Account(1, 1000));
		deque.insertFront(new Account(2, 2000));
		deque.insertFront(new Account(3, 3000));
		deque.insertFront(new Account(4, 4000));
		
		assertEquals(4, deque.front().getAgency());
	}
	
	@Test
	public void testInsertBack1() {
		Deque<Account> deque = new Deque<>();
		
		deque.insertBack(new Account(1, 1000));
		
		assertEquals(1, deque.back().getAgency());
	}
	
	@Test
	public void testInsertBack2() {
		Deque<Account> deque = new Deque<>();
		
		deque.insertBack(new Account(1, 1000));
		deque.insertBack(new Account(2, 2000));
		deque.insertBack(new Account(3, 3000));
		deque.insertBack(new Account(4, 4000));
		deque.insertBack(new Account(5, 5000));
		
		assertEquals(5, deque.back().getAgency());
	}
	

	@Test
	public void testMixInsert() {
		Deque<Account> deque = new Deque<>();
		
		deque.insertBack(new Account(1, 1000));
		deque.insertFront(new Account(2, 2000));
		deque.insertBack(new Account(3, 3000));
		deque.insertFront(new Account(4, 4000));
		deque.insertBack(new Account(5, 5000));
		
		assertEquals(4, deque.front().getAgency());
	}
	
	@Test
	public void testRemovetFront1() {
		Deque<Account> deque = new Deque<>();
		
		deque.insertFront(new Account(1, 1000));
		deque.insertFront(new Account(2, 2000));
		deque.insertFront(new Account(3, 3000));
		deque.insertFront(new Account(4, 4000));
		
		deque.removeFront();
		assertEquals(3, deque.removeFront().getAgency());
	}
	
	@Test
	public void testRemoveBack1() {
		Deque<Account> deque = new Deque<>();
		
		deque.insertBack(new Account(1, 1000));
		deque.insertBack(new Account(2, 2000));
		deque.insertBack(new Account(3, 3000));
		deque.insertBack(new Account(4, 4000));
		deque.insertBack(new Account(5, 5000));
		
		assertEquals(5, deque.removeBack().getAgency());
	}
}
