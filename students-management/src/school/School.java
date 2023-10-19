package school;

public class School {
  public static void main(String[] args) {
    Student felipe = new Student();

    felipe.setName("Felipe");
    felipe.setAge(8);

    System.out.println("The student " + felipe.getName() + " has " + felipe.getAge() + " years old.");
  }
}
