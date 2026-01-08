import java.util.ArrayList;
import java.util.Scanner;

public class BookSuggestionSystem {
    public static void main(String[] args) {

 Scanner input = new Scanner(System.in);
  ArrayList<String> book = new ArrayList<>();

while(true){
 System.out.println("WELCOME To BOOK SUGGESTION SYSTEM");
 System.out.println("1: Get suggestions");
 System.out.println("2: Add book");
 System.out.println("3: Remove book");
 System.out.println("4: Updatee book");
 System.out.println("5: Show all books");


    System.out.println("how can i help you");
    int help = input.nextInt();
    input.nextLine();
    if(help == 1){
    System.out.println("here are my suggestion");
    System.out.println("Book Title: War Between Land And Sea \n page 123");
    System.out.println("Book Title: Frozen \n page 40");
    System.out.println("Book Title: Beauty And The Beast\n page 234");
   System.out.println();
}

    else if(help == 2){
        while(true){
    System.out.println("enter the book you want to add:");
    String addBook = input.nextLine();
    System.out.println("Book added successfully");
    
    book.add(addBook);
   
    System.out.println("Would you like to get another book suggestion? (yes/no):");
    String ask = input.nextLine();
 
     if(ask.equalsIgnoreCase("no"))
      break;
    }  

   }else if(help == 3){
         while(true){
    System.out.println("Enter the book title to remove:");
    String removeBook = input.nextLine();

     if(book.contains(removeBook)){
       book.remove(removeBook);
       System.out.println("Book removed successfully");

}else{ 
System.out.println("book you entered is not in the collection");
}
    System.out.println("would you like to remove more books");
    String ask = input.nextLine();
   if(ask.equalsIgnoreCase("no"))
     break;
 }
 
 
 }else if(help == 4){
       while(true){
  System.out.println("enter book you want to update");
  String oldTitle = input.nextLine();

    if(book.contains(oldTitle)){
     System.out.println("enter new title");
     String updateBook = input.nextLine();
     int position = book.indexOf(oldTitle);
     book.set(position,updateBook);
}
System.out.println("would you like to remove more books");
    String  choose = input.nextLine();
   if(choose.equalsIgnoreCase("no"))
     break;
}

}else if(help == 5){
 System.out.println("all Books in collection");
 System.out.println(book);
{


}




     












  }

}

}


}


















 


     
