package br.facisa.si.p3.datastructure;

public class Queue {
	private static final int SIZE_QUEUE = 3;
	private int internArray[];
	private int inserts;

	public Queue() {
		internArray = new int[SIZE_QUEUE];
	}

	public void enqueue(int obj) {
		if (obj > -1) {
			if (inserts == internArray.length) {
				internArrayOverFlow();
			}
			internArray[inserts] = obj;
			inserts++;
		}
	}

	public int dequeue() {
		int temp = -1;
		temp = internArray[0];
		for (int j = 0; j < inserts; j++) {
			internArray[j] = internArray[j + 1];
		}
		internArray[inserts - 1] = -1;
		inserts--;
		return temp;
	}

	public int peek() {
		return internArray[0];
	}

	public int size() {
		return inserts;
	}

	public boolean isEmpty() {
		return inserts == 0;
	}

	private void internArrayOverFlow() {
		int[] externArray = new int[internArray.length * 2];
		for (int i = 0; i < internArray.length; i++) {
			externArray[i] = internArray[i];
		}
		internArray = externArray;
	}

	public int[] getArray() {
		return this.internArray;
	}
}
