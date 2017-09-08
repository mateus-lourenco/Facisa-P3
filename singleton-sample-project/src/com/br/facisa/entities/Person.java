package com.br.facisa.entities;

/**
 * @author Mateus Lourenco
 *
 */
public abstract class Person {

	private String name;
	private String burnDate;
	/**
	 * Getter of name
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * Setter of name
	 *
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * Getter of burnDate
	 *
	 * @return the burnDate
	 */
	public String getBurnDate() {
		return burnDate;
	}
	/**
	 * Setter of burnDate
	 *
	 * @param burnDate the burnDate to set
	 */
	public void setBurnDate(String dateBurn) {
		this.burnDate = dateBurn;
	}
}
