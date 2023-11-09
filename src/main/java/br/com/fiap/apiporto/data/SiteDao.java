package br.com.fiap.apiporto.data;

import java.sql.SQLException;

import br.com.fiap.apiporto.model.Site;

public class SiteDao {

	private static void createMarca(Site site) throws SQLException {
		var con = ConnectionFactory.getConnection();
		
		// Verifica se a marca já existe no banco de dados
		var rss = con.prepareStatement("select * from T_ECS_MARCA where nm_marca = ?");
		rss.setString(1, site.getMarca().getNmMarca());
		var rs = rss.executeQuery();
		rs.next();
		
		// Se nao, insere a nova marca no banco de dados
		if (rs.isAfterLast()) {
			var ps = con.prepareStatement("insert into T_ECS_MARCA (nm_marca) values (?)");
			ps.setString(1, site.getMarca().getNmMarca());
			ps.executeUpdate(); 
		}
		
		con.close();
	}
	
	private static void createModelo(Site site) throws SQLException {
		var con = ConnectionFactory.getConnection();
		
		 // Obtem o codigo da marca correspondente ao nome da marca
		var tss = con.prepareStatement("select cd_marca from T_ECS_MARCA WHERE nm_marca = ?");
		tss.setString(1, site.getMarca().getNmMarca());
		var ts = tss.executeQuery();
		ts.next();
		
		// Verifica se o modelo ja existe no banco de dados
		var rss = con.prepareStatement("select * from T_ECS_MODEL where nm_modelo = ?  and t_ecs_marca_cd_marca= ?");
		rss.setString(1, site.getModelo().getNmModelo());
		rss.setInt(2, ts.getInt("cd_marca"));
		var rs = rss.executeQuery();
		rs.next();
		
		// Se nao, insere a nova marca no banco de dados
		if (rs.isAfterLast()) {
			var ps = con.prepareStatement("insert into T_ECS_MODEL (nm_modelo, nr_modelo, T_ECS_MARCA_CD_MARCA) values (?,?,?)");
			ps.setString(1, site.getModelo().getNmModelo());
			ps.setLong(2,site.getModelo().getNrModelo());
			ps.setInt(3, ts.getInt("cd_marca"));
			ps.executeUpdate();
		}
		
		con.close();
	}
	
	private static void createBicicleta(Site site) throws SQLException {
		var con = ConnectionFactory.getConnection();
		
		// Obtem o codigo do modelo correspondente ao nome do modelo e nome da marca
		var modeloo = con.prepareStatement("select cd_modelo from T_ECS_MODEL WHERE NM_MODELO = ? and T_ECS_MARCA_CD_MARCA = (select CD_MARCA from T_ECS_MARCA where NM_MARCA = ?)");
		modeloo.setString(1, site.getModelo().getNmModelo());
		modeloo.setString(2, site.getMarca().getNmMarca());
		var modelo = modeloo.executeQuery();
		modelo.next();
		
		// Obtem o codigo do cliente correspondente ao endereço de email
		var clientee = con.prepareStatement("select CD_CLIENTE from T_ECS_CLIENTE where ds_email = ?");
		clientee.setString(1,site.getCliente().getDsEmail());
		var cliente = clientee.executeQuery();
		cliente.next();
		
		//Verifica se a bicicleta ja existe no banco de dados
		var rss = con.prepareStatement("select * from T_ECS_BIKE where cd_serie = ? and T_ECS_MODEL_CD_MODELO = ?");
		rss.setString(1, site.getBicicleta().getCdSerie());
		rss.setInt(2, modelo.getInt("cd_modelo"));
		var rs = rss.executeQuery();
		rs.next();
		
		// Se nao, insere a nova bicicleta no banco de dados
		if (rs.isAfterLast()) {
		var ps = con.prepareStatement("insert into T_ECS_BIKE (T_ECS_CLIENTE_CD_CLIENTE, T_ECS_MODEL_CD_MODELO, CD_SERIE, VL_BICICLETA, TP_BICICLETA) values (?,?,?,?,?)");
		ps.setInt(1,cliente.getInt("cd_cliente"));
		ps.setInt(2, modelo.getInt("cd_modelo"));
		ps.setString(3,site.getBicicleta().getCdSerie());
		ps.setDouble(4,site.getBicicleta().getVlBicicleta());
		ps.setString(5,site.getBicicleta().getTpBicicleta());
		ps.executeUpdate();
		}
		
		con.close();
	}

	private static void createAcessorio(Site site) throws SQLException {
		var con = ConnectionFactory.getConnection();
		
		 // Obtem o codigo da bicicleta correspondente a serie da bike, codigo do modelo, nome do modelo e nome da marca
		var bicicletaa = con.prepareStatement("select cd_bicicleta from T_ECS_BIKE where CD_SERIE = ? and T_ECS_MODEL_CD_MODELO = (select cd_modelo from T_ECS_MODEL where nm_modelo = ? and T_ECS_MARCA_CD_MARCA = (select CD_MARCA from T_ECS_MARCA where nm_marca = ?))");
		bicicletaa.setString(1, site.getBicicleta().getCdSerie());
		bicicletaa.setString(2,site.getModelo().getNmModelo());
		bicicletaa.setString(3, site.getMarca().getNmMarca());
		var bicicleta = bicicletaa.executeQuery();
		bicicleta.next();
		
		 // Obtem o codigo do modelo correspondente ao nome do modelo e nome da marca
		var modeloo = con.prepareStatement("select cd_modelo from T_ECS_MODEL WHERE nm_modelo = ? and T_ECS_MARCA_CD_MARCA = (select CD_MARCA from T_ECS_MARCA where nm_marca = ?)");
		modeloo.setString(1, site.getModelo().getNmModelo());
		modeloo.setString(2, site.getMarca().getNmMarca());
		var modelo = modeloo.executeQuery();
		modelo.next();
		
		// Insere o novo acessorio no banco de dados
		var ps = con.prepareStatement("insert into T_ECS_ACESS(T_ECS_MODEL_CD_MODELO, T_ECS_BIKE_CD_BICICLETA, NM_ACESSORIO) values(?,?,?)");
		ps.setInt(1, modelo.getInt("cd_modelo"));
		ps.setInt(2,bicicleta.getInt("cd_bicicleta"));
		ps.setString(3, site.getAcessorio().getNmAcessorio());
		ps.executeUpdate();
		
		con.close();
	}
	
	
	public static void create(Site site) throws SQLException {
		createMarca(site);
		createModelo(site);
		createBicicleta(site);
		createAcessorio(site);
		
		
		
	}
}
