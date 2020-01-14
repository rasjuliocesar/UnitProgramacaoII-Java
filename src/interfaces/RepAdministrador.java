package interfaces;

import gestaointerno.profissoes.Administrador;

public interface RepAdministrador {

	void inserirAdministrador(Administrador amd);
	void removerAdministrador(String nome);
	Administrador procurarAdministrador(String nome);
}
