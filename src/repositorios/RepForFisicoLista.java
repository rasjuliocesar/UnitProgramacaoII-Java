package repositorios;

import java.util.ArrayList;
import java.util.List;

import gestaoexterno.FornecedorFisico;
import interfaces.RepForFisico;

public class RepForFisicoLista implements RepForFisico{

	private List<FornecedorFisico> forFisicos;
	
	public RepForFisicoLista() {
		forFisicos = new ArrayList<FornecedorFisico>();
	}
	
	public List<FornecedorFisico> listarForFisico(){
		return this.forFisicos;
	}
	
	@Override
	public void inserirForFisico(FornecedorFisico fis) {
		forFisicos.add(fis);
	}
	
	@Override
	public void removerForFisico(String nome) {
		int posicao = -1;
		for(FornecedorFisico fis : forFisicos) {
			if(fis.getNome().equals(nome)) {
				posicao = forFisicos.indexOf(fis);
				break;
			}
		}
		if(posicao != -1) {
			forFisicos.remove(posicao);
		}else {
			System.out.println("Fornecedor Físico não encontrado!");
		}
	}
	
	@Override
	public void removerForFisicoCPF(String cpf) {
		int posicao = -1;
		for(FornecedorFisico fis : forFisicos) {
			if(fis.getCpf().equals(cpf)) {
				posicao = forFisicos.indexOf(fis);
				break;
			}
		}
		if(posicao != -1) {
			forFisicos.remove(posicao);
		}else {
			System.out.println("Fornecedor Físico Não Encontrado!");
		}
	}
	
	@Override
	public FornecedorFisico procurarForFisico(String nome) {
		FornecedorFisico nomeProcurado = null;
		for(FornecedorFisico fis : forFisicos) {
			if(fis.getNome().equals(nome)) {
				nomeProcurado = fis;
				break;
			}
		}
		return nomeProcurado;
	}
	
	@Override
	public FornecedorFisico procurarForFisicoCPF(String cpf) {
		FornecedorFisico cpfProcurado = null;
		for(FornecedorFisico fis : forFisicos) {
			if(fis.getCpf().equals(cpf)) {
				cpfProcurado = fis;
				break;
			}
		}
		return cpfProcurado;
	}
}
