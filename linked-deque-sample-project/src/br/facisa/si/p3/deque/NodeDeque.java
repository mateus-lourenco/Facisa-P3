package br.facisa.si.p3.deque;

public class NodeDeque<T> {
	private T obj;
	protected NodeDeque next;
	/**
	 * 
	 * @param obj
	 */
	public NodeDeque(T obj) {
		this.obj = obj;
		next = null;
	}
	
	/**
	 * @return the obj
	 */
	public T getObj() {
		return obj;
	}

	/**
	 * @param obj the obj to set
	 */
	public void setObj(T obj) {
		this.obj = obj;
	}

	/**
	 * @return the next
	 */
	public NodeDeque getNext() {
		return next;
	}

	/**
	 * @param next the next to set
	 */
	public void setNext(NodeDeque next) {
		this.next = next;
	}

	
	
}
