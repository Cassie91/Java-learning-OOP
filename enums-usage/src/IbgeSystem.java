public class IbgeSystem {
  public static void main(String[] args) {
    for(BrazilianStates e: BrazilianStates.values()) {
      // System.out.println(e.getAcronym() + " - " + e.getName());
    }
    
    BrazilianStates bs = BrazilianStates.SAO_PAULO;

    System.out.println(bs.getName());
    System.out.println(bs.getAcronym());
    System.out.println(bs.getUppercaseName());
    System.out.println(bs.getIBGE());
  }
}
