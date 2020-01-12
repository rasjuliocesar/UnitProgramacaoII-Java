package gestaointerno.profissoes;

import gestaointerno.Empregado;

public class Operario extends Empregado{

	private double valorProducao;
	//Constante (apesar de n�o solicitado) implementada a fim de aplicar os ensinamentos em sala de aula.
	private static  final double COMISSAO = 0.10;
	
	//Construtor Padr�o - Heran�a Classe EmpregadoxPessoa
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
	
	//M�todo (Abstrato) CalcularSal�rio() -> Valor do Sal�rio + Comiss�o (% do valor de Produ��o) - Impostos(Representa��o �nica ex: INSS/FGTS/IRRF).
	public double calcularSalario() {
		double salarioOperario = getSalarioBase() - (getSalarioBase() * (getImposto() / 100)) + (this.getValorProducao() * this.getComissao());
		return salarioOperario;
	}
	
	@Override
	public String toString() {
		return " Nome: " + getNome() + " Endere�o: " + getEndereco() + " Telefone: " + getTelefone() + " CPF: " + getCpf()
			 + " C�digo Setor: " + getCodigoSetor() + " Sal�rio Base: " + getSalarioBase()
			 + " Valor Produ��o: " + this.getValorProducao() + " Imposto: " + getImposto() + "%"
			 + " Sal�rio L�quido: R$ " + this.calcularSalario() ;
	}
}
