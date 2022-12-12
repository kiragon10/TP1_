public class Fisica extends Pessoa {
  private int cpf;

  public Fisica(int cpf, String nome, String email) {
    super(nome, email);
    this.cpf = cpf;
  }

  public String toString() {
    return this.getNome() + " " + this.cpf;
  }

  public int getCadastroDePessoa() {
    return cpf;
  }

  public void setCadastroDePessoa(int cpf) {
    this.cpf = cpf;
  }
}
