package br.com.fiap.apiporto.data;

import java.sql.SQLException;

import br.com.fiap.apiporto.model.IA;

public class IADao {
	
	private static String returnCdBicicleta(IA ia) throws SQLException {
		var con = ConnectionFactory.getConnection();
		
		var bicicletaa = con.prepareStatement("select cd_bicicleta from T_ECS_BIKE where CD_SERIE = ? and T_ECS_MODEL_CD_MODELO = (select cd_modelo from T_ECS_MODEL where nm_modelo = ? and T_ECS_MARCA_CD_MARCA = (select CD_MARCA from T_ECS_MARCA where nm_marca = ?))");
		bicicletaa.setString(1, ia.getBike().getCdSerie());
		bicicletaa.setString(2, ia.getBike().getNmModelo());
		bicicletaa.setString(3, ia.getBike().getNmMarca());
		
		var bicicleta = bicicletaa.executeQuery();
		bicicleta.next();
		
		var cdBicicleta = bicicleta.getString("cd_bicicleta");
		con.close();
		
		return cdBicicleta;
		
	}
	
	
	private static void createVistoria(IA ia) throws SQLException {
		var con = ConnectionFactory.getConnection();
		
		var ps = con.prepareStatement("insert into T_ECS_VIST (T_ECS_BIKE_CD_BICICLETA, dt_vistoria, ds_resultado) values (?,?,?)");
		ps.setString(1, returnCdBicicleta(ia));
		ps.setDate(2, ia.getVistoria().getDtVistoria());
		ps.setString(3, ia.getVistoria().getDsResultado());
		ps.executeQuery();
		
		con.close();
	}
	
	private static void createFoto(IA ia) throws SQLException {
		var con = ConnectionFactory.getConnection();
		
		var vistoriaa = con.prepareStatement("select cd_vistoria from T_ECS_VIST where DT_VISTORIA = ? and T_ECS_BIKE_CD_BICICLETA = ?");
		vistoriaa.setDate(1, ia.getVistoria().getDtVistoria());
		vistoriaa.setString(2, returnCdBicicleta(ia));
		var vistoria = vistoriaa.executeQuery();
		vistoria.next();
		System.out.println(vistoria.getString("cd_vistoria"));
		
		var ps = con.prepareStatement("insert into T_ECS_FOTO (T_ECS_VIST_CD_VISTORIA, DT_FOTO, DS_FOTO, URL_FOTO) values(?,?,?,?)");
		ps.setString(1, vistoria.getString("cd_vistoria"));
		ps.setDate(2, ia.getFoto().getDtFoto());
		ps.setString(3, ia.getFoto().getDsFoto());
		ps.setString(4, ia.getFoto().getUrlFoto());
		ps.executeQuery();
		
		con.close();
	}
	
	
	
	public static void create(IA ia) throws SQLException {
		createVistoria(ia);
		createFoto(ia);
	}
}
