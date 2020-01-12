package gestaointerno.profissoes;

import gestaointerno.Empregado;

public class Administrador extends Empregado{

	private double ajudaDeCusto;
	
	
	//Construtor Padr�o - Heran�a Classe EmpregadoxPessoa
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
	
	//M�todo (Abstrato) CalcularSal�rio() -> Valor do Sal�rio + Ajuda de Custo - Impostos(Representa��o �nica ex: INSS/FGTS/IRRF).
	public double calcularSalario() {
		double salarioAdministrador = getSalarioBase() - (getSalarioBase() * (getImposto() / 100)) + this.getAjudaDeCusto();
		return salarioAdministrador;
	}
	
	@Override
	public String toString() {
		return "Nome: " + getNome() + " Endere�o: " + getEndereco() + " Telefone: " + getTelefone() + " CPF: " + getCpf()
		+ " C�digo Setor: " + getCodigoSetor() + " Sal�rio Base: " + getSalarioBase()
		+ " Ajuda de Custo: " + this.getAjudaDeCusto() + " Imposto: " + getImposto() + "% "
		+ " Sal�rio L�quido: R$ " + this.calcularSalario();
	}
}
