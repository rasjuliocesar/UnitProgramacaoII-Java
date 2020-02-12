package interfaces;

import gestaointerno.profissoes.Administrador;

public interface RepAdministrador {

	void inserirAdministrador(Administrador amd);
	void removerAdministrador(String nome);
	Administrador procurarAdministrador(String nome);
	Administrador procurarAdministradorSetor(int codigoSetor);
	Administrador procurarAdministradorCPF(String cpf);
	void removerAdministradorCPF(String cpf);
}
