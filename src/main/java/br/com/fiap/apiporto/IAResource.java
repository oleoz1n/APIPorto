package br.com.fiap.apiporto;

import br.com.fiap.apiporto.model.IA;
import br.com.fiap.apiporto.service.IAService;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("ia")
public class IAResource {
		
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Response create(IA ia) {
		if (!IAService.create(ia)) {
			return Response.status(Response.Status.BAD_REQUEST).build();
		}
		return Response.ok(ia).build();
	}
}
