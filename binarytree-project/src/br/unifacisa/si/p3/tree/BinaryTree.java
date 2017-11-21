package br.unifacisa.si.p3.tree;

/**
 * @author Mateus Lourenco
 *
 */
public class BinaryTree {
	private Node root;

	/**
	 * Insert value of root
	 * @param value
	 */
	public void insert(int value) {
		root = insert(root, value);
	}

	/**
	 * Insert values on tree recursively
	 * @param node
	 * @param value
	 * @return node
	 */
	private Node insert(Node node, int value) {
		if (isEmpty(node)) {
			node = new Node(value);
		} else {
			if (value < node.getValue()) {
				if (isEmpty(node.getLeft()))
					node.setLeft(new Node(value));
				else
					insert(node.getLeft(), value);
			}

			else if (value > node.getValue()) {
				if (isEmpty(node.getRight()))
					node.setRight(new Node(value));
				else
					insert(node.getRight(), value);
			}
		}

		return node;
	}

	/**
	 * Return value of root from tree
	 * @return root
	 */
	public Node getRoot() {
		return this.root;
	}

	/**
	 * Print values in pre Order
	 * @param n
	 * @return value of node
	 */
	public int preOrder(Node n) {
		int tmp = -1;
		if (!isEmpty(n)) {
			System.out.print(n.getValue() + " ");
			preOrder(n.getLeft());
			preOrder(n.getRight());
		}
		return tmp;
	}

	/**
	 * Print values in post Order
	 * @param n
	 * @return value of node
	 */
	public int postOrder(Node n) {
		int tmp = -1;
		if (!isEmpty(n)) {
			preOrder(n.getLeft());
			preOrder(n.getRight());
			System.out.print(n.getValue() + " ");
		}
		return tmp;
	}

	/**
	 * Print values in Order
	 * @param n
	 * @return value of node
	 */
	public int inOrder(Node n) {
		int tmp = -1;
		if (!isEmpty(n)) {
			preOrder(n.getLeft());
			System.out.print(n.getValue() + " ");
			preOrder(n.getRight());
		}
		return tmp;

	}

	/**
	 * Return if Node is null
	 * @param n
	 * @return boolean of node
	 */
	private boolean isEmpty(Node n) {
		return n == null;
	}

}
