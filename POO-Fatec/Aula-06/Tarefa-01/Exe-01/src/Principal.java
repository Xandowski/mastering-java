public class Principal {
  Disciplina d1, d2;
  Pratica p1;
  Teorica t1;

  public void entrarDados() {
    d1 = new Disciplina();
    d1.setNome("Matematica");
    d2 = new Disciplina();
    d2.setNome("Portugues");
    Disciplina[] lista = new Disciplina[2];
    lista[0] = d1;
    lista[1] = d2;

    p1 = new Pratica();
    p1.setNome("Calculos matematicos");
    p1.setDisciplina(lista);
  }

  public void mostrarDados() {
    System.out.println("-----Disciplinas-----");
    System.out.println("Nome: " + d1.getNome());
    System.out.println("-----Práticas-----");
    System.out.println("Disciplina: " + p1.getNome());
    System.out.println(p1.getDisciplina()[0].getNome());

  }
	public static void main (String args[]) {
    Principal programa = new Principal();
    
    programa.entrarDados();
    programa.mostrarDados();
	}
}