public class Principal {
	Pessoa p1, p2, p3;
	
	public void entraDados() {
		p1 = new Pessoa();
		p1.setNome("Alexandre");
		p1.setIdade(25);
		
		Email e1 = new Email();
		e1.setUsuario("alexandre.morais");
		e1.setProvedor("@gmail.com");
		p1.setEmail(e1);
		
		p2 = new Pessoa();
		p2.setNome("João");
		p2.setIdade(20);
		
		Email e2 = new Email();
		e2.setUsuario("joão.gomes");
		e2.setProvedor("@gmail.com");
		p2.setEmail(e2);
		
		p3 = new Pessoa();
		p3.setNome("Maria");
		p3.setIdade(29);
		
		Email e3 = new Email();
		e3.setUsuario("maria");
		e3.setProvedor("@gmail.com");
		p3.setEmail(e3);
		
		
	}
	
	public void mostrarDados() {
		System.out.println("Nome: " + p1.getNome());
		System.out.println("Idade: " + p1.getIdade());
		System.out.println("Email: " + p1.getEmail().getUsuario() + p1.getEmail().getProvedor());
		
		System.out.println("Nome: " + p2.getNome());
		System.out.println("Idade: " + p2.getIdade());
		System.out.println("Email: " + p2.getEmail().getUsuario() + p2.getEmail().getProvedor());
		
		System.out.println("Nome: " + p3.getNome());
		System.out.println("Idade: " + p3.getIdade());
		System.out.println("Email: " + p3.getEmail().getUsuario() + p3.getEmail().getProvedor());
	}
	
	public static void main(String[] args) throws Exception {
		Principal programa = new Principal();
		
		programa.entraDados();
		programa.mostrarDados();

    }
}
