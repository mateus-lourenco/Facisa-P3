package br.facisa.si.p3.entities;

public class Account {

	private int agency;
	private double balance;

	/**
	 * @return the agency
	 */
	public int getAgency() {
		return agency;
	}

	/**
	 * @param agency
	 *            the agency to set
	 */
	public void setAgency(int agencia) {
		this.agency = agencia;
	}

	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * @param balance
	 *            the balance to set
	 */
	public void setBalance(double saldo) {
		this.balance = saldo;
	}
}
