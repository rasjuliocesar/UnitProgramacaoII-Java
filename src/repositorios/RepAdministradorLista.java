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
	
	public List<Administrador> listarAdministrador(){
		return this.administradores;
	}
}
