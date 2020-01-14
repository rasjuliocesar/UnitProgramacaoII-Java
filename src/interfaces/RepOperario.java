package interfaces;

import gestaointerno.profissoes.Operario;

public interface RepOperario {

	void inserirOperario(Operario ope);
	void removerOperario(String nome);
	Operario procurarOperario(String nome);
}
