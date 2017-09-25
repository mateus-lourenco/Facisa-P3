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
			
			while (newNode.next != null) {
				newNode = newNode.next;
			}
			

			newNode.next = new NodeDeque<T>(obj);
			
			inserts++;
		}
	}

	/**
	 * 
	 * @return removed last element from deque
	 */
	/*public T removeBack() {
		NodeDeque<T> temp = null;
		if(firstNode != null) {
			temp = firstNode;
			for(int i = 0; i < inserts-2; i++) {
				temp = temp.next;
			}
			
			inserts--;	
		}
		return  temp;
	}*/
	
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
		while (temp.next != null) {
			temp = temp.next;
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
