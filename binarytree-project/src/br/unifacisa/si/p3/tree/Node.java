/**
 * 
 */
package br.unifacisa.si.p3.tree;

/**
 * @author Mateus Lourenco
 *
 */
public class Node {
	private Node left;
	private Node right;
	private int value;
	
	/**
	 * Empty Constructor
	 */
	public Node() {
	}

	/**
	 * @param value
	 */
	public Node(int value) {
		this.value = value;
	}

	/**
	 * @return the left
	 */
	public Node getLeft() {
		return left;
	}

	/**
	 * @param left the left to set
	 */
	public void setLeft(Node left) {
		this.left = left;
	}

	/**
	 * @return the right
	 */
	public Node getRight() {
		return right;
	}

	/**
	 * @param right the right to set
	 */
	public void setRight(Node rigth) {
		this.right = rigth;
	}

	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(int value) {
		this.value = value;
	}	
	
}
