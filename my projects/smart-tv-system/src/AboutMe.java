import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
      System.out.println("What is your name?");
      String name = scanner.next();

      System.out.println("What is your last name?");
      String lastName = scanner.next();

      System.out.println("What is your age?");
      int age = scanner.nextInt();

      System.out.println("What is your height?");
      double height = scanner.nextDouble();

      System.out.println("Hi! my name is " + name + " " + lastName + ", that's nice to meet you!");
      System.out.println("I have " + age + " years old and");
      System.out.println("my height is " + height + "cm. And you?");
  };
};