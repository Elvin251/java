package SinaqImtahani.Task20;
import java.util.Scanner;
public class Person {
  String name;
  int age;

  public void daxilEt(){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter your name: ");
      name = sc.nextLine();
      System.out.print("Enter your age: ");
      age = sc.nextInt();
  }
  public void goster(){
      System.out.println("name : " + name + " age : " + age);
  }


}
