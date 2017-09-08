package br.facisa.si.p3.entidades;

import br.facisa.si.p3.exceptions.SaldoInsuficienteException;
import br.facisa.si.p3.exceptions.ValorNegativoException;

/**
 * 
 * @author Mateus Lourenco
 *
 */
public class ContaCorrente {

	private float limite;
	private float saldo;
	private float valorLimite;

	/**
	 * 
	 */
	public ContaCorrente() {
	}

	/**
	 * Getter do atributo limite
	 *
	 * @return o valor de limite
	 */
	public float getLimite() {
		return limite;
	}

	/**
	 * Setter de limite
	 *
	 * @param limite
	 *            a variavel limite a ser ajustada
	 */
	public void setLimite(float limite) throws ValorNegativoException {
		if (limite > 0) {
			this.limite = limite;
		} else {
			throw new ValorNegativoException();
		}
	}

	/**
	 * Getter do atributo saldo
	 *
	 * @return o valor de saldo
	 */
	public float getSaldo() {
		return saldo;
	}

	/**
	 * Setter de saldo
	 *
	 * @param saldo
	 *            a variavel saldo a ser ajustada
	 */
	public void setSaldo(float saldo) throws ValorNegativoException {
		if (saldo > 0) {
			this.saldo = saldo;
		} else {
			throw new ValorNegativoException();
		}
	}

	/**
	 * Getter do atributo valorLimite
	 *
	 * @return o valor de valorLimite
	 */
	public float getValorLimite() {
		return valorLimite;
	}

	/**
	 * Setter de valorLimite
	 *
	 * @param valorLimite
	 *            a variavel valorLimite a ser ajustada
	 */
	public void setValorLimite(float valorLimite) throws ValorNegativoException {
		if (valorLimite > 0) {
			this.valorLimite = valorLimite;
		} else {
			throw new ValorNegativoException();
		}
	}

	public void sacar(float valor) throws ValorNegativoException, SaldoInsuficienteException, Exception {
		if (valor <= 0) {
			throw new ValorNegativoException();
		} else if (getSaldo() < valor) {
			throw new SaldoInsuficienteException(
					"Você tem um saldo de " + getSaldo() + ", mas está tentando sacar " + valor);
		} else {
			setSaldo(getSaldo() - valor);
		}
	}

	public void depositar(float valor) throws ValorNegativoException {
		if (valor < 0) {
			throw new ValorNegativoException();
		} else if (getSaldo() >= valor) {
			setSaldo(getSaldo() + valor);
		}
	}

}
