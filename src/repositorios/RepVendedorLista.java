package repositorios;

import java.util.ArrayList;
import java.util.List;

import gestaointerno.profissoes.Vendedor;
import interfaces.RepVendedor;

public class RepVendedorLista implements RepVendedor{

	private List<Vendedor> vendedores;
	
	public List<Vendedor> listarVendedor(){
		return this.vendedores;
	}
	
	public RepVendedorLista() {
		vendedores = new ArrayList<Vendedor>();
	}
	
	@Override
	public void inserirVendedor(Vendedor ven) {
		vendedores.add(ven);
	}
	
	@Override
	public void removerVendedor(String nome) {
		int posicao = -1;
		for(Vendedor ven : vendedores) {
			if(ven.getNome().equals(nome)) {
				posicao = vendedores.indexOf(ven);
				break;
			}
		}
		if (posicao != -1) {
			vendedores.remove(posicao);
		}else {
			System.out.println("Vendedor não encontrado!");
		}
	}
	
	@Override
	public Vendedor procurarVendedor(String nome) {
		Vendedor nomeProcurado = null;
		for(Vendedor ven : vendedores) {
			if(ven.getNome().equals(nome)) {
				nomeProcurado = ven;
				break;
			}
		}
		return nomeProcurado;
	}
}
