package repositorios;

import java.util.ArrayList;
import java.util.List;

import gestaoexterno.FornecedorJuridico;
import interfaces.RepForJuridico;

public class RepForJuridicoLista implements RepForJuridico{

	private List<FornecedorJuridico> forJuridicos;
	
	public RepForJuridicoLista() {
		forJuridicos = new ArrayList<FornecedorJuridico>();
	}
	
	public List<FornecedorJuridico> listarForJuridico(){
		return this.forJuridicos;
	}
	
	@Override
	public void inserirForJuridico(FornecedorJuridico jur) {
		forJuridicos.add(jur);
	}
	
	@Override
	public void removerForJuridico(String nome) {
		int posicao = -1;
		for(FornecedorJuridico jur : forJuridicos) {
			if(jur.getNome().equals(nome)) {
				posicao = forJuridicos.indexOf(jur);
				break;
			}
		}
		if(posicao != 1) {
			forJuridicos.remove(posicao);
		}else {
			System.out.println("Fornecedor Jurídico não encontrado!");
		}
	}
	
	@Override
	public FornecedorJuridico procurarForJuridico(String nome) {
		FornecedorJuridico nomeProcurado = null;
		for(FornecedorJuridico jur : forJuridicos) {
			if(jur.getNome().equals(nome)) {
				nomeProcurado = jur;
				break;
			}
		}
		return nomeProcurado;
	}
}
