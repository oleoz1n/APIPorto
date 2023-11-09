package br.com.fiap.apiporto.service;

import java.sql.SQLException;
import java.util.List;

import br.com.fiap.apiporto.data.ClienteDao;
import br.com.fiap.apiporto.data.SiteDao;
import br.com.fiap.apiporto.model.Cliente;
import br.com.fiap.apiporto.model.Site;


public class SiteService {
	
	public static boolean create(Site site) {
		if(!validar(site)) {
			return false;
		}
		
		try {
			SiteDao.create(site);
		}
		catch(Exception e){	
			e.printStackTrace();
			return false;
		}
		return true;
		
	}

	private static boolean validar(Site site) {
		if(site.getBicicleta().getVlBicicleta() < 2000) return false;
		try {
			/* Procura se o email do cliente eh valido */
			var clientes = ClienteDao.findAll();
			for (Cliente clienteProcurado : clientes) {
				if(clienteProcurado.getDsEmail().equals(site.getCliente().getDsEmail())) return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

}
