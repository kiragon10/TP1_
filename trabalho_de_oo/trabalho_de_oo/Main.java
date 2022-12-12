
public class Main {
  public static void main(String[] args) {
    // Criando pessoa fisica
    Pessoa pessoaFisica = new Fisica(12345, "Jorge W. Junior", "jorge@hotmail.com");
    System.out.println(pessoaFisica);
    // Criando pessoa juridica
    Pessoa pessoaJuridica = new Juridica(1234567, "Jorge W. Juridico", "jorgejuju@hotmail.com");
    System.out.println(pessoaJuridica);

    Orcamento orcamento = new Orcamento("nome do o", "tipo do o", 10, 20.5);
    System.out.println(orcamento);

  }
}
