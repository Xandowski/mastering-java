public class Aereo extends Transporte {
	private String prefixo;
	private int motores;
	
	public void setPrefixo(String prefixo) {
		this.prefixo = prefixo;
	}
	
	public void setMotores(int motores) {
		this.motores = motores;
	}
	
	public String getPrefixo() {
		return prefixo;
	}
	
	public int getMotores() {
		return motores;
	}
}
