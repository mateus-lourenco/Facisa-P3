package br.facisa.si.p3.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.facisa.si.p3.entities.Temperature;
import br.facisa.si.p3.exceptions.FahrenheitException;
import br.facisa.si.p3.util.TemperatureConverterUtil;

/**
 * 
 * @author Mateus
 *
 */
public class TemperatureConverterTest {

	@Test
	public void convertToCelsiusTest1() throws FahrenheitException {

		Temperature temp = new Temperature();
		TemperatureConverterUtil tempConverter = new TemperatureConverterUtil();

		temp.setFahrenheit(32);
		double celsius = tempConverter.toCelsius(temp.getFahrenheit());

		assertEquals(0.0, celsius, 0.02);
	}

	@Test
	public void convertToCelsiusTest2() throws FahrenheitException {

		Temperature temp = new Temperature();
		TemperatureConverterUtil tempConverter = new TemperatureConverterUtil();

		temp.setFahrenheit(15);
		double celsius = tempConverter.toCelsius(temp.getFahrenheit());

		assertEquals(-9.44, celsius, 0.02);
	}

	@Test(expected = FahrenheitException.class)
	public void convertToCelsiusTest3() throws FahrenheitException {

		Temperature temp = new Temperature();
		TemperatureConverterUtil tempConverter = new TemperatureConverterUtil();

		temp.setFahrenheit(-459.67);
		double celsius = tempConverter.toCelsius(temp.getFahrenheit());

		assertEquals(0, celsius, 0.0002);
	}
}
