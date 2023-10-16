public class App {
  

  public static void main(String[] args) {
    
    //Some concepts about variables declarament
    
    // String myName = "Alessandra";

    // int fabricationYear = 2022;

    // boolean trueOrFalse = true;

    // fabricationYear = 2018;
    String firstName = "Alessandra";
    String lastName = "Vieira";

    String fullName = fullName(firstName, lastName);

    System.out.print(fullName);
  }

  public static String fullName(String firstName, String lastName) {
    return firstName.concat(" ").concat(lastName);
  }
}
