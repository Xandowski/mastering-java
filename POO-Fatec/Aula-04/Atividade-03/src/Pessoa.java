public class Pessoa {
	private String nome;
	private int idade;
	private Email email;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void setEmail(Email email) {
		this.email = email;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public Email getEmail() {
		return email;
	}
}
