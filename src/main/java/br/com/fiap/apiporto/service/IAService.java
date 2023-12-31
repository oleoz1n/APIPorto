package br.com.fiap.apiporto.service;

import java.sql.SQLException;

import br.com.fiap.apiporto.data.IADao;
import br.com.fiap.apiporto.model.IA;

public class IAService {

	public static boolean create(IA ia) {
		if(!ia.getFoto().getUrlFoto().startsWith("http")) return false;
		try {
			IADao.create(ia);
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
}
