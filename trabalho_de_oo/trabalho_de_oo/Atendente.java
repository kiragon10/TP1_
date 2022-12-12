public abstract class Atendente {
  private String identificador;

  public Atendente(String identificador) {
    System.out.println("Construindo Atendente");
    this.identificador = identificador;
  }

  public String toString() {
    return identificador;
  }

  public String getIdentificador() {
    return identificador;
  }

  public void setIdentificador(String identificador) {
    this.identificador = identificador;
  }
}
