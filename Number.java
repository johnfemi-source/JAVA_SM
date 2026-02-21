import java.util.Scanner;

    public class Number {

    public static void main (String[] args){


Scanner input = new Scanner(System.in);

System.out.println("Enter a number from 1-5");

int anyNumber = input.nextInt();


if (anyNumber > 0 && anyNumber <= 5){

System.out.println("Hello" + anyNumber);

}
else{

System.out.println("i cannot see this number");

}













}
}

