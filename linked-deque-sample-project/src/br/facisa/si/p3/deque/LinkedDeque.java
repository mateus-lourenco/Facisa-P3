package br.facisa.si.p3.deque;

/**
 * 
 * @author Mateus Lourenço
 *
 * @param <T>
 */
public class LinkedDeque<T> {

	private NodeDeque<T> firstNode;
	private int inserts;

	/**
	 * 
	 */
	public LinkedDeque() {
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
			newNode.setNext(firstNode);
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

	/**
	 * insert last element on deque
	 * 
	 * @param obj
	 */
	public void insertBack(T obj) {
		if (firstNode == null) {
			createNodeDeque(obj);
		} else {
			NodeDeque<T> newNode = firstNode;

			while (newNode.getNext() != null) {
				newNode = newNode.getNext();
			}

			newNode.setNext(new NodeDeque<T>(obj));

			inserts++;
		}
	}

	/**
	 * 
	 * @return removed last element from deque
	 */
	public T removeBack() {
		NodeDeque<T> current = null;
		T element = null;
		if (firstNode != null) {
			current = firstNode;
			for (int i = 0; i < inserts - 2; i++) {
				current = current.getNext();
			}

			element = current.getNext().getObj();
			current.setNext(null);
			inserts--;
		}
		return element;
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

	/**
	 * 
	 * @return last element from deque
	 */
	public T getLastElement() {
		NodeDeque<T> temp = firstNode;
		while (temp.getNext() != null) {
			temp = temp.getNext();
		}
		return temp.getObj();
	}

	/**
	 * 
	 * @param obj
	 */
	private void createNodeDeque(T obj) {
		firstNode = new NodeDeque<T>(obj);
		inserts++;
	}
}
