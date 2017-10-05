package br.facisa.si.p3.test;

import static org.junit.Assert.*;

import org.junit.Test;

import br.facisa.si.p3.entities.Account;
import br.facisa.si.p3.stack.LinkedStack;

public class LinkedStackTest {

	@Test
	public void testPush() {
		LinkedStack<Account> stack = new LinkedStack<>();
		
		Account ac1 = new Account();
		Account ac2 = new Account();
		Account ac3 = new Account();
		Account ac4 = new Account();
		
		stack.push(ac1);
		stack.push(ac2);
		stack.push(ac3);
		stack.push(ac4);
		
		ac1.setAgency(1);
		ac2.setAgency(2);
		ac3.setAgency(3);
		ac4.setAgency(4);
		
		assertEquals(4, stack.top().getAgency());
	}

	
	@Test
	public void testPop() {
		LinkedStack<Account> stack = new LinkedStack<>();
		
		Account ac1 = new Account();
		Account ac2 = new Account();
		Account ac3 = new Account();
		Account ac4 = new Account();
		
		stack.push(ac1);
		stack.push(ac2);
		stack.push(ac3);
		stack.push(ac4);
		
		ac1.setAgency(1);
		ac2.setAgency(2);
		ac3.setAgency(3);
		ac4.setAgency(4);
		
		assertEquals(4, stack.pop().getAgency());
	}
}
