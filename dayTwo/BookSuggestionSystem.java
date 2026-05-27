import java.util.ArrayList;
import java.util.Scanner;

public class BookSuggestionSystem {
    
    public static String generateRandomBook(String[] books) {
    
        java.util.Random randomBookGenerator = new java.util.Random();
    
        int randomIndex = randomBookGenerator.nextInt(books.length);
        int randomPage = randomBookGenerator.nextInt(100);
    
        String randomBook = books[randomIndex] + ", page: " + randomPage;
        
        // System.out.println(randomBook);
        
        return randomBook;
    }
    
    
    public static void addToBooksArray(String bookName){
        ArrayList<String> books = new ArrayList<>();
        books.add(bookName);
    }

    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);
    
        // books array collection
        ArrayList<String> books = new ArrayList<>();
                   
                
        
        while(true){
        
        System.out.println("""
                
    Welcome to the Book Suggestion System!
    
        1. Get Suggestions
        2. Add Book
        3. Remove Book
        4. Update book
        5. Show books
    
    Select option to begin
                """);
                
        int option = inputCollector.nextInt();
        inputCollector.nextLine();

            
            switch(option){
            
                case 1:
                    System.out.println(generateRandomBook(books));
                    System.out.print("Would you like to get another suggestion? (yes/no): ");
                    String select = inputCollector.nextLine();
                    
                        if(select.toLowerCase().equals("yes")){
                             System.out.println(generateRandomBook(books));
                        } else{
                            System.out.println("exited!!!");
                            break;
                        }
                        
                case 2:
                    System.out.println("enter book title");
                    String bookTitle = inputCollector.nextLine();
                    addToBooksArray(books, bookTitle);
                    
                    
            }
        }

    }
}
