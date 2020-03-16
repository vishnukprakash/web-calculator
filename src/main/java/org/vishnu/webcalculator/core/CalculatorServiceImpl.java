package org.vishnu.webcalculator.core;

class CalculatorServiceImpl implements CalculatorService{

	@Override
	public long add(long a, long b) {
		return a+b;
	}
	
	@Override
	public long substract(long a, long b) {
		return a-b;
	}
	
	@Override
	public long multiply(long a, long b) {
		return a*b;
	}
	
	@Override
	public long divide(long a, long b) {
		return a/b;
	}
}
