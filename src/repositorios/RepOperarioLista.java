package repositorios;

import java.util.ArrayList;
import java.util.List;

import gestaointerno.profissoes.Operario;
import interfaces.RepOperario;

public class RepOperarioLista implements RepOperario{

	private List<Operario> operarios;
	
	public RepOperarioLista() {
		operarios = new ArrayList<Operario>();
	}
	
	@Override
	public void inserirOperario(Operario ope) {
		operarios.add(ope);
	}
	
	@Override
	public void removerOperario(String nome) {
		int posicao = -1;
		for(Operario ope : operarios) {
			if(ope.getNome().contentEquals(nome)) {
				posicao = operarios.indexOf(ope);
			}
		}
		if(posicao != -1) {
			operarios.remove(posicao);
		}else {
			System.out.println("Operário não encontrado!");
		}
	}
	
	@Override
	public Operario procurarOperario(String nome) {
		Operario nomeProcurado = null;
		for(Operario ope : operarios) {
			if(ope.getNome().equals(nome)) {
				nomeProcurado = ope;
				break;
			}
		}
		return nomeProcurado;
	}
	
	public List<Operario> listarOperario(){
		return this.operarios;
	}
}
