package br.com.fiap.apiporto;

import br.com.fiap.apiporto.model.IA;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("ia")
public class IAResource {
	@GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Got it3!";
    }
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public void create(IA ia) {
		System.out.println(ia);
	}
}
