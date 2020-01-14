package interfaces;

import gestaoexterno.FornecedorFisico;

public interface RepForFisico {

	void inserirForFisico(FornecedorFisico fis);
	void removerForFisico(String nome);
	FornecedorFisico procurarForFisico(String nome);
}
