package br.com.fiap.apiporto;

import br.com.fiap.apiporto.model.Site;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("site")
public class SiteResource {
	@GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Got it2!";
    }
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public void create(Site site) {
		System.out.println(site);
	}
}
