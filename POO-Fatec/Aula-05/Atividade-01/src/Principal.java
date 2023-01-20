public class Principal {
  Professor p1, p2;
  Aluno a1, a2;

  public void entraDados() {
    p1 = new Professor();
    p1.setNome("Carlos Silva");
    p1.setTitulacao("Doutor");

    p2 = new Professor();
    p2.setNome("João Souza");
    p2.setTitulacao("Mestre");

    a1 = new Aluno();
    a1.setNome("Alexandre Morais");
    a1.setCiclo(4);
    a1.setProfessor(p1);

    a2 = new Aluno();
    a2.setNome("Carla Cristina");
    a2.setCiclo(5);
    a2.setProfessor(p2);
  }

  public void mostrarDados() {
    System.out.println("-----PROFESSORES-----");
    System.out.println("Nome: " + p1.getNome());
    System.out.println("Titulação: " + p1.getTitulacao());

    System.out.println("Nome: " + p2.getNome());
    System.out.println("Titulação: " + p2.getTitulacao());
    
    System.out.println("-------ALUNOS-------");
    System.out.println("Nome: " + a1.getNome());
    System.out.println("Ciclo: " + a1.getCiclo());
    System.out.println("Professor: " + a1.getProfessor().getNome());
    System.out.println("Prof. Titulação: " + a1.getProfessor().getTitulacao());

    System.out.println("Nome: " + a2.getNome());
    System.out.println("Ciclo: " + a2.getCiclo());
    System.out.println("Professor: " + a2.getProfessor().getNome());
    System.out.println("Prof. Titulação: " + a2.getProfessor().getTitulacao());
  }

  public static void main(String[] args) {
		Principal programa = new Principal();
		
		programa.entraDados();
		programa.mostrarDados();    
  }
}