package interfaces;

import gestaointerno.profissoes.Vendedor;

public interface RepVendedor {

	void inserirVendedor(Vendedor ven);
	void removerVendedor(String nome);
	Vendedor procurarVendedor(String nome);
	Vendedor procurarVendedorCPF(String cpf);
	Vendedor procurarVendedorSetor(int codigoSetor);
	void removerVendedorCPF(String cpf);
}
