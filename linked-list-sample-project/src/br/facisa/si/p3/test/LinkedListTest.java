package br.facisa.si.p3.test;

import static org.junit.Assert.*;

import org.junit.Test;

import br.facisa.si.p3.entities.Account;
import br.facisa.si.p3.list.LinkedList;

public class LinkedListTest {

	@Test
	public void testInsertFront1() {
		LinkedList<Account> list = new LinkedList<>();

		Account ac1 = new Account();
		Account ac2 = new Account();
		Account ac3 = new Account();
		Account ac4 = new Account();

		list.insertFront(ac1);
		list.insertFront(ac2);
		list.insertFront(ac3);
		list.insertFront(ac4);
		
		ac1.setAgency(1);
		ac2.setAgency(2);
		ac3.setAgency(3);
		ac4.setAgency(4);

		assertEquals(4, list.removeFront().getAgency());
	}

	@Test
	public void testInsertBack1() {
		LinkedList<Account> list = new LinkedList<>();

		Account ac1 = new Account();
		Account ac2 = new Account();
		Account ac3 = new Account();
		Account ac4 = new Account();
		
		list.insertBack(ac1);
		list.insertBack(ac2);
		list.insertBack(ac3);
		list.insertBack(ac4);
		
		ac1.setAgency(1);
		ac2.setAgency(2);
		ac3.setAgency(3);
		ac4.setAgency(4);
		
		assertEquals(4, list.removeBack().getAgency());
	}

}
