public class Veiculo {
	private long id;
	private String localizacao;
	private int tiros;
	
	public void setId(long id) {
		this.id = id;
	}
	
	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	
	public void setTiros(int tiros) {
		this.tiros = tiros;
	}
	
	public long getId() {
		return id;
	}
	
	public String getLocalizacao() {
		return localizacao;
	}
	
	public int getTiros() {
		return tiros;
	}
}
