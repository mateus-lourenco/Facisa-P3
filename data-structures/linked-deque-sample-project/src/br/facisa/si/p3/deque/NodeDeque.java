package br.facisa.si.p3.deque;
/**
 * 
 * @author Mateus Lourenço
 *
 * @param <T>
 */
public class NodeDeque<T> {
	private T obj;
	protected NodeDeque<T> next;
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
	public NodeDeque<T> getNext() {
		return next;
	}

	/**
	 * @param next the next to set
	 */
	public void setNext(NodeDeque<T> next) {
		this.next = next;
	}

	
	
}
