package gestaoexterno;

import gestaointerno.Pessoa;

public class Fornecedor extends Pessoa{

	private double valorCredito;
	private double valorDivida;
	
	//Construtor Padrão - Herança Classe Pessoa
	public Fornecedor(String nome, String endereco, String telefone) {
		super(nome, endereco, telefone);
	}
	
	//Construtor Opcional 1
	public Fornecedor(String nome, String endereco, String telefone, double valorCredito, double valorDivida) {
		super(nome, endereco, telefone);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;;
	}
	
	//Get and Set
	public double getValorCredito() {
		return this.valorCredito;
	}
	
	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}
	
	public double getValorDivida() {
		return this.valorDivida;
	}
	
	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	
	//Método de retorno da Diferença entre Valor do Crédito e Valor da Dívida.
	public double obterSaldo() {
		return this.getValorCredito() - this.getValorDivida();
	}
}
