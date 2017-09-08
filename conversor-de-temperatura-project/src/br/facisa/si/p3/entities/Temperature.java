package br.facisa.si.p3.entities;
/**
 * 
 * @author Mateus
 *
 */

import br.facisa.si.p3.exceptions.FahrenheitException;

public class Temperature {
	private double fahrenheit;

	/**
	 * @return the fahrenheit
	 */
	public double getFahrenheit() {
		return fahrenheit;
	}

	/**
	 * @param fahrenheit
	 *            the fahrenheit to set
	 */
	public void setFahrenheit(double fahrenheit) throws FahrenheitException {
		if (fahrenheit <= -459.67) {
			throw new FahrenheitException();
		} else {
			this.fahrenheit = fahrenheit;
		}
	}
}
