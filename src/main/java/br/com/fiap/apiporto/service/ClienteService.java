package br.com.fiap.apiporto.service;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Period;

import br.com.fiap.apiporto.data.ClienteDao;
import br.com.fiap.apiporto.model.Cliente;

public class ClienteService {
	
	private static boolean validar(Cliente cliente) throws SQLException {
		/* TRASNFORMA A DATA DE NASCIMENTO EM NUMERO DE IDADE*/
		LocalDate dataNascimentoLocalDate = cliente.getDtNascimento().toLocalDate();
	    LocalDate dataAtual = LocalDate.now();
	    int idade = Period.between(dataNascimentoLocalDate, dataAtual).getYears();
		if(cliente.getNmCliente().length() < 5) return false;
		if(cliente.getCpf().length() < 11) return false;
		if(cliente.getRg().length() < 9) return false;
		if(idade < 18) return false;
		
		return true;
	}

	public static Object findAll() throws SQLException {
		return ClienteDao.findAll();
	}
	
	public static Object findById(int id) throws SQLException {
		return ClienteDao.findById(id);
	}

	public static boolean create(Cliente cliente){
				
		try {
			if(!validar(cliente)) {
				return false;
			}
			/* NAO DEIXA TER EMAILS REPETIDOS */
			var clientes = ClienteDao.findAll();
			for (Cliente clienteProcurado : clientes) {
				if(clienteProcurado.getDsEmail().equals(cliente.getDsEmail())) return false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			ClienteDao.create(cliente);
		}
		catch(Exception e){			
			return false;
		}
		return true;
	}
	
	public static boolean update(Cliente cliente) {
		try {
			if(!validar(cliente)) {
				return false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			ClienteDao.update(cliente);
		}
		catch(Exception e){
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	public static void delete (int id) throws SQLException {
		ClienteDao.delete(id);
	}

}
