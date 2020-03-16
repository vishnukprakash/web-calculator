package org.vishnu.webcalculator.core;

public class CalculatorServiceFactoryDefImpl implements CalculatorServiceFactory{

	@Override
	public CalculatorService createCalculatorService() {
		return new CalculatorServiceImpl();
	}
}