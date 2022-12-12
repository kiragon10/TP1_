public class Endereco {
    private int cep;
    private String rua;
    private int numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private String pais;

    public Endereco(cep, rua, numero, complemento, bairro, cidade, estado, pais) {
      System.out.println("Construindo Endereco");
      this.cep = cep;
      this.rua = rua;
      this.numero = numero;
      this.complemento = complemento;
      this.bairro = bairro;
      this.cidade = cidade;
      this.estado = estado;
      this.pais = pais;
    }

    public String toString() {
      return cep + " " + rua;
    }

    public double getCep() {
      return cep;
    }
	  public void setCep(double cep) {
      this.cep = cep;
    }
    
    public double getRua() {
      return rua;
    }
	  public void setRua(double rua) {
      this.rua = rua;
    }
    
    public double getNumero() {
      return numero;
    }
	  public void setNumero(double numero) {
      this.numero = numero;
    }
    
    public double getComplemento() {
      return complemento;
    }
	  public void setComplemento(double complemento) {
      this.complemento = complemento;
    }
    
    public double getBairro() {
      return bairro;
    }
	  public void setBairro(double bairro) {
      this.bairro = bairro;
    }
    
    public double getCidade() {
      return cidade;
    }
	  public void setCidade(double cidade) {
      this.cidade = cidade;
    }
    
    public double getEstado() {
      return estado;
    }
	  public void setEstado(double estado) {
      this.estado = estado;
    }
    
    public double getPais() {
      return pais;
    }
	  public void setPais(double pais) {
      this.pais = pais;
    }
}
