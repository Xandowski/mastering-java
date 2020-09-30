public class Aluno {
	private long ra;
	private double saldo;
	private Email email;
	
	public void setRa(long ra) {
		this.ra = ra;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void setEmail(Email email) {
		this.email = email;
	}
	
	public long getRa() {
		return ra;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public Email getEmail() {
		return email;
	}
}
