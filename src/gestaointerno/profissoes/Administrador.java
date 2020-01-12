package gestaointerno.profissoes;

import gestaointerno.Empregado;

public class Administrador extends Empregado{

	private double ajudaDeCusto;
	
	
	//Construtor Padrão - Herança Classe EmpregadoxPessoa
	public Administrador(String nome, String endereco, String telefone) {
		super(nome, endereco, telefone);
	}
	
	//Construtor Opicional 1
	public Administrador(String nome, String endereco, String telefone, String cpf) {
		super(nome, endereco, telefone, cpf);
	}
	
	//Get adn Set
	public double getAjudaDeCusto() {
		return this.ajudaDeCusto;
	}
	
	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
	//Método (Abstrato) CalcularSalário() -> Valor do Salário + Ajuda de Custo - Impostos(Representação única ex: INSS/FGTS/IRRF).
	public double calcularSalario() {
		double salarioAdministrador = getSalarioBase() - (getSalarioBase() * (getImposto() / 100)) + this.getAjudaDeCusto();
		return salarioAdministrador;
	}
	
	@Override
	public String toString() {
		return "Nome: " + getNome() + " Endereço: " + getEndereco() + " Telefone: " + getTelefone() + " CPF: " + getCpf()
		+ " Código Setor: " + getCodigoSetor() + " Salário Base: " + getSalarioBase()
		+ " Ajuda de Custo: " + this.getAjudaDeCusto() + " Imposto: " + getImposto() + "% "
		+ " Salário Líquido: R$ " + this.calcularSalario();
	}
}
