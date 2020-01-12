package gestaointerno.profissoes;

import gestaointerno.Empregado;

public class Operario extends Empregado{

	private double valorProducao;
	//Constante (apesar de não solicitado) implementada a fim de aplicar os ensinamentos em sala de aula.
	private static  final double COMISSAO = 0.10;
	
	//Construtor Padrão - Herança Classe EmpregadoxPessoa
	public Operario(String nome, String endereco, String telefone){
		super(nome, endereco, telefone);
	}
	
	//Construtor Opicional 1
	public Operario(String nome, String endereco, String telefone, String cpf){
		super(nome, endereco, telefone, cpf);
	}
	
	//Get and Set
	public double getValorProducao() {
		return this.valorProducao;
	}
	
	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}

	public double getComissao() {
		return COMISSAO;
	}
	
	//Método (Abstrato) CalcularSalário() -> Valor do Salário + Comissão (% do valor de Produção) - Impostos(Representação única ex: INSS/FGTS/IRRF).
	public double calcularSalario() {
		double salarioOperario = getSalarioBase() - (getSalarioBase() * (getImposto() / 100)) + (this.getValorProducao() * this.getComissao());
		return salarioOperario;
	}
	
	@Override
	public String toString() {
		return " Nome: " + getNome() + " Endereço: " + getEndereco() + " Telefone: " + getTelefone() + " CPF: " + getCpf()
			 + " Código Setor: " + getCodigoSetor() + " Salário Base: " + getSalarioBase()
			 + " Valor Produção: " + this.getValorProducao() + " Imposto: " + getImposto() + "%"
			 + " Salário Líquido: R$ " + this.calcularSalario() ;
	}
}
