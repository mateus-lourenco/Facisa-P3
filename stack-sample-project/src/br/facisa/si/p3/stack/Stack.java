package br.facisa.si.p3.stack;

import java.util.ArrayList;

public class Stack<T> {

	private static final int SIZE_STACK = 3;
	private T internArray[];
	private int inserts;

	public Stack() {
		internArray = (T[]) new Object[SIZE_STACK];
	}

	public void push(T obj) {
		if (obj != null) {
			if (inserts == internArray.length) {
				internArrayOverFlow();
			}
			internArray[inserts] = obj;
			inserts++;
		}
	}

	public T pop() {
		T temp = null;
		temp = internArray[inserts - 1];
		internArray[inserts - 1] = null;
		inserts--;

		return temp;
	}

	public T top() {
		return internArray[inserts - 1];
	}

	public boolean isEmpty() {
		return inserts == 0;
	}

	public int size() {
		return inserts;
	}
	private void internArrayOverFlow() {
		T[] externArray = (T[]) new Object[internArray.length*2];
		for (int i = 0; i < internArray.length; i++) {
			externArray[i] = internArray[i];
		}
		internArray = externArray;
	}
}
