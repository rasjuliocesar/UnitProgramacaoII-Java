package gestaointerno;

public class Pessoa {

	private String nome;
	private String endereco;
	private String telefone;
	
	//Construtor Padr�o
	public Pessoa(String nome, String endereco, String telefone) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	
	//Construtor Opcional 1
	public Pessoa(String nome, String endereco) {
		this.nome = nome;
		this.endereco = endereco;
	}
	
	//Get and Set
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEndereco() {
		return this.endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getTelefone() {
		return this.telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	//M�todo para Representa��o String do Objeto (print Objeto no lugar do endere�o de mem�ria).
	public String toString() {
		return "Nome: " + this.getNome() + " Endere�o: " + this.getEndereco() +" Telefone: " + this.getTelefone();
	}
	
}
