package br.facisa.si.p3.stack;

/**
 * 
 * @author Mateus Lourenco
 *
 * @param <T>
 */
public class NodeStack<T> {
	private NodeStack<T> next;
	private T obj;
	
	/**
	 * @param next
	 * @param obj
	 */
	public NodeStack(T obj) {
		this.obj = obj;
		this.next = null;
	}
	/**
	 * @return the next
	 */
	public NodeStack<T> getNext() {
		return next;
	}
	/**
	 * @param next the next to set
	 */
	public void setNext(NodeStack<T> next) {
		this.next = next;
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
}
