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
	public void removerOperarioCPF(String cpf) {
		int posicao = -1;
		for(Operario ope : operarios) {
			if(ope.getCpf().equals(cpf)) {
				posicao = operarios.indexOf(ope);
				break;
			}
		}
		if(posicao != -1) {
			operarios.remove(posicao);
		}else {
			System.out.println("Operario Não Encontrado!");
		}
	}
	
	public void removerOperarioSetor(int codigoSetor) {
		int posicao = -1;
		for(Operario ope : operarios) {
			if(ope.getCodigoSetor() == codigoSetor) {
				posicao = operarios.indexOf(ope);
				break;
			}
		}
		if(posicao != -1) {
			operarios.remove(posicao);
		}else {
			System.out.println("Operario Não Encontrado!");
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
	
	@Override
	public Operario procurarOperarioCPF(String cpf) {
		Operario cpfProcurado = null;
		for(Operario ope : operarios) {
			if(ope.getCpf().equals(cpf)) {
				cpfProcurado = ope;
				break;
			}
		}
		return cpfProcurado;
	}
	
	@Override
	public Operario procurarOperarioSetor(int codigoSetor) {
		Operario codigoSetorProcurado = null;
		for(Operario ope : operarios) {
			if(ope.getCodigoSetor() == codigoSetor) {
				codigoSetorProcurado = ope;
				break;
			}
		}
		return codigoSetorProcurado;
	}
	
	public List<Operario> listarOperario(){
		return this.operarios;
	}
}
