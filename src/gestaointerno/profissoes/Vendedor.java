package gestaointerno.profissoes;

import gestaointerno.Empregado;

public class Vendedor extends Empregado{

	private double valorVendas;
	//Constante (apesar de não solicitado) implementada a fim de aplicar os ensinamentos em sala de aula.
	private static  final double COMISSAO = 0.08;
	
	//Construtor Padrão - Herança Classe EmpregadoxPessoa
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
	
	//Método (Abstrato) CalcularSalário() -> Valor do Salário + Comissão (% do valor de Vendas) - Impostos(Representação única ex: INSS/FGTS/IRRF).
	public double calcularSalario() {
		double salarioVendedor = getSalarioBase() - (getSalarioBase() * (getImposto() / 100)) + (this.getValorVendas() * this.getComissao());
		return salarioVendedor;
	}
	
	@Override
	public String toString() {
		return "Nome: " + getNome() + " Endereço: " + getEndereco() + " Telefone: " + getTelefone() + " CPF: " + getCpf()
		     + " Código Setor: " + getCodigoSetor() + " Salário Base: " + getSalarioBase()
		     + " Valor de Vendas: " + this.getValorVendas() + " Imposto: " + getImposto() + "%"
		     + " Salário Líquido: " + this.calcularSalario();
	}
}
