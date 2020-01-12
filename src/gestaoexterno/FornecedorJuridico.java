package gestaoexterno;

public class FornecedorJuridico extends Fornecedor{

	private String cnpj;
	private String tipoProdutos;
	private double precoUnitario;
	private int quantidadeProduto;
	private double impostos;
	
	//Construtor Padrão - Herança Classe FornecedorxPessoa
	public FornecedorJuridico(String nome, String endereco, String telefone) {
		super(nome, endereco, telefone);
	}
	
	//Construtor Opcional 1
	public FornecedorJuridico(String nome, String endereco, String telefone, String cnpj) {
		super(nome, endereco, telefone);
		this.cnpj = cnpj;
	}
	
	//Get and Set
	public String getCnpj() {
		return this.cnpj;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getTipoProdutos() {
		return this.tipoProdutos;
	}
	
	public void setTipoProdutos(String tipoProdutos) {
		this.tipoProdutos = tipoProdutos;
	}
	
	public double getPrecoUnitario() {
		return this.precoUnitario;
	}
	
	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}
	
	public int getQuantidadeProduto() {
		return this.quantidadeProduto;
	}
	
	public void setQuantidadeProduto(int quantidadeProduto) {
		this.quantidadeProduto = quantidadeProduto;
	}
	
	public double getImpostos() {
		return this.impostos;
	}
	
	public void setImpostos(double impostos) {
		this.impostos = impostos;
	}
	
	//Método para Calcular o Valor por Atacado (Valor Total) de um determinado Produto (Preço Unitário x Quantidade de Produtos).
	public double precoPorAtacado() {
		return this.getPrecoUnitario() * this.getQuantidadeProduto();
	}
	
	//Método Emissão de Nota Fiscal.
	public void emitirNotaFiscal() {
		double valorTotal = precoPorAtacado();
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=- N O T A   F I S C A L -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println("Nome: " + this.getNome() + " CNPJ: " + this.getCnpj());
		System.out.println("___________________________________________________________________________________");
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-= PRODUTO(S) RELACIONADOS =-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println("       Tipo       |   R$ Unitário   |  Quantidade  |  % Impostos |   Valor Total   ");
		System.out.println(this.getTipoProdutos() + " |  " + this.getPrecoUnitario() + " |  " + this.getQuantidadeProduto() + " |  " + this.getImpostos() + " |  " + valorTotal);
	}
	
	@Override
	public String toString() {
		return "Nome: " +  getNome() + " Endereço: " + getEndereco() + " Telefone: " + getTelefone() + " CNPJ: " + this.getCnpj() + " Valor Crédito: " + getValorCredito() + " Valor Dívida: " + getValorDivida();
	}
}
