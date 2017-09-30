package br.facisa.si.p3.Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import br.facisa.si.p3.list.List;

public class ListTest {

	@Test
	public void testInsert() {
		List<String> list = new List<>();

		list.insert("a");
		list.insert("b");
		list.insert("c");
		list.insert("d");

		assertEquals("d", list.getElementByIndex(3));
	}

	@Test
	public void testInsertByIndex1() {
		List<String> list = new List<>();

		list.insertByIndex(0, "a");
		list.insertByIndex(1, "b");
		list.insertByIndex(2, "c");
		list.insertByIndex(3, "a");

		assertEquals("a", list.getElementByIndex(3));
	}
	
	@Test
	public void testInsertByIndex2() {
		List<String> list = new List<>();

		list.insertByIndex(1, "b");
		list.insertByIndex(0, "a");
		list.insertByIndex(3, "a");
		list.insertByIndex(2, "c");

		assertEquals("a", list.getElementByIndex(3));
	}


	@Test
	public void testRemove() {
		List<String> list = new List<>();

		list.insert("a");
		list.insert("b");
		list.insert("c");
		list.insert("d");

		assertEquals("d", list.remove("d"));
	}

	@Test
	public void testRemoveByIndex() {
		List<String> list = new List<>();

		list.insert("a");
		list.insert("b");
		list.insert("c");
		list.insert("d");

		assertEquals("b", list.removeByIndex(1));
	}

	@Test
	public void testGetElement() {
		List<String> list = new List<>();

		list.insertByIndex(0, "a");
		list.insertByIndex(1, "b");
		list.insertByIndex(2, "c");
		list.insertByIndex(3, "a");

		assertEquals("a", list.getElement("a"));
	}

	@Test
	public void testGetElementByIndex() {
		List<String> list = new List<>();

		list.insertByIndex(0, "a");
		list.insertByIndex(1, "b");
		list.insertByIndex(2, "c");
		list.insertByIndex(3, "a");

		assertEquals("a", list.getElementByIndex(0));
	}

	@Test
	public void testGetIndexElement() {
		List<String> list = new List<>();

		list.insertByIndex(0, "a");
		list.insertByIndex(1, "b");
		list.insertByIndex(2, "c");
		list.insertByIndex(3, "a");

		assertEquals(0, list.getIndexElement("a"));
	}

	@Test
	public void testSize() {
		List<String> list = new List<>();

		list.insertByIndex(0, "a");
		list.insertByIndex(1, "b");
		list.insertByIndex(2, "c");
		list.insertByIndex(3, "a");
		
		assertEquals(4,list.size());
	}
	
	@Test
	public void testIsEmpty() {
		List<String> list = new List<>();

		list.insertByIndex(0, "a");
		list.insertByIndex(1, "b");
		list.insertByIndex(2, "c");
		list.insertByIndex(3, "a");
		
		assertEquals(false,list.isEmpty());
	}
	

}
