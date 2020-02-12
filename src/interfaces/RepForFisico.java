package interfaces;

import gestaoexterno.FornecedorFisico;

public interface RepForFisico {

	void inserirForFisico(FornecedorFisico fis);
	void removerForFisico(String nome);
	void removerForFisicoCPF(String cpf);
	FornecedorFisico procurarForFisico(String nome);
	FornecedorFisico procurarForFisicoCPF(String cpf);
}
