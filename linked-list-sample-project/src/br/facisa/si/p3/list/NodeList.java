package br.facisa.si.p3.list;

/**
 * 
 * @author Mateus
 *
 * @param <T>
 */
public class NodeList<T> {
	private T obj;
	private NodeList<T> next;

	public NodeList(T obj) {
		this.obj = obj;
		this.next = null;
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

	/**
	 * @return the next
	 */
	public NodeList<T> getNext() {
		return next;
	}

	/**
	 * @param next
	 *            the next to set
	 */
	public void setNext(NodeList<T> next) {
		this.next = next;
	}

}
