package br.facisa.si.p3.util;

/**
 * 
 * @author Mateus
 *
 */
public class TemperatureConverterUtil {

	public double toCelsius(double fahrenheit) {
		double celsius = (5 * (fahrenheit - 32)) / 9;

		return celsius;
	}
}
