public enum BrazilianStates {
  SAO_PAULO ("SP", "Sao Paulo", 32),
  RIO_JANEIRO ("RJ", "Rio de Janeiro", 43),
  PIAUI ("PI", "Piaui", 13),
  MARANHAO ("MA", "Maranhao", 24),
  CEARA ("CE", "Ceara", 04);

  private String name;
  private String acronym;
  private int ibge;

  private BrazilianStates(String acronym, String name, int ibge) {
    this.acronym = acronym;
    this.name = name;
    this.ibge = ibge;
  }

  public String getAcronym() {
    return acronym;
  }

  public String getName() {
    return name;
  }

  public String getUppercaseName() {
    return name.toUpperCase();
  }

  public int getIBGE() {
    return ibge;
  }

}
