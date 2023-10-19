public class RegistrationSystem {
  public static void main(String[] args) {
    User marcos = new User("123", "Marcos");

    marcos.setAdress("New York City");

    System.out.println(marcos.getName() + " - " + marcos.getCpf());
  }
}