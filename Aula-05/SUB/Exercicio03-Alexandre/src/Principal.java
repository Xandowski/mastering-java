public class Principal {
  Internauta i1, i2, i3;
  Site s1, s2, s3;

  public void entrarDados() {
    i1 = new Internauta();
    i1.setNome("Carlos Antonio");

    Email e1 = new Email();
    e1.setUsuario("carlosantonio");
    e1.setProvedor("@gmail.com");
    i1.setEmail(e1);

    Endereco ed1 = new Endereco();
    ed1.setRua("Taubaté");
    ed1.setCidade("Américo Brasiliense");
    i1.setEndereco(ed1);

    s1 = new Site();
    s1.setUrl("https://www.carlosantonio.com/");
    i1.setSite(s1);

    i2 = new Internauta();
    i2.setNome("Arthur Cabral");

    Email e2 = new Email();
    e2.setUsuario("arthurcabral");
    e2.setProvedor("@gmail.com");
    i2.setEmail(e2);

    Endereco ed2 = new Endereco();
    ed2.setRua("Goiania");
    ed2.setCidade("Araraquara");
    i2.setEndereco(ed2);

    s2 = new Site();
    s2.setUrl("https://www.arthurcabral.com/");
    i2.setSite(s2);

    i3 = new Internauta();
    i3.setNome("Carla Silva");

    Email e3 = new Email();
    e3.setUsuario("carlasilva");
    e3.setProvedor("@gmail.com");
    i3.setEmail(e3);

    Endereco ed3 = new Endereco();
    ed3.setRua("Santafe");
    ed3.setCidade("Ibate");
    i3.setEndereco(ed3);

    s3 = new Site();
    s3.setUrl("https://www.carlasilva.com/");
    i3.setSite(s3);
  }

  public void mostrarDados() {
    System.out.println("------Internauta 01------");
    System.out.println("Nome    : " + i1.getNome());
    System.out.println("Email   : " + i1.getEmail().getUsuario() + i1.getEmail().getProvedor());
    System.out.println("Endereço: " + "rua " + i1.getEndereco().getRua() + ", cidade " + i1.getEndereco().getCidade());
    System.out.println("Site    : " + i1.getSite().getUrl());

    System.out.println("------Internauta 02------");
    System.out.println("Nome: " + i2.getNome());
    System.out.println("Email: " + i2.getEmail().getUsuario() + i2.getEmail().getProvedor());
    System.out.println("Endereço: " + "rua " + i2.getEndereco().getRua() + ", cidade " + i2.getEndereco().getCidade());
    System.out.println("Site    : " + i2.getSite().getUrl());

    System.out.println("------Internauta 03------");
    System.out.println("Nome: " + i3.getNome());
    System.out.println("Email: " + i3.getEmail().getUsuario() + i3.getEmail().getProvedor());
    System.out.println("Endereço: " + "rua " + i3.getEndereco().getRua() + ", cidade " + i3.getEndereco().getCidade());
    System.out.println("Site    : " + i3.getSite().getUrl());
  }

  public static void main(String[] args) {
    Principal programa = new Principal();

    programa.entrarDados();
    programa.mostrarDados();
  }
}