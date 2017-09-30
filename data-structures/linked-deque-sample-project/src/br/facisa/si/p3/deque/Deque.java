package br.facisa.si.p3.deque;

/**
 * 
 * @author Mateus Lourenço
 *
 * @param <T>
 */
public class Deque<T> {

	private NodeDeque<T> firstNode;
	private int inserts;

	/**
	 * 
	 */
	public Deque() {
		this.firstNode = null;
	}

	/**
	 * insert first element on deque
	 * 
	 * @param obj
	 */

	public void insertFront(T obj) {
		if (firstNode == null) {
			createNodeDeque(obj);
		} else {
			NodeDeque<T> newNode = new NodeDeque<T>(obj);
			newNode.next = firstNode;
			firstNode = newNode;
			inserts++;
		}
	}

	/**
	 * 
	 * @return removed first element from deque
	 */
	public T removeFront() {
		T temp = null;
		if (firstNode != null) {
			temp = firstNode.getObj();
			firstNode = firstNode.getNext();
			inserts--;
		}

		return temp;
	}

	public void insertBack(T obj) {
		if (firstNode == null) {
			createNodeDeque(obj);
		} else {
			NodeDeque<T> newNode = new NodeDeque<T>(obj);
			
			while (firstNode != null) {
				newNode = firstNode.next;
			}
			
			firstNode = newNode;
			inserts++;
		}
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
	public T getFirstElement() {
		return firstNode.getObj();
	}
	
	public T getLastElement() {
		NodeDeque<T> temp = firstNode;
		while(firstNode != null) {
			temp = firstNode.next;
		}
		return temp.getObj();
	}

	private void createNodeDeque(T obj) {
		firstNode = new NodeDeque<T>(obj);
		inserts++;
	}
}
