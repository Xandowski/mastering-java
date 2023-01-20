public class Principal {
  Proprietario p1, p2;
  Carro c1;

  public void entrarDados() {
    p1 = new Proprietario();
    p1.setNome("João Carlos");

    Endereco e1 = new Endereco();
    e1.setRua("Rua 9 de julho");
    p1.setEndereco(e1);

    p2 = new Proprietario();
    p2.setNome("João Carlos");

    Endereco e2 = new Endereco();
    e2.setRua("Rua maringa");
    p2.setEndereco(e2);

    c1 = new Carro();
    c1.setPlaca("ABC-0101");
    c1.setProprietario(p1);
  }

  public void mostrarDados() {
    System.out.println("Nome: " + p1.getNome());
    System.out.println("Placa do carro: " + c1.getPlaca());
    System.out.println("Endereco: " + p1.getEndereco().getRua());
  }

  public static void main (String args[]) {
    Principal programa = new Principal();
    
    programa.entrarDados();
    programa.mostrarDados();
	}
}
