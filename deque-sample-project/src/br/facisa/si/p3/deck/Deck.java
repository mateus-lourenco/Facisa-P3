/**
 * 
 */
package br.facisa.si.p3.deck;

/**
 * @author Mateus Lourenco
 *
 */
public class Deck<T> {
	private T[] internArray;
	private int inserts;

	/**
	 * Constructor of Deck
	 * 
	 */
	public Deck(int arraySize) {
		internArray = (T[]) new Object[arraySize];
	}

	/**
	 * 
	 * @param object
	 * @throws DeckFullException
	 */
	public void insertFront(T object) throws DeckFullException {

		if (object == null) {
			throw new IllegalArgumentException();
		}

		if (inserts == internArray.length) {
			throw new DeckFullException();
		}

		for (int i = 0; i < inserts - 1; i++) {
			internArray[i + 1] = internArray[i];
		}
		internArray[0] = object;
		inserts++;
	}

	/**
	 * 
	 * @param object
	 * @throws DeckFullException
	 */
	public void insertBack(T object) throws DeckFullException {
		if (object == null) {
			throw new IllegalArgumentException();
		}
		if (inserts == internArray.length) {
			throw new DeckFullException();
		}
		internArray[inserts] = object;
		inserts++;
	}

	/**
	 * 
	 * @return the first removed element from Deck
	 */
	public T removeFront() {
		T temp = internArray[0];
		for (int j = 0; j < inserts - 1; j++) {
			internArray[j] = internArray[j + 1];
		}
		internArray[inserts - 1] = null;
		return temp;
	}

	/**
	 * 
	 * @return the last removed element from Deck
	 */
	public T removeBack() {
		T temp = internArray[inserts - 1];
		internArray[inserts - 1] = null;
		inserts--;
		return temp;
	}

	/**
	 * 
	 * @return first element from Deck
	 */
	public T first() {
		return internArray[0];
	}

	/**
	 * 
	 * @return last element from Deck
	 */
	public T last() {
		return internArray[inserts - 1];
	}

	/**
	 * 
	 * @return size of Deck
	 */
	public int size() {
		return inserts;
	}
	
	/**
	 * 
	 * @return if the array is empty
	 */
	public boolean isEmpty(){	
		return internArray.length > 0;
	}
}
