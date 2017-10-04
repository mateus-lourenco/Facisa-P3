package br.facisa.si.p3.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import br.facisa.si.p3.entities.Account;
import br.facisa.si.p3.stack.Stack;

public class StackTest {

	@Test
	public void testPush1() {
		Stack<Account> stack = new Stack<>();

		stack.push(new Account(1, 1000.10));
		assertEquals(1, stack.top().getAgency());
	}
	
	@Test
	public void testPush2() {
		Stack<Account> stack = new Stack<>();

		stack.push(new Account(1, 1000.10));
		stack.push(new Account(2, 2000.20));
		stack.push(new Account(3, 3000.30));
		stack.push(new Account(4, 4000.40));

		assertEquals(1, stack.top().getAgency());
	}

	@Test
	public void testPop1() {
		Stack<Account> stack = new Stack<>();

		stack.push(new Account(1, 1000.10));
		stack.push(new Account(2, 2000.20));
		stack.push(new Account(3, 3000.30));
		stack.push(new Account(4, 4000.40));

		assertEquals(4, stack.pop().getAgency());
	}
	
	@Test
	public void testPop2() {
		Stack<Account> stack = new Stack<>();

		stack.push(new Account(1, 1000.10));
		stack.push(new Account(2, 2000.20));
		stack.push(new Account(3, 3000.30));
		stack.push(new Account(4, 4000.40));

		stack.pop();
		stack.pop();
		
		assertEquals(2, stack.pop().getAgency());
	}

	@Test
	public void testSize() {
		Stack<Account> stack = new Stack<>();

		stack.push(new Account(1, 1000.10));
		stack.push(new Account(2, 2000.20));
		stack.push(new Account(3, 3000.30));
		stack.push(new Account(4, 4000.40));

		assertEquals(4, stack.size());
	}

	@Test
	public void testSize2() {
		Stack<Account> stack = new Stack<>();

		stack.push(new Account(1, 1000.10));
		stack.push(new Account(2, 2000.20));
		stack.push(new Account(3, 3000.30));
		stack.push(new Account(4, 4000.40));

		stack.pop();
		stack.pop();
		assertEquals(2, stack.size());
	}
}
