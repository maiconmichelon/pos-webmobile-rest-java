package br.edu.fcv.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/message")
public class MessageRestService {

	@GET
	@Path("/{param}")
	public Response printMessage(@PathParam("param") String msg) {
		String result = "Restful example : " + msg;
		return Response.status(200).entity(result).build();
	}
	
	@GET
	@Path("/soma/{param1}/{param2}")
	public Response soma(@PathParam("param1") String param1, @PathParam("param2") String param2) {
		String result = "Resultado é: " + (Integer.parseInt(param1) + Integer.parseInt(param2));
		return Response.status(200).entity(result).build();
	}
	
	@GET
	@Path("/subtrai/{param1}/{param2}")
	public Response subtrai(@PathParam("param1") String param1, @PathParam("param2") String param2) {
		String result = "Resultado é: " + (Integer.parseInt(param1) - Integer.parseInt(param2));
		return Response.status(200).entity(result).build();
	}
	
	@GET
	@Path("/divide/{param1}/{param2}")
	public Response divide(@PathParam("param1") String param1, @PathParam("param2") String param2) {
		String result = "Resultado é: " + (Integer.parseInt(param1) / Integer.parseInt(param2));
		return Response.status(200).entity(result).build();
	}
	
	@GET
	@Path("/multiplica/{param1}/{param2}")
	public Response multiplica(@PathParam("param1") String param1, @PathParam("param2") String param2) {
		String result = "Resultado é: " + (Integer.parseInt(param1) * Integer.parseInt(param2));
		return Response.status(200).entity(result).build();
	}

}