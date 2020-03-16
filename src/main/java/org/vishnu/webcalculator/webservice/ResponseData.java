package org.vishnu.webcalculator.webservice;

public class ResponseData {
	private final long result;
	
	public ResponseData(final long result) {
		this.result = result;
	}
	
	public long getResult() {
		return result;
	}
}