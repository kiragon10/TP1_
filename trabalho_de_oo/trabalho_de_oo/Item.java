public abstract class Item {
  private String nome;
  private int quantidade;
  private double valor;

  public Item(String nome, int quantidade, double valor) {
    System.out.println("Construindo Item");
    this.nome = nome;
    this.quantidade = quantidade;
    this.valor = valor;
  }

  public String toString() {
    return nome;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getQuantidade() {
    return quantidade;
  }

  public void setQuantidade(int quantidade) {
    this.quantidade = quantidade;
  }

  public double getValor() {
    return valor;
  }

  public void setValor(double valor) {
    this.valor = valor;
  }
}
