public class Produto {
	private long codigo;
	private String nome;
	private double preco;
	private int estoque;
	private boolean status;
	
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public long getCodigo() {
		return codigo;
	}
	public String getNome() {
		return nome;
	}
	public double getPreco() {
		return preco;
	}
	public int getEstoque() {
		return estoque;
	}
	public boolean getStatus() {
		return status;
	}
}
