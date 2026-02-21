import java.util.Scanner;
public class Fake{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter name: ");
    String name = input.nextLine();
  
    System.out.print("Enter age: ");
    int age = input.nextInt();

   System.out.printf("name: %s\n age: %d\n", name, age);

}
}



