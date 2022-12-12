public class Juridica extends Pessoa {
  private int cnpj;

  public Juridica(int cnpj, String nome, String email) {
    super(nome, email);
    this.cnpj = cnpj;
  }

  public String toString() {
    return this.getNome() + " " + this.cnpj;
  }

  public int getCadastroDePessoa() {
    return cnpj;
  }

  public void setCadastroDePessoa(int cnpj) {
    this.cnpj = cnpj;
  }
}
