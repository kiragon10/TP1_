// TODO importar os arquivos aqui

public abstract class Pessoa {

  private String nome;
  private String email;
  // private Endereco endereco;
  // private Telefone telefone;

  public Pessoa(String nome, String email) {
    this.nome = nome;
    this.email = email;
  }

  public void checarEmail() {
    System.out.println("Checando email");
  }

  public String toString() {
    return nome + " " + email;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}
