public class User {
  private String name;
  private String cpf;
  private String adress;

  public User (String cpf, String name) {
    this.cpf = cpf;
    this.name = name;
  }


  public String getName() {
    return this.name;
  }

  public String getCpf() {
    return this.cpf;
  }

  public String getAdress() {
    return this.adress;
  }

  public void setAdress(String adress) {
    this.adress = adress;
  }

}
