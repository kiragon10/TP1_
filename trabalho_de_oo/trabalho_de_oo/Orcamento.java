

public class Orcamento {
  private String nome;
  private String tipo;
  private double receita;
  private double despesa;
  private double valorTotal;
  //private final List<Item> items;

  public Orcamento(String nome, String tipo, double receita, double despesa) {
    System.out.println("Construindo Orcamento");
    this.nome = nome;
    this.tipo = tipo;
    this.receita = receita;
    this.despesa = despesa;
    this.valorTotal = 0;
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

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public double getReceita() {
    return receita;
  }

  public void setReceita(double receita) {
    this.receita = receita;
  }

  public double getDespesa() {
    return despesa;
  }

  public void setDespesa(double despesa) {
    this.despesa = despesa;
  }

  public double calculaValorTotal() {
    double valorTotal = 0;
    System.out.println("Calculando valor total");
    return valorTotal;
  }
}
