package org.vishnu.webcalculator.webservice;

import javax.inject.Singleton;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.vishnu.webcalculator.core.CalculatorService;
import org.vishnu.webcalculator.core.CalculatorServiceFactoryDefImpl;

@Path("/")
@Singleton
public class CalculatorRestEndPoint {
	private final CalculatorService calculatorService;
	
	public CalculatorRestEndPoint() {
		this.calculatorService = new CalculatorServiceFactoryDefImpl()
										.createCalculatorService();
	}
	
	@Path("add")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response add(Request request) {
		long result = calculatorService.add(request.getA(), request.getB());
		return Response.ok(new ResponseData(result)).build();
	}
	
	@Path("substract")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response substract(Request request) {
		long result = calculatorService.substract(request.getA(), request.getB());
		return Response.ok(new ResponseData(result)).build();
	}
	
	@Path("multiply")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response multiply(Request request) {
		long result = calculatorService.multiply(request.getA(), request.getB());
		return Response.ok(new ResponseData(result)).build();
	}
	
	@Path("divide")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response divide(Request request) {
		long result = calculatorService.divide(request.getA(), request.getB());
		return Response.ok(new ResponseData(result)).build();
	}
}