public abstract class Usuario implements Criptografia, Login, Compressao{
  private String username;
  private String password;

  // construtor padrão
  // public Usuario() {
  //   super();
  // }

  public Usuario(String username, String password) {
    super();
    this.username = username;
    this.password = password;
  }

  public abstract void validaSenha();

  public void setUsername(String username) {
    this.username = username;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getUsername() {
    return username;
  }

  public String getPassword() {
    return password;
  }
}
