package gestaoexterno;

public class FornecedorFisico extends Fornecedor{

	private String cpf;
	private double horasTrabalhadas;
	private double valorPorHora;
	private String servicosDisponiveis;
	
	//Construtor Padrão - Herança Classe FornecedorxPessoa
	public FornecedorFisico(String nome, String endereco, String telefone) {
		super(nome, endereco, telefone);
	}
	
	//Construtor Opcional 1
	public FornecedorFisico(String nome, String endereco, String telefone, String cpf) {
		super(nome, endereco, telefone);
		this.cpf = cpf;
	}
	
	//Get and Set
	public String getCpf() {
		return this.cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public double getHorasTrabalhadas() {
		return this.horasTrabalhadas;
	}
	
	public void setHorasTrabalhadas(double horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}
	
	public double getValorPorHora() {
		return this.valorPorHora;
	}
	
	public void setValorPorHora(double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}
	
	public String getServicosDisponiveis() {
		return this.servicosDisponiveis;
	}
	
	public void setServicosDisponiveis(String servicosDisponiveis) {
		this.servicosDisponiveis = servicosDisponiveis;
	}
	
	//Método para Calcular o Valor Completo do Serviço (Multiplicar Quantidade de Horas Trabalhada x Valor da Hora).
	public double honorariosPorServico(){
		return this.getHorasTrabalhadas() * this.getValorPorHora();
	}
	
	@Override
	public String toString() {
		return "Nome: " + getNome() + " Endereco: " + getEndereco() + " Telefone: " + getTelefone() + " CPF: " + this.getCpf() + " Valor Crédito: " + getValorCredito() + " Valor Dívida: " + getValorDivida(); 
	}
}
