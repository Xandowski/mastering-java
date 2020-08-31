public class Aluno {
	private String nome;
	private String cidade;
	private long ra;
	private long enem;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public void setRa(long ra) {
		this.ra = ra;
	}
	
	public void setEnem(long enem) {
		this.enem = enem;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	public long getRa() {
		return ra;
	}
	
	public long getEnem() {
		return enem;
	}
}
