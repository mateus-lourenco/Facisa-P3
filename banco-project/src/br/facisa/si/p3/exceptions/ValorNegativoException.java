/**
 * 
 */
package br.facisa.si.p3.exceptions;

/**
 * @author Mateus Lourenco
 *
 */
public class ValorNegativoException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4915952029750902962L;

	public ValorNegativoException() {
		super("Voce está tentando acessar um valor negativo");
		
	}

}
