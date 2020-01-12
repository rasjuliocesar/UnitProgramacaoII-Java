package gestaointerno.profissoes;

import gestaointerno.Empregado;

public class Vendedor extends Empregado{

	private double valorVendas;
	//Constante (apesar de n�o solicitado) implementada a fim de aplicar os ensinamentos em sala de aula.
	private static  final double COMISSAO = 0.08;
	
	//Construtor Padr�o - Heran�a Classe EmpregadoxPessoa
	public Vendedor(String nome, String endereco, String telefone) {
		super(nome, endereco, telefone);
	}
	
	//Construtor Opicional 1
	public Vendedor(String nome, String endereco, String telefone, String cpf) {
		super(nome, endereco, telefone, cpf);
	}
	
	//Get and Set
	public double getValorVendas() {
		return this.valorVendas;
	}
	
	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}
	
	public double getComissao() {
		return COMISSAO;
	}
	
	//M�todo (Abstrato) CalcularSal�rio() -> Valor do Sal�rio + Comiss�o (% do valor de Vendas) - Impostos(Representa��o �nica ex: INSS/FGTS/IRRF).
	public double calcularSalario() {
		double salarioVendedor = getSalarioBase() - (getSalarioBase() * (getImposto() / 100)) + (this.getValorVendas() * this.getComissao());
		return salarioVendedor;
	}
	
	@Override
	public String toString() {
		return "Nome: " + getNome() + " Endere�o: " + getEndereco() + " Telefone: " + getTelefone() + " CPF: " + getCpf()
		     + " C�digo Setor: " + getCodigoSetor() + " Sal�rio Base: " + getSalarioBase()
		     + " Valor de Vendas: " + this.getValorVendas() + " Imposto: " + getImposto() + "%"
		     + " Sal�rio L�quido: " + this.calcularSalario();
	}
}
