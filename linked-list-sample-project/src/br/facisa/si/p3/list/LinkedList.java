package br.facisa.si.p3.list;

public class LinkedList<T> {

	private NodeList<T> headNode;
	private int inserts;

	public LinkedList() {
		this.headNode = null;
	}

	public void insertFront(T obj) {
		if (headNode == null) {
			createObject(obj);
		} else {
			NodeList<T> tempNode = new NodeList<T>(obj);
			tempNode.setNext(headNode);
			headNode = tempNode;
		}
	}

	public void insertBack(T obj) {
		if (headNode == null) {
			createObject(obj);
		} else {
			NodeList<T> tempNode = headNode;

			while (tempNode.getNext() != null) {
				tempNode = tempNode.getNext();
			}

			tempNode.setNext(new NodeList<T>(obj));

			inserts++;
		}
	}

	public T search(T obj) {
		T element = null;
		NodeList<T> current = null;
		if(headNode != null) {
			current = headNode;
			while(current.getObj() != obj) {
				current = current.getNext();
			}
			element  = current.getObj();			
		}
		
		return element;
	}
	public T removeFront() {
		T tempObj = null;
		if (headNode != null) {
			tempObj = headNode.getObj();
			headNode = headNode.getNext();
			inserts--;
		}
		return tempObj;
	}

	public T removeBack() {
		NodeList<T> current = null;
		T tempElement = null;
		if (headNode != null) {
			current = headNode;
			for (int j = 0; j < inserts - 2; j++) {
				current = current.getNext();
			}
			tempElement = current.getNext().getObj();
			current.setNext(null);
			inserts--;
		}
		return tempElement;
	}

	public T removeIn(int pos) {
		T element = null;
		if(pos > 0 && pos < inserts) {
			if(headNode != null) {
				NodeList<T> current = headNode;
				for(int k = 0; k < pos - 1; k++) {
					current = current.getNext();
				}
				NodeList<T> del = current.getNext();
				element = del.getObj();
				NodeList<T> after = del.getNext();
				current.setNext(after);
			}
		}
		
		return element;
	}

	private void createObject(T obj) {
		headNode = new NodeList<T>(obj);
		inserts++;
	}

	public boolean isEmpty() {
		return inserts == 0;
	}
	
	public int size() {
		return inserts;
	}
}
