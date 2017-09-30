package br.facisa.si.p3.entities;

/**
 * 
 * @author Mateus Lourenço
 *
 */
public class Student {

	private String name;
	private int id;

	/**
	 * @param name
	 * @param id
	 */
	public Student(String nome, int id) {
		super();
		this.name = nome;
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

}
