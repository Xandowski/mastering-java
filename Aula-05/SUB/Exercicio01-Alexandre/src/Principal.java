public class Principal {
  Aluno a1, a2, a3;
  Curso c1, c2;

  public void entrarDados() {
    a1 = new Aluno();
    c1 = new Curso();
    a1.setNome("Carlos Andrade");
    c1.setNome("Filosofia");
    c1.setValor(250.00);
    a1.setCurso(c1);

    Email e1;
    e1 = new Email();
    e1.setUsuario("candrade");
    e1.setProvedor("@bol.com.br");
    a1.setEmail(e1);

    a2 = new Aluno();
    a2.setNome("Marcia Silas");
    a2.setCurso(c1);

    Email e2;
    e2 = new Email();
    e2.setUsuario("msilas");
    e2.setProvedor("@gmail.com");
    a2.setEmail(e2);

    a3 = new Aluno();
    c2 = new Curso();
    a3.setNome("Andre Mendes");
    c2.setNome("Sociologia");
    c2.setValor(300.00);
    a3.setCurso(c2);

    Email e3;
    e3 = new Email();
    e3.setUsuario("adrm");
    e3.setProvedor("@hotmail.com");
    a3.setEmail(e3);
  }

  public void mostrarDados() {
    System.out.println("------Aluno 01------");
    System.out.println("Nome : " + a1.getNome());
    System.out.println("Curso: " + a1.getCurso().getNome());
    System.out.println("Valor: " + a1.getCurso().getValor());
    System.out.println("Email: " + a1.getEmail().getUsuario() + a1.getEmail().getProvedor());

    System.out.println("------Aluno 03------");
    System.out.println("Nome : " + a2.getNome());
    System.out.println("Curso: " + a2.getCurso().getNome());
    System.out.println("Valor: " + a2.getCurso().getValor());
    System.out.println("Email: " + a2.getEmail().getUsuario() + a2.getEmail().getProvedor());

    System.out.println("------Aluno 03------");
    System.out.println("Nome : " + a3.getNome());
    System.out.println("Curso: " + a3.getCurso().getNome());
    System.out.println("Valor: " + a3.getCurso().getValor());
    System.out.println("Email: " + a3.getEmail().getUsuario() + a3.getEmail().getProvedor());
  }
  public static void main(String[] args) {
    Principal programa = new Principal();

    programa.entrarDados();
    programa.mostrarDados();
  }
}
