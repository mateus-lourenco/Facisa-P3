package br.facisa.si.p3.list;

public class LinkedList<T> {

	private NodeList<T> headNode;
	private int inserts;

	public LinkedList() {
		this.headNode = null;
	}

	public void insertFront(T obj) {
		if (headNode == null) {
			createNodeList(obj);
		} else {
			NodeList<T> tempNode = new NodeList<T>(obj);
			tempNode.setNext(headNode);
			headNode = tempNode;
		}
	}

	public void insertBack(T obj) {
		if (headNode == null) {
			createNodeList(obj);
		} else {
			NodeList<T> tempNode = headNode;
			NodeList<T> newNode = new NodeList<T>(obj);
			
			while (tempNode.getNext() != null) {
				tempNode = tempNode.getNext();
			}

			tempNode.setNext(newNode);
			
			inserts++;
		}
	}

	public T search(T obj) {
		T element = null;
		NodeList<T> current = null;
		if (headNode != null) {
			current = headNode;
			while (current.getObj() != obj) {
				current = current.getNext();
			}
			element = current.getObj();
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
			while (current.getNext() != null) {
				current = current.getNext();
			}
			tempElement = current.getObj();
			current.setObj(null);
			inserts--;
		}
		return tempElement;
	}

	public T first() {
		T temp = null;
		if (headNode != null) {
			temp = headNode.getObj();
		}
		return temp;
	}

	public T last() {
		T temp = null;
		NodeList<T> current = null;
		if (headNode != null) {
			current = headNode;
			while (current.getNext() != null) {
				current = current.getNext();
			}
			temp = current.getObj();
		}
		return temp;
	}

	private void createNodeList(T obj) {
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
