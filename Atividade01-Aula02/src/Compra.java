public class Compra {
	private long numero;
	private String data;
	private double total;
	
	public void setNumero(long num) {
		this.numero = num;
	}
	
	public void setData(String data) {
		this.data = data;
	}
	
	public void setTotal(double total) {
		this.total = total;
	}
	
	public long getNumero() {
		return numero;
	}
	
	public String getData() {
		return data;
	}
	
	public double getTotal() {
		return total;
	}
}