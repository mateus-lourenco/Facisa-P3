package br.facisa.si.p3.queue;

/**
 * 
 * @author Mateus Lourenco
 * @param <T>
 *
 */
public class LinkedQueue<T> {
	private NodeQueue<T> headNode;
	private int inserts;

	public void enqueue(T obj) {
		if (headNode == null) {
			createNodeQueue(obj);
		} else {
			NodeQueue<T> temp = headNode;
			while (temp.getNext() != null) {
				temp = temp.getNext();
			}
			temp.setNext(new NodeQueue<T>(obj));
			inserts++;
		}
	}


	public T dequeue() {
		T element = null;
		if (headNode != null) {
			element = headNode.getObj();
			headNode.setObj(null);
			headNode = headNode.getNext();
			inserts--;
		}

		return element;
	}

	public T peek() {
		T temp = null;
		if (headNode != null) {
			temp = headNode.getObj();
		}

		return temp;
	}

	public int size() {
		return inserts;
	}

	private void createNodeQueue(T obj) {
		this.headNode = new NodeQueue<T>(obj);
		this.inserts++;
	}
}
