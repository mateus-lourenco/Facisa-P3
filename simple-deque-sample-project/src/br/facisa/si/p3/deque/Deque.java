package br.facisa.si.p3.deque;

public class Deque<T> {

	private static final int SIZE_DEQUE = 3;
	private T[] internArray = null;
	private int inserts;

	public Deque() {
		this.internArray = (T[]) new Object[SIZE_DEQUE];
	}

	public void insertFront(T obj) {
		if (obj != null) {
			if (size() == internArray.length) {
				internArrayOverFlow();
			}

			if (size() > 0) {
				for (int i = inserts; i > 0; i--) {
					internArray[i] = internArray[i - 1];
				}
			}

			internArray[0] = obj;
			inserts++;
		}
	}

	public void insertBack(T obj) {
		if (obj != null) {

			if (size() == internArray.length) {
				internArrayOverFlow();
			}

			internArray[inserts] = obj;
			inserts++;
		}
	}

	public T removeFront() {
		T current = null;
		current = internArray[0];
		internArray[0] = null;
		for (int j = 0; j < inserts; j++) {
			internArray[j] = internArray[j + 1];
		}

		internArray[inserts - 1] = null;
		inserts--;

		return current;
	}

	public T removeBack() {
		T current = null;
		current = internArray[inserts - 1];
		internArray[inserts - 1] = null;
		return current;
	}

	public T front() {
		return internArray[0];
	}

	public T back() {
		return internArray[inserts - 1];
	}

	public int size() {
		return inserts;
	}

	public boolean isEmpty() {
		return inserts == 0;
	}

	private void internArrayOverFlow() {
		T[] externArray = (T[]) new Object[internArray.length * 2];
		for (int i = 0; i < internArray.length; i++) {
			externArray[i] = internArray[i];
		}

		internArray = externArray;
	}

}
