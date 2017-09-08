package br.facisa.si.p3.exceptions;

public class FahrenheitException extends TemperatureException{

	public FahrenheitException(){
		super("The temperature reached absolute zero");
	}
}
