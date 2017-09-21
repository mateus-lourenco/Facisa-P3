package br.facisa.si.p3.deque;

public class Deque<T> {

	private NodeDeque firstNode;
	private int inserts = 0;

	/**
	 * 
	 */
	public Deque() {
		this.firstNode = null;
	}

	/**
	 * 
	 * @param obj
	 */
	public void insertFront(T obj) {
		if (firstNode == null) {
			firstNode = new NodeDeque(obj);
			inserts++;
		} else {
			NodeDeque newNode = new NodeDeque(obj);
			newNode.next = firstNode;
			firstNode = newNode;
			inserts++;
		}
	}

	/**
	 * 
	 * @return removed element from deque
	 */
	public NodeDeque removeFront() {
		NodeDeque temp = null;
		if (firstNode != null) {
			temp = firstNode;
			firstNode = firstNode.getNext();
			inserts--;
		}
		
		return temp;
		
	}

	/**
	 * 
	 * @return size of deque
	 */
	public int size() {
		return inserts;
	}

	/**
	 * 
	 * @return first element from deque
	 */
	public Object getFirstElement() {
		return firstNode.getObj();
	}
}
