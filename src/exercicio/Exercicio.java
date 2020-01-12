package exercicio;

public class Exercicio {

	/*
	1. Cria uma Classe Pessoa, contendo os atributos encapsulados, com seus respectivos seletores (getters) e
	modificadores (setters), e ainda o construtor padrão e pelo menos mais duas opções de construtores conforme
	sua percepção. Atributos: String nome; String endereço; String telefone;
	
	2. Considere, como subclasse da classe Pessoa (desenvolvida no exercício anterior) a classe Fornecedor. Considere
	que cada instância da classe Fornecedor tem, para além dos atributos que caracterizam a classe Pessoa, os
	atributos valorCredito (correspondente ao crédito máximo atribuído ao fornecedor) e valorDivida (montante da
	dívida para com o fornecedor). Implemente na classe Fornecedor, para além dos usuais métodos seletores e
	modificadores, um método obterSaldo() que devolve a diferença entre os valores dos atributos valorCredito e
	valorDivida. Depois de implementada a classe Fornecedor, crie um programa de teste adequado que lhe permita
	verificar o funcionamento dos métodos implementados na classe Fornecedor e os herdados da classe Pessoa.
	
	3. Implemente, como subclasse da classe Fornecedor, a classe FornecedorJuridico. Um determinado
	FornecedorJuridico tem como atributos, para além dos atributos da classe Pessoa e da classe Fornecedor, o
	atributo CNPJ (String), tipoProdutos (podendo ser: produtos não perecíveis, bebidas, produtos de limpeza).
	Implemente a classe FornecedorJuridico com métodos seletores e modificadores e um método
	precoPorAtacado (calculo do preço unitario * quantidade de produtos) e o método EmitirNotaFiscal (Com
	informações dos produtos, valor por produtos, impostos, e valor total)
	
	4. Implemente, como subclasse da classe Fornecedor, a classe FornecedorFisico. Um determinado
	FornecedorFisico tem como atributos, para além dos atributos da classe Pessoa e da classe Fornecedor, o
	atributo CPF (numérico), horasTrabalhadas (double) e valorPorHora (double) sevicosDisponíveis (podendo ser:
	servicos de mão de obra). Implemente a classe FornecedorFisico com métodos seletores e modificadores e um
	método honorariosPorServico (calulados das horasTRabalhadas vezes valorPorHora)
	
	5. Considere, como subclasse da classe Pessoa, a classe Empregado. Considere que cada instância da classe
	Empregado tem, para além dos atributos que caracterizam a classe Pessoa, os atributos codigoSetor (inteiro),
	salarioBase (vencimento base) e imposto (porcentagem retida dos impostos). Implemente a classe Empregado
	com métodos seletores e modificadores e um método calcularSalario.
	
	6. Implemente a classe Administrador como subclasse da classe Empregado. Um determinado administrador tem
	como atributos, para além dos atributos da classe Pessoa e da classe Empregado, o atributo ajudaDeCusto (ajudas
	referentes a viagens, estadias, ...). Note que deverá redefinir na classe Administrador o método herdado
	calcularSalario (o salário de um administrador é equivalente ao salário de um empregado usual acrescido das ajuda
	de custo). Escreva um programa de teste adequado para esta classe.
	
	7. Implemente a classe Operario como subclasse da classe Empregado. Um determinado operário tem como
	atributos, para além dos atributos da classe Pessoa e da classe Empregado, o atributo valorProducao (que
	corresponde ao valor monetário dos artigos efetivamente produzidos pelo operário) e comissao (que corresponde
	à porcentagem do valorProducao que será adicionado ao vencimento base do operário). Note que deverá redefinir
	nesta subclasse o método herdado calcularSalario (o salário de um operário é equivalente ao salário de um
	empregado usual acrescido da referida comissão). Escreva um programa de teste adequado para esta classe.
	
	8. Implemente a classe Vendedor como subclasse da classe Empregado. Um determinado vendedor tem como
	atributos, para além dos atributos da classe Pessoa e da classe Empregado, o atributo valorVendas
	(correspondente ao valor monetário dos artigos vendidos) e o atributo comissao (porcentagem do valorVendas
	que será adicionado ao vencimento base do Vendedor). Note que deverá redefinir nesta subclasse o método
	herdado calcularSalario (o salário de um vendedor é equivalente ao salário de um empregado usual acrescido da
	referida comissão).
	
	9. Escreva um programa (Classe main) de teste adequado para estas classes que deve conter:
	
		a Menu com as opções para cadastrar, deletar, modificar e listar um empregado (administrador, operario
		ou Vendedor
		
		b Menu com as opções para cadastrar, deletar, modificar e listar um Fornecedor (Juridico e Fisico)
		
		c Deverá também ter um menu de procurar um empregado e um fornecedor (pelo nome ou código setor
		ou cpf ou cpnj e mostrar todas as informações do mesmo
		
		d As ações deverão ficar em loop até alguma instrução de saida ser solicitada
		
		e É necessário o uso de interfaces, classes abstratas e assuntos abordados em sala de aula
	*/
}
