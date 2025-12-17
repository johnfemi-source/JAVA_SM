import java.util.Scanner;
public class Score{
      public static void main(String[] args){
      Scanner input = new Scanner(System.in);

  System.out.print("Enter first score: ");
  int firstScore=input.nextInt();
  
  System.out.print("Enter first score: ");
  int secondScore=input.nextInt();

  System.out.print("Enter first score: ");
  int thirdScore=input.nextInt();
 
 int total= firstScore+secondScore+thirdScore;
 float average= total / 3;

System.out.println("total is " + total);
System.out.printf("average is " + average);


  }

}
