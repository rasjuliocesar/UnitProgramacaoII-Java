package teste;

import java.util.Scanner;

import gestaoexterno.FornecedorFisico;
import gestaoexterno.FornecedorJuridico;

public class TesteTresQuatro {

	Scanner tc = new Scanner(System.in);
	
	public static void main(String[] args) {
	/*
	 * Teste ref. tópicos 3 e 4.
	 */
	
	FornecedorFisico fis = new FornecedorFisico("Seu Lunga da Impressora", "Fazenda de Serra Talhada", "(87) 98989-8787");
	FornecedorJuridico jur = new FornecedorJuridico("Autopeças ME", "Imbiribeira 101D", "(81) 3333-0000");
	
	fis.setCpf(00011122234);
	fis.setHorasTrabalhadas(120);
	fis.setValorPorHora(18.75);
	
	System.out.println(fis);
	System.out.println("Valor Serviço: R$" + fis.honorariosPorServico());
	
	jur.setCnpj("12.345.678/0009-10");
	jur.setImpostos(12.00);
	jur.setQuantidadeProduto(10);
	jur.setPrecoUnitario(5.38);
	jur.setTipoProdutos("Bolsa");
	
	System.out.println("Preço Atacado: " + jur.precoPorAtacado());
	
	jur.emitirNotaFiscal();
	
	}
	
}
