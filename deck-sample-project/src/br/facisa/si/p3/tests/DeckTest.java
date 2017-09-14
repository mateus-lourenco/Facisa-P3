/**
 * 
 */
package br.facisa.si.p3.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.facisa.si.p3.deck.Deck;
import br.facisa.si.p3.entity.Student;

/**
 * @author Mateus Lourenco
 *
 */
public class DeckTest {

	@Test
	public void testInsertFront1() {
		Deck<Student> deck = new Deck<>();
		deck.insertFront(new Student("Mateus",1111));		
		assertEquals(1, deck.size());
	}

	@Test
	public void testInsertFront2() {
		Deck<Student> deck = new Deck<>();
		deck.insertFront(new Student("Abella",2222));
		deck.insertFront(new Student("Andrews",3333)); 
		assertEquals(2, deck.size());
	}
	
	@Test
	public void testInsertFront3() {
		Deck<Student> deck = new Deck<>();
		deck.insertFront(new Student("Robinho",5555));
		deck.insertFront(new Student("Bitão",6666));
		deck.insertFront(new Student("Cassio",7777));
		deck.insertFront(new Student("Yago",8888));
		assertEquals(4, deck.size());
	}
	
	@Test
	public void testeRemoveFront1(){
		 Deck<String> deck = new Deck<>();
		 deck.insertFront("Mateus");
		 assertEquals("Mateus", deck.removeFront());
	}
	
	@Test
	public void testeRemoveFront2(){
		 Deck<String> deck = new Deck<>();
		 deck.insertFront("e");
		 deck.insertFront("d");
		 deck.insertFront("c");
		 deck.insertFront("b");
		 deck.insertFront("a");
		 assertEquals("a", deck.removeFront());
	}
	
	@Test
	public void testInsertBack1() {
		Deck<Student> deck = new Deck<>();
		deck.insertBack(new Student("Mateus",1111));		
		assertEquals(1, deck.size());
	}
	
	@Test
	public void testInsertBack2() {
		Deck<Student> deck = new Deck<>();
		deck.insertBack(new Student("Abella",2222));
		deck.insertBack(new Student("Andrews",3333));
		deck.insertFront(new Student("Bitão",6666));
		deck.insertFront(new Student("Cassio",7777));
		assertEquals(4, deck.size());
	}
}
