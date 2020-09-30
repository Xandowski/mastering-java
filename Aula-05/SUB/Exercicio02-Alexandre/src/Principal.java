public class Principal {
  Cliente c1, c2;
  Loja l1;

  public void entrarDados() {
    c1 = new Cliente();
    l1 = new Loja();
    c1.setNome("Romario da Silva");
    l1.setNome("Mercadão");

    Endereco el1 = new Endereco();
    el1.setRua("Rua Ibate");
    el1.setBairro("Bairro Passaros");
    l1.setEndereco(el1);
    c1.setLoja(l1);

    Endereco ec1 = new Endereco();
    ec1.setRua("Rua Maringa");
    ec1.setBairro("Bairro Centro");
    c1.setEndereco(ec1);

    c2 = new Cliente();
    c2.setNome("Antonio Souza");

    Endereco ec2 = new Endereco();
    ec2.setRua("Rua Américo");
    ec2.setBairro("Bairro Recanto");
    c2.setEndereco(ec2);
    c2.setLoja(l1);
  }

  public void mostrarDados() {
    System.out.println("------CLIENTE01------");

    System.out.println("Nome    : " + c1.getNome());
    System.out.println("Endereço: " + c1.getEndereco().getRua() + ", " + c1.getEndereco().getBairro());
    System.out.println("Loja    : " + c1.getLoja().getNome());
    System.out.println("Endereço: " + c1.getLoja().getEndereco().getRua() + ", " + c1.getLoja().getEndereco().getBairro());

    System.out.println("------CLIENTE02------");

    System.out.println("Nome    : " + c2.getNome());
    System.out.println("Endereço: " + c2.getEndereco().getRua() + ", " + c2.getEndereco().getBairro());
    System.out.println("Loja    : " + c2.getLoja().getNome());
    System.out.println("Endereço: " + c2.getLoja().getEndereco().getRua() + ", " + c2.getLoja().getEndereco().getBairro());
  }
  public static void main(String[] args) {
    Principal programa = new Principal();

    programa.entrarDados();
    programa.mostrarDados();
  }
}
