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

		// Reposit�rios

		RepAdministradorLista repAdministrador = new RepAdministradorLista();
		RepOperarioLista repOperario = new RepOperarioLista();
		RepVendedorLista repVendedor = new RepVendedorLista();
		RepForJuridicoLista repJuridico = new RepForJuridicoLista();
		RepForFisicoLista repFisico = new RepForFisicoLista();

		// Main

		String opcaoLoopPrincipal = "MenuAtivo"; // O uso de String facilitou para controlar exce��es caso o usu�rio
													// digite uma informa��o inv�lida.
		while (opcaoLoopPrincipal != "0") {
			tela.telaMenuInicial();
			System.out.print("\nInforme a Op��o Desejada: ");
			opcaoLoopPrincipal = teclado.next();
			switch (opcaoLoopPrincipal) {
			case "0": // finalizando o Sistema/Loop
				System.out.println("Sistema Encerrado com Sucesso!");
				opcaoLoopPrincipal = "0";
				break;
			case "1": // Tela de Cadastro
				tela.telaMenuCadastrar();
				System.out.print("Informe a Op��o Desejada: ");
				String opcaoControleCadastro = teclado.next();
				int opcaoLoopCadastro = 1;
				switch (opcaoControleCadastro) {
				case "0": // Voltar Tela Anterior
					break;
				case "1": // Cadastrar Administrador
					while (opcaoLoopCadastro == 1) {
						tela.telaCadastrando("Administrador");
						Administrador adm = new Administrador("", "", "");
						teclado.nextLine();// Gambiarra(Sem isso o Java n�o reconhece Strings com espa�os
						System.out.print("\nInforme o Nome do Administrador: ");
						adm.setNome(teclado.nextLine());
						System.out.print("Informe o Endere�o do Administrador: ");
						adm.setEndereco(teclado.nextLine());
						System.out.print("Informe o Telefone do Administrador: ");
						adm.setTelefone(teclado.next());
						System.out.print("Informe o CPF do Administrador: ");
						adm.setCpf(teclado.next());
						System.out.print("Informe o C�digo do Setor: ");
						adm.setCodigoSetor(teclado.nextInt());
						System.out.print("Informe o Salario Base do Administrador: ");
						adm.setSalarioBase(teclado.nextDouble());
						System.out.print("Informe a Ajuda de Custo do Administrador: ");
						adm.setAjudaDeCusto(teclado.nextDouble());
						System.out.print(
								"Informe o Percentual de Desconto do Imposto do Administrador: (ex: 25%, informar 25) ");
						adm.setImposto(teclado.nextDouble());
						repAdministrador.inserirAdministrador(adm);
						System.out.print("\nCadastrar um Novo Administrador? (1 - SIM / 0 - N�O)");
						opcaoLoopCadastro = teclado.nextInt();
					}
					break;
				case "2": // Cadastrar Oper�rio
					while (opcaoLoopCadastro == 1) {
						tela.telaCadastrando("Oper�rio");
						Operario ope = new Operario("", "", "");
						teclado.nextLine();// Gambiarra(Sem isso o Java n�o reconhece Strings com espa�os
						System.out.print("\nInforme o Nome do Operario: ");
						ope.setNome(teclado.next());
						System.out.print("Informe o Endere�o do Operario: ");
						ope.setEndereco(teclado.next());
						System.out.print("Informe o Telefone do Operario: ");
						ope.setTelefone(teclado.next());
						System.out.print("Informe o CPF do Operario: ");
						ope.setCpf(teclado.next());
						System.out.print("Informe o Codigo do Setor: ");
						ope.setCodigoSetor(teclado.nextInt());
						System.out.print("Informe o Salario Base do Operario: ");
						ope.setSalarioBase(teclado.nextDouble());
						System.out.print("Informe o Valor de Producao do Operario: ");
						ope.setValorProducao(teclado.nextDouble());
						System.out.print(
								"Informe o Percentual de Desconto do Imposto do Operario: (ex: 25%, informar 25): ");
						ope.setImposto(teclado.nextDouble());
						repOperario.inserirOperario(ope);
						System.out.print("\nCadastrar um Novo Oper�rio? (1 - SIM / 0 - N�O)");
						opcaoLoopCadastro = teclado.nextInt();
					}
					break;
				case "3": // Cadastrar Vendedor
					while (opcaoLoopCadastro == 1) {
						tela.telaCadastrando("Vendedor");
						Vendedor ven = new Vendedor("", "", "");
						teclado.nextLine();// Gambiarra(Sem isso o Java n�o reconhece Strings com espa�os
						System.out.print("\nInforme o Nome do Vendedor: ");
						ven.setNome(teclado.next());
						System.out.print("Informe o Endere�o do Vendedor: ");
						ven.setEndereco(teclado.next());
						System.out.print("Informe o Telefone do Vendedor: ");
						ven.setTelefone(teclado.next());
						System.out.print("Informe o CPF do Vendedor: ");
						ven.setCpf(teclado.next());
						System.out.print("Informe o Codigo Setor: ");
						ven.setCodigoSetor(teclado.nextInt());
						System.out.print("Informe o Salario Base do Vendedor: ");
						ven.setSalarioBase(teclado.nextDouble());
						System.out.print("Informe o Valor de Vendas do Vendedor: ");
						ven.setValorVendas(teclado.nextDouble());
						System.out.print(
								"Informe o Percentual de Desconto do Imposto do Vendedor: (ex: 25%, informar 25): ");
						ven.setImposto(teclado.nextDouble());
						repVendedor.inserirVendedor(ven);
						System.out.print("\nCadastrar um Novo Vendedor? (1 - SIM / 0 - N�O)");
						opcaoLoopCadastro = teclado.nextInt();
					}
					break;
				case "4": // Cadastrar Fornecedor Jur�dico
					while (opcaoLoopCadastro == 1) {
						tela.telaCadastrando("Fornecedor Jur�dico");
						FornecedorJuridico jur = new FornecedorJuridico("", "", "");
						teclado.nextLine();// Gambiarra(Sem isso o Java n�o reconhece Strings com espa�os
						System.out.print("\nInforme o Nome do Fornecedor Jur�dico: ");
						jur.setNome(teclado.next());
						System.out.print("Informe o Endere�o do Fornecedor Jur�dico: ");
						jur.setEndereco(teclado.next());
						System.out.print("Informe o Telefone do Fornecedor Jur�dico: ");
						jur.setTelefone(teclado.next());
						System.out.print("Informe o CNPJ do Fornecedor Jur�dico: ");
						jur.setCnpj(teclado.next());
						System.out.print("Informe o Valor de Cr�dito do Fornecedor Jur�dico: ");
						jur.setValorCredito(teclado.nextDouble());
						System.out.print("Informe o Valor de D�vida do Fornecedor Jur�dico: ");
						jur.setValorDivida(teclado.nextDouble());
						repJuridico.inserirForJuridico(jur);
						System.out.print("\nCadastrar um Novo Fornecedor Jur�dico? (1 - SIM / 0 - N�O)");
						opcaoLoopCadastro = teclado.nextInt();
					}
					break;
				case "5": // Cadastrar Fornecedor F�sico
					while (opcaoLoopCadastro == 1) {
						tela.telaCadastrando("Fornecedor Fisico");
						FornecedorFisico fis = new FornecedorFisico("", "", "");
						teclado.nextLine();// Gambiarra(Sem isso o Java n�o reconhece Strings com espa�os
						System.out.print("\nInforme o Nome do Fornecedor Fisico: ");
						fis.setNome(teclado.next());
						System.out.print("Informe o Endere�o do Fornecedor Fisico: ");
						fis.setEndereco(teclado.next());
						System.out.print("Informe o Telefone do Fornecedor Fisico: ");
						fis.setTelefone(teclado.next());
						System.out.print("Informe o CPF do Fornecedor Fisico: ");
						fis.setCpf(teclado.next());
						System.out.print("Informe o Valor de Cr�dito do Fornecedor Fisico: ");
						fis.setValorCredito(teclado.nextDouble());
						System.out.print("Informe o Valor de D�vida do Fornecedor Fisico: ");
						fis.setValorDivida(teclado.nextDouble());
						repFisico.inserirForFisico(fis);
						System.out.print("\nCadastrar um Novo Fornecedor F�sico? (1 - SIM / 0 - N�O)");
						opcaoLoopCadastro = teclado.nextInt();
					}
					break;
				default:
					System.out.println("\nOp��o Inv�lida! Voltando ao Menu Principal.");
					break;
				}
				break;
			case "2": // Tela de Remo��o
				tela.telaMenuApagar();
				System.out.print("Informe uma Op��o: ");
				String opcaoControleApaga = teclado.next();
				int opcaoLoopApaga = 1;
				int opcaoParametroApaga = 0;
				switch (opcaoControleApaga) {
				case "0": // Voltando tela Anterior
					break;
				case "1": // Apagar Administrador
					while (opcaoLoopApaga == 1) {
						tela.telaApagandoEmpregado("Administrador");
						opcaoLoopApaga = teclado.nextInt();
						switch (opcaoLoopApaga) {
						case 1:// Procurar e Apagar pelo Nome.
							teclado.nextLine();// Gambiarra(Sem isso o Java n�o reconhece Strings com espa�os
							System.out.println("Informe o Nome do Administrador: ");
							String nome = teclado.nextLine();
							Administrador buscarNome = repAdministrador.procurarAdministrador(nome);
							if (buscarNome == null) {
								System.out.println("Nome N�o Encontrado!");
							} else {
								System.out.println(buscarNome.toString());
								System.out.println("\nDeseja Realmente apagar as informa��es? (1 - SIM / 0 - N�O)");
								opcaoParametroApaga = teclado.nextInt();
								if (opcaoParametroApaga == 1) {
									repAdministrador.removerAdministrador(nome);
									System.out.println("Dados Apagados com Sucesso!");
								} else if (opcaoParametroApaga == 0) {
									System.out.println("Dados N�o Apagados!");
								} else {
									System.out.println("\nOp��o Inv�lida! Favor Escolher uma Op��o conforme Menu: ");
								}
							}
							break;
						case 2:// Procurar e Apagar pelo C�digo Setor.
							System.out.println("Informe o C�digo do Setor: ");
							int codigoSetor = teclado.nextInt();
							Administrador buscarCodSetor = repAdministrador.procurarAdministradorSetor(codigoSetor);
							if (buscarCodSetor == null) {
								System.out.println("C�digo Setor N�o Encontrado!");
							} else {
								System.out.println(buscarCodSetor.toString());
								System.out.println("\nDeseja Realmente apagar as informa��es? (1 - SIM / 0 - N�O)");
								opcaoParametroApaga = teclado.nextInt();
								if (opcaoParametroApaga == 1) {
									repAdministrador.removerAdministradorSetor(codigoSetor);
									System.out.println("Dados Apagados com Sucesso!");
								} else if (opcaoParametroApaga == 0) {
									System.out.println("Dados N�o Apagados!");
								} else {
									System.out.println("\nOp��o Inv�lida! Favor Escolher uma Op��o conforme Menu: ");
								}
							}
							break;
						case 3:// Procurar e Apagar pelo CPF.
							System.out.println("Informe o CPF do Administrador: ");
							String cpf = teclado.next();
							Administrador buscarCpf = repAdministrador.procurarAdministradorCPF(cpf);
							if (buscarCpf == null) {
								System.out.println("CPF N�o Encontrado!");
							} else {
								System.out.println(buscarCpf.toString());
								System.out.println("\nDeseja Realmente apagar as informa��es? (1 - SIM / 0 - N�O)");
								opcaoParametroApaga = teclado.nextInt();
								if (opcaoParametroApaga == 1) {
									repAdministrador.removerAdministradorCPF(cpf);
									System.out.println("Dados Apagados com Sucesso!");
								} else if (opcaoParametroApaga == 0) {
									System.out.println("Dados N�o Apagados!");
								} else {
									System.out.println("\nOp��o Inv�lida! Favor Escolher uma Op��o conforme Menu: ");
								}
							}
							break;
						default:// Acessando CADASTRO - Op��o Inv�lida
							System.out.println("\nOp��o Inv�lida! Favor Escolher uma Op��o conforme Menu: ");
							break;
						}
						System.out.print("\nApagar outro Administrador? (1 - SIM / 0 - N�O)");
						opcaoLoopApaga = teclado.nextInt();
					}
					break;
				case "2": // Apagar Oper�rio
					while (opcaoLoopApaga == 1) {
						tela.telaApagandoEmpregado("Oper�rio");
						opcaoLoopApaga = teclado.nextInt();
						switch (opcaoLoopApaga) {
						case 1:// Procurar e Apagar pelo Nome.
							teclado.nextLine();// Gambiarra(Sem isso o Java n�o reconhece Strings com espa�os
							System.out.println("Informe o Nome do Oper�rio: ");
							String nome = teclado.nextLine();
							Operario buscarNome = repOperario.procurarOperario(nome);
							if (buscarNome == null) {
								System.out.println("Nome N�o Encontrado!");
							} else {
								System.out.println(buscarNome.toString());
								System.out.println("\nDeseja Realmente apagar as informa��es? (1 - SIM / 0 - N�O)");
								opcaoParametroApaga = teclado.nextInt();
								if (opcaoParametroApaga == 1) {
									repOperario.removerOperario(nome);
									System.out.println("Dados Apagados com Sucesso!");
								} else if (opcaoParametroApaga == 0) {
									System.out.println("Dados N�o Apagados!");
								} else {
									System.out.println("\nOp��o Inv�lida! Favor Escolher uma Op��o conforme Menu: ");
								}
							}
							break;
						case 2:// Procurar e Apagar pelo C�digo Setor.
							System.out.println("Informe o C�digo do Setor: ");
							int codigoSetor = teclado.nextInt();
							Operario buscarCodSetor = repOperario.procurarOperarioSetor(codigoSetor);
							if (buscarCodSetor == null) {
								System.out.println("C�digo Setor N�o Encontrado!");
							} else {
								System.out.println(buscarCodSetor.toString());
								System.out.println("\nDeseja Realmente apagar as informa��es? (1 - SIM / 0 - N�O)");
								opcaoParametroApaga = teclado.nextInt();
								if (opcaoParametroApaga == 1) {
									repOperario.removerOperarioSetor(codigoSetor);
									System.out.println("Dados Apagados com Sucesso!");
								} else if (opcaoParametroApaga == 0) {
									System.out.println("Dados N�o Apagados!");
								} else {
									System.out.println("\nOp��o Inv�lida! Favor Escolher uma Op��o conforme Menu: ");
								}
							}
							break;
						case 3:// Procurar e Apagar pelo CPF.
							System.out.println("Informe o CPF do Operario: ");
							String cpf = teclado.next();
							Operario buscarCpf = repOperario.procurarOperarioCPF(cpf);
							if (buscarCpf == null) {
								System.out.println("CPF N�o Encontrado!");
							} else {
								System.out.println(buscarCpf.toString());
								System.out.println("\nDeseja Realmente apagar as informa��es? (1 - SIM / 0 - N�O)");
								opcaoParametroApaga = teclado.nextInt();
								if (opcaoParametroApaga == 1) {
									repOperario.removerOperarioCPF(cpf);
									System.out.println("Dados Apagados com Sucesso!");
								} else if (opcaoParametroApaga == 0) {
									System.out.println("Dados N�o Apagados!");
								} else {
									System.out.println("\nOp��o Inv�lida! Favor Escolher uma Op��o conforme Menu: ");
								}
							}
							break;
						default:// Acessando CADASTRO - Op��o Inv�lida
							System.out.println("\nOp��o Inv�lida! Favor Escolher uma Op��o conforme Menu: ");
							break;
						}
						System.out.print("\nApagar outro Operario? (1 - SIM / 0 - N�O)");
						opcaoLoopApaga = teclado.nextInt();
					}
					break;
				case "3": // Apagar Vendedor
					while (opcaoLoopApaga == 1) {
						tela.telaApagandoEmpregado("Vendedor");
						opcaoLoopApaga = teclado.nextInt();
						switch (opcaoLoopApaga) {
						case 1:// Procurar e Apagar pelo Nome.
							teclado.nextLine();// Gambiarra(Sem isso o Java n�o reconhece Strings com espa�os
							System.out.println("Informe o Nome do Vendedor: ");
							String nome = teclado.nextLine();
							Vendedor buscarNome = repVendedor.procurarVendedor(nome);
							if (buscarNome == null) {
								System.out.println("Nome N�o Encontrado!");
							} else {
								System.out.println(buscarNome.toString());
								System.out.println("\nDeseja Realmente apagar as informa��es? (1 - SIM / 0 - N�O)");
								opcaoParametroApaga = teclado.nextInt();
								if (opcaoParametroApaga == 1) {
									repVendedor.removerVendedor(nome);
									System.out.println("Dados Apagados com Sucesso!");
								} else if (opcaoParametroApaga == 0) {
									System.out.println("Dados N�o Apagados!");
								} else {
									System.out.println("\nOp��o Inv�lida! Favor Escolher uma Op��o conforme Menu: ");
								}
							}
							break;
						case 2:// Procurar e Apagar pelo C�digo Setor.
							System.out.println("Informe o C�digo do Setor: ");
							int codigoSetor = teclado.nextInt();
							Vendedor buscarCodSetor = repVendedor.procurarVendedorSetor(codigoSetor);
							if (buscarCodSetor == null) {
								System.out.println("C�digo Setor N�o Encontrado!");
							} else {
								System.out.println(buscarCodSetor.toString());
								System.out.println("\nDeseja Realmente apagar as informa��es? (1 - SIM / 0 - N�O)");
								opcaoParametroApaga = teclado.nextInt();
								if (opcaoParametroApaga == 1) {
									repVendedor.removerVendedorSetor(codigoSetor);
									System.out.println("Dados Apagados com Sucesso!");
								} else if (opcaoParametroApaga == 0) {
									System.out.println("Dados N�o Apagados!");
								} else {
									System.out.println("\nOp��o Inv�lida! Favor Escolher uma Op��o conforme Menu: ");
								}
							}
							break;
						case 3:// Procurar e Apagar pelo CPF.
							System.out.println("Informe o CPF do Vendedor: ");
							String cpf = teclado.next();
							Vendedor buscarCpf = repVendedor.procurarVendedorCPF(cpf);
							if (buscarCpf == null) {
								System.out.println("CPF N�o Encontrado!");
							} else {
								System.out.println(buscarCpf.toString());
								System.out.println("\nDeseja Realmente apagar as informa��es? (1 - SIM / 0 - N�O)");
								opcaoParametroApaga = teclado.nextInt();
								if (opcaoParametroApaga == 1) {
									repVendedor.removerVendedorCPF(cpf);
									System.out.println("Dados Apagados com Sucesso!");
								} else if (opcaoParametroApaga == 0) {
									System.out.println("Dados N�o Apagados!");
								} else {
									System.out.println("\nOp��o Inv�lida! Favor Escolher uma Op��o conforme Menu: ");
								}
							}
							break;
						default:// Acessando CADASTRO - Op��o Inv�lida
							System.out.println("\nOp��o Inv�lida! Favor Escolher uma Op��o conforme Menu: ");
							break;
						}
						System.out.print("\nApagar outro Vendedor? (1 - SIM / 0 - N�O)");
						opcaoLoopApaga = teclado.nextInt();
					}
					break;
				case "4": // Apagar Fornecedor Jur�dico
					while (opcaoLoopApaga == 1) {
						tela.telaApagandoFornecedor("Fornecedor Jur�dico");
						System.out.println("                  1 - NOME        2 - CNPJ                    \n");
						opcaoParametroApaga = teclado.nextInt();
						switch (opcaoParametroApaga) {
						case 1:// Procurar e Apagar pelo Nome.
							teclado.nextLine();// Gambiarra(Sem isso o Java n�o reconhece Strings com espa�os
							System.out.println("Informe o Nome do Fornecedor Jur�dico: ");
							String nome = teclado.nextLine();
							FornecedorJuridico buscarNome = repJuridico.procurarForJuridico(nome);
							if (buscarNome == null) {
								System.out.println("Nome N�o Encontrado!");
							} else {
								System.out.println(buscarNome.toString());
								System.out.println("\nDeseja Realmente apagar as informa��es? (1 - SIM / 0 - N�O)");
								opcaoParametroApaga = teclado.nextInt();
								if (opcaoParametroApaga == 1) {
									repJuridico.removerForJuridico(nome);
									System.out.println("Dados Apagados com Sucesso!");
								} else if (opcaoParametroApaga == 0) {
									System.out.println("Dados N�o Apagados!");
								} else {
									System.out.println("\nOp��o Inv�lida! Favor Escolher uma Op��o conforme Menu: ");
								}
							}
							break;
						case 2:// Procurar e Apagar pelo CNPJ.
							System.out.println("Informe o CNPJ do Fornecedor Jur�dico: ");
							String cnpj = teclado.next();
							FornecedorJuridico buscarCnpj = repJuridico.procurarForJuridicoCNPJ(cnpj);
							if (buscarCnpj == null) {
								System.out.println("CNPJ N�o Encontrado!");
							} else {
								System.out.println(buscarCnpj.toString());
								System.out.println("\nDeseja Realmente apagar as informa��es? (1 - SIM / 0 - N�O)");
								opcaoParametroApaga = teclado.nextInt();
								if (opcaoParametroApaga == 1) {
									repJuridico.removerForJuridicoCNPJ(cnpj);
									System.out.println("Dados Apagados com Sucesso!");
								} else if (opcaoParametroApaga == 0) {
									System.out.println("Dados N�o Apagados!");
								} else {
									System.out.println("\nOp��o Inv�lida! Favor Escolher uma Op��o conforme Menu: ");
								}
							}
							break;
						default:// Acessando CADASTRO - Op��o Inv�lida
							System.out.println("\nOp��o Inv�lida! Favor Escolher uma Op��o conforme Menu: ");
							break;
						}
						System.out.print("\nApagar outro Fornecedor Jur�dico? (1 - SIM / 0 - N�O)");
						opcaoLoopApaga = teclado.nextInt();
					}
					break;
				case "5": // Apagar Fornecedor F�sico
					while (opcaoLoopApaga >= 1) {
						tela.telaApagandoFornecedor("Fornecedor F�sico");
						System.out.println("                  1 - NOME        2 - CPF                     \n");
						opcaoParametroApaga = teclado.nextInt();
						switch (opcaoParametroApaga) {
						case 1:// Procurar e Apagar pelo Nome.
							teclado.nextLine();// Gambiarra(Sem isso o Java n�o reconhece Strings com espa�os
							System.out.println("Informe o Nome do Fornecedor F�sico: ");
							String nome = teclado.nextLine();
							FornecedorFisico buscarNome = repFisico.procurarForFisico(nome);
							if (buscarNome == null) {
								System.out.println("Nome N�o Encontrado!");
							} else {
								System.out.println(buscarNome.toString());
								System.out.println("\nDeseja Realmente apagar as informa��es? (1 - SIM / 0 - N�O)");
								opcaoParametroApaga = teclado.nextInt();
								if (opcaoParametroApaga == 1) {
									repFisico.removerForFisico(nome);
									System.out.println("Dados Apagados com Sucesso!");
								} else if (opcaoParametroApaga == 0) {
									System.out.println("Dados N�o Apagados!");
								} else {
									System.out.println("\nOp��o Inv�lida! Favor Escolher uma Op��o conforme Menu: ");
								}
							}
							break;
						case 2:// Procurar e Apagar pelo CNPJ.
							System.out.println("Informe o CPF do Fornecedor F�sico: ");
							String cpf = teclado.next();
							FornecedorFisico buscarCpf = repFisico.procurarForFisicoCPF(cpf);
							if (buscarCpf == null) {
								System.out.println("CPF N�o Encontrado!");
							} else {
								System.out.println(buscarCpf.toString());
								System.out.println("\nDeseja Realmente apagar as informa��es? (1 - SIM / 0 - N�O)");
								opcaoParametroApaga = teclado.nextInt();
								if (opcaoParametroApaga == 1) {
									repFisico.removerForFisicoCPF(cpf);
									System.out.println("Dados Apagados com Sucesso!");
								} else if (opcaoParametroApaga == 0) {
									System.out.println("Dados N�o Apagados!");
								} else {
									System.out.println("\nOp��o Inv�lida! Favor Escolher uma Op��o conforme Menu: ");
								}
							}
							break;
						default:// Acessando CADASTRO - Op��o Inv�lida
							System.out.println("\nOp��o Inv�lida! Favor Escolher uma Op��o conforme Menu: ");
							break;
						}
						System.out.print("\nApagar outro Fornecedor Fisico? (1 - SIM / 0 - N�O)");
						opcaoLoopApaga = teclado.nextInt();
					}
					break;
				}
				break;
			case "3": // Tela de Updates
				tela.telaMenuModificar();
				System.out.print("Informe a Op��o Desejada: ");
				String opcaoControleModificar = teclado.next();
				int opcaoLoopModificar = 1;
				switch (opcaoControleModificar) {
				case "0": // Voltar Tela Anterior
					System.out.println("Tela Anterior...");
					break;
				case "1": // Modificar Administrador
					while (opcaoLoopModificar != 0) {
						tela.telaModificando("Administrador");
						System.out.print("Informe o Nome do Administrador: ");
						Administrador buscarNome = repAdministrador.procurarAdministrador(teclado.next());
						if (buscarNome == null) {
							System.out.println("Nome Administrador n�o encontrado!");
						} else {
							System.out.println(buscarNome.toString());
							tela.telaModificandoEmpregado();
							System.out.println("5 - C�D SETOR   6 - SALARIO BASE   7 - AJUDA CUSTO   8 - % IMPOSTO");
							System.out.print("Escolha a Op��o Desejada: ");
							String decisaoModificaAdministrador = teclado.next();
							switch (decisaoModificaAdministrador) {
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
					while (opcaoLoopModificar != 0) {
						tela.telaModificando("Oper�rio");
						System.out.print("Informe o Nome do Oper�rio: ");
						Operario buscarNome = repOperario.procurarOperario(teclado.next());
						if (buscarNome == null) {
							System.out.println("Nome Oper�rio n�o encontrado!");
						} else {
							System.out.println(buscarNome.toString());
							tela.telaModificandoEmpregado();
							System.out.println("5 - C�D SETOR  6 - SALARIO BASE  7 - VALOR PRODUCAO  8 - % IMPOSTO");
							System.out.print("Escolha a Op��o Desejada: ");
							String decisaoModificaOperario = teclado.next();
							switch (decisaoModificaOperario) {
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
					while (opcaoLoopModificar != 0) {
						tela.telaModificando("Vendedor");
						System.out.print("Informe o Nome do Vendedor: ");
						Vendedor buscarNome = repVendedor.procurarVendedor(teclado.next());
						if (buscarNome == null) {
							System.out.println("Nome Vendedor n�o encontrado!");
						} else {
							System.out.println(buscarNome.toString());
							tela.telaModificandoEmpregado();
							System.out.println("5 - C�D SETOR   6 - SALARIO BASE   7 - VALOR VENDAS   8 - % IMPOSTO");
							System.out.print("Escolha a Op��o Desejada: ");
							String decisaoModificaVendedor = teclado.next();
							switch (decisaoModificaVendedor) {
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
					while (opcaoLoopModificar != 0) {
						tela.telaModificando("Fornecedor Jur�dico");
						System.out.print("Informe o Nome do Fornecedor Jur�dico: ");
						FornecedorJuridico buscarNome = repJuridico.procurarForJuridico(teclado.next());
						if (buscarNome == null) {
							System.out.println("Nome Fornecedor Jur�dico n�o encontrado!");
						} else {
							System.out.println(buscarNome.toString());
							tela.telaModificandoFornecedor();
							System.out.println("          4 - CNPJ 5 - VALOR CREDITO   6 - VALOR DIVIDA          ");
							System.out.print("Escolha a Op��o Desejada: ");
							String decisaoModificaForJuridico = teclado.next();
							switch (decisaoModificaForJuridico) {
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
					while (opcaoLoopModificar != 0) {
						tela.telaModificando("Fornecedor F�sico");
						System.out.print("Informe o Nome do Fornecedor F�sico: ");
						FornecedorFisico buscarNome = repFisico.procurarForFisico(teclado.next());
						if (buscarNome == null) {
							System.out.println("Nome Fornecedor F�sico n�o encontrado!");
						} else {
							System.out.println(buscarNome.toString());
							tela.telaModificandoFornecedor();
							System.out.println("           4 - CPF  5 - VALOR CREDITO   6 - VALOR DIVIDA         ");
							System.out.print("Escolha a Op��o Desejada: ");
							String decisaoModificaForFisico = teclado.next();
							switch (decisaoModificaForFisico) {
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
				switch (opcaoControleListar) {
				case "0": // Voltar Tela Anterior
					System.out.println("Tela Anterior...");
					break;
				case "1": // Listar Administrador
					while (opcaoLoopListar != 0) {
						tela.telaListando("Administrador");
						// System.out.println(((RepAdministradorLista)
						// repAdministrador).listarAdministrador());
						repAdministrador.listarAdministrador();
						System.out.print("\nListar Novamente? [1 - SIM / 0 - N�O]: ");
						opcaoLoopListar = teclado.nextInt();
					}
					break;
				case "2": // Listar Oper�rio
					while (opcaoLoopListar != 0) {
						tela.telaListando("Oper�rio");
						System.out.println(((RepOperarioLista) repOperario).listarOperario());
						System.out.print("\nListar Novamente? [1 - SIM / 0 - N�O]: ");
						opcaoLoopListar = teclado.nextInt();
					}
					break;
				case "3": // Listar Vendedor
					while (opcaoLoopListar != 0) {
						tela.telaListando("Vendedor");
						System.out.println(((RepVendedorLista) repVendedor).listarVendedor());
						System.out.print("\nListar Novamente? [1 - SIM / 0 - N�O]: ");
						opcaoLoopListar = teclado.nextInt();
					}
					break;
				case "4": // Listar Fornecedor Jur�dico
					while (opcaoLoopListar != 0) {
						tela.telaListando("Fornecedor Jur�dico");
						System.out.println(((RepForJuridicoLista) repJuridico).listarForJuridico());
						System.out.print("\nListar Novamente? [1 - SIM / 0 - N�O]: ");
						opcaoLoopListar = teclado.nextInt();
					}
					break;
				case "5": // Listar Fornecedor F�sico
					while (opcaoLoopListar != 0) {
						tela.telaListando("Fornecedor F�sico");
						System.out.println(((RepForFisicoLista) repFisico).listarForFisico());
						System.out.print("\nListar Novamente? [1 - SIM / 0 - N�O]: ");
						opcaoLoopListar = teclado.nextInt();
					}
					break;
				case "6": // Listar Notas Fiscais
					while (opcaoLoopListar != 0) {
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
