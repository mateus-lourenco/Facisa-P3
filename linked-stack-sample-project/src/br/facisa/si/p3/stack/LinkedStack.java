package br.facisa.si.p3.stack;

public class LinkedStack<T> {
	private NodeStack<T> headNode;
	private int inserts;
	
	public void push(T obj) {
		if(headNode == null) {
			createNodeStack(obj);
		} else {
			NodeStack<T> newNode = new NodeStack<>(obj);
			newNode.setNext(headNode);
			headNode = newNode;
			inserts++;
		}
	}

	public T pop() {
		T element = null;
		if(headNode != null) {
			element = headNode.getObj();
			headNode.setObj(null);
			headNode = headNode.getNext();
			inserts--;
		}
		
		return element;
	}
	public T top() {
		T element = null;
		if(headNode != null) {
			element = headNode.getObj();
		}
		
		return element;
	}
	private void createNodeStack(T obj) {
		this.headNode = new NodeStack<>(obj);
		this.inserts++;
	}

}
