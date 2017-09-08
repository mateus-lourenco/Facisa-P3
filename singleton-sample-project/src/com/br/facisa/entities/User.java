package com.br.facisa.entities;

import com.br.facisa.connection.Connection;

/**
 * @author Mateus Lourenco
 *
 */
public class User extends Person {
	private String email;
	private static int id = 1;
	static Connection  con  = null;
	/**
	 * Getter of email
	 *
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Setter of email
	 *
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int makeConnection(){
		con = Connection.getInstance();
		return id++;
	}

}
