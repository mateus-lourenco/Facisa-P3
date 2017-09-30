/**
 * 
 */
package br.facisa.si.p3.deque;

/**
 * @author Mateus Lourenco
 *
 */
public class Deque<T> {
	private T[] internArray;
	private int inserts;

	/**
	 * Constructor of Deque
	 * 
	 */
	public Deque(int arraySize) {
		internArray = (T[]) new Object[arraySize];
	}

	/**
	 * 
	 * @param object
	 * @throws DequeFullException
	 */
	public void insertFront(T object) throws DequeFullException {

		if (object == null) {
			throw new IllegalArgumentException();
		}

		if (inserts == internArray.length) {
			throw new DequeFullException();
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
	 * @throws DequeFullException
	 */
	public void insertBack(T object) throws DequeFullException {
		if (object == null) {
			throw new IllegalArgumentException();
		}
		if (inserts == internArray.length) {
			throw new DequeFullException();
		}
		internArray[inserts] = object;
		inserts++;
	}

	/**
	 * 
	 * @return the first removed element from Deque
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
	 * @return the last removed element from Deque
	 */
	public T removeBack() {
		T temp = internArray[inserts - 1];
		internArray[inserts - 1] = null;
		inserts--;
		return temp;
	}

	/**
	 * 
	 * @return first element from Deque
	 */
	public T first() {
		return internArray[0];
	}

	/**
	 * 
	 * @return last element from Deque
	 */
	public T last() {
		return internArray[inserts - 1];
	}

	/**
	 * 
	 * @return size of Deque
	 */
	public int size() {
		return inserts;
	}
	
	/**
	 * 
	 * @return if the array is empty
	 */
	public boolean isEmpty(){	
		return internArray.length == 0;
	}
}
