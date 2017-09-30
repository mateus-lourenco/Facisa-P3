package br.facisa.si.p3.list;

public class List<T> {

	private static final int SIZE_ARRAY = 3;
	private T internArray[] = null;
	private int inserts;

	public List() {
		internArray = (T[]) new Object[SIZE_ARRAY];
	}

	public void insert(T obj) {
		if (obj != null) {
			if (inserts == internArray.length) {
				internArrayOverFlow();
			}

			internArray[inserts] = obj;
			inserts++;
		}
	}

	public void insertByIndex(int index, T obj) {
		if (obj != null) {
			if (inserts == internArray.length)
				internArrayOverFlow();

			if (index > -1 || index < inserts) {
				internArray[index] = obj;
				inserts++;
			}
		}

	}

	public T remove(T obj) {
		T temp = null;
		int k;
		for (k = 0; k < inserts; k++) {
			if (internArray[k] == obj) {
				temp = internArray[k];
				internArray[k] = null;
				break;
			}
		}

		for (int x = k; x < inserts; x++) {
			if (internArray[x + 1] != null)
				internArray[x] = internArray[x + 1];
		}

		internArray[inserts - 1] = null;
		inserts--;
		return temp;
	}

	public T removeByIndex(int index) {
		T temp = null;
		if (index > -1 && index < inserts) {
			temp = internArray[index];
			internArray[index] = null;

			for (int x = index; x < inserts; x++) {
				if (internArray[x + 1] != null)
					internArray[x] = internArray[x + 1];
			}

			internArray[inserts - 1] = null;
			inserts--;
		}
		return temp;
	}

	public T getElement(T obj) {
		T temp = null;
		for (int k = 0; k < inserts; k++) {
			if (internArray[k] == obj) {
				temp = internArray[k];
				break;
			}
		}
		return temp;
	}

	public T getElementByIndex(int index) {
		T temp = null;
		if (index > -1 && index < inserts) {
			temp = internArray[index];
		}
		return temp;
	}

	public int getIndexElement(T obj) {
		int temp = -1;
		for (int j = 0; j < inserts; j++) {
			if (internArray[j] == obj) {
				temp = j;
				break;
			}
		}

		return temp;
	}

	public int size() {
		return inserts;
	}

	public boolean isEmpty() {
		return inserts == 0;
	}

	private void internArrayOverFlow() {
		T externArray[] = (T[]) new Object[internArray.length * 2];

		for (int i = 0; i < internArray.length; i++) {
			externArray[i] = internArray[i];
		}

		internArray = externArray;
	}
}
