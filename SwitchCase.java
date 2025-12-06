import java.util.Scanner;

class SwitchCase{

	static void main(String[] args){
		
		Scanner playPlay = new Scanner(System.in);

		System.out.println("Enter number of days: ");
		int numberOfDays = playPlay.nextInt();

		int remainder = numberOfDays % 7;

		
		switch(remainder){
		case  0 -> System.out.printf("It will be Friday in %d days time\n", numberOfDays); 

		case  1 -> System.out.printf("It will be Saturday in %d days time\n", numberOfDays); 
		
		case  2 -> System.out.printf("It will be Sunday in %d days time\n", numberOfDays); 

		case  3 -> System.out.printf("It will be Monday in %d days time\n", numberOfDays); 

		case  4 -> System.out.printf("It will be Tuesday in %d days time\n", numberOfDays);

		case  5 -> System.out.printf("It will be Wednesday in %d days time\n", numberOfDays); 

		case  6 -> System.out.printf("It will be Thursday in %d days time\n", numberOfDays);

		}
		


	}

}
