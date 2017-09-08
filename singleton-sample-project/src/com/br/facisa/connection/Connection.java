package com.br.facisa.connection;

/**
 * @author Louren�o
 *
 */
public class Connection {

	private static Connection instance;

	private Connection() {
	}

	public static synchronized Connection getInstance() {
		if (instance == null)
			instance = new Connection();
		return instance;
	}

}
