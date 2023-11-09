package br.com.fiap.apiporto.service;

import java.sql.SQLException;

import br.com.fiap.apiporto.data.ClienteDao;
import br.com.fiap.apiporto.model.Cliente;

public class ClienteService {
	
	private static boolean validar(Cliente cliente) {
		if(cliente.getNm_cliente().length() < 4) return false;
		if(!skin.getImagem().startsWith("http")) return false;
		
		return true;
	}

	public static Object findAll() throws SQLException {
		return ClienteDao.findAll();
	}
	
	public static Object findById(int id) throws SQLException {
		return ClienteDao.findById(id);
	}

	public static boolean create(Cliente cliente) {
		// TODO Auto-generated method stub
		return false;
	}

}
