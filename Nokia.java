import java.util.scanner;
public class Nokia{
    public static void main(string[]args){
    Scanner input = new Scanner(system.in);



    String menu = """
        1. Phone book
   
    """;

       System.out.println("ENTER YOUR CHOICE: ");\
        int menuChoice = input.nextInt();

        switch(menuChoice){
            case 1 ->
                System.out.println("Phone book");
                String englishMenu = """
	                Press 1 - To Register at Semicolon
	                Press 2 - To Register at Amotekun
	                Press 3 - To Register for Neighbourhood
	            """;
                System.out.println(englishMenu); 
                int englishMenuChoice =  inputCollector.nextInt(); 
        }
	
    }
}
