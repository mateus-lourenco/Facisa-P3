/**
 * 
 */
package br.facisa.si.p3.deck;

/**
 * @author Mateus Lourenco
 *
 */
public class Deck<T> {

	private static final int ARRAY_SIZE = 3;
	T[] internArray = (T[]) new Object[ARRAY_SIZE];
	private int inserts = 0;

	public void insertFront(T object) {

		if (object == null) {
			throw new IllegalArgumentException();
		}

		if (inserts == internArray.length) {
			internArrayOverFlow();
		}

		internArray[0] = object;
		inserts++;
	}

	public void insertBack(T object) {
		if (object == null) {
			throw new IllegalArgumentException();
		}
		
		internArray[inserts] = object;
		inserts++;
	}

	public T removeFront() {
		T temp = internArray[0];		
		for(int j = 0; j < inserts-1; j++) {
			internArray[j] = internArray[j+1];
		}
		internArray[inserts-1] = null;
		return temp;
	}

	public T removeBack() {
		T temp = internArray[inserts-1];
		internArray[inserts - 1] = null;
		inserts--;
		return temp;
	}

	public T first() {
		return internArray[0];
	}

	public T last() {
		return internArray[inserts - 1];
	}

	public int size() {
		return inserts;
	}

	private T[] internArrayOverFlow() {

		T[] externArray = (T[]) new Object[internArray.length * 2];

		for (int i = 0; i < internArray.length; i++) {
			externArray[i+1] = internArray[i];
		}

		return internArray = externArray;

	}
}
