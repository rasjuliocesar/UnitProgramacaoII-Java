package interfaces;

import gestaointerno.profissoes.Vendedor;

public interface RepVendedor {

	void inserirVendedor(Vendedor ven);
	void removerVendedor(String nome);
	Vendedor procurarVendedor(String nome);
}
