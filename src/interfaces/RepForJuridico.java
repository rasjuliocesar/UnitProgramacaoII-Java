package interfaces;

import gestaoexterno.FornecedorJuridico;

public interface RepForJuridico {

	void inserirForJuridico(FornecedorJuridico jur);
	void removerForJuridico(String nome);
	FornecedorJuridico procurarForJuridico(String nome);
}
