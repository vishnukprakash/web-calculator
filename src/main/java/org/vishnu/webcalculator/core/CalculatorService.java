package org.vishnu.webcalculator.core;

public interface CalculatorService {
	public static final String NOT_IMPLEMENTED = "Method Not Implemented";
	
	public default long add(long a, long b) {
		throw new UnsupportedOperationException(NOT_IMPLEMENTED);
	}
	
	public default long substract(long a, long b) {
		throw new UnsupportedOperationException(NOT_IMPLEMENTED);
	}
	
	public default long multiply(long a, long b) {
		throw new UnsupportedOperationException(NOT_IMPLEMENTED);
	}
	
	public default long divide(long a, long b) {
		throw new UnsupportedOperationException(NOT_IMPLEMENTED);
	}
	
	public default long modulus(long a, long b) {
		throw new UnsupportedOperationException(NOT_IMPLEMENTED);
	}
}