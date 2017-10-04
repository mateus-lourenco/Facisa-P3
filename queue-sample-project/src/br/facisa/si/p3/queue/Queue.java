package br.facisa.si.p3.queue;

public class Queue<T> {
	private static final int SIZE_QUEUE = 3;
	private T internArray[];
	private int inserts;

	public Queue() {
		internArray = (T[]) new Object[SIZE_QUEUE];
	}

	public void enqueue(T obj) {
		if (obj != null) {
			if (inserts == internArray.length) {
				internArrayOverFlow();
			}
			internArray[inserts] = obj;
			inserts++;
		}
	}

	public T dequeue() {
		T temp = null;
		temp = internArray[0];
		for (int j = 0; j < inserts; j++) {
			internArray[j] = internArray[j + 1];
		}
		internArray[inserts - 1] = null;
		inserts--;
		return temp;
	}

	public T peek() {
		return internArray[0];
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
