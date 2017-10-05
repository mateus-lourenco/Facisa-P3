package br.facisa.si.p3.queue;

/**
 * 
 * @author Mateus Lourenco
 *
 * @param <T>
 */
public class NodeQueue<T> {
	private NodeQueue<T> next;
	private T obj;

	public NodeQueue(T obj) {
		this.obj = obj;
		this.next = null;
	}

	/**
	 * @return the next
	 */
	public NodeQueue<T> getNext() {
		return next;
	}

	/**
	 * @param next
	 *            the next to set
	 */
	public void setNext(NodeQueue<T> next) {
		this.next = next;
	}

	/**
	 * @return the obj
	 */
	public T getObj() {
		return obj;
	}

	/**
	 * @param obj
	 *            the obj to set
	 */
	public void setObj(T obj) {
		this.obj = obj;
	}
}
