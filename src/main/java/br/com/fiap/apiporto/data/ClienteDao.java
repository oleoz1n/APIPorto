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

	public static void create(Cliente cliente)  throws SQLException {
		var con = ConnectionFactory.getConnection();
		var ps = con.prepareStatement("INSERT INTO T_ECS_CLIENTE (NM_CLIENTE, DT_NASCIMENTO, NR_RG, NR_CPF, NR_TELEFONE, NR_CEP, DS_ENDERECO, DS_EMAIL) VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
		ps.setString(1, cliente.getNmCliente());
		ps.setDate(2, cliente.getDtNascimento());
		ps.setString(3, cliente.getRg());
		ps.setString(4, cliente.getCpf());
		ps.setString(5, cliente.getTelefone());
		ps.setString(6, cliente.getCep());
		ps.setString(7, cliente.getDsEndereco());
		ps.setString(8, cliente.getDsEmail());

		ps.executeUpdate();
			
		con.close();
		}
	
	public static void update(Cliente cliente) throws SQLException {
		var con = ConnectionFactory.getConnection();
		var ps = con.prepareStatement("UPDATE T_ECS_CLIENTE SET NM_CLIENTE=?, DT_NASCIMENTO=?, NR_RG=?, NR_CPF=?, NR_TELEFONE=?, NR_CEP=?, DS_ENDERECO=?, DS_EMAIL=? WHERE CD_CLIENTE=?");
		ps.setString(1, cliente.getNmCliente());
		ps.setDate(2, cliente.getDtNascimento());
		ps.setString(3, cliente.getRg());
		ps.setString(4, cliente.getCpf());
		ps.setString(5, cliente.getTelefone());
		ps.setString(6, cliente.getCep());
		ps.setString(7, cliente.getDsEndereco());
		ps.setString(8, cliente.getDsEmail());
		ps.setLong(9, cliente.getCdCliente());
		
		ps.executeUpdate();
		con.close();		
	}
	
	 public static void delete(int id) throws SQLException {
	        var con = ConnectionFactory.getConnection();
	        var ps = con.prepareStatement("DELETE FROM T_ECS_CLIENTE WHERE CD_CLIENTE=?");
	        ps.setLong(1, id);
	        ps.executeUpdate();
	        con.close();
	    }
	

}
