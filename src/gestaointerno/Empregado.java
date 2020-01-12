package gestaointerno;

public abstract class Empregado extends Pessoa{

	private int codigoSetor;
	private double salarioBase;
	private double imposto;
	//Auxiliar na Identificação dos Empregados (apesar de não explícito a criação no Tópico 5).
	private String cpf;
	
	//Construtor Padrão - Herança Classe Pessoa
	public Empregado(String nome, String endereco, String telefone) {
		super(nome, endereco, telefone);
	}
	
	//Construtor Opicional 1
	public Empregado(String nome, String endereco, String telefone, String cpf) {
		super(nome, endereco, telefone);
		this.cpf = cpf;
	}
	
	//Get and Set
	public int getCodigoSetor() {
		return this.codigoSetor;
	}
	
	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}
	
	public double getSalarioBase() {
		return this.salarioBase;
	}
	
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	public double getImposto() {
		return this.imposto;
	}
	
	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	//Método Abstrato CalcularSalario() - Cada Empregado possui uma maneira diferente de calcular o salário.
	public abstract double calcularSalario();
}
