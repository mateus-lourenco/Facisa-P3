/**
 * 
 */
package br.unifacisa.si.p3.main;

import br.unifacisa.si.p3.tree.BinaryTree;

/**
 * @author Mateus Lourenco
 *
 */
public class BinaryTreeApp {

	/*
	 * 
	 * Building of main to test inputs in BinaryTree
	 */
	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();

		bt.insert(3);
		bt.insert(2);
		bt.insert(9);
		bt.insert(7);
		bt.insert(1);

		bt.preOrder(bt.getRoot());
		System.out.println("");
		bt.postOrder(bt.getRoot());
		System.out.println("");
		bt.inOrder(bt.getRoot());
		System.out.println("");

	}

}
