package telas;

public class Telas {
	
	public void telaMenuInicial()
	{
		System.out.println("________________________________________________________________");
		System.out.println("=-=-=-=-=-=-=-  Sistema de Gestão Empresarial   -=-=-=-=-=-=-=\n");
		System.out.println("----------------------------------------------------------------");
		System.out.println("               Menu Principal - Opções do Usuário\n             ");
		System.out.println(" 1 - CADASTRAR            2 - APAGAR            3 - MODIFICAR\n ");
		System.out.println(" 4 - LISTAR               0 - SAIR                              ");
		System.out.println("----------------------------------------------------------------");
	}
	
	public void telaMenuCadastrar()
	{
		System.out.println("________________________________________________________________");
		System.out.println("           Qual o tipo de Cadastro será Realizado:            \n");
		System.out.println("----------------------------------------------------------------");
		System.out.println("                    CADASTRO DE EMPREGADOS                      ");
		System.out.println(" 1 - ADMINISTRADOR        2 - OPERARIO          3 - VENDEDOR  \n");
		System.out.println("                  CADASTRO DE FORNECEDORES                      ");
		System.out.println(" 4 - JURIDICO             5 - FISICO\n"); //6 - EMITIR NF
		System.out.println("0 - VOLTAR TELA ANTERIOR"                                        );
		System.out.println("----------------------------------------------------------------");
	}
	
	public void telaMenuApagar()
	{
		System.out.println("________________________________________________________________");
		System.out.println("           Qual o tipo de Cadastro será Apagado:            \n");
		System.out.println("----------------------------------------------------------------");
		System.out.println("                      APAGAR  EMPREGADOS                        ");
		System.out.println(" 1 - ADMINISTRADOR        2 - OPERARIO          3 - VENDEDOR  \n");
		System.out.println("                     APAGAR FORNECEDORES                        ");
		System.out.println("              4 - JURIDICO        5 - FISICO                  \n");
		System.out.println("0 - VOLTAR TELA ANTERIOR");
		System.out.println("----------------------------------------------------------------");
	}
	
	public void telaMenuModificar()
	{
		System.out.println("________________________________________________________________");
		System.out.println("          Qual o tipo de Cadastro será Modificado:            \n");
		System.out.println("----------------------------------------------------------------");
		System.out.println("                     MODIFICAR EMPREGADOS                       ");
		System.out.println(" 1 - ADMINISTRADOR        2 - OPERARIO          3 - VENDEDOR  \n");
		System.out.println("                    MODIFICAR FORNECEDORES                      ");
		System.out.println("              4 - JURIDICO        5 - FISICO                  \n");
		System.out.println("0 - VOLTAR TELA ANTERIOR");
		System.out.println("----------------------------------------------------------------");
	}
	
	public void telaMenuListar()
	{
		System.out.println("________________________________________________________________");
		System.out.println("            Qual o tipo de Cadastro será Listado:             \n");
		System.out.println("----------------------------------------------------------------");
		System.out.println("                       LISTAR EMPREGADOS                        ");
		System.out.println(" 1 - ADMINISTRADOR        2 - OPERARIO          3 - VENDEDOR  \n");
		System.out.println("                      LISTAR FORNECEDORES                       ");
		System.out.println(" 4 - JURIDICO             5 - FISICO"); //6 - NOTA FISCAL
		System.out.println("0 - VOLTAR TELA ANTERIOR");
		System.out.println("----------------------------------------------------------------");
	}
	
	public void telaCadastrando(String nome)
	{
		System.out.println("________________________________________________________________");
		System.out.println("=-=- CADASTRANDO: " +  nome);
	}
	
	public void telaApagandoEmpregado(String nome)
	{
		System.out.println("________________________________________________________________");
		System.out.println("=-=- APAGANDO: " + nome);
		System.out.println("----------------------------------------------------------------");
		System.out.println("Informe o parametro a ser utilizado na busca do " + nome);
		System.out.println("      1 - NOME        2 - COD SETOR          3 - CPF          \n");
	}
	
	public void telaApagandoFornecedor(String nome)
	{
		System.out.println("____________________________________________________________________");
		System.out.println("=-=- APAGANDO: " + nome);
		System.out.println("--------------------------------------------------------------------");
		System.out.println("Informe o parametro a ser utilizado na busca do " + nome);
	}
	
	public void telaModificando(String nome)
	{
		System.out.println("________________________________________________________________");
		System.out.println("=-=- MODIFICANDO: " + nome);
		System.out.println("----------------------------------------------------------------");
	}
	
	public void telaModificandoEmpregado()
	{
		System.out.println("----------------------------------------------------------------");
		System.out.println("             Escolha uma Informação para ser Alterada:           ");
		System.out.println("  1 - NOME        2 - ENDERECO      3 - TELEFONE      4 - CPF   ");
	}
	
	public void telaModificandoFornecedor()
	{
		System.out.println("----------------------------------------------------------------");
		System.out.println("             Escolha uma Informação para ser Alterada:           ");
		System.out.println("          1 - NOME        2 - ENDERECO      3 - TELEFONE         ");
	}
	
	public void telaListando(String nome)
	{
		System.out.println("________________________________________________________________");
		System.out.println("=-=- LISTANDO: " + nome);
		System.out.println("");
	}
	

}
