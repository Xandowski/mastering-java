public class Produto {
	private String nome;
	private double preco;
	private long estoque;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void setEstoque(long estoque) {
		this.estoque = estoque;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public long getEstoque() {
		return estoque;
	}
}
