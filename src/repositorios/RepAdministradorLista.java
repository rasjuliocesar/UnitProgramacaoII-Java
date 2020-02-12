package repositorios;

import java.util.ArrayList;
import java.util.List;

import gestaointerno.profissoes.Administrador;
import interfaces.RepAdministrador;

public class RepAdministradorLista implements RepAdministrador{

	private List<Administrador> administradores;
	
	public RepAdministradorLista() {
		administradores = new ArrayList<Administrador>();
	}
	
	@Override
	public void inserirAdministrador(Administrador adm) {
		administradores.add(adm);
	}
	
	@Override
	public void removerAdministrador(String nome) {
		int posicao = -1;
		for(Administrador adm : administradores) {
			if(adm.getNome().equals(nome)) {
				posicao = administradores.indexOf(adm);
				break;
			}
		}
		if(posicao != -1) {
			administradores.remove(posicao);
		}else {
			System.out.println("Administrador não encontrado!");
		}
	}
	
	public void removerAdministradorSetor(int codigoSetor) {
		int posicao = -1;
		for(Administrador adm : administradores) {
			if(adm.getCodigoSetor() == codigoSetor) {
				posicao = administradores.indexOf(adm);
				break;
			}
		}
		if(posicao != -1) {
			administradores.remove(posicao);
		}else {
			System.out.println("Administrador Não Encontrado!");
		}
	}
	
	@Override
	public void removerAdministradorCPF(String cpf) {
		int posicao = -1;
		for(Administrador adm : administradores) {
			if(adm.getCpf().equals(cpf)) {
				posicao = administradores.indexOf(adm);
				break;
			}
		}
		if(posicao != -1) {
			administradores.remove(posicao);
		}else {
			System.out.println("Administrador Não Encontrado!");
		}
	}	
	
	@Override
	public Administrador procurarAdministrador(String nome) {
		Administrador nomeProcurado = null;
		for(Administrador adm : administradores) {
			if(adm.getNome().contentEquals(nome)) {
				nomeProcurado = adm;
				break;
			}
		}
		return nomeProcurado;
	}
	
	@Override
	public Administrador procurarAdministradorSetor(int codigoSetor) {
		Administrador codigoSetorProcurado = null;
		for(Administrador adm : administradores) {
			if(adm.getCodigoSetor() == codigoSetor){
				codigoSetorProcurado = adm;
				break;
			}
		}
		return codigoSetorProcurado;
	}
	
	@Override
	public Administrador procurarAdministradorCPF(String cpf) {
		Administrador cpfProcurado = null;
		for(Administrador adm : administradores) {
			if(adm.getCpf().equals(cpf)){
				cpfProcurado = adm;
				break;
			}
		}
		return cpfProcurado;
	}
	
	public void listarAdministrador(){
		//return this.administradores;
		for(Administrador adm : administradores) {
			System.out.println(adm.toString());
		}
	}
}
