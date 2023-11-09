package br.com.fiap.apiporto.data;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.apiporto.model.Cliente;

public class ClienteDao {

	
	
	public static List<Cliente> findAll() throws SQLException {
		List<Cliente> Clientes = new ArrayList<>();	
		
	var con = ConnectionFactory.getConnection();
	var rs = con.createStatement().executeQuery("select * from T_ECS_CLIENTE");
	
	while(rs.next()) {
		Clientes.add(new Cliente(
				    rs.getInt("CD_CLIENTE"),
				    rs.getString("NM_CLIENTE"),
				    rs.getDate("DT_NASCIMENTO"),
				    rs.getString("NR_RG"),
				    rs.getString("NR_CPF"),
				    rs.getString("NR_TELEFONE"),
				    rs.getString("NR_CEP"),
				    rs.getString("DS_ENDERECO"),
				    rs.getString("DS_EMAIL")
				));
	}
	
	con.close();
		
		return Clientes;
	}

	public static Cliente findById(int id) throws SQLException {
		
		var con = ConnectionFactory.getConnection();
		var rss = con.prepareStatement("select * from T_ECS_CLIENTE where cd_cliente = ?");
		rss.setInt(1, id);
		var rs = rss.executeQuery();
		rs.next();
		if (rs.isAfterLast()) {
		    return null;
		}
		System.out.println(rs);
		var skin = new Cliente(
				rs.getInt("CD_CLIENTE"),
			    rs.getString("NM_CLIENTE"),
			    rs.getDate("DT_NASCIMENTO"),
			    rs.getString("NR_RG"),
			    rs.getString("NR_CPF"),
			    rs.getString("NR_TELEFONE"),
			    rs.getString("NR_CEP"),
			    rs.getString("DS_ENDERECO"),
			    rs.getString("DS_EMAIL")
					);
		
		con.close();
		return skin;
			
		}
}
