public class Cliente {
  private String identificador;
  private Pessoa pessoa;

  public Cliente(String identificador, boolean pessoaFisica, String nome, String email, int numeroCadastroDePessoa) {
    this.identificador = identificador;
    if (pessoaFisica) {
      this.pessoa = new Fisica(numeroCadastroDePessoa, nome, email);
    } else {
      this.pessoa = new Juridica(numeroCadastroDePessoa, nome, email);
    }
  }

  public String toString() {
    return pessoa.getNome();
  }

  public String getIdentificador() {
    return identificador;
  }

  public void setIdentificador(String identificador) {
    this.identificador = identificador;
  }
}
