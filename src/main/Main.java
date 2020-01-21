package main;

import java.util.Scanner;

import gestaoexterno.FornecedorFisico;
import gestaoexterno.FornecedorJuridico;
import gestaointerno.profissoes.Administrador;
import gestaointerno.profissoes.Operario;
import gestaointerno.profissoes.Vendedor;
import repositorios.RepAdministradorLista;
import repositorios.RepForFisicoLista;
import repositorios.RepForJuridicoLista;
import repositorios.RepOperarioLista;
import repositorios.RepVendedorLista;
import telas.Telas;

public class Main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Telas tela = new Telas();
		
		//Reposit�rios
		
		RepAdministradorLista repAdministrador = new RepAdministradorLista();
		RepOperarioLista repOperario = new RepOperarioLista();
		RepVendedorLista repVendedor = new RepVendedorLista();
		RepForJuridicoLista repJuridico = new RepForJuridicoLista();
		RepForFisicoLista repFisico = new RepForFisicoLista();
		
		//Main
		
		String opcaoLoopPrincipal = "MenuAtivo"; //O uso de String facilitou para controlar exce��es caso o usu�rio digite uma informa��o inv�lida.
		while (opcaoLoopPrincipal != "0") {
			tela.telaMenuInicial();
			System.out.print("Informe a Op��o Desejada: ");
			opcaoLoopPrincipal = teclado.next();
			switch (opcaoLoopPrincipal) {
				case "0": // finalizando o Sistema/Loop
					System.out.println("Sistema Encerrado com Sucesso!");
					opcaoLoopPrincipal = "0";
					break;
				case "1": // Tela de Cadastro	
					tela.telaMenuCadastrar();
					System.out.println("Cadastrando...");
					break;
				case "2": // Tela de Remo��o
					tela.telaMenuApagar();
					System.out.println("Apagando...");
					break;
				case "3": // Tela de Updates
					tela.telaMenuModificar();
					System.out.print("Informa a Op��o Deseja: ");
					String opcaoControleModificar = teclado.next();
					int opcaoLoopModificar = 1;
					switch(opcaoControleModificar) {
						case "0": // Voltar Tela Anterior
							System.out.println("Tela Anterior...");
							break;
						case "1": // Modificar Administrador
							while(opcaoLoopModificar != 0 ) {
								tela.telaModificando("Administrador");
								System.out.print("Informe o Nome do Administrador: ");
								Administrador buscarNome = repAdministrador.procurarAdministrador(teclado.next());
								if(buscarNome == null) {
									System.out.println("Nome Administrador n�o encontrado!");
								}else {
									System.out.println(buscarNome.toString());
									tela.telaModificandoEmpregado();
									System.out.println("5 - C�D SETOR   6 - SALARIO BASE   7 - AJUDA CUSTO   8 - % IMPOSTO");
									System.out.print("Escolha a Op��o Desejada: ");
									String decisaoModificaAdministrador = teclado.next();
									switch(decisaoModificaAdministrador) {
										case "1": // Modificar Nome
											System.out.println("Informe o novo Nome: ");
											buscarNome.setNome(teclado.next());
											System.out.println("Nome Alterado com Sucesso!");
											System.out.println(buscarNome.toString());
											break;
										case "2": // Modificar Endere�o
											System.out.println("Informe o novo Endere�o: ");
											buscarNome.setEndereco(teclado.next());
											System.out.println("Endere�o Alterado com Sucesso!");
											System.out.println(buscarNome.toString());
											break;
										case "3": // Modificar Telefone
											System.out.println("Informe o novo Telefone: ");
											buscarNome.setTelefone(teclado.next());
											System.out.println("Telefone Alterado com Sucesso!");
											System.out.println(buscarNome.toString());
											break;
										case "4": // Modificar CPF
											System.out.println("Informe o novo CPF: ");
											buscarNome.setCpf(teclado.next());
											System.out.println("CPF Alterado com Sucesso!");
											System.out.println(buscarNome.toString());
											break;
										case "5": // Modificar C�digo Setor
											System.out.println("Informe o novo C�digo do Setor: ");
											buscarNome.setCodigoSetor(teclado.nextInt());
											System.out.println("C�digo do Setor Alterado com Sucesso!");
											System.out.println(buscarNome.toString());
											break;
										case "6": // Modificar Sal�rio Base
											System.out.println("Informe o novo Sal�rio Base: ");
											buscarNome.setSalarioBase(teclado.nextDouble());
											System.out.println("Sal�rio Base Alterado com Sucesso!");
											System.out.println(buscarNome.toString());
											break;
										case "7": // Modificar Ajuda de Custo
											System.out.println("Informe o novo valor da Ajuda de Custo: ");
											buscarNome.setAjudaDeCusto(teclado.nextDouble());
											System.out.println("Ajuda de Custo Alterado com Sucesso!");
											System.out.println(buscarNome.toString());
											break;
										case "8": // Modificar % Imposto
											System.out.println("Informe o novo Percentual de Imposto: ");
											buscarNome.setImposto(teclado.nextDouble());
											System.out.println("Percentual de Imposto Alterado com Sucesso!");
											System.out.println(buscarNome.toString());
											break;
										default: // Op��o Inv�lida - N�o consta no Menu
											System.out.print("Por Favor digite uma Op��o v�lida do Menu:\n");
											break;
									}
								}
								System.out.print("Deseja Modificar outro Administrador? [1 - SIM / 0 - N�O]: ");
								opcaoLoopModificar = teclado.nextInt();
							}
							break;
						case "2": // Modificar Oper�rio
							while(opcaoLoopModificar != 0 ) {
								tela.telaModificando("Oper�rio");
								System.out.print("Informe o Nome do Oper�rio: ");
								Operario buscarNome = repOperario.procurarOperario(teclado.next());
								if(buscarNome == null) {
									System.out.println("Nome Oper�rio n�o encontrado!");
								}else {
									System.out.println(buscarNome.toString());
									tela.telaModificandoEmpregado();
									System.out.println("5 - C�D SETOR  6 - SALARIO BASE  7 - VALOR PRODUCAO  8 - % IMPOSTO");
									System.out.print("Escolha a Op��o Desejada: ");
									String decisaoModificaOperario = teclado.next();
									switch(decisaoModificaOperario) {
										case "1": // Modificar Nome
											System.out.println("Informe o novo Nome: ");
											buscarNome.setNome(teclado.next());
											System.out.println("Nome Alterado com Sucesso!");
											System.out.println(buscarNome.toString());
											break;
										case "2": // Modificar Endere�o
											System.out.println("Informe o novo Endere�o: ");
											buscarNome.setEndereco(teclado.next());
											System.out.println("Endere�o Alterado com Sucesso!");
											System.out.println(buscarNome.toString());
											break;
										case "3": // Modificar Telefone
											System.out.println("Informe o novo Telefone: ");
											buscarNome.setTelefone(teclado.next());
											System.out.println("Telefone Alterado com Sucesso!");
											System.out.println(buscarNome.toString());
											break;
										case "4": // Modificar CPF
											System.out.println("Informe o novo CPF: ");
											buscarNome.setCpf(teclado.next());
											System.out.println("CPF Alterado com Sucesso!");
											System.out.println(buscarNome.toString());
											break;
										case "5": // Modificar C�digo Setor
											System.out.println("Informe o novo C�digo do Setor: ");
											buscarNome.setCodigoSetor(teclado.nextInt());
											System.out.println("C�digo do Setor Alterado com Sucesso!");
											System.out.println(buscarNome.toString());
											break;
										case "6": // Modificar Sal�rio Base
											System.out.println("Informe o novo Sal�rio Base: ");
											buscarNome.setSalarioBase(teclado.nextDouble());
											System.out.println("Sal�rio Base Alterado com Sucesso!");
											System.out.println(buscarNome.toString());
											break;
										case "7": // Modificar Valor de Produ��o
											System.out.println("Informe o novo Valor de Produ��o: ");
											buscarNome.setValorProducao(teclado.nextDouble());
											System.out.println("Valor de Produ��o Alterado com Sucesso!");
											System.out.println(buscarNome.toString());
											break;
										case "8": // Modificar % Imposto
											System.out.println("Informe o novo Percentual de Imposto: ");
											buscarNome.setImposto(teclado.nextDouble());
											System.out.println("Percentual de Imposto Alterado com Sucesso!");
											System.out.println(buscarNome.toString());
											break;
										default: // Op��o Inv�lida - N�o consta no Menu
											System.out.print("Por Favor digite uma Op��o v�lida do Menu:\n");
											break;
									}
								}
								System.out.print("Deseja Modificar outro Oper�rio? [1 - SIM / 0 - N�O]: ");
								opcaoLoopModificar = teclado.nextInt();
							}
							break;
						case "3": // Modificar Vendedor
							while(opcaoLoopModificar != 0 ) {
								tela.telaModificando("Vendedor");
								System.out.print("Informe o Nome do Vendedor: ");
								Vendedor buscarNome = repVendedor.procurarVendedor(teclado.next());
								if(buscarNome == null) {
									System.out.println("Nome Vendedor n�o encontrado!");
								}else {
									System.out.println(buscarNome.toString());
									tela.telaModificandoEmpregado();
									System.out.println("5 - C�D SETOR   6 - SALARIO BASE   7 - VALOR VENDAS   8 - % IMPOSTO");
									System.out.print("Escolha a Op��o Desejada: ");
									String decisaoModificaVendedor = teclado.next();
									switch(decisaoModificaVendedor) {
										case "1": // Modificar Nome
											System.out.println("Informe o novo Nome: ");
											buscarNome.setNome(teclado.next());
											System.out.println("Nome Alterado com Sucesso!");
											System.out.println(buscarNome.toString());
											break;
										case "2": // Modificar Endere�o
											System.out.println("Informe o novo Endere�o: ");
											buscarNome.setEndereco(teclado.next());
											System.out.println("Endere�o Alterado com Sucesso!");
											System.out.println(buscarNome.toString());
											break;
										case "3": // Modificar Telefone
											System.out.println("Informe o novo Telefone: ");
											buscarNome.setTelefone(teclado.next());
											System.out.println("Telefone Alterado com Sucesso!");
											System.out.println(buscarNome.toString());
											break;
										case "4": // Modificar CPF
											System.out.println("Informe o novo CPF: ");
											buscarNome.setCpf(teclado.next());
											System.out.println("CPF Alterado com Sucesso!");
											System.out.println(buscarNome.toString());
											break;
										case "5": // Modificar C�digo Setor
											System.out.println("Informe o novo C�digo do Setor: ");
											buscarNome.setCodigoSetor(teclado.nextInt());
											System.out.println("C�digo do Setor Alterado com Sucesso!");
											System.out.println(buscarNome.toString());
											break;
										case "6": // Modificar Sal�rio Base
											System.out.println("Informe o novo Sal�rio Base: ");
											buscarNome.setSalarioBase(teclado.nextDouble());
											System.out.println("Sal�rio Base Alterado com Sucesso!");
											System.out.println(buscarNome.toString());
											break;
										case "7": // Modificar Valor de vendas
											System.out.println("Informe o novo Valor de Vendas: ");
											buscarNome.setValorVendas(teclado.nextDouble());
											System.out.println("Valor de Vendas Alterado com Sucesso!");
											System.out.println(buscarNome.toString());
											break;
										case "8": // Modificar % Imposto
											System.out.println("Informe o novo Percentual de Imposto: ");
											buscarNome.setImposto(teclado.nextDouble());
											System.out.println("Percentual de Imposto Alterado com Sucesso!");
											System.out.println(buscarNome.toString());
											break;
										default: // Op��o Inv�lida - N�o consta no Menu
											System.out.print("Por Favor digite uma Op��o v�lida do Menu:\n");
											break;
									}
								}
								System.out.print("Deseja Modificar outro Vendedor? [1 - SIM / 0 - N�O]: ");
								opcaoLoopModificar = teclado.nextInt();
							}
							break;
						case "4": // Modificar Fornecedor Jur�dico
							while(opcaoLoopModificar != 0 ) {
								tela.telaModificando("Fornecedor Jur�dico");
								System.out.print("Informe o Nome do Fornecedor Jur�dico: ");
								FornecedorJuridico buscarNome = repJuridico.procurarForJuridico(teclado.next());
								if(buscarNome == null) {
									System.out.println("Nome Fornecedor Jur�dico n�o encontrado!");
								}else {
									System.out.println(buscarNome.toString());
									tela.telaModificandoFornecedor();
									System.out.println("          4 - CNPJ 5 - VALOR CREDITO   6 - VALOR DIVIDA          ");
									System.out.print("Escolha a Op��o Desejada: ");
									String decisaoModificaForJuridico = teclado.next();
									switch(decisaoModificaForJuridico) {
										case "1": // Modificar Nome
											System.out.println("Informe o novo Nome: ");
											buscarNome.setNome(teclado.next());
											System.out.println("Nome Alterado com Sucesso!");
											System.out.println(buscarNome.toString());
											break;
										case "2": // Modificar Endere�o
											System.out.println("Informe o novo Endere�o: ");
											buscarNome.setEndereco(teclado.next());
											System.out.println("Endere�o Alterado com Sucesso!");
											System.out.println(buscarNome.toString());
											break;
										case "3": // Modificar Telefone
											System.out.println("Informe o novo Telefone: ");
											buscarNome.setTelefone(teclado.next());
											System.out.println("Telefone Alterado com Sucesso!");
											System.out.println(buscarNome.toString());
											break;
										case "4": // Modificar CNPJ
											System.out.println("Informe o novo CNPJ: ");
											buscarNome.setCnpj(teclado.next());
											System.out.println("CNPJ Alterado com Sucesso!");
											System.out.println(buscarNome.toString());
											break;
										case "5": // Modificar Valor Cr�dito
											System.out.println("Informe o novo Valor de Cr�dito: ");
											buscarNome.setValorCredito(teclado.nextInt());
											System.out.println("Valor de Cr�dito Alterado com Sucesso!");
											System.out.println(buscarNome.toString());
											break;
										case "6": // Modificar Valor D�vida
											System.out.println("Informe o novo Valor da D�vida: ");
											buscarNome.setValorDivida(teclado.nextDouble());
											System.out.println("Valor da D�vida Alterado com Sucesso!");
											System.out.println(buscarNome.toString());
											break;
										default: // Op��o Inv�lida - N�o consta no Menu
											System.out.print("Por Favor digite uma Op��o v�lida do Menu:\n");
											break;
									}
								}
								System.out.print("Deseja Modificar outro Fornecedor Jur�dico? [1 - SIM / 0 - N�O]: ");
								opcaoLoopModificar = teclado.nextInt();
							}
							break;
						case "5": // Modificar F�sico
							while(opcaoLoopModificar != 0 ) {
								tela.telaModificando("Fornecedor F�sico");
								System.out.print("Informe o Nome do Fornecedor F�sico: ");
								FornecedorFisico buscarNome = repFisico.procurarForFisico(teclado.next());
								if(buscarNome == null) {
									System.out.println("Nome Fornecedor F�sico n�o encontrado!");
								}else {
									System.out.println(buscarNome.toString());
									tela.telaModificandoFornecedor();
									System.out.println("           4 - CPF  5 - VALOR CREDITO   6 - VALOR DIVIDA         ");
									System.out.print("Escolha a Op��o Desejada: ");
									String decisaoModificaForFisico = teclado.next();
									switch(decisaoModificaForFisico) {
										case "1": // Modificar Nome
											System.out.println("Informe o novo Nome: ");
											buscarNome.setNome(teclado.next());
											System.out.println("Nome Alterado com Sucesso!");
											System.out.println(buscarNome.toString());
											break;
										case "2": // Modificar Endere�o
											System.out.println("Informe o novo Endere�o: ");
											buscarNome.setEndereco(teclado.next());
											System.out.println("Endere�o Alterado com Sucesso!");
											System.out.println(buscarNome.toString());
											break;
										case "3": // Modificar Telefone
											System.out.println("Informe o novo Telefone: ");
											buscarNome.setTelefone(teclado.next());
											System.out.println("Telefone Alterado com Sucesso!");
											System.out.println(buscarNome.toString());
											break;
										case "4": // Modificar CPF
											System.out.println("Informe o novo CPF: ");
											buscarNome.setCpf(teclado.nextInt());
											System.out.println("CPF Alterado com Sucesso!");
											System.out.println(buscarNome.toString());
											break;
										case "5": // Modificar Valor de Cr�dito
											System.out.println("Informe o novo Valor de Cr�dito: ");
											buscarNome.setValorCredito(teclado.nextInt());
											System.out.println("Valor de Cr�dito Alterado com Sucesso!");
											System.out.println(buscarNome.toString());
											break;
										case "6": // Modificar Valor da D�vida
											System.out.println("Informe o novo Valor da D�vida: ");
											buscarNome.setValorDivida(teclado.nextDouble());
											System.out.println("Valor da D�vida Alterado com Sucesso!");
											System.out.println(buscarNome.toString());
											break;
										default: // Op��o Inv�lida - N�o consta no Menu
											System.out.print("Por Favor digite uma Op��o v�lida do Menu:\n");
											break;
									}
								}
								System.out.print("Deseja Modificar outro Fornecedor F�sico? [1 - SIM / 0 - N�O]: ");
								opcaoLoopModificar = teclado.nextInt();
							}
							break;
						default: // Op��o Inv�lida - N�o consta no Menu
							System.out.print("Por Favor digite uma Op��o v�lida do Menu:\n");
							break;
					}
					break;
				case "4": // Tela de listagem *Verificar notas Fiscais
					tela.telaMenuListar();
					System.out.print("Informe a Op��o Desejada: ");
					String opcaoControleListar = teclado.next();
					int opcaoLoopListar = 1;
					switch(opcaoControleListar){
						case "0": // Voltar Tela Anterior
							System.out.println("Tela Anterior...");
							break;
						case "1": // Listar Administrador
							while(opcaoLoopListar != 0) {
								tela.telaListando("Administrador");
								System.out.println(((RepAdministradorLista) repAdministrador).listarAdministrador());
								System.out.print("\nListar Novamente? [1 - SIM / 0 - N�O]: ");
								opcaoLoopListar = teclado.nextInt();
							}
							break;
						case "2": // Listar Oper�rio
							while(opcaoLoopListar != 0) {
								tela.telaListando("Oper�rio");
								System.out.println(((RepOperarioLista) repOperario).listarOperario());
								System.out.print("\nListar Novamente? [1 - SIM / 0 - N�O]: ");
								opcaoLoopListar = teclado.nextInt();
							}
							break;
						case "3": // Listar Vendedor
							while(opcaoLoopListar != 0) {
								tela.telaListando("Vendedor");
								System.out.println(((RepVendedorLista) repVendedor).listarVendedor());
								System.out.print("\nListar Novamente? [1 - SIM / 0 - N�O]: ");
								opcaoLoopListar = teclado.nextInt();
							}
							break;
						case "4": // Listar Fornecedor Jur�dico
							while(opcaoLoopListar != 0) {
								tela.telaListando("Fornecedor Jur�dico");
								System.out.println(((RepForJuridicoLista) repJuridico).listarForJuridico());
								System.out.print("\nListar Novamente? [1 - SIM / 0 - N�O]: ");
								opcaoLoopListar = teclado.nextInt();
							}
							break;
						case "5": // Listar Fornecedor F�sico
							while(opcaoLoopListar != 0) {
								tela.telaListando("Fornecedor F�sico");
								System.out.println(((RepForFisicoLista) repFisico).listarForFisico());
								System.out.print("\nListar Novamente? [1 - SIM / 0 - N�O]: ");
								opcaoLoopListar = teclado.nextInt();
							}
							break;
						case "6": // Listar Notas Fiscais
							while(opcaoLoopListar != 0) {
								tela.telaListando("Notas Fiscais");
								System.out.print("\nListar Novamente? [1 - SIM / 0 - N�O]: ");
								opcaoLoopListar = teclado.nextInt();
							}
							break;
						default: // Op��o Inv�lida - N�o consta no Menu
							System.out.print("Por Favor digite uma Op��o v�lida do Menu:\n");
					}
					break;
				default: // Op��o Inv�lida - N�o consta no Menu
					System.out.print("Por Favor digite uma Op��o v�lida do Menu Principal:\n");
					break;
			}
				
		}
		
		teclado.close();
	}
}
