package exercicio;

public class Exercicio {

	/*
	1. Cria uma Classe Pessoa, contendo os atributos encapsulados, com seus respectivos seletores (getters) e
	modificadores (setters), e ainda o construtor padr�o e pelo menos mais duas op��es de construtores conforme
	sua percep��o. Atributos: String nome; String endere�o; String telefone;
	
	2. Considere, como subclasse da classe Pessoa (desenvolvida no exerc�cio anterior) a classe Fornecedor. Considere
	que cada inst�ncia da classe Fornecedor tem, para al�m dos atributos que caracterizam a classe Pessoa, os
	atributos valorCredito (correspondente ao cr�dito m�ximo atribu�do ao fornecedor) e valorDivida (montante da
	d�vida para com o fornecedor). Implemente na classe Fornecedor, para al�m dos usuais m�todos seletores e
	modificadores, um m�todo obterSaldo() que devolve a diferen�a entre os valores dos atributos valorCredito e
	valorDivida. Depois de implementada a classe Fornecedor, crie um programa de teste adequado que lhe permita
	verificar o funcionamento dos m�todos implementados na classe Fornecedor e os herdados da classe Pessoa.
	
	3. Implemente, como subclasse da classe Fornecedor, a classe FornecedorJuridico. Um determinado
	FornecedorJuridico tem como atributos, para al�m dos atributos da classe Pessoa e da classe Fornecedor, o
	atributo CNPJ (String), tipoProdutos (podendo ser: produtos n�o perec�veis, bebidas, produtos de limpeza).
	Implemente a classe FornecedorJuridico com m�todos seletores e modificadores e um m�todo
	precoPorAtacado (calculo do pre�o unitario * quantidade de produtos) e o m�todo EmitirNotaFiscal (Com
	informa��es dos produtos, valor por produtos, impostos, e valor total)
	
	4. Implemente, como subclasse da classe Fornecedor, a classe FornecedorFisico. Um determinado
	FornecedorFisico tem como atributos, para al�m dos atributos da classe Pessoa e da classe Fornecedor, o
	atributo CPF (num�rico), horasTrabalhadas (double) e valorPorHora (double) sevicosDispon�veis (podendo ser:
	servicos de m�o de obra). Implemente a classe FornecedorFisico com m�todos seletores e modificadores e um
	m�todo honorariosPorServico (calulados das horasTRabalhadas vezes valorPorHora)
	
	5. Considere, como subclasse da classe Pessoa, a classe Empregado. Considere que cada inst�ncia da classe
	Empregado tem, para al�m dos atributos que caracterizam a classe Pessoa, os atributos codigoSetor (inteiro),
	salarioBase (vencimento base) e imposto (porcentagem retida dos impostos). Implemente a classe Empregado
	com m�todos seletores e modificadores e um m�todo calcularSalario.
	
	6. Implemente a classe Administrador como subclasse da classe Empregado. Um determinado administrador tem
	como atributos, para al�m dos atributos da classe Pessoa e da classe Empregado, o atributo ajudaDeCusto (ajudas
	referentes a viagens, estadias, ...). Note que dever� redefinir na classe Administrador o m�todo herdado
	calcularSalario (o sal�rio de um administrador � equivalente ao sal�rio de um empregado usual acrescido das ajuda
	de custo). Escreva um programa de teste adequado para esta classe.
	
	7. Implemente a classe Operario como subclasse da classe Empregado. Um determinado oper�rio tem como
	atributos, para al�m dos atributos da classe Pessoa e da classe Empregado, o atributo valorProducao (que
	corresponde ao valor monet�rio dos artigos efetivamente produzidos pelo oper�rio) e comissao (que corresponde
	� porcentagem do valorProducao que ser� adicionado ao vencimento base do oper�rio). Note que dever� redefinir
	nesta subclasse o m�todo herdado calcularSalario (o sal�rio de um oper�rio � equivalente ao sal�rio de um
	empregado usual acrescido da referida comiss�o). Escreva um programa de teste adequado para esta classe.
	
	8. Implemente a classe Vendedor como subclasse da classe Empregado. Um determinado vendedor tem como
	atributos, para al�m dos atributos da classe Pessoa e da classe Empregado, o atributo valorVendas
	(correspondente ao valor monet�rio dos artigos vendidos) e o atributo comissao (porcentagem do valorVendas
	que ser� adicionado ao vencimento base do Vendedor). Note que dever� redefinir nesta subclasse o m�todo
	herdado calcularSalario (o sal�rio de um vendedor � equivalente ao sal�rio de um empregado usual acrescido da
	referida comiss�o).
	
	9. Escreva um programa (Classe main) de teste adequado para estas classes que deve conter:
	
		a Menu com as op��es para cadastrar, deletar, modificar e listar um empregado (administrador, operario
		ou Vendedor
		
		b Menu com as op��es para cadastrar, deletar, modificar e listar um Fornecedor (Juridico e Fisico)
		
		c Dever� tamb�m ter um menu de procurar um empregado e um fornecedor (pelo nome ou c�digo setor
		ou cpf ou cpnj e mostrar todas as informa��es do mesmo
		
		d As a��es dever�o ficar em loop at� alguma instru��o de saida ser solicitada
		
		e � necess�rio o uso de interfaces, classes abstratas e assuntos abordados em sala de aula
	*/
}
