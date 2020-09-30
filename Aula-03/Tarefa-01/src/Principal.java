public class Principal {
	Professor p1, p2;
	Aluno a1, a2;
	
	public void entraDados() {
		p1 = new Professor();
		p1.setNome("Euclides Adamantio");
		p1.setCidade("Bauru");
		p1.setCtps(123456);
		p1.setSalario(3890);
		
		p2 = new Professor();
		p2.setNome("João da Silva");
		p2.setCidade("São Carlos");
		p2.setCtps(796513);
		p2.setSalario(4500);
		
		a1 = new Aluno();
		a1.setNome("Mariana Cardoso Mendes");
		a1.setCidade("Matão");
		a1.setRa(7654321);
		a1.setEnem(690);
		
		a2 = new Aluno();
		a2.setNome("Alexandre do Carmo Morais");
		a2.setCidade("Américo Brasiliense");
		a2.setRa(123456);
		a2.setEnem(700);
	}
	
	public void mostraDados() {
		System.out.println("------Professores------");
		System.out.println("Nome   : " + p1.getNome());
		System.out.println("Cidade : " + p1.getCidade());
		System.out.println("Ctps   : " + p1.getCtps());
		System.out.println("Salário: " + p1.getSalario());
		System.out.println("-----------------------");
		System.out.println("Nome   : " + p2.getNome());
		System.out.println("Cidade : " + p2.getCidade());
		System.out.println("Ctps   : " + p2.getCtps());
		System.out.println("Salário: " + p2.getSalario());
		
		System.out.println("------Alunos------");
		System.out.println("Nome   : " + a1.getNome());
		System.out.println("Cidade : " + a1.getCidade());
		System.out.println("Ra     : " + a1.getRa());
		System.out.println("Enem   : " + a1.getEnem());
		System.out.println("------------------");
		System.out.println("Nome   : " + a2.getNome());
		System.out.println("Cidade : " + a2.getCidade());
		System.out.println("Ra     : " + a2.getRa());
		System.out.println("Enem   : " + a2.getEnem());
	}
	
	public static void main (String args[]) {
        Principal programa = new Principal();

        programa.entraDados();

        programa.mostraDados();

	}
}
