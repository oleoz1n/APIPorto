package br.com.fiap.apiporto;

import java.sql.SQLException;
import java.util.ArrayList;

import br.com.fiap.apiporto.model.Cliente;
import br.com.fiap.apiporto.service.ClienteService;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("cliente")
public class ClienteResource {
	
	
	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response get(@PathParam("id") int id) throws SQLException {
		
		if(id != 0) {
		var cliente = ClienteService.findById(id);
		
		if(cliente == null) {
			System.out.println("Não encontrada!");
			return Response.status(Response.Status.NOT_FOUND).build();
		}
		
		return Response.ok(cliente).build();
		} else {
			var clientes = ClienteService.findAll();
			
			if(((ArrayList<Cliente>) clientes).isEmpty()) {
				return Response.status(Response.Status.NOT_FOUND).build();
			}
			
			return Response.ok(clientes).build();
		}
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Response create(Cliente cliente) {
		if (!ClienteService.create(cliente)) {
			return Response.status(Response.Status.BAD_REQUEST).build();
		}
		return Response.ok(cliente).build();
	}
	
	@PUT
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response update(@PathParam("id") int id, Cliente cliente) {
		cliente.setCdCliente(id);
		if(!ClienteService.update(cliente)) {
			return Response.status(Response.Status.BAD_REQUEST).build();
		}
		return Response.ok(cliente).build();
	}
	
	@DELETE
	@Path("{id}")
	public Response destroy(@PathParam("id") int id) throws SQLException {
		var cliente = ClienteService.findById(id);
		
		if(cliente == null) {
			System.out.println("Não encontrada!");
			return Response.status(Response.Status.NOT_FOUND).build();
		}
		
		ClienteService.delete(id);
		return Response.noContent().build();
	}
}
