package interfaces;

import gestaoexterno.FornecedorJuridico;

public interface RepForJuridico {

	void inserirForJuridico(FornecedorJuridico jur);
	void removerForJuridico(String nome);
	void removerForJuridicoCNPJ(String cnpj);
	FornecedorJuridico procurarForJuridico(String nome);
	FornecedorJuridico procurarForJuridicoCNPJ(String cnpj);
}
